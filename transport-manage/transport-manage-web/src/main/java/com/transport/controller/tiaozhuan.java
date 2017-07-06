package com.transport.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class tiaozhuan {

	@RequestMapping("/admin/listUser")
	public String getCustomerByID(){
		return "user/info";
	}
	@RequestMapping("/showDash")
	public String showDash(){
		
		
		return "customer";
	}
}
