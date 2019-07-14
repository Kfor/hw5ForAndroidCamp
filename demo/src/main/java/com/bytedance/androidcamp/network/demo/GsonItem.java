package com.bytedance.androidcamp.network.demo;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GsonItem {
    @SerializedName("breeds")
    public List<String> breeds;
    @SerializedName("id")
    public int id;
    @SerializedName("url")
    public String url;
    @SerializedName("width")
    public int width;
    @SerializedName("height")
    public int height;
}