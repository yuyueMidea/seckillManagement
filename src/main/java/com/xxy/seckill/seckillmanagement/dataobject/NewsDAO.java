package com.xxy.seckill.seckillmanagement.dataobject;

public class NewsDAO {
    private Integer keyid;
    private String title;
    private String content;
    public Integer getKeyid() {
        return keyid;
    }
    public void setKeyid(Integer keyid) {
        this.keyid = keyid;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
}