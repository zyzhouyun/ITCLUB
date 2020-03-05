package com.dream.itclub.handler;

import com.dream.itclub.pojo.RepCom;
import com.dream.itclub.pojo.custom.CustomRepCom;
import com.dream.itclub.service.ICustomRepComService;
import com.dream.itclub.utils.VO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class RepComHandler {
    @Resource
    private ICustomRepComService customRepComService;

    //异步添加评论回复
    @ResponseBody
    @RequestMapping("/addRepCom")
    public Object addRepCom(RepCom repCom){
        VO vo = new VO();
        try {
            String s = customRepComService.addRepCom(repCom);
            if(!s.equals("0")){
                CustomRepCom customRepComById = customRepComService.findCustomRepComById(s);
                vo.setData(customRepComById);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vo;
    }

}
