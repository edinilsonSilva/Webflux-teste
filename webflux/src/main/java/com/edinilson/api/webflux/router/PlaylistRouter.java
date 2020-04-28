package com.edinilson.api.webflux.router;
import static org.springframework.web.reactive.function.server.RequestPredicates.*;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import com.edinilson.api.webflux.handler.PlaylistHandler;

@Configuration
public class PlaylistRouter {

	@Bean
	public RouterFunction<ServerResponse> router(PlaylistHandler handler) {
		return RouterFunctions
				.route(GET("/playlist").and(accept(MediaType.APPLICATION_JSON)), handler::findAll)
				.andRoute(GET("/playlist/{id}").and(accept(MediaType.APPLICATION_JSON)), handler::findById)
				.andRoute(POST("/playsist").and(accept(MediaType.APPLICATION_JSON)), handler::save);
	}
}
