package org.apache.camel.component.as2.api.entity;

import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.camel.component.as2.api.CanonicalOutputStream;
import org.apache.http.Header;
import org.apache.http.HeaderIterator;
import org.apache.http.entity.ContentType;

public abstract class MultipartMimeEntity extends MimeEntity {

    private final List<MimeEntity> parts = new ArrayList<MimeEntity>();

    protected String boundary;

    public MultipartMimeEntity(ContentType contentType) {
        this(contentType, false, null);
    }

    public MultipartMimeEntity(ContentType contentType, boolean isMainBody) {
        this(contentType, isMainBody, null);
    }

    public MultipartMimeEntity(ContentType contentType, boolean isMainBody, String boundary) {
        setContentType(contentType);
        setMainBody(isMainBody);
        
        if (boundary != null && EntityUtils.validateBoundaryValue(boundary)) {
            this.boundary = boundary;
        } else {
            this.boundary = EntityUtils.createBoundaryValue();            
        }

    }
    
    protected MultipartMimeEntity() {
    }

    public void addPart(MimeEntity part) {
        parts.add(part);
        contentLength = RECALCULATE_CONTENT_LENGTH;
    }

    public MimeEntity getPart(int index) {
        return parts.get(index);
    }

    public int getPartCount() {
        return parts.size();
    }

    @Override
    public long getContentLength() {
        if (contentLength == RECALCULATE_CONTENT_LENGTH) {
            // Need to (re)calculate content length

            // See if their are any parts with unknown content lengths.
            for (MimeEntity part : parts) {
                long len = part.getContentLength();
                if (len < 0) {
                    contentLength = MimeEntity.UNKNOWN_CONTENT_LENGTH;
                    return contentLength;
                }
            }

            contentLength = super.getContentLength();
        }
        return contentLength;
    }

    @Override
    public void writeTo(OutputStream outstream) throws IOException {
        NoCloseOutputStream ncos = new NoCloseOutputStream(outstream);
        try (CanonicalOutputStream canonicalOutstream = new CanonicalOutputStream(ncos, getCharset())) {

            // Write out mime part headers if this is not the main body of message.
            if (!isMainBody()) { 
                HeaderIterator it = headerIterator();
                while (it.hasNext()) {
                    Header header = it.nextHeader();
                    canonicalOutstream.writeln(header.toString());
                }
                canonicalOutstream.writeln(); // ensure empty line between headers and body; RFC2046 - 5.1.1
            }
        
            // Write out each part separated by a boundary delimiter line
            String boundary = "--" + this.boundary;
            // Write out parts
            for (MimeEntity part : parts) {
                canonicalOutstream.writeln(); // ensure boundary occurs at the beginning of a line; RFC2046 - 5.1.1
                canonicalOutstream.writeln(boundary);
                part.writeTo(outstream);
            }
            
            // Write out closing boundary delimiter line
            canonicalOutstream.writeln(); // ensure boundary occurs at the beginning of a line; RFC2046 - 5.1.1
            canonicalOutstream.writeln(boundary + "--");
            
        }
    }

}
