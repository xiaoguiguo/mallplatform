package com.doudouj.dto.trade;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class TradeItem {
    private Long tradeId;

    private Long merchantId;

    private Long merchandiseId;

    private String merchandisePic;

    private String merchandiseName;

    private String brand;

    private BigDecimal price;

    private Integer quantity;

    private Long merchandiseCategoryId;

    private BigDecimal promotionAmt;

    private BigDecimal couponAmt;

    private BigDecimal pointAmt;

    private BigDecimal payAmt;

    private Integer giftGrowth;

    private Integer giftPoint;

    private Date createTime;

    private Date modifyTime;

}