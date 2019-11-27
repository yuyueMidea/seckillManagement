package com.xxy.seckill.seckillmanagement.service.impl;

import com.xxy.seckill.seckillmanagement.dao.CompanylistDAOMapper;
import com.xxy.seckill.seckillmanagement.dataobject.CompanylistDAO;
import com.xxy.seckill.seckillmanagement.service.CompanylistService;
import com.xxy.seckill.seckillmanagement.service.model.CompanylistModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CompanylistServiceImpl implements CompanylistService {

    @Autowired
    private CompanylistDAOMapper companylistDAOMapper;

    @Override
    public  Integer companylistCount(CompanylistModel companylistModel) {
        return companylistDAOMapper.companylistCount(companylistModel);
    }

    @Override
    public List<CompanylistDAO> listCompanylist(CompanylistModel companylistModel) {

        List<CompanylistDAO> companylistDAOList = companylistDAOMapper.listCompanylist(companylistModel);
//        List<CompanylistModel> companylistModelList = companylistDAOList.stream().map(companylistDAO -> {
//            CompanylistModel model = this.convertCompanylistModelFromCompanylistDAO(companylistDAO);
//            return model;
//        }).collect(Collectors.toList());
        return companylistDAOList;
    }

    private CompanylistModel convertCompanylistModelFromCompanylistDAO(CompanylistDAO companylistDAO) {
        if (null == companylistDAO) {
            return null;
        }
        CompanylistModel companylistModel = new CompanylistModel();
        BeanUtils.copyProperties(companylistDAO, companylistModel);
        return companylistModel;
    }

}
