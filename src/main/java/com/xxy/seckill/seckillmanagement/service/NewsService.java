package com.xxy.seckill.seckillmanagement.service;

import com.xxy.seckill.seckillmanagement.dataobject.NewsDAO;
import com.xxy.seckill.seckillmanagement.service.model.NewsModel;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface NewsService {

    List<NewsDAO> listNews(NewsModel newsModel);
//    列表查询数量
    Integer newsCount(NewsModel newsModel);
}
