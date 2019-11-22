package com.doudouj.dao.coupon;

import com.doudouj.dto.coupon.Coupon;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Coupon record);

    int insertSelective(Coupon record);

    Coupon selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Coupon record);

    int updateByPrimaryKey(Coupon record);
}