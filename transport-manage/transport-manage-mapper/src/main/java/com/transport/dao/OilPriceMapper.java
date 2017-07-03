/*
 * OilPriceMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-05-30 Created
 */
package com.transport.dao;

import com.transport.pojo.OilPrice;

public interface OilPriceMapper {
    int deleteByPrimaryKey(Integer oilPriceId);

    int insert(OilPrice record);

    int insertSelective(OilPrice record);

    OilPrice selectByPrimaryKey(Integer oilPriceId);

    int updateByPrimaryKeySelective(OilPrice record);

    int updateByPrimaryKey(OilPrice record);
}