package com.dmantz.WelcomeService;

import org.springframework.stereotype.Service;

@Service
public class WelcomeService {
	
	public String getWelcomeMessage() {
		
		return "Welcome to SpringBoot";
	}
	
	

}
