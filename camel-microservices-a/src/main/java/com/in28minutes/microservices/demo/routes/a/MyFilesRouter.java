package com.in28minutes.microservices.demo.routes.a;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//@Component
public class MyFilesRouter extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:files/input")
		.log("${body}")
		.to("file:files/output");
	}

}
