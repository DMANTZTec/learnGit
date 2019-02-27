package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {
	
	@Autowired
	public WelcomeService service;
	
	@RequestMapping("/welcome")
	public String welcome() {
		
		return service.retriveWelcomeMsg();
	}
	
	@Component
	 class WelcomeService{
		
		public String retriveWelcomeMsg() {
			
			return "Very Good Morning SpringBoot";
			
			
		}
		
		
	}

}
