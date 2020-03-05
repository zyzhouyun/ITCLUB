package com.dream.itclub.service;

import com.dream.itclub.pojo.Comments;
import com.dream.itclub.pojo.custom.CustomComments;

import java.util.List;

public interface ICustomCommentsService {
    //查询博客评论
    public List<CustomComments> findComments(String id) throws Exception;

    //添加评论
    public String addComments(Comments comments)throws Exception;

    //根据Id查询评论
    public CustomComments findCommentsByComId(String Id)throws Exception;
}
