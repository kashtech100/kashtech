package com.kashtech.kashtech.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class KashtechController {
	
	@GetMapping("/get/{country}")
	private String getmethod(@PathVariable("country")String name){
		return name;
	}
	
	@PostMapping("/post/{name}")
	private String postmethod(@PathVariable("name")String name){
		return name;
	}

}
