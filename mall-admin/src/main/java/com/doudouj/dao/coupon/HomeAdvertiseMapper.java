package com.doudouj.dao.coupon;

import com.doudouj.dto.coupon.HomeAdvertise;
import org.springframework.stereotype.Repository;

@Repository
public interface HomeAdvertiseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(HomeAdvertise record);

    int insertSelective(HomeAdvertise record);

    HomeAdvertise selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(HomeAdvertise record);

    int updateByPrimaryKey(HomeAdvertise record);
}