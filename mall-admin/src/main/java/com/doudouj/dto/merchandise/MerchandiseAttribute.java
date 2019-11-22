package com.doudouj.dto.merchandise;

import lombok.Data;

@Data
public class MerchandiseAttribute {
    private Long id;

    private Long merchandiseAttributeCategoryId;

    private String name;

    private Boolean selectType;

    private Boolean inputType;

    private String inputList;

    private Integer sort;

    private Boolean filterType;

    private Boolean searchType;

    private Boolean relatedType;

    private Boolean type;

}