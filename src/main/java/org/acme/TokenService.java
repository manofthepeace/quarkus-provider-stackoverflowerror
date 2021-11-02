package org.acme;

import javax.inject.Singleton;

import org.eclipse.microprofile.rest.client.inject.RestClient;

@Singleton
public class TokenService {

    String token;

    @RestClient
    SomeClient client;

    public void setToken() {
        token = client.getJwt();
    }

}
