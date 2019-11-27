package com.xxy.seckill.seckillmanagement.dataobject;

public class BooklistDAO {
    private Integer key;
    private String id;
    private String name;
    private String author;
    private String images;
    private String ratings;
    private String wordcount;
    private String type;
    private String serialize;
    private String like;
    public Integer getKey() {
        return key;
    }
    public void setKey(Integer key) {
        this.key = key;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author == null ? null : author.trim();
    }
    public String getImages() {
        return images;
    }
    public void setImages(String images) {
        this.images = images == null ? null : images.trim();
    }
    public String getRatings() {
        return ratings;
    }
    public void setRatings(String ratings) {
        this.ratings = ratings == null ? null : ratings.trim();
    }
    public String getWordcount() {
        return wordcount;
    }
    public void setWordcount(String wordcount) {
        this.wordcount = wordcount == null ? null : wordcount.trim();
    }
    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
    public String getSerialize() {
        return serialize;
    }
    public void setSerialize(String serialize) {
        this.serialize = serialize == null ? null : serialize.trim();
    }
    public String getLike() {
        return like;
    }
    public void setLike(String like) {
        this.like = like == null ? null : like.trim();
    }
}