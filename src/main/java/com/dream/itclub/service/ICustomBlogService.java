package com.dream.itclub.service;

import com.dream.itclub.pojo.Blog;
import com.dream.itclub.pojo.custom.CustomBlog;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface ICustomBlogService {

    public PageInfo<CustomBlog> findCustomBlogPageService(CustomBlog customBlog, Integer pageNum)throws Exception;


    public CustomBlog findCustomBlogService(String bid)throws Exception;


    public List<Blog> list(String btitle)throws Exception;

    public boolean add(Blog blog)throws Exception;


    //热门博客
    public List<Blog> hotList()throws Exception;

}
