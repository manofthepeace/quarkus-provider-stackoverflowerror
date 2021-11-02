package org.acme;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

@RegisterRestClient(baseUri = "someuri")
public interface SomeClient {

    @GET
    @Path("/token")
    String getJwt();

}
