package com.doudouj.coupon.model;

public class CouponMerchandiseCategory {
    private Long id;

    private Long couponId;

    private Long merchandiseCategoryId;

    private String merchandiseCategoryName;

    private String pMerchandiseCategoryName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public Long getMerchandiseCategoryId() {
        return merchandiseCategoryId;
    }

    public void setMerchandiseCategoryId(Long merchandiseCategoryId) {
        this.merchandiseCategoryId = merchandiseCategoryId;
    }

    public String getMerchandiseCategoryName() {
        return merchandiseCategoryName;
    }

    public void setMerchandiseCategoryName(String merchandiseCategoryName) {
        this.merchandiseCategoryName = merchandiseCategoryName == null ? null : merchandiseCategoryName.trim();
    }

    public String getpMerchandiseCategoryName() {
        return pMerchandiseCategoryName;
    }

    public void setpMerchandiseCategoryName(String pMerchandiseCategoryName) {
        this.pMerchandiseCategoryName = pMerchandiseCategoryName == null ? null : pMerchandiseCategoryName.trim();
    }
}