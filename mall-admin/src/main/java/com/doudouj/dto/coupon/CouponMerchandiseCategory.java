package com.doudouj.dto.coupon;

import lombok.Data;

@Data
public class CouponMerchandiseCategory {
    private Long id;

    private Long couponId;

    private Long merchandiseCategoryId;

    private String merchandiseCategoryName;

    private String pMerchandiseCategoryName;

}