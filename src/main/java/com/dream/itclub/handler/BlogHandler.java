package com.dream.itclub.handler;

import com.dream.itclub.conf.AjaxResponse;
import com.dream.itclub.exception.CustomBlogException;
import com.dream.itclub.pojo.Blog;
import com.dream.itclub.pojo.SysUser;
import com.dream.itclub.pojo.custom.CustomBlog;
import com.dream.itclub.pojo.custom.CustomComments;
import com.dream.itclub.pojo.custom.CustomRepCom;
import com.dream.itclub.service.ICustomBlogService;
import com.dream.itclub.service.ICustomCommentsService;
import com.dream.itclub.service.ICustomRepComService;
import com.dream.itclub.utils.UUIDUtil;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;

@RequestMapping("blog")
@Controller
public class BlogHandler {

    @Resource private ICustomBlogService customBlogService;
    @Resource private ICustomCommentsService customCommentsService;//zhouqunbo
    @Resource private ICustomRepComService customRepComService;//zhouqunbo



    @ResponseBody
    @RequestMapping("/findBlog")
    public AjaxResponse findBlog(CustomBlog customBlog, String blogTitle, @RequestParam(name = "pageNum",required = false) Integer pageNum){
        PageInfo<CustomBlog> pageInfo = null;
        try {
            if(blogTitle!=null){
                customBlog.setBtitle("%"+blogTitle+"%");
            }
            pageInfo = this.customBlogService.findCustomBlogPageService(customBlog,pageNum);
        } catch (Exception e) {
            e.printStackTrace();
            throw new CustomBlogException("服务器内部异常："+e.getMessage());
        }
        return AjaxResponse.success(pageInfo);
    }


    //查看博客
    @GetMapping("/descBlog/{bid}")
    public String descBlog(@PathVariable("bid") String bid, Model model){
        CustomBlog customBlog1=null;
        try {
            customBlog1 = this.customBlogService.findCustomBlogService(bid);
            System.out.println(customBlog1);

            //查询博客评论--zhouqunbo
            List<CustomComments> comments = customCommentsService.findComments(bid);
            for(CustomComments customComments:comments){
                //查询每条评论下的回复
                List<CustomRepCom> customRepCom = customRepComService.findCustomRepCom(customComments.getComid());
                customComments.setCustomRepComs(customRepCom);
            }
            model.addAttribute("commentsList",comments);

            model.addAttribute("customBlog",customBlog1);
        } catch (Exception e) {
            e.printStackTrace();
        }
        //跳转到详情页面;Handler跳转
        return "forward:/ref/toReadPage";
    }

    @ResponseBody
    @PostMapping("/publish")
    public AjaxResponse add(@RequestBody Blog blog, HttpSession session){
        try {
        SysUser sysUser =(SysUser)session.getAttribute("login");
        if(sysUser==null){
            sysUser=new SysUser();
            sysUser.setUserid("a47c3f7f019542f0bba42158a77fc65b"); //zhouyun
        }
        //设置UUID
        blog.setBid(UUIDUtil.createUUID());
        blog.setUserid(sysUser.getUserid());

        customBlogService.add(blog);
        } catch (Exception e) {
            e.printStackTrace();
            throw new CustomBlogException("服务器异常"+e.getMessage());
        }
        System.out.println(blog);
        return  AjaxResponse.success(blog);
    }


    @ResponseBody
    @GetMapping("/hot")
    public AjaxResponse hot(){
        List<Blog> blogs =null;
        try {
            blogs=customBlogService.hotList();
        } catch (Exception e) {
            e.printStackTrace();
            throw new CustomBlogException("服务器异常"+e.getMessage());
        }
        return AjaxResponse.success(blogs);
    }



}
