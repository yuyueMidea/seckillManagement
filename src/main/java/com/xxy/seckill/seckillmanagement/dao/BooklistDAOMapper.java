package com.xxy.seckill.seckillmanagement.dao;

import com.xxy.seckill.seckillmanagement.dataobject.BooklistDAO;
import com.xxy.seckill.seckillmanagement.service.model.BooklistModel;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public interface BooklistDAOMapper {

    Integer booklistCount(BooklistModel booklistModel);

    List<BooklistDAO> listBooklist(BooklistModel booklistModel);
}