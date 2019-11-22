package com.doudouj.dto.accounts;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class AccountFlow {
    private Long id;

    private Long acctId;

    private Long merchantId;

    private Long tradeId;

    private Byte payType;

    private BigDecimal amt;

    private Date tradeTime;

    private Byte tradeStatus;

    private Date createTime;

    private Date modifyTime;

}