package com.doudouj.dto.accounts;

import lombok.Data;

import java.util.Date;

@Data
public class AccountReport {
    private Long id;

    private Boolean reportType;

    private Long acctId;

    private Boolean reportStatus;

    private Boolean handleStatus;

    private String note;

    private Date createTime;

    private Date modifyTime;

    private String description;

}