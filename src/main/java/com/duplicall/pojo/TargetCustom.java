package com.duplicall.pojo;

import com.duplicall.model.RetentionPolicy;
import com.duplicall.model.Target;


/**
 * Created by raymond on 2016/3/28.
 */
public class TargetCustom extends Target {
    private RetentionPolicy retentionPolicy;

    public RetentionPolicy getRetentionPolicy() {
        return retentionPolicy;
    }

    public void setRetentionPolicy(RetentionPolicy retentionPolicy) {
        this.retentionPolicy = retentionPolicy;
    }

    @Override
    public String toString() {
        return "TargetCustom{" +
                "retentionPolicy=" + retentionPolicy +
                '}';
    }
}
