package com.doudouj.dto.merchandise;

import lombok.Data;

import java.util.Date;

@Data
public class Brand {
    private Long id;

    private String name;

    private Integer sort;

    private Integer merchandiseCount;

    private Integer merchandiseCommentCount;

    private String logo;

    private String bigPic;

    private Date createTime;

    private Date modifyTime;

    private String brandStory;

}