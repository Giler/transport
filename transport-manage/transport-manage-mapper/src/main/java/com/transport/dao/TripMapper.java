/*
 * TripMapper.java
 * Copyright(C) 20xx-2015 xxxxxx公司
 * All rights reserved.
 * -----------------------------------------------
 * 2017-05-30 Created
 */
package com.transport.dao;

import com.transport.pojo.Trip;

public interface TripMapper {
    int deleteByPrimaryKey(Integer tripId);

    int insert(Trip record);

    int insertSelective(Trip record);

    Trip selectByPrimaryKey(Integer tripId);

    int updateByPrimaryKeySelective(Trip record);

    int updateByPrimaryKey(Trip record);
}