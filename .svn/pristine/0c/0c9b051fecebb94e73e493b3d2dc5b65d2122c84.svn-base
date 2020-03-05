package com.dream.itclub.handler;

import com.dream.itclub.service.IStatisticsService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class StatisticsHandler extends BaseController {
    @Resource
    private IStatisticsService statisticsService;

    @RequestMapping(value = "/statistics")
    public String Statistics(String startTime, String endTime, Model model){
        System.out.println(startTime);
        try {
            int numberBlogs = statisticsService.findNumberBlogs(startTime, endTime);
            int registeredUsers = statisticsService.findRegisteredUsers(startTime, endTime);
            model.addAttribute("numberBlogs",numberBlogs);
            model.addAttribute("registeredUsers",registeredUsers);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "statistics";
    }
}
