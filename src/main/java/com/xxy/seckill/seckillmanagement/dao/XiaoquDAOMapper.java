package com.xxy.seckill.seckillmanagement.dao;

import com.xxy.seckill.seckillmanagement.dataobject.XiaoquDAO;
import com.xxy.seckill.seckillmanagement.service.model.XiaoquModel;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface XiaoquDAOMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(XiaoquDAO record);

    int insertSelective(XiaoquDAO record);

    XiaoquDAO selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(XiaoquDAO record);

    int updateByPrimaryKey(XiaoquDAO record);

    List<XiaoquDAO> listXiaoqu(XiaoquModel xiaoquModel);

    Integer listXiaoquCount(XiaoquModel xiaoquModel);
}