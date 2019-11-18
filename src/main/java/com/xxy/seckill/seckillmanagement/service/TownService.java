package com.xxy.seckill.seckillmanagement.service;

import com.xxy.seckill.seckillmanagement.service.model.TownModel;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface TownService {

    List<TownModel> listTown(TownModel townModel);
//    列表查询数量
    Integer townCount(TownModel townModel);
}
