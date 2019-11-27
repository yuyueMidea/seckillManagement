package com.xxy.seckill.seckillmanagement.service.impl;

import com.xxy.seckill.seckillmanagement.dao.BookDAOMapper;
import com.xxy.seckill.seckillmanagement.dao.BooklistDAOMapper;
import com.xxy.seckill.seckillmanagement.dataobject.BookDAO;
import com.xxy.seckill.seckillmanagement.dataobject.BooklistDAO;
import com.xxy.seckill.seckillmanagement.service.BookService;
import com.xxy.seckill.seckillmanagement.service.BooklistService;
import com.xxy.seckill.seckillmanagement.service.model.BookModel;
import com.xxy.seckill.seckillmanagement.service.model.BooklistModel;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookServiceImpl implements BookService, BooklistService {

    @Autowired
    private BookDAOMapper bookDAOMapper;
    @Autowired
    private BooklistDAOMapper booklistDAOMapper;

    @Override
    public  Integer booklistCount(BooklistModel booklistModel) {
        return booklistDAOMapper.booklistCount(booklistModel);
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
    @Override
    public List<BooklistDAO> bookList(BooklistModel booklistModel) {
        List<BooklistDAO> booklistDAOList = booklistDAOMapper.listBooklist(booklistModel);
//        List<BooklistModel> booklistModels =booklistDAOList.stream().map(booklistDAO -> {
//            BooklistModel model = this.convertBookModelFromBookDAO2(booklistDAO);
//            return model;
//        }).collect(Collectors.toList());
        return booklistDAOList;
    }

    private BookModel convertBookModelFromBookDAO(BookDAO bookDAO) {
        if (null == bookDAO) {
            return null;
        }
        BookModel bookModel = new BookModel();
        BeanUtils.copyProperties(bookDAO, bookModel);
        return bookModel;
    }
    private BooklistModel convertBookModelFromBookDAO2(BooklistDAO booklistDAO) {
        if (null == booklistDAO) {
            return null;
        }
        BooklistModel booklistModel = new BooklistModel();
        BeanUtils.copyProperties(booklistDAO, booklistModel);
        return booklistModel;
    }

}
