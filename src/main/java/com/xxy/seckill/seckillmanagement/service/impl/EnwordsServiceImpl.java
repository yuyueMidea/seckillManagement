package com.xxy.seckill.seckillmanagement.service.impl;

import com.xxy.seckill.seckillmanagement.dao.EnwordsDAOMapper;
import com.xxy.seckill.seckillmanagement.dataobject.EnwordsDAO;
import com.xxy.seckill.seckillmanagement.service.EnwordsService;
import com.xxy.seckill.seckillmanagement.service.model.EnwordsModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EnwordsServiceImpl implements EnwordsService {

    @Autowired
    private EnwordsDAOMapper enwordsDAOMapper;

    @Override
    public  Integer enwordsCount(EnwordsModel enwordsModel) {
        return enwordsDAOMapper.enwordsCount(enwordsModel);
    }

    @Override
    public List<EnwordsModel> listEnwords(EnwordsModel enwordsModel) {

        List<EnwordsDAO> enwordsDAOList = enwordsDAOMapper.listEnwords(enwordsModel);
        List<EnwordsModel> enwordsModelList = enwordsDAOList.stream().map(enwordsDAO -> {
            EnwordsModel model = this.convertEnwordsModelFromEnwordsDAO(enwordsDAO);
            return model;
        }).collect(Collectors.toList());
        return enwordsModelList;
    }

    private EnwordsModel convertEnwordsModelFromEnwordsDAO(EnwordsDAO enwordsDAO) {
        if (null == enwordsDAO) {
            return null;
        }
        EnwordsModel enwordsModel = new EnwordsModel();
        BeanUtils.copyProperties(enwordsDAO, enwordsModel);
        return enwordsModel;
    }

}
