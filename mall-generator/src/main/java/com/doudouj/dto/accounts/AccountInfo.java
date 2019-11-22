package com.doudouj.dto.accounts;

import java.math.BigDecimal;
import java.util.Date;

public class AccountInfo {
    private Long id;

    private Long tripartAcctId;

    private String name;

    private Byte acctType;

    private Byte acctStatus;

    private BigDecimal balance;

    private Integer growth;

    private Integer point;

    private Byte level;

    private Boolean vipStatus;

    private Date createTime;

    private Date modifyTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getTripartAcctId() {
        return tripartAcctId;
    }

    public void setTripartAcctId(Long tripartAcctId) {
        this.tripartAcctId = tripartAcctId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Byte getAcctType() {
        return acctType;
    }

    public void setAcctType(Byte acctType) {
        this.acctType = acctType;
    }

    public Byte getAcctStatus() {
        return acctStatus;
    }

    public void setAcctStatus(Byte acctStatus) {
        this.acctStatus = acctStatus;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Byte getLevel() {
        return level;
    }

    public void setLevel(Byte level) {
        this.level = level;
    }

    public Boolean getVipStatus() {
        return vipStatus;
    }

    public void setVipStatus(Boolean vipStatus) {
        this.vipStatus = vipStatus;
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