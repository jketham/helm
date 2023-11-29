package com.helm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helm {

	@RequestMapping("/")
	public String hello() {
		
		return "Welcome to Helm ";
	}
}
