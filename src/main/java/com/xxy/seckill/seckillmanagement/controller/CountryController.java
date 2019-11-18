package com.xxy.seckill.seckillmanagement.controller;
import com.xxy.seckill.seckillmanagement.response.CommonRetrunType;
import com.xxy.seckill.seckillmanagement.service.CountryService;
import com.xxy.seckill.seckillmanagement.service.model.CountryModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller("country")
@RequestMapping("/country")
@CrossOrigin(allowCredentials = "true", origins = {"*"})
public class CountryController extends BaseController {
    @Autowired
    private CountryService countryService;

    @RequestMapping(value = "/list", method = {RequestMethod.POST})
    @ResponseBody
    private CommonRetrunType listCountry(@RequestBody CountryModel countryModel) {
        List<CountryModel> countryModelList = countryService.listCountry(countryModel);
        return CommonRetrunType.create(countryModelList);
    }

    @RequestMapping(value = "/listCount", method = {RequestMethod.POST})
    @ResponseBody
    private CommonRetrunType listCountryCount(@RequestBody CountryModel countryModel) {
        Integer queryCount = countryService.countryCount(countryModel);
        return CommonRetrunType.create(queryCount);
    }
}
