package com.xxy.seckill.seckillmanagement.controller;
import com.xxy.seckill.seckillmanagement.response.CommonRetrunType;
import com.xxy.seckill.seckillmanagement.service.EnwordsService;
import com.xxy.seckill.seckillmanagement.service.model.EnwordsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller("enwords")
@RequestMapping("/enwords")
@CrossOrigin(allowCredentials = "true", origins = {"*"})
public class EnwordsController extends BaseController {
    @Autowired
    private EnwordsService enwordsService;

    @RequestMapping(value = "/list", method = {RequestMethod.POST})
    @ResponseBody
    private CommonRetrunType listEnwords(@RequestBody EnwordsModel enwordsModel) {
        List<EnwordsModel> enwordsModelList = enwordsService.listEnwords(enwordsModel);
        return CommonRetrunType.create(enwordsModelList);
    }

    @RequestMapping(value = "/listCount", method = {RequestMethod.POST})
    @ResponseBody
    private CommonRetrunType listEnwordsCount(@RequestBody EnwordsModel enwordsModel) {
        Integer queryCount = enwordsService.enwordsCount(enwordsModel);
        return CommonRetrunType.create(queryCount);
    }
}
