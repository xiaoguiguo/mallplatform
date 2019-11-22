package com.doudouj.dto.pay;

public class Merchandise {
    private Long id;

    private String pccName;

    private String pccShortName;

    private Long pctId;

    private String configParams;

    private Boolean pccStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPccName() {
        return pccName;
    }

    public void setPccName(String pccName) {
        this.pccName = pccName == null ? null : pccName.trim();
    }

    public String getPccShortName() {
        return pccShortName;
    }

    public void setPccShortName(String pccShortName) {
        this.pccShortName = pccShortName == null ? null : pccShortName.trim();
    }

    public Long getPctId() {
        return pctId;
    }

    public void setPctId(Long pctId) {
        this.pctId = pctId;
    }

    public String getConfigParams() {
        return configParams;
    }

    public void setConfigParams(String configParams) {
        this.configParams = configParams == null ? null : configParams.trim();
    }

    public Boolean getPccStatus() {
        return pccStatus;
    }

    public void setPccStatus(Boolean pccStatus) {
        this.pccStatus = pccStatus;
    }
}