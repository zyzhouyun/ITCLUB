package com.dream.itclub.pojo;

import java.util.Date;

public class Message {
    private String msgid;

    private String userid;

    private String msgcontent;

    private Date msgtime;

    private String messageuser;

    @Override
    public String toString() {
        return "Message{" +
                "msgid='" + msgid + '\'' +
                ", userid='" + userid + '\'' +
                ", msgcontent='" + msgcontent + '\'' +
                ", msgtime=" + msgtime +
                ", messageuser='" + messageuser + '\'' +
                '}';
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

    public String getMsgcontent() {
        return msgcontent;
    }

    public void setMsgcontent(String msgcontent) {
        this.msgcontent = msgcontent;
    }

    public Date getMsgtime() {
        return msgtime;
    }

    public void setMsgtime(Date msgtime) {
        this.msgtime = msgtime;
    }

    public String getMessageuser() {
        return messageuser;
    }

    public void setMessageuser(String messageuser) {
        this.messageuser = messageuser;
    }
}