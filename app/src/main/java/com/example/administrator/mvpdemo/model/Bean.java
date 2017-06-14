package com.example.administrator.mvpdemo.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by Administrator on 2017/6/13.
 */

public class Bean {
    /**
     * {
     "error": false,
     "results": [
      {
     "_id": "593dde44421aa92c73b647f5",
     "createdAt": "2017-06-12T08:20:20.475Z",
     "desc": "6-12",
     "publishedAt": "2017-06-12T11:11:11.25Z",
     "source": "chrome",
     "type": "\u798f\u5229",
     "url": "https://ws1.sinaimg.cn/large/610dc034ly1fgi3vd6irmj20u011i439.jpg",
     "used": true,
     "who": "\u4ee3\u7801\u5bb6"
      }
     }
     *
     * */
    @SerializedName("error")
    private boolean error;

    @SerializedName("results")
    private List<ImageDetail> results;

    public boolean isError() {
        return error;
    }

    public List<ImageDetail> getResults() {
        return results;
    }

    public static class ImageDetail{
        @SerializedName("_id")
        private String id;
        @SerializedName("createdAt")
        private String created;
        @SerializedName("desc")
        private String desc;
        @SerializedName("publishedAt")
        private String published;
        @SerializedName("source")
        private String source;
        @SerializedName("type")
        private String type;
        @SerializedName("url")
        private String url;
        @SerializedName("used")
        private boolean used;
        @SerializedName("who")
        private String who;

        public String getId() {
            return id;
        }

        public String getCreated() {
            return created;
        }

        public String getDesc() {
            return desc;
        }

        public String getPublished() {
            return published;
        }

        public String getSource() {
            return source;
        }

        public String getType() {
            return type;
        }

        public String getUrl() {
            return url;
        }

        public boolean isUsed() {
            return used;
        }

        public String getWho() {
            return who;
        }
    }
}
