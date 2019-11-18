package com.xxy.seckill.seckillmanagement.controller;
import com.xxy.seckill.seckillmanagement.response.CommonRetrunType;
import com.xxy.seckill.seckillmanagement.service.BookService;
import com.xxy.seckill.seckillmanagement.service.model.BookModel;
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

    @RequestMapping(value = "/list", method = {RequestMethod.POST})
    @ResponseBody
    private CommonRetrunType listBook(@RequestBody BookModel bookModel) {
        List<BookModel> bookModelList = bookService.listBook(bookModel);
        return CommonRetrunType.create(bookModelList);
    }

    @RequestMapping(value = "/listCount", method = {RequestMethod.POST})
    @ResponseBody
    private CommonRetrunType listBookCount(@RequestBody BookModel bookModel) {
        Integer queryCount = bookService.bookCount(bookModel);
        return CommonRetrunType.create(queryCount);
    }
}
