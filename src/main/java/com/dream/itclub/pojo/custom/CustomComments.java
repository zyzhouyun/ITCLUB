package com.dream.itclub.pojo.custom;

import com.dream.itclub.pojo.Blog;
import com.dream.itclub.pojo.Comments;
import com.dream.itclub.pojo.SysUser;

import java.util.List;

/**
 * 自定义评论
 */
public class CustomComments extends Comments {
    private SysUser sysUser;//关联用户表
    private Blog blog;//关联博客表
    private List<CustomRepCom> customRepComs;//保存每条评论下的回复

    public List<CustomRepCom> getCustomRepComs() {
        return customRepComs;
    }

    public void setCustomRepComs(List<CustomRepCom> customRepComs) {
        this.customRepComs = customRepComs;
    }

    public SysUser getSysUser() {
        return sysUser;
    }

    public void setSysUser(SysUser sysUser) {
        this.sysUser = sysUser;
    }

    public Blog getBlog() {
        return blog;
    }

    public void setBlog(Blog blog) {
        this.blog = blog;
    }
}
