package com.doudouj.dto.sysconfig;

import lombok.Data;

@Data
public class SysDataDict {
    private Long id;

    private Long dictId;

    private String name;

    private String value;

    private String label;

    private Integer sort;

}