package com.doudouj.dto.accounts;

import java.util.Date;

public class AccountReport {
    private Long id;

    private Boolean reportType;

    private Long acctId;

    private Boolean reportStatus;

    private Boolean handleStatus;

    private String note;

    private Date createTime;

    private Date modifyTime;

    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getReportType() {
        return reportType;
    }

    public void setReportType(Boolean reportType) {
        this.reportType = reportType;
    }

    public Long getAcctId() {
        return acctId;
    }

    public void setAcctId(Long acctId) {
        this.acctId = acctId;
    }

    public Boolean getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(Boolean reportStatus) {
        this.reportStatus = reportStatus;
    }

    public Boolean getHandleStatus() {
        return handleStatus;
    }

    public void setHandleStatus(Boolean handleStatus) {
        this.handleStatus = handleStatus;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}