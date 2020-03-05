package com.dream.itclub.dao;

import com.dream.itclub.pojo.Comments;
import com.dream.itclub.pojo.CommentsExample;
import com.dream.itclub.pojo.custom.CustomComments;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CommentsMapper {
    long countByExample(CommentsExample example);

    int deleteByExample(CommentsExample example);

    int deleteByPrimaryKey(String comid);

    int insert(Comments record);

    int insertSelective(Comments record);

    List<Comments> selectByExample(CommentsExample example);

    Comments selectByPrimaryKey(String comid);

    int updateByExampleSelective(@Param("record") Comments record, @Param("example") CommentsExample example);

    int updateByExample(@Param("record") Comments record, @Param("example") CommentsExample example);

    int updateByPrimaryKeySelective(Comments record);

    int updateByPrimaryKey(Comments record);

    List<CustomComments> findComments(String id);

    CustomComments findCommentsByComId(String id);
}