package com.dream.itclub.service.impl;

import com.dream.itclub.dao.custom.StatisticsMapper;
import com.dream.itclub.service.IStatisticsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class StatisticsServiceImpl implements IStatisticsService {
    @Resource
    private StatisticsMapper statisticsMapper;

    @Override
    public int findNumberBlogs(String startTime, String endTime) throws Exception {
        int i = statisticsMapper.findNumberBlogs(startTime, endTime);
        return i;
    }

    @Override
    public int findRegisteredUsers(String startTime, String endTime) throws Exception {
        int i = statisticsMapper.findRegisteredUsers(startTime, startTime);
        return i;
    }
}
