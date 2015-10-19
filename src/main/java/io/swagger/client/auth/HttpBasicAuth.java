package io.swagger.client.auth;

import io.swagger.client.Pair;

import javax.xml.bind.DatatypeConverter;
import java.io.UnsupportedEncodingException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.JavaClientCodegen", date = "2015-10-19T15:11:18.643+01:00")
public class HttpBasicAuth implements Authentication {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public void applyToParams(List<Pair> queryParams, Map<String, String> headerParams) {
        String str = (username == null ? "" : username) + ":" + (password == null ? "" : password);
        try {
            headerParams.put("Authorization", "Basic " + DatatypeConverter.printBase64Binary(str.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
