package com.xxy.seckill.seckillmanagement.service.impl;

import com.xxy.seckill.seckillmanagement.dao.BookDAOMapper;
import com.xxy.seckill.seckillmanagement.dataobject.BookDAO;
import com.xxy.seckill.seckillmanagement.service.BookService;
import com.xxy.seckill.seckillmanagement.service.model.BookModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDAOMapper bookDAOMapper;

    @Override
    public  Integer bookCount(BookModel bookModel) {
        return bookDAOMapper.bookCount(bookModel);
    }

    @Override
    public List<BookModel> listBook(BookModel bookModel) {

        List<BookDAO> bookDAOList = bookDAOMapper.listBook(bookModel);
        List<BookModel> bookModelList = bookDAOList.stream().map(bookDAO -> {
            BookModel model = this.convertBookModelFromBookDAO(bookDAO);
            return model;
        }).collect(Collectors.toList());
        return bookModelList;
    }

    private BookModel convertBookModelFromBookDAO(BookDAO bookDAO) {
        if (null == bookDAO) {
            return null;
        }
        BookModel bookModel = new BookModel();
        BeanUtils.copyProperties(bookDAO, bookModel);
        return bookModel;
    }

}
