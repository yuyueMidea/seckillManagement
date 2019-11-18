package com.xxy.seckill.seckillmanagement.dao;

import com.xxy.seckill.seckillmanagement.dataobject.ProvinceDAO;
import com.xxy.seckill.seckillmanagement.service.model.ProvinceModel;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProvinceDAOMapper {
    List<ProvinceDAO> listProvince(ProvinceModel provinceModel);
    Integer provinceCount(ProvinceModel provinceModel);

}