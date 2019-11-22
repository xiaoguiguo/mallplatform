package com.doudouj.dto.trade;

import java.math.BigDecimal;
import java.util.Date;

public class TradeReturnApply {
    private Long id;

    private Long tradeId;

    private Long acctId;

    private String acctName;

    private Long merchandiseId;

    private Long merchantId;

    private BigDecimal returnAmt;

    private String returnName;

    private String returnPhone;

    private Boolean returnStatus;

    private Date handleTime;

    private String merchandisePic;

    private String merchandiseName;

    private String brand;

    private String merchandiseAttribute;

    private Integer merchandiseCount;

    private BigDecimal merchandisePrice;

    private BigDecimal merchandisePayPrice;

    private String reason;

    private String proofPics;

    private String handleNote;

    private String handleMan;

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

    public String getAcctName() {
        return acctName;
    }

    public void setAcctName(String acctName) {
        this.acctName = acctName == null ? null : acctName.trim();
    }

    public Long getMerchandiseId() {
        return merchandiseId;
    }

    public void setMerchandiseId(Long merchandiseId) {
        this.merchandiseId = merchandiseId;
    }

    public Long getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Long merchantId) {
        this.merchantId = merchantId;
    }

    public BigDecimal getReturnAmt() {
        return returnAmt;
    }

    public void setReturnAmt(BigDecimal returnAmt) {
        this.returnAmt = returnAmt;
    }

    public String getReturnName() {
        return returnName;
    }

    public void setReturnName(String returnName) {
        this.returnName = returnName == null ? null : returnName.trim();
    }

    public String getReturnPhone() {
        return returnPhone;
    }

    public void setReturnPhone(String returnPhone) {
        this.returnPhone = returnPhone == null ? null : returnPhone.trim();
    }

    public Boolean getReturnStatus() {
        return returnStatus;
    }

    public void setReturnStatus(Boolean returnStatus) {
        this.returnStatus = returnStatus;
    }

    public Date getHandleTime() {
        return handleTime;
    }

    public void setHandleTime(Date handleTime) {
        this.handleTime = handleTime;
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

    public String getMerchandiseAttribute() {
        return merchandiseAttribute;
    }

    public void setMerchandiseAttribute(String merchandiseAttribute) {
        this.merchandiseAttribute = merchandiseAttribute == null ? null : merchandiseAttribute.trim();
    }

    public Integer getMerchandiseCount() {
        return merchandiseCount;
    }

    public void setMerchandiseCount(Integer merchandiseCount) {
        this.merchandiseCount = merchandiseCount;
    }

    public BigDecimal getMerchandisePrice() {
        return merchandisePrice;
    }

    public void setMerchandisePrice(BigDecimal merchandisePrice) {
        this.merchandisePrice = merchandisePrice;
    }

    public BigDecimal getMerchandisePayPrice() {
        return merchandisePayPrice;
    }

    public void setMerchandisePayPrice(BigDecimal merchandisePayPrice) {
        this.merchandisePayPrice = merchandisePayPrice;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getProofPics() {
        return proofPics;
    }

    public void setProofPics(String proofPics) {
        this.proofPics = proofPics == null ? null : proofPics.trim();
    }

    public String getHandleNote() {
        return handleNote;
    }

    public void setHandleNote(String handleNote) {
        this.handleNote = handleNote == null ? null : handleNote.trim();
    }

    public String getHandleMan() {
        return handleMan;
    }

    public void setHandleMan(String handleMan) {
        this.handleMan = handleMan == null ? null : handleMan.trim();
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