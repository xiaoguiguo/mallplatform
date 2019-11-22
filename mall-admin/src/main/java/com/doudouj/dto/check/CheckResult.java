package com.doudouj.dto.check;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class CheckResult {
    private Long id;

    private Long acctId;

    private Long merchantId;

    private Long payId;

    private Long tradeId;

    private Long acctFlowId;

    private BigDecimal amt;

    private BigDecimal discountAmt;

    private Boolean source;

    private Date payTime;

    private Boolean checkStatus;

    private Date checkTime;

    private Date createTime;

    private Date modifyTime;

}