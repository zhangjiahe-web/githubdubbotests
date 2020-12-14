package com.kgc.bookmanageconsumer.controller;

import com.kgc.pojo.Bookmanage;
import com.kgc.service.BookServicecx;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BookCotrollercx {
    @Reference
    BookServicecx bookServicecx;

    @RequestMapping("/toUpdBook")
    public String getBook(Integer id, Model model){
        Bookmanage book = bookServicecx.getBook(id);
        model.addAttribute("book",book);
        return "updBook";
    }

    @RequestMapping("/updBook")
    public String udpBook(Bookmanage bookmanage,Integer id){
        bookmanage.setId(id);
        bookServicecx.updBook(bookmanage);
        return "redirect:/";
    }

}
