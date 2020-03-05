package com.dream.itclub.pojo;

import java.io.Serializable;
import java.util.Date;

public class Blog implements Serializable {
    private String bid;

    private String userid;

    private String typeid;

    private String btitle;

    private Integer bpvnum;

    private Integer bgoodnum;

    private Date bpublishtime;

    private String bimgpath;

    private Integer auditstatus;

    private String instructions;

    private String bcontent;

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

    public String getTypeid() {
        return typeid;
    }

    public void setTypeid(String typeid) {
        this.typeid = typeid;
    }

    public String getBtitle() {
        return btitle;
    }

    public void setBtitle(String btitle) {
        this.btitle = btitle;
    }

    public Integer getBpvnum() {
        return bpvnum;
    }

    public void setBpvnum(Integer bpvnum) {
        this.bpvnum = bpvnum;
    }

    public Integer getBgoodnum() {
        return bgoodnum;
    }

    public void setBgoodnum(Integer bgoodnum) {
        this.bgoodnum = bgoodnum;
    }

    public Date getBpublishtime() {
        return bpublishtime;
    }

    public void setBpublishtime(Date bpublishtime) {
        this.bpublishtime = bpublishtime;
    }

    public String getBimgpath() {
        return bimgpath;
    }

    public void setBimgpath(String bimgpath) {
        this.bimgpath = bimgpath;
    }

    public Integer getAuditstatus() {
        return auditstatus;
    }

    public void setAuditstatus(Integer auditstatus) {
        this.auditstatus = auditstatus;
    }

    public String getInstructions() {
        return instructions;
    }

    public void setInstructions(String instructions) {
        this.instructions = instructions;
    }

    public String getBcontent() {
        return bcontent;
    }

    public void setBcontent(String bcontent) {
        this.bcontent = bcontent;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "bid='" + bid + '\'' +
                ", userid='" + userid + '\'' +
                ", typeid='" + typeid + '\'' +
                ", btitle='" + btitle + '\'' +
                ", bpvnum=" + bpvnum +
                ", bgoodnum=" + bgoodnum +
                ", bpublishtime=" + bpublishtime +
                ", bimgpath='" + bimgpath + '\'' +
                ", auditstatus=" + auditstatus +
                ", instructions='" + instructions + '\'' +
                ", bcontent='" + bcontent + '\'' +
                '}';
    }
}