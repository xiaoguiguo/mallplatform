package com.doudouj.coupon.dao;

import com.doudouj.coupon.model.HomeNewMerchandise;

public interface HomeNewMerchandiseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HomeNewMerchandise record);

    int insertSelective(HomeNewMerchandise record);

    HomeNewMerchandise selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HomeNewMerchandise record);

    int updateByPrimaryKey(HomeNewMerchandise record);
}