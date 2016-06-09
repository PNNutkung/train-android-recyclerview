package com.example.nut.samplerecyclerview.model;

/**
 * Created by nut on 9/6/2559.
 */
public class ItemObject {
    private String detail;
    private int icon;

    public ItemObject(String detail, int icon) {
        this.detail = detail;
        this.icon = icon;
    }

    public String getDetail() {
        return detail;
    }

    public int getIcon() {
        return icon;
    }
}
