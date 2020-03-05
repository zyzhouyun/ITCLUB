package com.dream.itclub.handler;

import com.dream.itclub.conf.AjaxResponse;
import com.dream.itclub.exception.CustomBlogException;
import com.dream.itclub.pojo.BlogType;
import com.dream.itclub.service.IBlogTypeService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("type")
@Controller
public class BlogTypeHandler {

    @Resource private IBlogTypeService blogTypeService;

    @ResponseBody
    @GetMapping("/getBlogTypes")
    public AjaxResponse getBlogTypes(){
        List<BlogType> blogTypeList=null;
        try {
            blogTypeList=blogTypeService.findBlogTypes();
        } catch (Exception e) {
            e.printStackTrace();
            throw new CustomBlogException("服务器内部异常："+e.getMessage());
        }
        return AjaxResponse.success(blogTypeList);
    }

}
