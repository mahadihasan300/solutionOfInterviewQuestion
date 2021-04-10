package com.example.contoller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	
	@GetMapping("/helloWorld")
	public String helloHorld() {
		return "Hello World";
	}

}
