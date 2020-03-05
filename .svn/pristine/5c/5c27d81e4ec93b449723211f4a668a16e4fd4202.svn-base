package com.dream.itclub.service.impl;

import com.dream.itclub.dao.CommentsMapper;
import com.dream.itclub.pojo.Comments;
import com.dream.itclub.pojo.custom.CustomComments;
import com.dream.itclub.service.ICustomCommentsService;
import com.dream.itclub.utils.UUIDUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@Service
public class CustomCommentsImpl implements ICustomCommentsService {
    @Resource
    private CommentsMapper commentsMapper;

    //查询评论
    @Override
    public List<CustomComments> findComments(String id) throws Exception {
        List<CustomComments> comments = commentsMapper.findComments(id);
        return comments;
    }

    //添加评论
    @Override
    public String addComments(Comments comments) throws Exception {
        comments.setComdatetime(new Date());//获取当前时间
        comments.setComgoodnum(0);//点赞数默认为0
        UUIDUtil uuidUtil = new UUIDUtil();
        comments.setComid(uuidUtil.toString());//使用uuid来拿到随机数当作id
        int insert = commentsMapper.insert(comments);
        if(insert==1){//当执行添加操作成功后返回随机数
            return uuidUtil.toString();
        }
        return insert+"";
    }

    //根据Id查询评论
    @Override
    public CustomComments findCommentsByComId(String id) throws Exception {
        CustomComments commentsByComId = commentsMapper.findCommentsByComId(id);
        return commentsByComId;
    }

}
