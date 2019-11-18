package com.xxy.seckill.seckillmanagement.service.model;

public class MoviesModel {
    private Integer page;
    private Integer pageSize;

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

    private String id;
    private String name;
    private String href;
    private String image;
    private String score;
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
    public String getHref() {
        return href;
    }
    public void setHref(String href) {
        this.href = href == null ? null : href.trim();
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }
    public String getScore() {
        return score;
    }
    public void setScore(String score) {
        this.score = score == null ? null : score.trim();
    }
}
