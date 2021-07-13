package com.taller.wildfly;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class ApiRestOrdenpedido1Application extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(ApiRestOrdenpedido1Application.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(ApiRestOrdenpedido1Application.class);
	}
	
}
