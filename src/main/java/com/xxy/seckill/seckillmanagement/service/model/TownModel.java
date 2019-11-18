package com.xxy.seckill.seckillmanagement.service.model;

public class TownModel {
    private Integer id;
    private String name;
    private String townId;
    private String countryId;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
    public String getTownId() {
        return townId;
    }
    public void setTownId(String townId) {
        this.townId = townId == null ? null : townId.trim();
    }
    public String getCountryId() {
        return countryId;
    }
    public void setCountryId(String countryId) {
        this.countryId = countryId == null ? null : countryId.trim();
    }
}
