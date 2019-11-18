package com.xxy.seckill.seckillmanagement.service.impl;

import com.xxy.seckill.seckillmanagement.dao.CityDAOMapper;
import com.xxy.seckill.seckillmanagement.dataobject.CityDAO;
import com.xxy.seckill.seckillmanagement.service.CityService;
import com.xxy.seckill.seckillmanagement.service.model.CityModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CityServiceImpl implements CityService {

    @Autowired
    private CityDAOMapper cityDAOMapper;

    @Override
    public  Integer cityCount(CityModel cityModel) {
        return cityDAOMapper.cityCount(cityModel);
    }

    @Override
    public List<CityModel> listCity(CityModel cityModel) {

        List<CityDAO> cityDAOList = cityDAOMapper.listCity(cityModel);
        List<CityModel> cityModelList = cityDAOList.stream().map(cityDAO -> {
            CityModel model = this.convertCityModelFromCityDAO(cityDAO);
            return model;
        }).collect(Collectors.toList());
        return cityModelList;
    }

    private CityModel convertCityModelFromCityDAO(CityDAO cityDAO) {
        if (null == cityDAO) {
            return null;
        }
        CityModel cityModel = new CityModel();
        BeanUtils.copyProperties(cityDAO, cityModel);
        return cityModel;
    }

}
