package org.acme;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;

import io.quarkus.runtime.StartupEvent;

@ApplicationScoped
public class Startup {

    @Inject
    TokenService token;

    void onStart(@Observes StartupEvent ev) {
        token.setToken();
    }

}
