package com.dream.itclub.service.impl;

import com.dream.itclub.dao.MessageMapper;
import com.dream.itclub.dao.SysUserMapper;
import com.dream.itclub.pojo.Message;
import com.dream.itclub.pojo.SysUser;
import com.dream.itclub.pojo.custom.CustomMessage;
import com.dream.itclub.service.ICustomMessageService;
import com.dream.itclub.utils.UUIDUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@Service
public class CustomMessageService implements ICustomMessageService {
    @Resource
    private MessageMapper messageMapper;
    @Resource
    private SysUserMapper sysUserMapper;


    @Override
    public List<CustomMessage> findMessage(String id) throws Exception {
        List<CustomMessage> message = messageMapper.findMessage(id);
        return message;
    }

    @Override
    public SysUser findUser(String id) throws Exception {
        SysUser user = sysUserMapper.selectByPrimaryKey(id);
        return user;
    }

    //添加一条留言
    @Override
    public String addMessage(Message message)throws Exception {
        message.setMsgtime(new Date());
        UUIDUtil uuidUtil = new UUIDUtil();
        message.setMsgid(uuidUtil.toString());
        int i = messageMapper.insert(message);
        if(i==1){
            return uuidUtil.toString();
        }
        return i+"";
    }

    @Override
    public CustomMessage findMessageByMsgId(String id) throws Exception {
        CustomMessage messageByMsgId = messageMapper.findMessageByMsgId(id);
        return messageByMsgId;
    }
}
