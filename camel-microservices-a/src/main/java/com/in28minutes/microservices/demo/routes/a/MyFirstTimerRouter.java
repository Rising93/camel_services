package com.in28minutes.microservices.demo.routes.a;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.in28minutes.microservices.demo.routes.a.utils.*;


//@Component
public class MyFirstTimerRouter extends RouteBuilder {
	
	@Autowired
	private GetCurrentTimeBean getCurrentTimeBean;
	
	@Autowired
	private SimpleLoggingProcessComponent loggingComponent; 

	@Override
	public void configure() throws Exception {
		
		//timer endpoint
		
		from("timer:first-timer")	//queue
		//.transform().constant("Time now is" + LocalDateTime.now())
		.bean(getCurrentTimeBean)
		.log("${body}")
		.bean(loggingComponent)
		.process(new SimpleLoggingProcessComponent())
		.to("log:first-timer");		//database
		
	}

	
	
}