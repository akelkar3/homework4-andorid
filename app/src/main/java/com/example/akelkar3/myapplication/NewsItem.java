package com.example.akelkar3.myapplication;


/**
 * Assignment #: Homework 4
 * File Name: Group20_HW04
 * Name of students: Ankit Kelkar, Shubhra Mishra
 */

public class NewsItem {
String title,description,urlToImage, publishedAt;

    @Override
    public String toString() {
        return "NewsItem{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", urlToImage='" + urlToImage + '\'' +
                ", publishedAt='" + publishedAt + '\'' +
                '}';
    }
}
