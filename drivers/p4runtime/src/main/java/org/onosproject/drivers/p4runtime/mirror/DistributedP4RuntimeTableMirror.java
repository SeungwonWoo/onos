/*
 * Copyright 2017-present Open Networking Foundation
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.onosproject.drivers.p4runtime.mirror;

import org.onlab.util.KryoNamespace;
import org.onosproject.net.pi.runtime.PiTableEntry;
import org.onosproject.net.pi.runtime.PiTableEntryHandle;
import org.onosproject.store.serializers.KryoNamespaces;
import org.osgi.service.component.annotations.Component;

/**
 * Distributed implementation of a P4Runtime table mirror.
 */
@Component(immediate = true, service = P4RuntimeTableMirror.class)
public final class DistributedP4RuntimeTableMirror
        extends AbstractDistributedP4RuntimeMirror
                        <PiTableEntryHandle, PiTableEntry>
        implements P4RuntimeTableMirror {

    private static final String DIST_MAP_NAME = "onos-p4runtime-table-mirror";

    @Override
    String mapName() {
        return DIST_MAP_NAME;
    }

    @Override
    KryoNamespace storeSerializer() {
        return KryoNamespace.newBuilder()
                .register(KryoNamespaces.API)
                .register(TimedEntry.class)
                .build();
    }
}
