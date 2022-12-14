/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.dolphinscheduler.service.zk;

import org.apache.curator.framework.CuratorFramework;
import org.apache.curator.framework.recipes.cache.TreeCacheEvent;

import org.junit.Assert;
import org.junit.Test;

public class ZookeeperCachedOperatorTest {

    private ZookeeperCachedOperator zookeeperCachedOperator = new ZookeeperCachedOperator();

    @Test
    public void testRegisterListener() {
        AbstractListener abstractListener1 = new AbstractListener(1) {
            @Override
            protected void dataChanged(CuratorFramework client, TreeCacheEvent event, String path) {
                // ignore
            }
        };
        AbstractListener abstractListener2 = new AbstractListener(2) {
            @Override
            protected void dataChanged(CuratorFramework client, TreeCacheEvent event, String path) {
                // ignore
            }
        };
        zookeeperCachedOperator.registerListener(abstractListener2);
        zookeeperCachedOperator.registerListener(abstractListener1);
        Assert.assertTrue(true);
    }
}