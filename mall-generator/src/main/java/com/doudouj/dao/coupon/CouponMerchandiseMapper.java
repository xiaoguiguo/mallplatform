package com.doudouj.dao.coupon;

import com.doudouj.dto.coupon.CouponMerchandise;

public interface CouponMerchandiseMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CouponMerchandise record);

    int insertSelective(CouponMerchandise record);

    CouponMerchandise selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CouponMerchandise record);

    int updateByPrimaryKey(CouponMerchandise record);
}