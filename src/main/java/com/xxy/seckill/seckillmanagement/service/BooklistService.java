package com.xxy.seckill.seckillmanagement.service;

import com.xxy.seckill.seckillmanagement.dataobject.BooklistDAO;
import com.xxy.seckill.seckillmanagement.service.model.BooklistModel;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BooklistService {

    List<BooklistDAO> bookList(BooklistModel booklistModel);
//    列表查询数量
    Integer booklistCount(BooklistModel booklistModel);
}
