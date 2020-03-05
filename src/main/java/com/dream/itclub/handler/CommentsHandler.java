package com.dream.itclub.handler;

import com.dream.itclub.pojo.Comments;
import com.dream.itclub.pojo.custom.CustomComments;
import com.dream.itclub.service.ICustomCommentsService;
import com.dream.itclub.utils.VO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class CommentsHandler {
    @Resource
    private ICustomCommentsService customCommentsService;


    @ResponseBody
    @RequestMapping("/addComments")
    public Object addMessage(Comments comments){
        VO vo = new VO();
        try {
            String s = customCommentsService.addComments(comments);
            if(!s.equals("0")){
                CustomComments commentsByComId = customCommentsService.findCommentsByComId(s);
                vo.setData(commentsByComId);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return vo;
    }
}
