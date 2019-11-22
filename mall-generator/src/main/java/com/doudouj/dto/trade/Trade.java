package com.doudouj.dto.trade;

import java.math.BigDecimal;
import java.util.Date;

public class Trade {
    private Long tradeId;

    private Long acctId;

    private Long couponId;

    private BigDecimal amt;

    private BigDecimal discountAmt;

    private BigDecimal freightAmt;

    private BigDecimal promotionAmt;

    private BigDecimal pointAmt;

    private BigDecimal couponAmt;

    private BigDecimal payAmt;

    private Boolean payChannel;

    private Boolean sourceType;

    private Boolean tradeStatus;

    private Boolean deliveryCompany;

    private Integer autoConfirmDay;

    private Boolean confirmStatus;

    private Integer usePoint;

    private Date payTime;

    private Date createTime;

    private Date modifyTime;

    public Long getTradeId() {
        return tradeId;
    }

    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
    }

    public Long getAcctId() {
        return acctId;
    }

    public void setAcctId(Long acctId) {
        this.acctId = acctId;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
    }

    public BigDecimal getDiscountAmt() {
        return discountAmt;
    }

    public void setDiscountAmt(BigDecimal discountAmt) {
        this.discountAmt = discountAmt;
    }

    public BigDecimal getFreightAmt() {
        return freightAmt;
    }

    public void setFreightAmt(BigDecimal freightAmt) {
        this.freightAmt = freightAmt;
    }

    public BigDecimal getPromotionAmt() {
        return promotionAmt;
    }

    public void setPromotionAmt(BigDecimal promotionAmt) {
        this.promotionAmt = promotionAmt;
    }

    public BigDecimal getPointAmt() {
        return pointAmt;
    }

    public void setPointAmt(BigDecimal pointAmt) {
        this.pointAmt = pointAmt;
    }

    public BigDecimal getCouponAmt() {
        return couponAmt;
    }

    public void setCouponAmt(BigDecimal couponAmt) {
        this.couponAmt = couponAmt;
    }

    public BigDecimal getPayAmt() {
        return payAmt;
    }

    public void setPayAmt(BigDecimal payAmt) {
        this.payAmt = payAmt;
    }

    public Boolean getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(Boolean payChannel) {
        this.payChannel = payChannel;
    }

    public Boolean getSourceType() {
        return sourceType;
    }

    public void setSourceType(Boolean sourceType) {
        this.sourceType = sourceType;
    }

    public Boolean getTradeStatus() {
        return tradeStatus;
    }

    public void setTradeStatus(Boolean tradeStatus) {
        this.tradeStatus = tradeStatus;
    }

    public Boolean getDeliveryCompany() {
        return deliveryCompany;
    }

    public void setDeliveryCompany(Boolean deliveryCompany) {
        this.deliveryCompany = deliveryCompany;
    }

    public Integer getAutoConfirmDay() {
        return autoConfirmDay;
    }

    public void setAutoConfirmDay(Integer autoConfirmDay) {
        this.autoConfirmDay = autoConfirmDay;
    }

    public Boolean getConfirmStatus() {
        return confirmStatus;
    }

    public void setConfirmStatus(Boolean confirmStatus) {
        this.confirmStatus = confirmStatus;
    }

    public Integer getUsePoint() {
        return usePoint;
    }

    public void setUsePoint(Integer usePoint) {
        this.usePoint = usePoint;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
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