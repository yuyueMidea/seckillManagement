package com.xxy.seckill.seckillmanagement.dao;

import com.xxy.seckill.seckillmanagement.dataobject.CompanylistDAO;
import com.xxy.seckill.seckillmanagement.service.model.CompanylistModel;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface CompanylistDAOMapper {
    List<CompanylistDAO> listCompanylist(CompanylistModel companylistModel);
    Integer companylistCount(CompanylistModel companylistModel);
}