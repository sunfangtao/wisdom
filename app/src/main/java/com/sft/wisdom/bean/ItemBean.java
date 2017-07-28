package com.sft.wisdom.bean;

import cn.sft.sqlhelper.DBVO;

/**
 * Created by Administrator on 2017/7/28.
 */

public class ItemBean extends DBVO {

    private String key;
    private String value;
    private int leftDrawableId;
    private int rightDrawableId;
    private int badge;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public int getLeftDrawableId() {
        return leftDrawableId;
    }

    public void setLeftDrawableId(int leftDrawableId) {
        this.leftDrawableId = leftDrawableId;
    }

    public int getRightDrawableId() {
        return rightDrawableId;
    }

    public void setRightDrawableId(int rightDrawableId) {
        this.rightDrawableId = rightDrawableId;
    }

    public int getBadge() {
        return badge;
    }

    public void setBadge(int badge) {
        this.badge = badge;
    }
}
