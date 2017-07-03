/*
 * TruckInfoMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-05-30 Created
 */
package com.transport.dao;

import com.transport.pojo.TruckInfo;

public interface TruckInfoMapper {
    int deleteByPrimaryKey(Integer truckId);

    int insert(TruckInfo record);

    int insertSelective(TruckInfo record);

    TruckInfo selectByPrimaryKey(Integer truckId);

    int updateByPrimaryKeySelective(TruckInfo record);

    int updateByPrimaryKey(TruckInfo record);
}