package com.xxy.seckill.seckillmanagement.controller;
import com.xxy.seckill.seckillmanagement.dataobject.CompanylistDAO;
import com.xxy.seckill.seckillmanagement.response.CommonRetrunType;
import com.xxy.seckill.seckillmanagement.service.CompanylistService;
import com.xxy.seckill.seckillmanagement.service.model.CompanylistModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller("companylist")
@RequestMapping("/companylist")
@CrossOrigin(allowCredentials = "true", origins = {"*"})
public class CompanylistController extends BaseController {
    @Autowired
    private CompanylistService companylistService;

    @RequestMapping(value = "/list", method = {RequestMethod.POST})
    @ResponseBody
    private CommonRetrunType listCompanylist(@RequestBody CompanylistModel companylistModel) {
        List<CompanylistDAO> companylistModelList = companylistService.listCompanylist(companylistModel);
        return CommonRetrunType.create(companylistModelList);
    }

    @RequestMapping(value = "/listCount", method = {RequestMethod.POST})
    @ResponseBody
    private CommonRetrunType listCompanylistCount(@RequestBody CompanylistModel companylistModel) {
        Integer queryCount = companylistService.companylistCount(companylistModel);
        return CommonRetrunType.create(queryCount);
    }
}
