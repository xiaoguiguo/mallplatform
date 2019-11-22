package com.doudouj.dto.merchandise;

import lombok.Data;

import java.util.Date;

@Data
public class MerchandiseComment {
    private Long id;

    private Long merchandiseId;

    private String acctName;

    private String merchandiseName;

    private Boolean star;

    private Boolean showStatus;

    private String merchandiseAttribute;

    private String pics;

    private String acctIcon;

    private Integer likeCount;

    private Integer unlikeCount;

    private Date createTime;

    private Date modifyTime;

    private String content;

}