package com.doudouj.coupon.dao;

import com.doudouj.coupon.model.HomeAdvertise;

public interface HomeAdvertiseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HomeAdvertise record);

    int insertSelective(HomeAdvertise record);

    HomeAdvertise selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HomeAdvertise record);

    int updateByPrimaryKey(HomeAdvertise record);
}