package com.xxy.seckill.seckillmanagement.service.impl;

import com.xxy.seckill.seckillmanagement.dao.CityDAOMapper;
import com.xxy.seckill.seckillmanagement.dao.ProvinceDAOMapper;
import com.xxy.seckill.seckillmanagement.dataobject.CityDAO;
import com.xxy.seckill.seckillmanagement.dataobject.ProvinceDAO;
import com.xxy.seckill.seckillmanagement.service.ProvinceService;
import com.xxy.seckill.seckillmanagement.service.model.PCModel;
import com.xxy.seckill.seckillmanagement.service.model.ProvinceModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProvinceServiceImpl implements ProvinceService {

    @Autowired
    private ProvinceDAOMapper provinceDAOMapper;

    @Autowired
    private CityDAOMapper cityDAOMapper;

    @Override
    public  Integer provinceCount(ProvinceModel provinceModel) {
        return provinceDAOMapper.provinceCount(provinceModel);
    }

    @Override
    public List<PCModel> listProvinceAndCity(ProvinceModel provinceModel) {
        List<ProvinceDAO> provinceDAOList = provinceDAOMapper.listProvince(provinceModel);
        String pName = provinceModel.getName();
        String pId = provinceModel.getProvinceId();
        if(provinceDAOList.size()==1){
            pName = provinceDAOList.get(0).getName();
            pId = provinceDAOList.get(0).getProvinceId();
        }
        String finalPName = pName;
        String finalPId = pId;

        List<CityDAO> cityDAOList = cityDAOMapper.getCityByPid(pId);
        List<PCModel> pcModelList = cityDAOList.stream().map(cityDAO -> {
            PCModel model = this.convertPCModelFromCityDAO(cityDAO);
            model.setpName(finalPName);
            model.setProvinceId(finalPId);
            return model;
        }).collect(Collectors.toList());
        return pcModelList;
    }

    @Override
    public List<ProvinceModel> listProvince(ProvinceModel provinceModel) {

        List<ProvinceDAO> provinceDAOList = provinceDAOMapper.listProvince(provinceModel);
        List<ProvinceModel> provinceModelList = provinceDAOList.stream().map(provinceDAO -> {
            ProvinceModel model = this.convertProvinceModelFromProvinceDAO(provinceDAO);
            return model;
        }).collect(Collectors.toList());
        return provinceModelList;
    }

    private ProvinceModel convertProvinceModelFromProvinceDAO(ProvinceDAO provinceDAO) {
        if (null == provinceDAO) {
            return null;
        }
        ProvinceModel provinceModel = new ProvinceModel();
        BeanUtils.copyProperties(provinceDAO, provinceModel);
        return provinceModel;
    }

    private PCModel convertPCModelFromCityDAO(CityDAO cityDAO) {
        if (null == cityDAO) {
            return null;
        }
        PCModel pcModel = new PCModel();
        pcModel.setcName(cityDAO.getName());
        pcModel.setCityId(cityDAO.getCityId());
        return pcModel;
    }

}
