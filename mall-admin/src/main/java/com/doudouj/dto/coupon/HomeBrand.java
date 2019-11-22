package com.doudouj.dto.coupon;

import lombok.Data;

import java.util.Date;

@Data
public class HomeBrand {
    private Long id;

    private Long brandId;

    private String brandName;

    private Boolean recommendStatus;

    private Integer sort;

    private Date createTime;

    private Date modifyTime;

}