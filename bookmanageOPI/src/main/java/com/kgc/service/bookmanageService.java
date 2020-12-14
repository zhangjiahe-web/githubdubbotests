package com.kgc.service;

import com.kgc.pojo.Bookmanage;
import com.kgc.pojo.BookmanageExample;

import java.awt.print.Book;
import java.util.List;

public interface bookmanageService {
    List<Bookmanage> selectByExample(BookmanageExample example);
    int add(Bookmanage bookmanage);
}
