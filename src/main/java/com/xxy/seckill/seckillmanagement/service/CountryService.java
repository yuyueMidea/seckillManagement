package com.xxy.seckill.seckillmanagement.service;

import com.xxy.seckill.seckillmanagement.service.model.CountryModel;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CountryService {

    List<CountryModel> listCountry(CountryModel countryModel);
//    列表查询数量
    Integer countryCount(CountryModel countryModel);
}
