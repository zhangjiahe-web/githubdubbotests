package com.kgc.bookmanageprovider.service;

import com.kgc.bookmanageprovider.mapper.BookmanageMapper;
import com.kgc.pojo.Bookmanage;
import com.kgc.service.BookServicecx;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Service
@Component
public class BookServicecxImpl implements BookServicecx {
    @Resource
    BookmanageMapper bookmanageMapper;

    //修改回显值
    @Override
    public Bookmanage getBook(Integer id) {
        return bookmanageMapper.selectByPrimaryKey(id);
    }

    //修改
    @Override
    public int updBook(Bookmanage bookmanage) {
        return bookmanageMapper.updateByPrimaryKeySelective(bookmanage);
    }
}
