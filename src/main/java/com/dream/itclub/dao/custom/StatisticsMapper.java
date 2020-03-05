package com.dream.itclub.dao.custom;

import org.apache.ibatis.annotations.Param;

public interface StatisticsMapper {
    //查询发布的博客数量
    public int findNumberBlogs(@Param("startTime")String startTime, @Param("endTime")String endTime) throws Exception;


    //查询注册的用户数量
    public int findRegisteredUsers(@Param("startTime")String startTime,@Param("endTime")String endTime) throws Exception;
}
