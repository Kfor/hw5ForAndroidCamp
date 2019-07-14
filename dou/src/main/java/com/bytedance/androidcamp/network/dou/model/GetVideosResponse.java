package com.bytedance.androidcamp.network.dou.model;

import com.bytedance.androidcamp.network.dou.model.Video;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GetVideosResponse {
    @SerializedName("success") private boolean success;
    @SerializedName("feeds") private List<Video> feeds;

    public boolean isSuccess() {return success;}
    public List<Video> getVideos(){return feeds;}

}
