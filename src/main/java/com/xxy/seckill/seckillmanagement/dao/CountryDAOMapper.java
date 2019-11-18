package com.xxy.seckill.seckillmanagement.dao;

import com.xxy.seckill.seckillmanagement.dataobject.CountryDAO;
import com.xxy.seckill.seckillmanagement.service.model.CountryModel;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface CountryDAOMapper {
    List<CountryDAO> listCountry(CountryModel countryModel);
    Integer countryCount(CountryModel countryModel);
}