package com.kgc.bookmanageconsumer.controller;

import com.kgc.pojo.Bookmanage;
import com.kgc.service.bookmanageService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

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

    @RequestMapping("delete")
    public  String delect(Integer id){
        int delect = bookmanageService.delect(id);
        return "redirect:/";
    }
}
