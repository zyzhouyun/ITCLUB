package com.dream.itclub.handler;


import com.dream.itclub.pojo.RepMessage;
import com.dream.itclub.pojo.SysUser;
import com.dream.itclub.pojo.custom.CustomRepMessage;
import com.dream.itclub.service.ICustomMessageService;
import com.dream.itclub.service.ICustomRepMessageService;
import com.dream.itclub.utils.VO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class RepMessageHandler {
    @Resource
    private ICustomRepMessageService repMessageService;
    @Resource
    private ICustomMessageService messageService;

    @ResponseBody
    @RequestMapping("/addRepMessage")
    public Object addRepMessage(RepMessage repMessage){
        VO vo = new VO();
        try {
            String s = repMessageService.addRepMessage(repMessage);
            if(!s.equals("0")){
                CustomRepMessage repMessageById = repMessageService.findRepMessageById(s);
                SysUser user = messageService.findUser(repMessageById.getRemessageuser());
                repMessageById.setRepMessageUserName(user.getUname());
                vo.setData(repMessageById);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vo;
    }
}
