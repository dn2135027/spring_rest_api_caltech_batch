package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("ec2")
public class SimpleController {

		// default port number is 8080
		// http://localhost:8080/ec2/greeting/david
		// http://3.137.221.106:8080/ec2/greeting/david
		@GetMapping(value = "/greeting/{name}")
		public String sayHello(@PathVariable("name") String name) {
			return "Welcome to Spring boot with EC2 instance user "+name;
		}
}
