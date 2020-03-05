package com.dream.itclub.service.impl;

import com.dream.itclub.dao.RepMessageMapper;
import com.dream.itclub.pojo.RepMessage;
import com.dream.itclub.pojo.custom.CustomRepMessage;
import com.dream.itclub.service.ICustomRepMessageService;
import com.dream.itclub.utils.UUIDUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@Service
public class CustomRepMessageServiceImpl implements ICustomRepMessageService {
    @Resource
    private RepMessageMapper repMessageMapper;

    @Override
    public List<CustomRepMessage> findRepMessage(String id) throws Exception {
        List<CustomRepMessage> repMessage = repMessageMapper.findRepMessage(id);
        return repMessage;
    }

    @Override
    public String addRepMessage(RepMessage repMessage) throws Exception {
        repMessage.setRemsgtime(new Date());
        UUIDUtil uuidUtil = new UUIDUtil();
        repMessage.setRemsgid(uuidUtil.toString());
        int i = repMessageMapper.insert(repMessage);
        if(i==1){
            return uuidUtil.toString();
        }
        return i+"";
    }

    @Override
    public CustomRepMessage findRepMessageById(String id) throws Exception {
        CustomRepMessage repMessageByRemsgId = repMessageMapper.findRepMessageByRemsgId(id);
        return repMessageByRemsgId;
    }
}
