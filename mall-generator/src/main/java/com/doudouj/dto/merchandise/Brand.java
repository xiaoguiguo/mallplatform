package com.doudouj.dto.merchandise;

import java.util.Date;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getMerchandiseCount() {
        return merchandiseCount;
    }

    public void setMerchandiseCount(Integer merchandiseCount) {
        this.merchandiseCount = merchandiseCount;
    }

    public Integer getMerchandiseCommentCount() {
        return merchandiseCommentCount;
    }

    public void setMerchandiseCommentCount(Integer merchandiseCommentCount) {
        this.merchandiseCommentCount = merchandiseCommentCount;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo == null ? null : logo.trim();
    }

    public String getBigPic() {
        return bigPic;
    }

    public void setBigPic(String bigPic) {
        this.bigPic = bigPic == null ? null : bigPic.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(Date modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getBrandStory() {
        return brandStory;
    }

    public void setBrandStory(String brandStory) {
        this.brandStory = brandStory == null ? null : brandStory.trim();
    }
}