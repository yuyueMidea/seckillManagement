package com.xxy.seckill.seckillmanagement.service.impl;

import com.xxy.seckill.seckillmanagement.dao.NewsDAOMapper;
import com.xxy.seckill.seckillmanagement.dataobject.NewsDAO;
import com.xxy.seckill.seckillmanagement.service.NewsService;
import com.xxy.seckill.seckillmanagement.service.model.NewsModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class NewsServiceImpl implements NewsService {

    @Autowired
    private NewsDAOMapper newsDAOMapper;

    @Override
    public  Integer newsCount(NewsModel newsModel) {
        return newsDAOMapper.newsCount(newsModel);
    }

    @Override
    public List<NewsDAO> listNews(NewsModel newsModel) {

        List<NewsDAO> newsDAOList = newsDAOMapper.listNews(newsModel);
//        List<NewsModel> newsModelList = newsDAOList.stream().map(newsDAO -> {
//            NewsModel model = this.convertNewsModelFromNewsDAO(newsDAO);
//            return model;
//        }).collect(Collectors.toList());
        return newsDAOList;
    }

    private NewsModel convertNewsModelFromNewsDAO(NewsDAO newsDAO) {
        if (null == newsDAO) {
            return null;
        }
        NewsModel newsModel = new NewsModel();
        BeanUtils.copyProperties(newsDAO, newsModel);
        return newsModel;
    }

}
