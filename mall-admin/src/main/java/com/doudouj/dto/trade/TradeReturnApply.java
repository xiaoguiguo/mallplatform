package com.doudouj.dto.trade;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

@Data
public class TradeReturnApply {
    private Long id;

    private Long tradeId;

    private Long acctId;

    private String acctName;

    private Long merchandiseId;

    private Long merchantId;

    private BigDecimal returnAmt;

    private String returnName;

    private String returnPhone;

    private Boolean returnStatus;

    private Date handleTime;

    private String merchandisePic;

    private String merchandiseName;

    private String brand;

    private String merchandiseAttribute;

    private Integer merchandiseCount;

    private BigDecimal merchandisePrice;

    private BigDecimal merchandisePayPrice;

    private String reason;

    private String proofPics;

    private String handleNote;

    private String handleMan;

    private Date createTime;

    private Date modifyTime;

}