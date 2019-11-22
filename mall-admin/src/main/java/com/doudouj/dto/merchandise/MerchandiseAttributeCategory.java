package com.doudouj.dto.merchandise;

import lombok.Data;

@Data
public class MerchandiseAttributeCategory {
    private Long id;

    private String name;

    private Integer attributeCount;

    private Integer paramCount;

}