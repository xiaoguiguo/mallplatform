package com.doudouj.pay.model;

public class PayChannel {
    private Long id;

    private String payChannelName;

    private String payChannelShortName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPayChannelName() {
        return payChannelName;
    }

    public void setPayChannelName(String payChannelName) {
        this.payChannelName = payChannelName == null ? null : payChannelName.trim();
    }

    public String getPayChannelShortName() {
        return payChannelShortName;
    }

    public void setPayChannelShortName(String payChannelShortName) {
        this.payChannelShortName = payChannelShortName == null ? null : payChannelShortName.trim();
    }
}