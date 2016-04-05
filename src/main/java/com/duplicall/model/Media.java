package com.duplicall.model;

public class Media {
    private String referenceId;

    private String path;

    private String shortName0;

    private String shortName1;

    private String remotePath;

    public String getReferenceId() {
        return referenceId;
    }

    public void setReferenceId(String referenceId) {
        this.referenceId = referenceId == null ? null : referenceId.trim();
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path == null ? null : path.trim();
    }

    public String getShortName0() {
        return shortName0;
    }

    public void setShortName0(String shortName0) {
        this.shortName0 = shortName0 == null ? null : shortName0.trim();
    }

    public String getShortName1() {
        return shortName1;
    }

    public void setShortName1(String shortName1) {
        this.shortName1 = shortName1 == null ? null : shortName1.trim();
    }

    public String getRemotePath() {
        return remotePath;
    }

    public void setRemotePath(String remotePath) {
        this.remotePath = remotePath == null ? null : remotePath.trim();
    }
}