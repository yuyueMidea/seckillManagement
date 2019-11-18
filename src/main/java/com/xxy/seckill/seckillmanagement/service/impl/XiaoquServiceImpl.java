package com.xxy.seckill.seckillmanagement.service.impl;

import com.xxy.seckill.seckillmanagement.dao.XiaoquDAOMapper;
import com.xxy.seckill.seckillmanagement.dataobject.DictDAO;
import com.xxy.seckill.seckillmanagement.dataobject.XiaoquDAO;
import com.xxy.seckill.seckillmanagement.service.XiaoquService;
import com.xxy.seckill.seckillmanagement.service.model.DictModel;
import com.xxy.seckill.seckillmanagement.service.model.XiaoquModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class XiaoquServiceImpl implements XiaoquService {

    @Autowired
    private XiaoquDAOMapper xiaoquDAOMapper;

    @Override
    public  Integer xiaoquCount(XiaoquModel xiaoquModel) {
        return xiaoquDAOMapper.listXiaoquCount(xiaoquModel);
    }

    @Override
    public List<XiaoquDAO> listXiaoqu(XiaoquModel xiaoquModel) {

        List<XiaoquDAO> xiaoquDAOList = xiaoquDAOMapper.listXiaoqu(xiaoquModel);
//        List<XiaoquModel> xiaoquModelList = xiaoquDAOList.stream().map(xiaoquDAO -> {
//            XiaoquModel model = this.convertXiaoquModelFromXiaoquDAO(xiaoquDAO);
//            return model;
//        }).collect(Collectors.toList());
        return xiaoquDAOList;
    }

    private XiaoquModel convertXiaoquModelFromXiaoquDAO(XiaoquDAO xiaoquDAO) {
        if (null == xiaoquDAO) {
            return null;
        }
        XiaoquModel xiaoquModel = new XiaoquModel();
        BeanUtils.copyProperties(xiaoquDAO, xiaoquModel);
        return xiaoquModel;
    }


}
