package com.example.root.mcu;

/**
 * Created by root on 12/17/16.
 */
public class MenuProperties {
    private String title,article;
    private int thumbnail;
    //private int thumbnail;

    public MenuProperties() {
    }

    public MenuProperties(String title, String article,int thumbnail) {
        this.title = title;
        this.article = article;
        this.thumbnail = thumbnail;
    }

    public int getThumbnail() { return thumbnail; }

    public void setThumbnail(int thumbnail) { this.thumbnail = thumbnail; }

    public String getTitle(){ return title; }

    public void setTitle(String title) { this.title = title; }

    public String getArticle(){return article;}

    public void setArticle(String article) { this.article = article;}

}
