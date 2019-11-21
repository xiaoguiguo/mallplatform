package com.doudouj.coupon.dao;

import com.doudouj.coupon.model.CouponMerchandiseCategory;

public interface CouponMerchandiseCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CouponMerchandiseCategory record);

    int insertSelective(CouponMerchandiseCategory record);

    CouponMerchandiseCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CouponMerchandiseCategory record);

    int updateByPrimaryKey(CouponMerchandiseCategory record);
}