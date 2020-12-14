package com.kgc.service;

import com.kgc.pojo.Bookmanage;
import com.kgc.pojo.BookmanageExample;

import java.util.List;

public interface bookmanageService {
    List<Bookmanage> selectByExample(BookmanageExample example);

    int delect(Integer id);
}
