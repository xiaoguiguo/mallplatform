package com.doudouj.dto.trade;

import java.util.Date;

public class TradeDetail {
    private Long tradeId;

    private Integer point;

    private Integer growth;

    private Boolean invoiceType;

    private String invoiceHeader;

    private String invoiceContent;

    private String invoiceReceivePhone;

    private String invoiceReceiveEmail;

    private String receiveName;

    private String receivePhone;

    private String receivePostCode;

    private String receiveProvince;

    private String receiveCity;

    private String receiveRegion;

    private String receiveDetailAddress;

    private String note;

    private Date deliveryTime;

    private Date receiveTime;

    private Date createTime;

    private Date modifyTime;

    public Long getTradeId() {
        return tradeId;
    }

    public void setTradeId(Long tradeId) {
        this.tradeId = tradeId;
    }

    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public Integer getGrowth() {
        return growth;
    }

    public void setGrowth(Integer growth) {
        this.growth = growth;
    }

    public Boolean getInvoiceType() {
        return invoiceType;
    }

    public void setInvoiceType(Boolean invoiceType) {
        this.invoiceType = invoiceType;
    }

    public String getInvoiceHeader() {
        return invoiceHeader;
    }

    public void setInvoiceHeader(String invoiceHeader) {
        this.invoiceHeader = invoiceHeader == null ? null : invoiceHeader.trim();
    }

    public String getInvoiceContent() {
        return invoiceContent;
    }

    public void setInvoiceContent(String invoiceContent) {
        this.invoiceContent = invoiceContent == null ? null : invoiceContent.trim();
    }

    public String getInvoiceReceivePhone() {
        return invoiceReceivePhone;
    }

    public void setInvoiceReceivePhone(String invoiceReceivePhone) {
        this.invoiceReceivePhone = invoiceReceivePhone == null ? null : invoiceReceivePhone.trim();
    }

    public String getInvoiceReceiveEmail() {
        return invoiceReceiveEmail;
    }

    public void setInvoiceReceiveEmail(String invoiceReceiveEmail) {
        this.invoiceReceiveEmail = invoiceReceiveEmail == null ? null : invoiceReceiveEmail.trim();
    }

    public String getReceiveName() {
        return receiveName;
    }

    public void setReceiveName(String receiveName) {
        this.receiveName = receiveName == null ? null : receiveName.trim();
    }

    public String getReceivePhone() {
        return receivePhone;
    }

    public void setReceivePhone(String receivePhone) {
        this.receivePhone = receivePhone == null ? null : receivePhone.trim();
    }

    public String getReceivePostCode() {
        return receivePostCode;
    }

    public void setReceivePostCode(String receivePostCode) {
        this.receivePostCode = receivePostCode == null ? null : receivePostCode.trim();
    }

    public String getReceiveProvince() {
        return receiveProvince;
    }

    public void setReceiveProvince(String receiveProvince) {
        this.receiveProvince = receiveProvince == null ? null : receiveProvince.trim();
    }

    public String getReceiveCity() {
        return receiveCity;
    }

    public void setReceiveCity(String receiveCity) {
        this.receiveCity = receiveCity == null ? null : receiveCity.trim();
    }

    public String getReceiveRegion() {
        return receiveRegion;
    }

    public void setReceiveRegion(String receiveRegion) {
        this.receiveRegion = receiveRegion == null ? null : receiveRegion.trim();
    }

    public String getReceiveDetailAddress() {
        return receiveDetailAddress;
    }

    public void setReceiveDetailAddress(String receiveDetailAddress) {
        this.receiveDetailAddress = receiveDetailAddress == null ? null : receiveDetailAddress.trim();
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }

    public Date getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(Date deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public Date getReceiveTime() {
        return receiveTime;
    }

    public void setReceiveTime(Date receiveTime) {
        this.receiveTime = receiveTime;
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