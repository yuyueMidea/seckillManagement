package com.xxy.seckill.seckillmanagement.service;

import com.xxy.seckill.seckillmanagement.service.model.PCModel;
import com.xxy.seckill.seckillmanagement.service.model.ProvinceModel;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ProvinceService {

    List<ProvinceModel> listProvince(ProvinceModel provinceModel);
//    列表查询数量
    Integer provinceCount(ProvinceModel provinceModel);

    List<PCModel> listProvinceAndCity(ProvinceModel provinceModel);
}
