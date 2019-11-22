package com.doudouj.dto.pay;

import lombok.Data;

@Data
public class Merchandise {
    private Long id;

    private String pccName;

    private String pccShortName;

    private Long pctId;

    private String configParams;

    private Boolean pccStatus;

}