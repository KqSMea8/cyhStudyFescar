/*
 *  Copyright 1999-2018 Alibaba Group Holding Ltd.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package com.alibaba.fescar.rm.datasource.exec;

import java.sql.SQLException;

/**
 * The type Lock wait timeout exception.
 */
public class LockWaitTimeoutException extends SQLException {
    private static final long serialVersionUID = -6754599774015964707L;

    /**
     * Instantiates a new Lock wait timeout exception.
     */
    public LockWaitTimeoutException() {}

    /**
     * Instantiates a new Lock wait timeout exception.
     *
     * @param reason the reason
     * @param cause  the cause
     */
    public LockWaitTimeoutException(String reason, Throwable cause) {
        super(reason, cause);
    }

    /**
     * Instantiates a new Lock wait timeout exception.
     *
     * @param e the e
     */
    public LockWaitTimeoutException(Throwable e) {
        super(e);
    }
}
