package com.kgc.bookmanageconsumer.controller;

import com.kgc.pojo.Bookmanage;
import com.kgc.service.bookmanageService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;
import java.util.List;

@Controller
public class bookmanageController {
    @Reference
    bookmanageService bookmanageService;
    @RequestMapping("/")
    public  String index(Model model){
        List<Bookmanage> bookmanages = bookmanageService.selectByExample(null);
        model.addAttribute("bookmanages",bookmanages);
        return "bookselect";
    }
    @RequestMapping("/toadd")
    public String add(){
        return "add";
    }
    @RequestMapping("/addbook")
    public String addbook(String name,String author,String type){
        Bookmanage b=new Bookmanage();
        b.setName(name);
        b.setAuthor(author);
        b.setTime(new Date());
        b.setType(type);
        bookmanageService.add(b);

        return "redirect:/";
    }
}
