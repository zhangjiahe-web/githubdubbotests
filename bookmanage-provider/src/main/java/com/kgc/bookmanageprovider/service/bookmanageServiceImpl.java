package com.kgc.bookmanageprovider.service;

import com.kgc.bookmanageprovider.mapper.BookmanageMapper;
import com.kgc.pojo.Bookmanage;
import com.kgc.pojo.BookmanageExample;
import com.kgc.service.bookmanageService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
@Service
public class bookmanageServiceImpl implements bookmanageService{
    @Resource
    BookmanageMapper bookmanageMapper;

    @Override
    public List<Bookmanage> selectByExample(BookmanageExample example) {
        return bookmanageMapper.selectByExample(example);
    }

    @Override
    public int delect(Integer id) {
        return bookmanageMapper.deleteByPrimaryKey(id);
    }
}
