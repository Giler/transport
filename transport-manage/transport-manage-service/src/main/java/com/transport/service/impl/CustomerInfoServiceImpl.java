package com.transport.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.transport.dao.CustomerInfoMapper;
import com.transport.pojo.CustomerInfo;
import com.transport.service.CustomerInfoService;
@Service
public class CustomerInfoServiceImpl extends BaseServiceImpl<CustomerInfo> implements CustomerInfoService {
	
	@Autowired
	private CustomerInfoMapper customerInfoMapper;
	
	@Override
	public CustomerInfo getCustomerInfoByID(Integer customerId) {
		CustomerInfo customerInfo = customerInfoMapper.selectByPrimaryKey(customerId);
		return customerInfo;
	}

}
