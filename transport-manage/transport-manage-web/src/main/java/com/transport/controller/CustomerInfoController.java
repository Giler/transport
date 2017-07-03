package com.transport.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.transport.pojo.CustomerInfo;
import com.transport.service.CustomerInfoService;

@Controller
public class CustomerInfoController {

	@Autowired
	private CustomerInfoService customerInfoService;
	
	@RequestMapping("customer/{customerId}")
	@ResponseBody
	public CustomerInfo getCustomerByID(@PathVariable Integer customerId){
		
		CustomerInfo customerInfo = customerInfoService.getCustomerInfoByID(customerId);
		CustomerInfo customerInfo2 = customerInfoService.getObjectById(customerId);
		 
		return customerInfo2;
	}
}
