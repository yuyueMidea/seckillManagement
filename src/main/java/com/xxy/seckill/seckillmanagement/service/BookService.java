package com.xxy.seckill.seckillmanagement.service;

import com.xxy.seckill.seckillmanagement.service.model.BookModel;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface BookService {

    List<BookModel> listBook(BookModel bookModel);
//    列表查询数量
    Integer bookCount(BookModel bookModel);
}
