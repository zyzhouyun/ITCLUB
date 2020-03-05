package com.dream.itclub.service.impl;

import com.dream.itclub.dao.BlogTypeMapper;
import com.dream.itclub.pojo.BlogType;
import com.dream.itclub.service.IBlogTypeService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BlogTypeServiceImpl implements IBlogTypeService {


    @Resource private BlogTypeMapper blogTypeMapper;


    @Cacheable(value = "blog_type")
    @Override
    public List<BlogType> findBlogTypes() throws Exception {
        return blogTypeMapper.selectByExample(null);
    }


}
