package com.doudouj.dto.pay;

public class PayChannelType {
    private Long id;

    private String pctName;

    private String pctShortName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPctName() {
        return pctName;
    }

    public void setPctName(String pctName) {
        this.pctName = pctName == null ? null : pctName.trim();
    }

    public String getPctShortName() {
        return pctShortName;
    }

    public void setPctShortName(String pctShortName) {
        this.pctShortName = pctShortName == null ? null : pctShortName.trim();
    }
}