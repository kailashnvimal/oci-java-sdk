/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.objectstorage.responses;

import com.oracle.bmc.objectstorage.model.*;

@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.Builder(builderClassName = "Builder")
@lombok.Getter
public class ListWorkRequestErrorsResponse {

    /**
     * Unique Oracle-assigned identifier for the request. If you need to contact Oracle about a particular
     * request, provide this request ID.
     *
     */
    private String opcRequestId;

    /**
     * Paginating a list of work request errors.
     * In the GET request, set the limit to the number of work request errors that you want returned in the
     * response. If the opc-next-page header appears in the response, then this is a partial list and there are
     * additional work request errors to get. Include the header's value as the `page` parameter in the subsequent
     * GET request to get the next batch of work request errors. Repeat this process to retrieve the entire list of work
     * request errors.
     *
     */
    private String opcNextPage;

    /**
     * Echoes back the value passed in the opc-client-request-id header, for use by clients when debugging.
     */
    private String opcClientRequestId;

    /**
     * A list of WorkRequestError instances.
     */
    private java.util.List<WorkRequestError> items;

    public static class Builder {
        /**
         * Copy method to populate the builder with values from the given instance.
         * @return this builder instance
         */
        public Builder copy(ListWorkRequestErrorsResponse o) {
            opcRequestId(o.getOpcRequestId());
            opcNextPage(o.getOpcNextPage());
            opcClientRequestId(o.getOpcClientRequestId());
            items(o.getItems());

            return this;
        }
    }
}
