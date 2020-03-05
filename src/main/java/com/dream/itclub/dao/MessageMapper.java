package com.dream.itclub.dao;

import com.dream.itclub.pojo.Message;
import com.dream.itclub.pojo.MessageExample;
import com.dream.itclub.pojo.custom.CustomMessage;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MessageMapper {
    long countByExample(MessageExample example);

    int deleteByExample(MessageExample example);

    int deleteByPrimaryKey(String msgid);

    int insert(Message record);

    int insertSelective(Message record);

    List<Message> selectByExample(MessageExample example);

    Message selectByPrimaryKey(String msgid);

    int updateByExampleSelective(@Param("record") Message record, @Param("example") MessageExample example);

    int updateByExample(@Param("record") Message record, @Param("example") MessageExample example);

    int updateByPrimaryKeySelective(Message record);

    int updateByPrimaryKey(Message record);

    List<CustomMessage> findMessage(String id);

    CustomMessage findMessageByMsgId(String id);
}