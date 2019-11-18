package com.xxy.seckill.seckillmanagement.dao;
import com.xxy.seckill.seckillmanagement.dataobject.BookDAO;
import com.xxy.seckill.seckillmanagement.service.model.BookModel;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface BookDAOMapper {
    List<BookDAO> listBook(BookModel bookModel);
    Integer bookCount(BookModel bookModel);
}