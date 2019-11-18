package com.xxy.seckill.seckillmanagement.service;

import com.xxy.seckill.seckillmanagement.dataobject.XiaoquDAO;
import com.xxy.seckill.seckillmanagement.service.model.XiaoquModel;
import org.springframework.stereotype.Service;

import java.util.List;
public interface XiaoquService {

    List<XiaoquDAO> listXiaoqu(XiaoquModel xiaoquModel);
    //listXiaoquCount---列表查询数量
    Integer xiaoquCount(XiaoquModel xiaoquModel);
}
