package com.doudouj.coupon.dao;

import com.doudouj.coupon.model.HomeRecommendMerchandise;

public interface HomeRecommendMerchandiseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HomeRecommendMerchandise record);

    int insertSelective(HomeRecommendMerchandise record);

    HomeRecommendMerchandise selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HomeRecommendMerchandise record);

    int updateByPrimaryKey(HomeRecommendMerchandise record);
}