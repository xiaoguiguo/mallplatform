package com.doudouj.dto;

import lombok.Data;

import java.util.Date;

@Data
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

}