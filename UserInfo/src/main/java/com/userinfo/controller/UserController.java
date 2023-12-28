package com.userinfo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

//e-nomination 

@Controller
public class UserController {

	@GetMapping("/")
	public String home() {
				
		return "index";
	}
	
}
