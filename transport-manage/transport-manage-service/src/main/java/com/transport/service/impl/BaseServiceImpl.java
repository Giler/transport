package com.transport.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.transport.dao.Mapper;

public abstract class BaseServiceImpl<T> {
	 @Autowired
	 private Mapper<T> mapper;
	 
	 public T getObjectById(Integer id){
		T t = mapper.selectByPrimaryKey(id);
		 return t;
	 }
}
