package com.in28minutes.microservices.demo.routes.a.utils;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

@Component
public class GetCurrentTimeBean{
	
	public String getCurrentTime() {
		return "Time now is " + LocalDateTime.now();
		}
}