package com.warumono.app.configurations;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.function.RequestPredicates;
import org.springframework.web.servlet.function.RouterFunction;
import org.springframework.web.servlet.function.RouterFunctions;
import org.springframework.web.servlet.function.ServerResponse;

@Configuration
public class RouterConfiguration
{
	@Bean
	public RouterFunction<ServerResponse> ping()
	{
		return RouterFunctions.route
		(
			RequestPredicates.GET("/ping"), 
			serverRequest -> 
				ServerResponse
					.ok()
					.contentType(MediaType.APPLICATION_JSON)
					.body
					(
						new HashMap<String, String>()
						{
							private static final long serialVersionUID = 1L;

							{
								put("ping", "pong");
								put("your-parameter", serverRequest.param("param").orElse(null));
								put("timestamp", LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));
							}
						}
					)
		);
	}
}
