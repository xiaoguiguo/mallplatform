package com.doudouj.dto.accounts;

import lombok.Data;

import java.util.Date;

@Data
public class Merchant {
    private Long id;

    private String name;

    private String email;

    private String phone;

    private String city;

    private Boolean merchantStatus;

    private String logo;

    private Date createTime;

    private Date modifyTime;

}