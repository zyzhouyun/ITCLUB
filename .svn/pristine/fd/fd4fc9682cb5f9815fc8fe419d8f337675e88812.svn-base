package com.dream.itclub.service.impl;

import com.dream.itclub.dao.RepComMapper;
import com.dream.itclub.pojo.RepCom;
import com.dream.itclub.pojo.custom.CustomRepCom;
import com.dream.itclub.service.ICustomRepComService;
import com.dream.itclub.utils.UUIDUtil;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
@Service
public class CustomRepComServiceImpl implements ICustomRepComService {

    @Resource
    private RepComMapper repComMapper;

    //根据id查询该条评论的回复
    @Override
    public List<CustomRepCom> findCustomRepCom(String id) throws Exception {
        List<CustomRepCom> customRepCom = repComMapper.findCustomRepCom(id);
        return customRepCom;
    }

    //添加一条评论的回复
    @Override
    public String addRepCom(RepCom repCom) {
        repCom.setRetime(new Date());
        UUIDUtil uuidUtil = new UUIDUtil();
        repCom.setRecomid(uuidUtil.toString());
        repCom.setRegoodnum(0);
        int insert = repComMapper.insert(repCom);
        if(insert==1){
            return uuidUtil.toString();
        }
        return insert+"";
    }

    //根据id查询新增的评论信息
    @Override
    public CustomRepCom findCustomRepComById(String id) throws Exception {
        CustomRepCom customRepComById = repComMapper.findCustomRepComById(id);
        return customRepComById;
    }
}
