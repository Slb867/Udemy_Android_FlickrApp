package com.example.flickrapp;

public class Photo {
    private String mTitle;
    private String mAuthor;
    private String mAuthorId;
    private String mLinks;
    private String mTag;
    private String mImageUrl;

    public Photo(String title, String author, String authorId, String links, String tag, String imageUrl) {
        this.mTitle = title;
        this.mAuthor = author;
        this.mAuthorId = authorId;
        this.mLinks = links;
        this.mTag = tag;
        this.mImageUrl = imageUrl;
    }

    public void setTitle(String title) {
        this.mTitle = title;
    }

    public void setAuthor(String author) {
        this.mAuthor = author;
    }

    public void setAuthorId(String authorId) {
        this.mAuthorId = authorId;
    }

    public void setLinks(String links) {
        this.mLinks = links;
    }

    public void setTag(String tag) {
        this.mTag = tag;
    }

    public void setmImageUrl(String imageUrl) {
        this.mImageUrl = imageUrl;
    }

    public String getTitle() {
        return mTitle;
    }

    public String getAuthor() {
        return mAuthor;
    }

    public String getAuthorId() {
        return mAuthorId;
    }

    public String getLinks() {
        return mLinks;
    }

    public String getTag() {
        return mTag;
    }

    public String getImageUrl() {
        return mImageUrl;
    }

    @Override
    public String toString() {
        return "Photo{" +
                "mTitle='" + mTitle + '\'' +
                ", mAuthor='" + mAuthor + '\'' +
                ", mAuthorId='" + mAuthorId + '\'' +
                ", mLinks='" + mLinks + '\'' +
                ", mTag='" + mTag + '\'' +
                ", mImageUrl='" + mImageUrl + '\'' +
                '}';
    }

}
