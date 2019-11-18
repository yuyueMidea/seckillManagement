package com.xxy.seckill.seckillmanagement.controller;
import com.xxy.seckill.seckillmanagement.response.CommonRetrunType;
import com.xxy.seckill.seckillmanagement.service.TownService;
import com.xxy.seckill.seckillmanagement.service.model.TownModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller("town")
@RequestMapping("/town")
@CrossOrigin(allowCredentials = "true", origins = {"*"})
public class TownController extends BaseController {
    @Autowired
    private TownService townService;

    @RequestMapping(value = "/list", method = {RequestMethod.POST})
    @ResponseBody
    private CommonRetrunType listTown(@RequestBody TownModel townModel) {
        List<TownModel> townModelList = townService.listTown(townModel);
        return CommonRetrunType.create(townModelList);
    }

    @RequestMapping(value = "/listCount", method = {RequestMethod.POST})
    @ResponseBody
    private CommonRetrunType listTownCount(@RequestBody TownModel townModel) {
        Integer queryCount = townService.townCount(townModel);
        return CommonRetrunType.create(queryCount);
    }
}
