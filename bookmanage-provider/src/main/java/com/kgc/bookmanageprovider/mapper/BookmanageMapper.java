package com.kgc.bookmanageprovider.mapper;

import com.kgc.pojo.Bookmanage;
import com.kgc.pojo.BookmanageExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface BookmanageMapper {
    int countByExample(BookmanageExample example);

    int deleteByExample(BookmanageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Bookmanage record);

    int insertSelective(Bookmanage record);

    List<Bookmanage> selectByExample(BookmanageExample example);

    Bookmanage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Bookmanage record, @Param("example") BookmanageExample example);

    int updateByExample(@Param("record") Bookmanage record, @Param("example") BookmanageExample example);

    int updateByPrimaryKeySelective(Bookmanage record);

    int updateByPrimaryKey(Bookmanage record);
}