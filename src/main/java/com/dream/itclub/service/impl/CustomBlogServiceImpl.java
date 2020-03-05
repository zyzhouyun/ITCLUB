package com.dream.itclub.service.impl;

import com.alibaba.fastjson.JSON;
import com.dream.itclub.dao.BlogMapper;
import com.dream.itclub.dao.custom.CustomBlogMapper;
import com.dream.itclub.pojo.Blog;
import com.dream.itclub.pojo.BlogExample;
import com.dream.itclub.pojo.custom.CustomBlog;
import com.dream.itclub.service.ICustomBlogService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.Duration;
import java.util.List;

@Service
public class CustomBlogServiceImpl implements ICustomBlogService {

    @Resource private CustomBlogMapper customBlogMapper;

    @Resource private BlogMapper blogMapper;

    @Resource private RedisTemplate<String,Object> redisTemplate;

    @Override
    public PageInfo<CustomBlog> findCustomBlogPageService(CustomBlog customBlog, Integer pageNum) throws Exception {
        PageHelper.startPage(pageNum==null?1:pageNum,3);
        List<CustomBlog> customBlogList = customBlogMapper.findCustomBlog(customBlog);
        PageInfo<CustomBlog> pageInfo=new PageInfo<>(customBlogList);
        return pageInfo;
    }


    //@Cacheable(value = "blog",key = "#bid")
    @Override
    public CustomBlog findCustomBlogService(String bid) throws Exception {
        if(redisTemplate.hasKey("blog:bid:"+bid)){
            System.out.println("从缓存取");
            /**
             * JSON.toJSON 将javaobject 转成JSON类型
             * JSON.toJavaObject 将JSON类型转成具体类型的Java对象类型
             */
            JSON json = (JSON) JSON.toJSON(redisTemplate.opsForValue().get("blog:bid:" + bid));
            CustomBlog cblog = JSON.toJavaObject(json, CustomBlog.class);
            return cblog;
        }
        CustomBlog customBlog=new CustomBlog();
        customBlog.setBid(bid);
        CustomBlog customBlog1=customBlogMapper.findCustomBlog(customBlog).get(0);
        redisTemplate.opsForValue().set("blog:bid:"+bid,customBlog1,Duration.ofDays(30));
        return customBlog1;
    }


    @Override
    public List<Blog> list(String btitle) throws Exception {
        BlogExample blogExample=new BlogExample();
        blogExample.createCriteria().andBtitleLike("%"+btitle+"%");
        return blogMapper.selectByExample(blogExample);
    }

    @Override
    public boolean add(Blog blog) throws Exception {
        int i=blogMapper.insertSelective(blog);
        return i>0;
    }

    @Override
    public List<Blog> hotList() throws Exception {

        if(redisTemplate.hasKey("blog:host")){
            Object obj = redisTemplate.opsForValue().get("blog:host");
            JSON json=(JSON)JSON.toJSON(obj);
            return JSON.toJavaObject(json,List.class);
        }

        List<Blog> blogList = customBlogMapper.orderDescList();
        /**
         * 热点数据；但由于是排行榜，会较为频繁的变动
         * Duration.ofHours(3);保存3小时
         */
        redisTemplate.opsForValue().set("blog:host",blogList, Duration.ofHours(3));
        return blogList;
    }


}
