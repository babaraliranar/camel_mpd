package org.apache.camel.component.stitch.client.models;

import java.util.LinkedHashMap;
import java.util.Map;

import org.apache.camel.util.ObjectHelper;

/**
 * This represents the schema here: https://www.stitchdata.com/docs/developers/import-api/api#message-object
 */
public class StitchMessage implements StitchModel {
    public enum Action {
        UPSERT
    };

    private final Action action;
    private final long sequence;
    private final Map<String, Object> data;

    private StitchMessage(Action action, long sequence, Map<String, Object> data) {
        this.action = action;
        this.sequence = sequence;
        this.data = data;
    }

    public static Builder builder() {
        return new Builder();
    }

    public Action getAction() {
        return action;
    }

    public long getSequence() {
        return sequence;
    }

    public Map<String, Object> getData() {
        return data;
    }

    @Override
    public Map<String, Object> toMap() {
        final Map<String, Object> resultAsMap = new LinkedHashMap<>();

        resultAsMap.put("action", action.name().toLowerCase());
        resultAsMap.put("sequence", sequence);
        resultAsMap.put("data", data);

        return resultAsMap;
    }

    public static final class Builder {
        private Action action = Action.UPSERT;
        private long sequence = System.currentTimeMillis();
        private Map<String, Object> data = new LinkedHashMap<>();

        private Builder() {
        }

        /**
         * This will always be upsert.
         *
         * Default: upsert
         *
         * @param action
         */
        public Builder withAction(final Action action) {
            this.action = action;
            return this;
        }

        /**
         * An integer that tells the Import API the order in which data points in the request body should be considered
         * for loading. This data will be stored in the destination table in the _sdc_sequence column. In other Stitch
         * integrations, Stitch uses a Unix epoch (in milliseconds) as the value for this property. Note: This value
         * cannot exceed the maximum of 9223372036854775807.
         *
         * Default: System.currentTimeMillis();
         *
         * @param sequence
         */
        public Builder withSequence(final long sequence) {
            this.sequence = sequence;
            return this;
        }

        /**
         * The record to be upserted into a table. The record data must conform to the JSON schema contained in the
         * request’s Schema object.
         *
         * @param data
         */
        public Builder withData(final Map<String, Object> data) {
            this.data.putAll(data);
            return this;
        }

        public Builder withData(final String key, final Object data) {
            this.data.put(key, data);
            return this;
        }

        public StitchMessage build() {
            if (ObjectHelper.isEmpty(data)) {
                throw new IllegalArgumentException("Data cannot be empty.");
            }
            return new StitchMessage(action, sequence, data);
        }
    }
}
