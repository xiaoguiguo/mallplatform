package com.doudouj.merchandise.model;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Boolean getSelectType() {
        return selectType;
    }

    public void setSelectType(Boolean selectType) {
        this.selectType = selectType;
    }

    public Boolean getInputType() {
        return inputType;
    }

    public void setInputType(Boolean inputType) {
        this.inputType = inputType;
    }

    public String getInputList() {
        return inputList;
    }

    public void setInputList(String inputList) {
        this.inputList = inputList == null ? null : inputList.trim();
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Boolean getFilterType() {
        return filterType;
    }

    public void setFilterType(Boolean filterType) {
        this.filterType = filterType;
    }

    public Boolean getSearchType() {
        return searchType;
    }

    public void setSearchType(Boolean searchType) {
        this.searchType = searchType;
    }

    public Boolean getRelatedType() {
        return relatedType;
    }

    public void setRelatedType(Boolean relatedType) {
        this.relatedType = relatedType;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }
}