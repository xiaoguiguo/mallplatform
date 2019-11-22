package com.doudouj.dto.coupon;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Coupon {
    private Long id;

    private Boolean type;

    private String name;

    private Boolean platform;

    private Integer count;

    private BigDecimal amount;

    private Integer perLimit;

    private Date startTime;

    private Date endTime;

    private Boolean useType;

    private String note;

    private Integer publishCount;

    private Integer useCount;

    private Integer receiveCount;

    private Date receiveTime;

    private String code;

    private Date createTime;

    private Date modifyTime;

}