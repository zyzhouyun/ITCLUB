package com.dream.itclub.handler;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;

import java.text.SimpleDateFormat;
import java.util.Date;

@ControllerAdvice
public class BaseController {

    @InitBinder
    public void intiStringToDateBinder(WebDataBinder dataBinder){
        //指定日期转换格式
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy-MM-dd");
        //创建属性编辑器
        CustomDateEditor dateEditor=new CustomDateEditor(dateFormat,true);
        //执行日期转换
        dataBinder.registerCustomEditor(Date.class, dateEditor);
    }

    @ExceptionHandler(value = Exception.class)
    public String doLoginException(Exception e, Model model){
        model.addAttribute("error", e.getMessage());
        return "UserLogin";
    }
}
