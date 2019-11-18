package com.xxy.seckill.seckillmanagement.controller;
import com.xxy.seckill.seckillmanagement.dataobject.MoviesDAO;
import com.xxy.seckill.seckillmanagement.response.CommonRetrunType;
import com.xxy.seckill.seckillmanagement.service.MoviesService;
import com.xxy.seckill.seckillmanagement.service.model.MoviesModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller("movies")
@RequestMapping("/movies")
@CrossOrigin(allowCredentials = "true", origins = {"*"})
public class MoviesController extends BaseController {
    @Autowired
    private MoviesService moviesService;

    @RequestMapping(value = "/list", method = {RequestMethod.POST})
    @ResponseBody
    private CommonRetrunType listMovies(@RequestBody MoviesModel moviesModel) {
        List<MoviesDAO> moviesModelList = moviesService.listMovies(moviesModel);
        return CommonRetrunType.create(moviesModelList);
    }

    @RequestMapping(value = "/listCount", method = {RequestMethod.POST})
    @ResponseBody
    private CommonRetrunType listMoviesCount(@RequestBody MoviesModel moviesModel) {
        Integer queryCount = moviesService.moviesCount(moviesModel);
        return CommonRetrunType.create(queryCount);
    }
}
