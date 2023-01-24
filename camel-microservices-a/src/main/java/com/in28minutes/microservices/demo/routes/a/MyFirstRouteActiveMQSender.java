package com.in28minutes.microservices.demo.routes.a;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class MyFirstRouteActiveMQSender extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		//TIMER
		from("timer:activve-mq-timer?period=10000")
		.transform().constant("Mio messaggio per ActiveMQ")
		
		//QUEUE
		.to("activemq:my-activemq-queue");
		
		
	}

}
