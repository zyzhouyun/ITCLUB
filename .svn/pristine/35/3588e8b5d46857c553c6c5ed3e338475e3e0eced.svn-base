package com.dream.itclub.exception;

import com.dream.itclub.conf.AjaxResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class GloablExceptionHandler {


    @ResponseBody
    @ExceptionHandler(CustomBlogException.class)
    public AjaxResponse customBlogException(Exception e){
        return AjaxResponse.error(500,e.getMessage());
    }







}
