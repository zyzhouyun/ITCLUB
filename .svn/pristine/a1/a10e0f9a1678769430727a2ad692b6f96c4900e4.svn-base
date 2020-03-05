package com.dream.itclub.handler;

import com.dream.itclub.pojo.SysUser;
import com.dream.itclub.pojo.custom.CustomSysUser;
import com.dream.itclub.service.SysUserService;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class backgroundUserHandler {

    @Resource
    private SysUserService userService;

    @RequestMapping(value = "/gobackgroundUser")
    public String gobackgroundUser(SysUser user, Model model, Integer pageNum, Integer pageSize) throws Exception {
        //获取存在session中的值
        PageInfo<CustomSysUser> userCustoms = userService.selectUserAll(user,pageNum,pageSize);
            model.addAttribute("users",userCustoms);
        return "userbackground";
    }

    @RequestMapping(value = "/gouserCreate")
    public String gouserCreate(){
        return "userCreate";
    }

    @RequestMapping(value = "/goblog")
    public String goblog(){
        return "blog";
    }

    @RequestMapping(value = "/gotype")
    public String gotype(){
        return "type";
    }

    @RequestMapping(value = "/gotypeCreate")
    public String gotypeCreate(){
        return "typeCreate";
    }
}
