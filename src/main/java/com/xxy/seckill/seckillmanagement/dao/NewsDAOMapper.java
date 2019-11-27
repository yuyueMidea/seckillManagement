package com.xxy.seckill.seckillmanagement.dao;

import com.xxy.seckill.seckillmanagement.dataobject.NewsDAO;
import com.xxy.seckill.seckillmanagement.service.model.NewsModel;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface NewsDAOMapper {
    List<NewsDAO> listNews(NewsModel newsModel);
    Integer newsCount(NewsModel newsModel);
}