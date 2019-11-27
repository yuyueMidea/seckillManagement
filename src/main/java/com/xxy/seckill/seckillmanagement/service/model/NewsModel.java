package com.xxy.seckill.seckillmanagement.service.model;

public class NewsModel {
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

    public Integer getPage() {
        return (page-1)*pageSize;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }
    private Integer page;
    private Integer pageSize;
}
