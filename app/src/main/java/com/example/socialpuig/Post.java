package com.example.socialpuig;

import java.util.HashMap;
import java.util.Map;

public class Post {
    public String uid;
    public String idAuthor;
    public String author;
    public String authorPhotoUrl;
    public String content;
    public String mediaUrl;
    public String mediaType;
    public Map<String, Boolean> likes = new HashMap<>();
    public long timeStamp;
    // Constructor vacio requerido por Firestore
    public Post() {}
    public Post(String uid, String author,String idAuthor, String authorPhotoUrl, String
            content, long timeStamp, String mediaUrl, String mediaType) {
        this.uid = uid;
        this.author = author;
        this.idAuthor = idAuthor;
        this.authorPhotoUrl = authorPhotoUrl;
        this.content = content;
        this.mediaUrl = mediaUrl;
        this.mediaType = mediaType;
        this.timeStamp = timeStamp;
    }
}