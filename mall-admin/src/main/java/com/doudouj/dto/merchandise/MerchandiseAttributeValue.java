package com.doudouj.dto.merchandise;

import lombok.Data;

@Data
public class MerchandiseAttributeValue {
    private Long id;

    private Long merchandiseId;

    private Long merchandiseAttributeId;

    private String value;

}