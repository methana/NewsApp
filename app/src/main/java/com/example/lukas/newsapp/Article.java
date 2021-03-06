package com.example.lukas.newsapp;

public class Article {
    private String mText;
    private String mDate;
    private String mDescription;
    private String mURL;
    private String mImageUrl;

    Article(String imageUrl, String text, String date, String description, String URL)
    {
        mImageUrl = imageUrl;
        mText = text;
        mDate = date;
        mDescription = description;
        mURL = URL;

    }

    public String getmImageUrl() {
        return mImageUrl;
    }


    public String getmDescription() {
        return mDescription;
    }

    public String getmURL() {
        return mURL;
    }

    public String getmText() {
        return mText;
    }


    public String getmDate() {
        return mDate;
    }


}
