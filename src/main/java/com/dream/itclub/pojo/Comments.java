package com.dream.itclub.pojo;

import java.util.Date;

public class Comments {
    private String comid;

    private String bid;

    private String userid;

    private String comcontent;

    private Integer comgoodnum;

    private Date comdatetime;

    public String getComid() {
        return comid;
    }

    public void setComid(String comid) {
        this.comid = comid;
    }

    public String getBid() {
        return bid;
    }

    public void setBid(String bid) {
        this.bid = bid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getComcontent() {
        return comcontent;
    }

    public void setComcontent(String comcontent) {
        this.comcontent = comcontent;
    }

    public Integer getComgoodnum() {
        return comgoodnum;
    }

    public void setComgoodnum(Integer comgoodnum) {
        this.comgoodnum = comgoodnum;
    }

    public Date getComdatetime() {
        return comdatetime;
    }

    public void setComdatetime(Date comdatetime) {
        this.comdatetime = comdatetime;
    }
}