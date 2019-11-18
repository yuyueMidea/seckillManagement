package com.xxy.seckill.seckillmanagement.service;

import com.xxy.seckill.seckillmanagement.dataobject.MoviesDAO;
import com.xxy.seckill.seckillmanagement.service.model.MoviesModel;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface MoviesService {

    List<MoviesDAO> listMovies(MoviesModel moviesModel);
//    列表查询数量
    Integer moviesCount(MoviesModel moviesModel);
}
