package com.xxy.seckill.seckillmanagement.controller;
import com.xxy.seckill.seckillmanagement.response.CommonRetrunType;
import com.xxy.seckill.seckillmanagement.service.ProvinceService;
import com.xxy.seckill.seckillmanagement.service.model.PCModel;
import com.xxy.seckill.seckillmanagement.service.model.ProvinceModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller("province")
@RequestMapping("/province")
@CrossOrigin(allowCredentials = "true", origins = {"*"})
public class ProvinceController extends BaseController {
    @Autowired
    private ProvinceService provinceService;

    @RequestMapping(value = "/list", method = {RequestMethod.POST})
    @ResponseBody
    private CommonRetrunType listProvince(@RequestBody ProvinceModel provinceModel) {
        List<ProvinceModel> provinceModelList = provinceService.listProvince(provinceModel);
        return CommonRetrunType.create(provinceModelList);
    }

    @RequestMapping(value = "/listCount", method = {RequestMethod.POST})
    @ResponseBody
    private CommonRetrunType listProvinceCount(@RequestBody ProvinceModel provinceModel) {
        Integer queryCount = provinceService.provinceCount(provinceModel);
        return CommonRetrunType.create(queryCount);
    }

    @RequestMapping(value = "/getAll", method = {RequestMethod.POST})
    @ResponseBody
    private CommonRetrunType listProvinceAndCity(@RequestBody ProvinceModel provinceModel) {
        List<PCModel> pcModelList = provinceService.listProvinceAndCity(provinceModel);
        return CommonRetrunType.create(pcModelList);
    }

}
