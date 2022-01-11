package com.cici.helloworld.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@GetMapping("/hello")
	public String gehello() {
		return "Hello";
	}
	
	@GetMapping("hello1")
	public String gethello1() {
		return "Hello everyone";
	}
}
