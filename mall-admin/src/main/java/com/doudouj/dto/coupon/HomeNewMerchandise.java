package com.doudouj.dto.coupon;

import lombok.Data;

import java.util.Date;

@Data
public class HomeNewMerchandise {
    private Long id;

    private Long merchandiseId;

    private String merchandiseName;

    private Boolean recommendStatus;

    private Integer sort;

    private Date createTime;

    private Date modifyTime;

}