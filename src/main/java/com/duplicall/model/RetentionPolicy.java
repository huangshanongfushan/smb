package com.duplicall.model;

/**
 * Created by raymond on 2016/3/28.
 */
public class RetentionPolicy {
    private Integer id;
    private String name;
    private Integer period;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPeriod() {
        return period;
    }

    public void setPeriod(Integer period) {
        this.period = period;
    }

    @Override
    public String toString() {
        return "RetentionPolicy{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", period=" + period +
                '}';
    }
}
