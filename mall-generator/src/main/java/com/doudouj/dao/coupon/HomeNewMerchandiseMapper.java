package com.doudouj.dao.coupon;

import com.doudouj.dto.coupon.HomeNewMerchandise;

public interface HomeNewMerchandiseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HomeNewMerchandise record);

    int insertSelective(HomeNewMerchandise record);

    HomeNewMerchandise selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HomeNewMerchandise record);

    int updateByPrimaryKey(HomeNewMerchandise record);
}