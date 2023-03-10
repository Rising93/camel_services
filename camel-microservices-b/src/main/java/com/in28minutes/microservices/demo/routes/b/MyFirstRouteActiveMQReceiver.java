package com.in28minutes.microservices.demo.routes.b;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyFirstRouteActiveMQReceiver extends RouteBuilder{

	@Override
	public void configure() throws Exception {
		from("activemq:my-activemq-queue")
		.to("log:received.message-from-activemq");
		
	}

}
