package com.xxy.seckill.seckillmanagement.controller;
import com.xxy.seckill.seckillmanagement.response.CommonRetrunType;
import com.xxy.seckill.seckillmanagement.service.CityService;
import com.xxy.seckill.seckillmanagement.service.model.CityModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller("city")
@RequestMapping("/city")
@CrossOrigin(allowCredentials = "true", origins = {"*"})
public class CityController extends BaseController {
    @Autowired
    private CityService cityService;

    @RequestMapping(value = "/list", method = {RequestMethod.POST})
    @ResponseBody
    private CommonRetrunType listCity(@RequestBody CityModel cityModel) {
        List<CityModel> cityModelList = cityService.listCity(cityModel);
        return CommonRetrunType.create(cityModelList);
    }

    @RequestMapping(value = "/listCount", method = {RequestMethod.POST})
    @ResponseBody
    private CommonRetrunType listCityCount(@RequestBody CityModel cityModel) {
        Integer queryCount = cityService.cityCount(cityModel);
        return CommonRetrunType.create(queryCount);
    }
}
