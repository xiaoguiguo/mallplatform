package com.doudouj.dto.sysconfig;

import lombok.Data;

import java.util.Date;

@Data
public class SysUser {
    private Long id;

    private String avatar;

    private String username;

    private String email;

    private String phone;

    private Long orgId;

    private Long jobId;

    private Boolean enabled;

    private String password;

    private Date createTime;

    private Date modifyTime;

}