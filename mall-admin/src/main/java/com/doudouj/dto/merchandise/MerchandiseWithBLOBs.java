package com.doudouj.dto.merchandise;

import lombok.Data;

@Data
public class MerchandiseWithBLOBs extends Merchandise {
    private String description;

    private String detailDesc;

    private String detailHtml;

    private String detailMobileHtml;

}