package com.dream.itclub;

import com.dream.itclub.dao.custom.CustomBlogMapper;
import com.dream.itclub.pojo.Blog;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.List;

@SpringBootTest
class ItclubApplicationTests {

    @Resource
    private CustomBlogMapper customBlogMapper;


    @Test
    void contextLoads() throws Exception {
        List<Blog> customBlogList=customBlogMapper.orderDescList();
        System.out.println(customBlogList);
    }

}
