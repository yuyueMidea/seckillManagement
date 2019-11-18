package com.xxy.seckill.seckillmanagement.service.model;

public class BookModel {
    private String id;
    private String err;
    private String bookname;
    private String title;
    private String content;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }
    public String getErr() {
        return err;
    }
    public void setErr(String err) {
        this.err = err == null ? null : err.trim();
    }
    public String getBookname() {
        return bookname;
    }
    public void setBookname(String bookname) {
        this.bookname = bookname == null ? null : bookname.trim();
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
