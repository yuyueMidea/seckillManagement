package com.xxy.seckill.seckillmanagement.dao;

import com.xxy.seckill.seckillmanagement.dataobject.EnwordsDAO;
import com.xxy.seckill.seckillmanagement.service.model.EnwordsModel;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EnwordsDAOMapper {

    Integer enwordsCount(EnwordsModel enwordsModel);

    List<EnwordsDAO> listEnwords(EnwordsModel enwordsModel);
}