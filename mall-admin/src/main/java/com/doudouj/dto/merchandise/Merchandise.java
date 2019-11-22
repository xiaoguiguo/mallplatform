package com.doudouj.dto.merchandise;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class Merchandise {
    private Long id;

    private Long brandId;

    private Long merchandiseCategoryId;

    private Long merchandiseAttributeCategoryId;

    private String name;

    private String pic;

    private Boolean publishStatus;

    private Boolean newStatus;

    private Boolean recommandStatus;

    private Boolean verifyStatus;

    private Integer sort;

    private Integer sale;

    private BigDecimal price;

    private BigDecimal promotionPrice;

    private Integer giftGrowth;

    private Integer giftPoint;

    private Integer usePointLimit;

    private String subTitle;

    private BigDecimal marketPrice;

    private Integer stock;

    private Integer lowStock;

    private String unit;

    private String serviceIds;

    private String keywords;

    private String albumPics;

    private String detailTitle;

    private Date promotionStartTime;

    private Date promotionEndTime;

    private Integer promotionPerLimit;

    private Boolean promotionType;

    private Date createTime;

    private Date modifyTime;

}