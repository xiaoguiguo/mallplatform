package com.doudouj.coupon.dao;

import com.doudouj.coupon.model.CouponMerchandise;

public interface CouponMerchandiseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CouponMerchandise record);

    int insertSelective(CouponMerchandise record);

    CouponMerchandise selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CouponMerchandise record);

    int updateByPrimaryKey(CouponMerchandise record);
}