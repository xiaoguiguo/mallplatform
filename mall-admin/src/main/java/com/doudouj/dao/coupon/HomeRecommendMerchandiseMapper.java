package com.doudouj.dao.coupon;

import com.doudouj.dto.coupon.HomeRecommendMerchandise;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeRecommendMerchandiseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HomeRecommendMerchandise record);

    int insertSelective(HomeRecommendMerchandise record);

    HomeRecommendMerchandise selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HomeRecommendMerchandise record);

    int updateByPrimaryKey(HomeRecommendMerchandise record);
}