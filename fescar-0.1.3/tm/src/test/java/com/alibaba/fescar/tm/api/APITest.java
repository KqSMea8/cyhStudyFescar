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

package com.alibaba.fescar.tm.api;

import org.junit.Assert;
import org.junit.Test;

import com.alibaba.fescar.core.context.RootContext;

/**
 * The type Api test.
 */
public class APITest {

    /**
     * Test current.
     *
     * @throws Exception the exception
     */
    @Test
    public void testCurrent() throws Exception {
        String xid = "1234567890";
        RootContext.bind(xid);
        GlobalTransaction tx = GlobalTransactionContext.getCurrentOrCreate();
        Assert.assertEquals(xid, tx.getXid());

    }
}
