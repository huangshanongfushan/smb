package com.duplicall.model;

import java.util.Date;

public class Call {
    private String referenceId;

    private Long systemId;

    private Short channelId;

    private Long deviceId;

    private String extension;

    private String callerId;

    private String calledId;

    private String agentId;

    private Long staffId;

    private String callType;

    private Short answered;

    private Date createTime;

    private Long createPtime;

    private Date connectTime;

    private Date releaseTime;

    private Date insertTime;

    private String state;

    private Date triggerTime;

    private String startType;

    private Short encrypted;

    private Short transferCount;

    private Short tagCount;

    private String thirdParty;

    private String custom1;

    private String custom2;

    private Long duration;

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId == null ? null : referenceId.trim();
    }

    public Long getSystemId() {
        return systemId;
    }

    public void setSystemId(Long systemId) {
        this.systemId = systemId;
    }

    public Short getChannelId() {
        return channelId;
    }

    public void setChannelId(Short channelId) {
        this.channelId = channelId;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension == null ? null : extension.trim();
    }

    public String getCallerId() {
        return callerId;
    }

    public void setCallerId(String callerId) {
        this.callerId = callerId == null ? null : callerId.trim();
    }

    public String getCalledId() {
        return calledId;
    }

    public void setCalledId(String calledId) {
        this.calledId = calledId == null ? null : calledId.trim();
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId == null ? null : agentId.trim();
    }

    public Long getStaffId() {
        return staffId;
    }

    public void setStaffId(Long staffId) {
        this.staffId = staffId;
    }

    public String getCallType() {
        return callType;
    }

    public void setCallType(String callType) {
        this.callType = callType == null ? null : callType.trim();
    }

    public Short getAnswered() {
        return answered;
    }

    public void setAnswered(Short answered) {
        this.answered = answered;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Long getCreatePtime() {
        return createPtime;
    }

    public void setCreatePtime(Long createPtime) {
        this.createPtime = createPtime;
    }

    public Date getConnectTime() {
        return connectTime;
    }

    public void setConnectTime(Date connectTime) {
        this.connectTime = connectTime;
    }

    public Date getReleaseTime() {
        return releaseTime;
    }

    public void setReleaseTime(Date releaseTime) {
        this.releaseTime = releaseTime;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public Date getTriggerTime() {
        return triggerTime;
    }

    public void setTriggerTime(Date triggerTime) {
        this.triggerTime = triggerTime;
    }

    public String getStartType() {
        return startType;
    }

    public void setStartType(String startType) {
        this.startType = startType == null ? null : startType.trim();
    }

    public Short getEncrypted() {
        return encrypted;
    }

    public void setEncrypted(Short encrypted) {
        this.encrypted = encrypted;
    }

    public Short getTransferCount() {
        return transferCount;
    }

    public void setTransferCount(Short transferCount) {
        this.transferCount = transferCount;
    }

    public Short getTagCount() {
        return tagCount;
    }

    public void setTagCount(Short tagCount) {
        this.tagCount = tagCount;
    }

    public String getThirdParty() {
        return thirdParty;
    }

    public void setThirdParty(String thirdParty) {
        this.thirdParty = thirdParty == null ? null : thirdParty.trim();
    }

    public String getCustom1() {
        return custom1;
    }

    public void setCustom1(String custom1) {
        this.custom1 = custom1 == null ? null : custom1.trim();
    }

    public String getCustom2() {
        return custom2;
    }

    public void setCustom2(String custom2) {
        this.custom2 = custom2 == null ? null : custom2.trim();
    }

    public Long getDuration() {
        return duration;
    }

    public void setDuration(Long duration) {
        this.duration = duration;
    }
}