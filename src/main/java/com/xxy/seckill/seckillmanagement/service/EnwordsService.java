package com.xxy.seckill.seckillmanagement.service;

import com.xxy.seckill.seckillmanagement.service.model.EnwordsModel;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface EnwordsService {

    List<EnwordsModel> listEnwords(EnwordsModel enwordsModel);
//    列表查询数量
    Integer enwordsCount(EnwordsModel enwordsModel);
}
