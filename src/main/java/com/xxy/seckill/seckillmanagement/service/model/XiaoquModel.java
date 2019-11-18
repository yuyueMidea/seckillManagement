package com.xxy.seckill.seckillmanagement.service.model;

public class XiaoquModel {
    private Integer page;
    private Integer pageSize;
    private Integer id;
    private String city;
    private String date;

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

    private String district;
    private String area;
    private String xiaoqu;
    private Double price;
    private Integer sale;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date == null ? null : date.trim();
    }
    public String getDistrict() {
        return district;
    }
    public void setDistrict(String district) {
        this.district = district == null ? null : district.trim();
    }
    public String getArea() {
        return area;
    }
    public void setArea(String area) {
        this.area = area == null ? null : area.trim();
    }
    public String getXiaoqu() {
        return xiaoqu;
    }
    public void setXiaoqu(String xiaoqu) {
        this.xiaoqu = xiaoqu == null ? null : xiaoqu.trim();
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }
    public Integer getSale() {
        return sale;
    }
    public void setSale(Integer sale) {
        this.sale = sale;
    }
}
