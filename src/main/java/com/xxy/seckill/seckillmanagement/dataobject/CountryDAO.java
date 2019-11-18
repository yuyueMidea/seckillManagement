package com.xxy.seckill.seckillmanagement.dataobject;

public class CountryDAO {
    private Integer id;
    private String name;
    private String countryId;
    private String cityId;
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
    public String getCountryId() {
        return countryId;
    }
    public void setCountryId(String countryId) {
        this.countryId = countryId == null ? null : countryId.trim();
    }
    public String getCityId() {
        return cityId;
    }
    public void setCityId(String cityId) {
        this.cityId = cityId == null ? null : cityId.trim();
    }
}