package com.doudouj.dto.check;

import java.math.BigDecimal;
import java.util.Date;

public class CheckTradeFlow {
    private Long id;

    private Long tradeId;

    private Long acctId;

    private BigDecimal amt;

    private BigDecimal payAmt;

    private Boolean payChannel;

    private Boolean sourceType;

    private Boolean tradeStatus;

    private Date payTime;

    private Date createTime;

    private Date modifyTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

    public BigDecimal getAmt() {
        return amt;
    }

    public void setAmt(BigDecimal amt) {
        this.amt = amt;
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