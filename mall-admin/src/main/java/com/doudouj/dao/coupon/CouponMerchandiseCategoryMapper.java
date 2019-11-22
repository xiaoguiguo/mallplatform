package com.doudouj.dao.coupon;

import com.doudouj.dto.coupon.CouponMerchandiseCategory;
import org.springframework.stereotype.Repository;

@Repository
public interface CouponMerchandiseCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CouponMerchandiseCategory record);

    int insertSelective(CouponMerchandiseCategory record);

    CouponMerchandiseCategory selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CouponMerchandiseCategory record);

    int updateByPrimaryKey(CouponMerchandiseCategory record);
}