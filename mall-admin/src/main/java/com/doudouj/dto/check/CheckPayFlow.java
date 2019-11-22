package com.doudouj.dto.check;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class CheckPayFlow {
    private Long id;

    private Long payId;

    private Long tradeId;

    private BigDecimal tradeAmt;

    private BigDecimal payAmt;

    private Boolean payType;

    private Boolean payStatus;

    private Long acctId;

    private Long merchantId;

    private Boolean payChannelId;

    private Date payTime;

    private Date createTime;

    private Date modifyTime;

}