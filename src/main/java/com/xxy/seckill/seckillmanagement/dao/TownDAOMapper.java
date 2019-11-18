package com.xxy.seckill.seckillmanagement.dao;

import com.xxy.seckill.seckillmanagement.dataobject.TownDAO;
import com.xxy.seckill.seckillmanagement.service.model.TownModel;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface TownDAOMapper {
    List<TownDAO> listTown(TownModel townModel);

    Integer townCount(TownModel townModel);
}