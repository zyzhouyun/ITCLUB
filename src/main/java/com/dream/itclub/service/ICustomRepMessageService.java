package com.dream.itclub.service;

import com.dream.itclub.pojo.RepMessage;
import com.dream.itclub.pojo.custom.CustomRepMessage;

import java.util.List;

public interface ICustomRepMessageService {
    //回复留言信息
    public List<CustomRepMessage> findRepMessage(String id)throws Exception;

    //添加回复
    public String addRepMessage(RepMessage repMessage)throws Exception;

    //查询新增回复
    public CustomRepMessage findRepMessageById(String id)throws Exception;
}
