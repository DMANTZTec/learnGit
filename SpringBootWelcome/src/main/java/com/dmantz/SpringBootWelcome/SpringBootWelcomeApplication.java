package com.dmantz.SpringBootWelcome;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.dmantz.WelcomeController,com.dmantz.WelcomeService"})
public class SpringBootWelcomeApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootWelcomeApplication.class, args);
	}

}
