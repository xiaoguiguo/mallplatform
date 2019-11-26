package com.doudouj.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
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

}