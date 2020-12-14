package com.kgc.service;

import com.kgc.pojo.Bookmanage;

public interface BookServicecx {
    //修改回显值
    Bookmanage getBook(Integer id);
    //修改
    int updBook(Bookmanage bookmanage);
}
