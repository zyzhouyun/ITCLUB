package com.dream.itclub.pojo;

import java.util.Date;

public class RepMessage {
    private String remsgid;

    private String msgid;

    private String userid;

    private String remsgcontent;

    private Date remsgtime;

    private String remessageuser;

    public String getRemsgid() {
        return remsgid;
    }

    public void setRemsgid(String remsgid) {
        this.remsgid = remsgid;
    }

    public String getMsgid() {
        return msgid;
    }

    public void setMsgid(String msgid) {
        this.msgid = msgid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getRemsgcontent() {
        return remsgcontent;
    }

    public void setRemsgcontent(String remsgcontent) {
        this.remsgcontent = remsgcontent;
    }

    public Date getRemsgtime() {
        return remsgtime;
    }

    public void setRemsgtime(Date remsgtime) {
        this.remsgtime = remsgtime;
    }

    public String getRemessageuser() {
        return remessageuser;
    }

    public void setRemessageuser(String remessageuser) {
        this.remessageuser = remessageuser;
    }
}