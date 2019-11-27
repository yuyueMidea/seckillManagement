package com.xxy.seckill.seckillmanagement.controller;
import com.xxy.seckill.seckillmanagement.dataobject.BooklistDAO;
import com.xxy.seckill.seckillmanagement.response.CommonRetrunType;
import com.xxy.seckill.seckillmanagement.service.BookService;
import com.xxy.seckill.seckillmanagement.service.BooklistService;
import com.xxy.seckill.seckillmanagement.service.model.BookModel;
import com.xxy.seckill.seckillmanagement.service.model.BooklistModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller("book")
@RequestMapping("/book")
@CrossOrigin(allowCredentials = "true", origins = {"*"})
public class BookController extends BaseController {
    @Autowired
    private BookService bookService;
    @Autowired
    private BooklistService booklistService;

    @RequestMapping(value = "/list", method = {RequestMethod.POST})
    @ResponseBody
    private CommonRetrunType listBook(@RequestBody BookModel bookModel) {
        List<BookModel> bookModelList = bookService.listBook(bookModel);
        return CommonRetrunType.create(bookModelList);
    }

    @RequestMapping(value = "/booklist", method = {RequestMethod.POST})
    @ResponseBody
    private CommonRetrunType listBook(@RequestBody BooklistModel booklistModel) {
        List<BooklistDAO> bookModelList = booklistService.bookList(booklistModel);
        return CommonRetrunType.create(bookModelList);
    }

    @RequestMapping(value = "/listCount", method = {RequestMethod.POST})
    @ResponseBody
    private CommonRetrunType listBookCount(@RequestBody BooklistModel booklistModel) {
        Integer queryCount = booklistService.booklistCount(booklistModel);
        return CommonRetrunType.create(queryCount);
    }

}
