package com.xxy.seckill.seckillmanagement.service;

import com.xxy.seckill.seckillmanagement.dataobject.CompanylistDAO;
import com.xxy.seckill.seckillmanagement.service.model.CompanylistModel;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CompanylistService {

    List<CompanylistDAO> listCompanylist(CompanylistModel companylistModel);
//    列表查询数量
    Integer companylistCount(CompanylistModel companylistModel);
}
