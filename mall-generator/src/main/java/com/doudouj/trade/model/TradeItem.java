package com.doudouj.trade.model;

import java.math.BigDecimal;
import java.util.Date;

public class TradeItem {
    private Long tradeId;

    private Long merchantId;

    private Long merchandiseId;

    private String merchandisePic;

    private String merchandiseName;

    private String brand;

    private BigDecimal price;

    private Integer quantity;

    private Long merchandiseCategoryId;

    private BigDecimal promotionAmt;

    private BigDecimal couponAmt;

    private BigDecimal pointAmt;

    private BigDecimal payAmt;

    private Integer giftGrowth;

    private Integer giftPoint;

    private Date createTime;

    private Date modifyTime;

    public Long getTradeId() {
        return tradeId;
    }

    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
    }

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public Long getMerchandiseId() {
        return merchandiseId;
    }

    public void setMerchandiseId(Long merchandiseId) {
        this.merchandiseId = merchandiseId;
    }

    public String getMerchandisePic() {
        return merchandisePic;
    }

    public void setMerchandisePic(String merchandisePic) {
        this.merchandisePic = merchandisePic == null ? null : merchandisePic.trim();
    }

    public String getMerchandiseName() {
        return merchandiseName;
    }

    public void setMerchandiseName(String merchandiseName) {
        this.merchandiseName = merchandiseName == null ? null : merchandiseName.trim();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand == null ? null : brand.trim();
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Long getMerchandiseCategoryId() {
        return merchandiseCategoryId;
    }

    public void setMerchandiseCategoryId(Long merchandiseCategoryId) {
        this.merchandiseCategoryId = merchandiseCategoryId;
    }

    public BigDecimal getPromotionAmt() {
        return promotionAmt;
    }

    public void setPromotionAmt(BigDecimal promotionAmt) {
        this.promotionAmt = promotionAmt;
    }

    public BigDecimal getCouponAmt() {
        return couponAmt;
    }

    public void setCouponAmt(BigDecimal couponAmt) {
        this.couponAmt = couponAmt;
    }

    public BigDecimal getPointAmt() {
        return pointAmt;
    }

    public void setPointAmt(BigDecimal pointAmt) {
        this.pointAmt = pointAmt;
    }

    public BigDecimal getPayAmt() {
        return payAmt;
    }

    public void setPayAmt(BigDecimal payAmt) {
        this.payAmt = payAmt;
    }

    public Integer getGiftGrowth() {
        return giftGrowth;
    }

    public void setGiftGrowth(Integer giftGrowth) {
        this.giftGrowth = giftGrowth;
    }

    public Integer getGiftPoint() {
        return giftPoint;
    }

    public void setGiftPoint(Integer giftPoint) {
        this.giftPoint = giftPoint;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }
}