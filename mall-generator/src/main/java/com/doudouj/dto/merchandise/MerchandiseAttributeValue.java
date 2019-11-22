package com.doudouj.dto.merchandise;

public class MerchandiseAttributeValue {
    private Long id;

    private Long merchandiseId;

    private Long merchandiseAttributeId;

    private String value;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMerchandiseId() {
        return merchandiseId;
    }

    public void setMerchandiseId(Long merchandiseId) {
        this.merchandiseId = merchandiseId;
    }

    public Long getMerchandiseAttributeId() {
        return merchandiseAttributeId;
    }

    public void setMerchandiseAttributeId(Long merchandiseAttributeId) {
        this.merchandiseAttributeId = merchandiseAttributeId;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value == null ? null : value.trim();
    }
}