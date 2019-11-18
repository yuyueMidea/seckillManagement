package com.xxy.seckill.seckillmanagement.service.impl;

import com.xxy.seckill.seckillmanagement.dao.MoviesDAOMapper;
import com.xxy.seckill.seckillmanagement.dataobject.MoviesDAO;
import com.xxy.seckill.seckillmanagement.service.MoviesService;
import com.xxy.seckill.seckillmanagement.service.model.MoviesModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class MoviesServiceImpl implements MoviesService {

    @Autowired
    private MoviesDAOMapper moviesDAOMapper;

    @Override
    public  Integer moviesCount(MoviesModel moviesModel) {
        return moviesDAOMapper.moviesCount(moviesModel);
    }

    @Override
    public List<MoviesDAO> listMovies(MoviesModel moviesModel) {

        List<MoviesDAO> moviesDAOList = moviesDAOMapper.listMovies(moviesModel);
//        List<MoviesModel> moviesModelList = moviesDAOList.stream().map(moviesDAO -> {
//            MoviesModel model = this.convertMoviesModelFromMoviesDAO(moviesDAO);
//            return model;
//        }).collect(Collectors.toList());
        return moviesDAOList;
    }

    private MoviesModel convertMoviesModelFromMoviesDAO(MoviesDAO moviesDAO) {
        if (null == moviesDAO) {
            return null;
        }
        MoviesModel moviesModel = new MoviesModel();
        BeanUtils.copyProperties(moviesDAO, moviesModel);
        return moviesModel;
    }

}
