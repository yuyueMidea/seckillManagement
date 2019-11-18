package com.xxy.seckill.seckillmanagement.controller;
import com.xxy.seckill.seckillmanagement.dataobject.XiaoquDAO;
import com.xxy.seckill.seckillmanagement.error.BusinessException;
import com.xxy.seckill.seckillmanagement.error.EmBusinessError;
import com.xxy.seckill.seckillmanagement.response.CommonRetrunType;
import com.xxy.seckill.seckillmanagement.service.DictService;
import com.xxy.seckill.seckillmanagement.service.XiaoquService;
import com.xxy.seckill.seckillmanagement.service.model.DictModel;
import com.xxy.seckill.seckillmanagement.service.model.XiaoquModel;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Controller("xiaoqu")
@RequestMapping("/xiaoqu")
@CrossOrigin(allowCredentials = "true", origins = {"*"})
public class XiaoquController extends BaseController {
    @Autowired
    private XiaoquService xiaoquService;

    @RequestMapping(value = "/list", method = {RequestMethod.POST})
    @ResponseBody
    private CommonRetrunType listDict(@RequestBody XiaoquModel xiaoquModel) {
        List<XiaoquDAO> xiaoquModelList = xiaoquService.listXiaoqu(xiaoquModel);
        return CommonRetrunType.create(xiaoquModelList);
    }

    @RequestMapping(value = "/listCount", method = {RequestMethod.POST})
    @ResponseBody
    private CommonRetrunType listXiaoquCount(@RequestBody XiaoquModel xiaoquModel) {
        Integer queryCount = xiaoquService.xiaoquCount(xiaoquModel);
        return CommonRetrunType.create(queryCount);
    }
}
