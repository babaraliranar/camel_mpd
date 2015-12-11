/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * <p/>
 * http://www.apache.org/licenses/LICENSE-2.0
 * <p/>
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.component.mllp;

public class MllpException extends Exception {
    private byte[] mllpPayload = null;

    public MllpException(String message) {
        super(message);
    }

    public MllpException(String message, byte[] mllpPayload) {
        super(message);
        this.mllpPayload = mllpPayload;
    }

    public MllpException(String message, Throwable cause) {
        super(message, cause);
    }

    public MllpException(String message, byte[] mllpPayload, Throwable cause) {
        super(message, cause);
    }

    public byte[] getMllpPayload() {
        return mllpPayload;
    }

    public void setMllpPayload(byte[] mllpPayload) {
        this.mllpPayload = mllpPayload;
    }

}
