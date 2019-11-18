package com.xxy.seckill.seckillmanagement.service.impl;

import com.xxy.seckill.seckillmanagement.dao.CountryDAOMapper;
import com.xxy.seckill.seckillmanagement.dataobject.CountryDAO;
import com.xxy.seckill.seckillmanagement.service.CountryService;
import com.xxy.seckill.seckillmanagement.service.model.CountryModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CountryServiceImpl implements CountryService {

    @Autowired
    private CountryDAOMapper countryDAOMapper;

    @Override
    public  Integer countryCount(CountryModel countryModel) {
        return countryDAOMapper.countryCount(countryModel);
    }

    @Override
    public List<CountryModel> listCountry(CountryModel countryModel) {

        List<CountryDAO> countryDAOList = countryDAOMapper.listCountry(countryModel);
        List<CountryModel> countryModelList = countryDAOList.stream().map(countryDAO -> {
            CountryModel model = this.convertCountryModelFromCountryDAO(countryDAO);
            return model;
        }).collect(Collectors.toList());
        return countryModelList;
    }

    private CountryModel convertCountryModelFromCountryDAO(CountryDAO countryDAO) {
        if (null == countryDAO) {
            return null;
        }
        CountryModel countryModel = new CountryModel();
        BeanUtils.copyProperties(countryDAO, countryModel);
        return countryModel;
    }

}
