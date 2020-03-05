package com.dream.itclub.dao;

import com.dream.itclub.pojo.BlogType;
import com.dream.itclub.pojo.BlogTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BlogTypeMapper {
    long countByExample(BlogTypeExample example);

    int deleteByExample(BlogTypeExample example);

    int deleteByPrimaryKey(String typeid);

    int insert(BlogType record);

    int insertSelective(BlogType record);

    List<BlogType> selectByExample(BlogTypeExample example);

    BlogType selectByPrimaryKey(String typeid);

    int updateByExampleSelective(@Param("record") BlogType record, @Param("example") BlogTypeExample example);

    int updateByExample(@Param("record") BlogType record, @Param("example") BlogTypeExample example);

    int updateByPrimaryKeySelective(BlogType record);

    int updateByPrimaryKey(BlogType record);
}