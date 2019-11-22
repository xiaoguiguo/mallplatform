package com.doudouj.dto.coupon;

import lombok.Data;

@Data
public class CouponMerchandise {
    private Long id;

    private Long couponId;

    private Long merchandiseId;

    private String merchandiseName;

}