package com.xxy.seckill.seckillmanagement.service;

import com.xxy.seckill.seckillmanagement.service.model.CityModel;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CityService {

    List<CityModel> listCity(CityModel cityModel);
//    列表查询数量
    Integer cityCount(CityModel cityModel);
}
