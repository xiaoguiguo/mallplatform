package com.doudouj.dto.merchandise;

import java.math.BigDecimal;
import java.util.Date;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public Long getMerchandiseCategoryId() {
        return merchandiseCategoryId;
    }

    public void setMerchandiseCategoryId(Long merchandiseCategoryId) {
        this.merchandiseCategoryId = merchandiseCategoryId;
    }

    public Long getMerchandiseAttributeCategoryId() {
        return merchandiseAttributeCategoryId;
    }

    public void setMerchandiseAttributeCategoryId(Long merchandiseAttributeCategoryId) {
        this.merchandiseAttributeCategoryId = merchandiseAttributeCategoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Boolean getPublishStatus() {
        return publishStatus;
    }

    public void setPublishStatus(Boolean publishStatus) {
        this.publishStatus = publishStatus;
    }

    public Boolean getNewStatus() {
        return newStatus;
    }

    public void setNewStatus(Boolean newStatus) {
        this.newStatus = newStatus;
    }

    public Boolean getRecommandStatus() {
        return recommandStatus;
    }

    public void setRecommandStatus(Boolean recommandStatus) {
        this.recommandStatus = recommandStatus;
    }

    public Boolean getVerifyStatus() {
        return verifyStatus;
    }

    public void setVerifyStatus(Boolean verifyStatus) {
        this.verifyStatus = verifyStatus;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getSale() {
        return sale;
    }

    public void setSale(Integer sale) {
        this.sale = sale;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getPromotionPrice() {
        return promotionPrice;
    }

    public void setPromotionPrice(BigDecimal promotionPrice) {
        this.promotionPrice = promotionPrice;
    }

    public Integer getGiftGrowth() {
        return giftGrowth;
    }

    public void setGiftGrowth(Integer giftGrowth) {
        this.giftGrowth = giftGrowth;
    }

    public Integer getGiftPoint() {
        return giftPoint;
    }

    public void setGiftPoint(Integer giftPoint) {
        this.giftPoint = giftPoint;
    }

    public Integer getUsePointLimit() {
        return usePointLimit;
    }

    public void setUsePointLimit(Integer usePointLimit) {
        this.usePointLimit = usePointLimit;
    }

    public String getSubTitle() {
        return subTitle;
    }

    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle == null ? null : subTitle.trim();
    }

    public BigDecimal getMarketPrice() {
        return marketPrice;
    }

    public void setMarketPrice(BigDecimal marketPrice) {
        this.marketPrice = marketPrice;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Integer getLowStock() {
        return lowStock;
    }

    public void setLowStock(Integer lowStock) {
        this.lowStock = lowStock;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public String getServiceIds() {
        return serviceIds;
    }

    public void setServiceIds(String serviceIds) {
        this.serviceIds = serviceIds == null ? null : serviceIds.trim();
    }

    public String getKeywords() {
        return keywords;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords == null ? null : keywords.trim();
    }

    public String getAlbumPics() {
        return albumPics;
    }

    public void setAlbumPics(String albumPics) {
        this.albumPics = albumPics == null ? null : albumPics.trim();
    }

    public String getDetailTitle() {
        return detailTitle;
    }

    public void setDetailTitle(String detailTitle) {
        this.detailTitle = detailTitle == null ? null : detailTitle.trim();
    }

    public Date getPromotionStartTime() {
        return promotionStartTime;
    }

    public void setPromotionStartTime(Date promotionStartTime) {
        this.promotionStartTime = promotionStartTime;
    }

    public Date getPromotionEndTime() {
        return promotionEndTime;
    }

    public void setPromotionEndTime(Date promotionEndTime) {
        this.promotionEndTime = promotionEndTime;
    }

    public Integer getPromotionPerLimit() {
        return promotionPerLimit;
    }

    public void setPromotionPerLimit(Integer promotionPerLimit) {
        this.promotionPerLimit = promotionPerLimit;
    }

    public Boolean getPromotionType() {
        return promotionType;
    }

    public void setPromotionType(Boolean promotionType) {
        this.promotionType = promotionType;
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
}