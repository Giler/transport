/*
 * TankInfoMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-05-30 Created
 */
package com.transport.dao;

import com.transport.pojo.TankInfo;

public interface TankInfoMapper {
    int deleteByPrimaryKey(Integer tankId);

    int insert(TankInfo record);

    int insertSelective(TankInfo record);

    TankInfo selectByPrimaryKey(Integer tankId);

    int updateByPrimaryKeySelective(TankInfo record);

    int updateByPrimaryKey(TankInfo record);
}