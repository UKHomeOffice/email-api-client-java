package io.swagger.client.auth;

import io.swagger.client.Pair;

import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-19T15:11:18.643+01:00")
public interface Authentication {
    /**
     * Apply authentication settings to header and query params.
     */
    void applyToParams(List<Pair> queryParams, Map<String, String> headerParams);
}
