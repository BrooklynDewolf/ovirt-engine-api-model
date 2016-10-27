/*
Copyright (c) 2015 Red Hat, Inc.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

  http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/
package types;

import org.ovirt.api.metamodel.annotations.Type;

@Type
public enum RngSource {
    RANDOM,

    /**
     * Obtains random data from the `/dev/urandom` device.
     *
     * This RNG source is meant to replace `random` RNG source for non-cluster-aware entities (i.e. Blank template and
     * instance types) and entities associated with clusters with compatibility version 4.1 or higher.
     *
     * @author Jakub Niedermertl <jniederm@redhat.com>
     * @date 26 Oct 2016
     * @status added
     * @since 4.1
     */
    URANDOM,

    HWRNG;
}
