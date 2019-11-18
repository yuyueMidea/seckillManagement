package com.xxy.seckill.seckillmanagement.dao;

import com.xxy.seckill.seckillmanagement.dataobject.MoviesDAO;
import com.xxy.seckill.seckillmanagement.dataobject.MoviesDAO;
import com.xxy.seckill.seckillmanagement.service.model.MoviesModel;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface MoviesDAOMapper {
    List<MoviesDAO> listMovies(MoviesModel moviesModel);
    Integer moviesCount(MoviesModel moviesModel);
}