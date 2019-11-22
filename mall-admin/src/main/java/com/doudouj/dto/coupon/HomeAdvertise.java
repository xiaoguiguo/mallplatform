package com.doudouj.dto.coupon;

import lombok.Data;

import java.util.Date;

@Data
public class HomeAdvertise {
    private Long id;

    private String name;

    private Boolean type;

    private String pic;

    private Date startTime;

    private Date endTime;

    private Boolean adStatus;

    private Integer clickCount;

    private Integer orderCount;

    private String url;

    private String note;

    private Integer sort;

    private Date createTime;

    private Date modifyTime;

}