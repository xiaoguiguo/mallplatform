package com.doudouj.dto.accounts;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
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

}