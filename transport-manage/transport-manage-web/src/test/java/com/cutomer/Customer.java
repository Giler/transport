package com.cutomer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.transport.pojo.CustomerInfo;
import com.transport.service.CustomerInfoService;

//查看详细内容时可以调用日志管理
//@RunWith(JUnit4ClassRunner.class)
//简单测试可以使用此测试
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:spring/applicationContext-*.xml"})
public class Customer {

	@Autowired
	private CustomerInfoService customerInfoService;
	
	@Test
	public void test() {
		CustomerInfo customerInfo2 = customerInfoService.getCustomerInfoByID(1);
		System.out.println(customerInfo2.toString());
	}

}
