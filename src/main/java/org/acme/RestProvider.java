package org.acme;

import java.io.IOException;

import javax.annotation.Priority;
import javax.inject.Inject;
import javax.ws.rs.Priorities;
import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientRequestFilter;
import javax.ws.rs.ext.Provider;

@Provider
@Priority(Priorities.AUTHENTICATION)
public class RestProvider implements ClientRequestFilter {

    @Inject
    TokenService service;

    @Override
    public void filter(ClientRequestContext requestContext) throws IOException {

    }

}
