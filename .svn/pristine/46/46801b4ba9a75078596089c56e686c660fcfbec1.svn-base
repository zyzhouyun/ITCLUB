package com.dream.itclub.conf;

public class AjaxResponse {

    private boolean isok;
    private int code;
    private String message;
    private Object data;

    private AjaxResponse(){}


    public static AjaxResponse success(Object data){
        AjaxResponse resultBean = new AjaxResponse();
        resultBean.setIsok(true);
        resultBean.setCode(200);
        resultBean.setMessage("请求成功");
        if(data!=null){
            resultBean.setData(data);
        }
        return resultBean;
    }


    public static AjaxResponse error(int code,String message){
        AjaxResponse resultBean = new AjaxResponse();
        resultBean.setIsok(false);
        resultBean.setCode(code);
        resultBean.setMessage(message); //异常信息；e.getMessage();
        return resultBean;
    }




    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public boolean isIsok() {
        return isok;
    }

    public void setIsok(boolean isok) {
        this.isok = isok;
    }
}
