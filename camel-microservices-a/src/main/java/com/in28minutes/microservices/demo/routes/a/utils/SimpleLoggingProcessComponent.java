package com.in28minutes.microservices.demo.routes.a.utils;



import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class SimpleLoggingProcessComponent implements Processor{
	
	private Logger logger = LoggerFactory.getLogger(SimpleLoggingProcessComponent.class);
	
	public void process(String message) {
		logger.info("SimpleLoggingProcessComponent {}", message);
		}

	@Override
	public void process(Exchange exchange) throws Exception {
		logger.info("SimpleLoggingProcessProcessor {}", exchange.getMessage().getBody());
		
	}



}