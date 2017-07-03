/*
 * RefineryInfoMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-05-30 Created
 */
package com.transport.dao;

import com.transport.pojo.RefineryInfo;

public interface RefineryInfoMapper {
    int deleteByPrimaryKey(Integer refineryId);

    int insert(RefineryInfo record);

    int insertSelective(RefineryInfo record);

    RefineryInfo selectByPrimaryKey(Integer refineryId);

    int updateByPrimaryKeySelective(RefineryInfo record);

    int updateByPrimaryKey(RefineryInfo record);
}