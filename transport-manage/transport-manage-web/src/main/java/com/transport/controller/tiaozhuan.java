package com.transport.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class tiaozhuan {

	@RequestMapping("/")
	public String getCustomerByID(){
		return "angular";
	}
	@RequestMapping("/showDash")
	public String showDash(){
		
		
		return "customer";
	}
}
