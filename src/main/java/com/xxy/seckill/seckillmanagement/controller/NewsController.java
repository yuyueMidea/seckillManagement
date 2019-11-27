package com.xxy.seckill.seckillmanagement.controller;
import com.xxy.seckill.seckillmanagement.dataobject.NewsDAO;
import com.xxy.seckill.seckillmanagement.response.CommonRetrunType;
import com.xxy.seckill.seckillmanagement.service.NewsService;
import com.xxy.seckill.seckillmanagement.service.model.NewsModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller("news")
@RequestMapping("/news")
@CrossOrigin(allowCredentials = "true", origins = {"*"})
public class NewsController extends BaseController {
    @Autowired
    private NewsService newsService;

    @RequestMapping(value = "/list", method = {RequestMethod.POST})
    @ResponseBody
    private CommonRetrunType listNews(@RequestBody NewsModel newsModel) {
        List<NewsDAO> newsModelList = newsService.listNews(newsModel);
        return CommonRetrunType.create(newsModelList);
    }

    @RequestMapping(value = "/listCount", method = {RequestMethod.POST})
    @ResponseBody
    private CommonRetrunType listNewsCount(@RequestBody NewsModel newsModel) {
        Integer queryCount = newsService.newsCount(newsModel);
        return CommonRetrunType.create(queryCount);
    }
}
