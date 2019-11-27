package com.xxy.seckill.seckillmanagement.dataobject;

public class CompanylistDAO {
    private Integer id;
    private String code;
    private String name;
    private String address;
    private String registid;
    private String registtime;
    private String artificial;
    private String capital;
    private String creditcode;
    private String website;
    private String intro;
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }
    public String getRegistid() {
        return registid;
    }
    public void setRegistid(String registid) {
        this.registid = registid == null ? null : registid.trim();
    }
    public String getRegisttime() {
        return registtime;
    }
    public void setRegisttime(String registtime) {
        this.registtime = registtime == null ? null : registtime.trim();
    }
    public String getArtificial() {
        return artificial;
    }
    public void setArtificial(String artificial) {
        this.artificial = artificial == null ? null : artificial.trim();
    }
    public String getCapital() {
        return capital;
    }
    public void setCapital(String capital) {
        this.capital = capital == null ? null : capital.trim();
    }
    public String getCreditcode() {
        return creditcode;
    }
    public void setCreditcode(String creditcode) {
        this.creditcode = creditcode == null ? null : creditcode.trim();
    }
    public String getWebsite() {
        return website;
    }
    public void setWebsite(String website) {
        this.website = website == null ? null : website.trim();
    }
    public String getIntro() {
        return intro;
    }
    public void setIntro(String intro) {
        this.intro = intro == null ? null : intro.trim();
    }
}