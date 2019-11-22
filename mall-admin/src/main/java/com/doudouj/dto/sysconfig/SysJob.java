package com.doudouj.dto.sysconfig;

import lombok.Data;

@Data
public class SysJob {
    private Long id;

    private String name;

    private Integer sort;

    private Long orgId;

    private String remark;

}