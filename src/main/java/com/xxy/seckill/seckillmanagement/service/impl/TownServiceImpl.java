package com.xxy.seckill.seckillmanagement.service.impl;

import com.xxy.seckill.seckillmanagement.dao.TownDAOMapper;
import com.xxy.seckill.seckillmanagement.dataobject.TownDAO;
import com.xxy.seckill.seckillmanagement.service.TownService;
import com.xxy.seckill.seckillmanagement.service.model.TownModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TownServiceImpl implements TownService {

    @Autowired
    private TownDAOMapper townDAOMapper;

    @Override
    public  Integer townCount(TownModel townModel) {
        return townDAOMapper.townCount(townModel);
    }

    @Override
    public List<TownModel> listTown(TownModel townModel) {

        List<TownDAO> townDAOList = townDAOMapper.listTown(townModel);
        List<TownModel> townModelList = townDAOList.stream().map(townDAO -> {
            TownModel model = this.convertTownModelFromTownDAO(townDAO);
            return model;
        }).collect(Collectors.toList());
        return townModelList;
    }

    private TownModel convertTownModelFromTownDAO(TownDAO townDAO) {
        if (null == townDAO) {
            return null;
        }
        TownModel townModel = new TownModel();
        BeanUtils.copyProperties(townDAO, townModel);
        return townModel;
    }

}
