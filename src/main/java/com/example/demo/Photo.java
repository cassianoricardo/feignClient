package com.example.demo;

public class Photo {

    private int albumId;
    private int id;
    private String title;
    private String url;
    private String thumbnaiUrl;

    public int getAlbumId() {
        return albumId;
    }

    public void setAlbumId(int albumId) {
        this.albumId = albumId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getThumbnaiUrl() {
        return thumbnaiUrl;
    }

    public void setThumbnaiUrl(String thumbnaiUrl) {
        this.thumbnaiUrl = thumbnaiUrl;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "albumId=" + albumId +
                ", id=" + id +
                ", title='" + title + '\'' +
                ", url='" + url + '\'' +
                ", thumbnaiUrl='" + thumbnaiUrl + '\'' +
                '}';
    }
}