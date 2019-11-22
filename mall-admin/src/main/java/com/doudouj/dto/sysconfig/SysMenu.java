package com.doudouj.dto.sysconfig;

import lombok.Data;

@Data
public class SysMenu {
    private Long id;

    private String name;

    private String component;

    private Long pid;

    private Integer sort;

    private String path;

}