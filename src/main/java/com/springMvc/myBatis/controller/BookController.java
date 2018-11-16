package com.springMvc.myBatis.controller;

import com.springMvc.myBatis.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookServiceImpl bookService;

    @RequestMapping("/getAll")
    public ModelAndView index(){
        System.out.println("sa");
        return new ModelAndView("book").addObject("bookList",bookService.getAllBooks());
    }

    @RequestMapping("/hello")
    public String in(){
        System.out.println("sa");
        return "hello";
    }

}
