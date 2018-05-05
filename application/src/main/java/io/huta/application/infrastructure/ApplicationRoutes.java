package io.huta.application.infrastructure;

import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.http.HttpMethod.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.method;
import static org.springframework.web.reactive.function.server.RouterFunctions.*;

@Configuration
public class ApplicationRoutes {

    RouterFunction routes() {
        return route(method(GET), request -> ServerResponse.ok().build());
    }

}
