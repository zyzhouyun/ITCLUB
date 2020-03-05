package com.dream.itclub.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Member {
    private String mid;

    private String userid;

    private String mname;

    private BigDecimal memoney;

    private Date mtime;

    private Date enddate;

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public BigDecimal getMemoney() {
        return memoney;
    }

    public void setMemoney(BigDecimal memoney) {
        this.memoney = memoney;
    }

    public Date getMtime() {
        return mtime;
    }

    public void setMtime(Date mtime) {
        this.mtime = mtime;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }
}