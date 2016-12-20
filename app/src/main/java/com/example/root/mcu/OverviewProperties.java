package com.example.root.mcu;

/**
 * Created by root on 12/19/16.
 */

public class OverviewProperties {
    private String title,author,desc,url,thumbnail;
    //private int thumbnail;

    public OverviewProperties() {
    }

    public OverviewProperties(String title) {
        this.title = title;
        this.author = author;
        this.url = url;
        this.desc = desc;
        this.thumbnail = thumbnail;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) { this.thumbnail = thumbnail; }

    public String getArticleTitle(){ return title; }

    public void setArticleTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }

    public void setAuthor(String author){ this.author = author; }

    public String getDesc() { return desc; }

    public void setDesc(String desc){ this.desc = desc; }

    public String getUrl() { return url; }

    public void setUrl(String url) { this.url = url; }
}