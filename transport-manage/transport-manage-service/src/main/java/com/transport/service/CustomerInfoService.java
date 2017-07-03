package com.transport.service;

import com.transport.pojo.CustomerInfo;


public interface CustomerInfoService extends BaseService<CustomerInfo>{
	
	//根据ID获取客户内容
	CustomerInfo getCustomerInfoByID(Integer customerId);
}
