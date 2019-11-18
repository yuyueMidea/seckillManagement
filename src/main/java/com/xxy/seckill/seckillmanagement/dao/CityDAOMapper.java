package com.xxy.seckill.seckillmanagement.dao;

import com.xxy.seckill.seckillmanagement.dataobject.CityDAO;
import com.xxy.seckill.seckillmanagement.service.model.CityModel;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CityDAOMapper {
    List<CityDAO> listCity(CityModel cityModel);
    List<CityDAO> getCityByPid(String provinceId);
    Integer cityCount(CityModel cityModel);
//    getCityByPid
}