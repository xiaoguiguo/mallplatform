package com.doudouj.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
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

}