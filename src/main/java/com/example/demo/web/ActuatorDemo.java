package com.example.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ActuatorDemo {

	@RequestMapping("/hello")
	public String helloWorld() {
		return "Hello World!";
	}
}
