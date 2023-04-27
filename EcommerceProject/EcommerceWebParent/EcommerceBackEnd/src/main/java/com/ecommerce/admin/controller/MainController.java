package com.ecommerce.admin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping("/EcommerceAdmin")
public class MainController {
	
	@GetMapping("")
	public String viewHomePage() {
		return "index";
	}

}
