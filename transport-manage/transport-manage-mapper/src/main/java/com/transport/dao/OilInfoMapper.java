/*
 * OilInfoMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-05-30 Created
 */
package com.transport.dao;

import com.transport.pojo.OilInfo;

public interface OilInfoMapper {
    int deleteByPrimaryKey(Integer oilId);

    int insert(OilInfo record);

    int insertSelective(OilInfo record);

    OilInfo selectByPrimaryKey(Integer oilId);

    int updateByPrimaryKeySelective(OilInfo record);

    int updateByPrimaryKey(OilInfo record);
}