package com.dream.itclub.pojo;

import java.util.Date;

public class SysUser {
    private String userid;

    private String mid;

    private String ucode;

    private String pwd;

    private String uname;

    private Integer gender;

    private String address;

    private Date birthday;

    private Integer blogage;

    private Integer integral;

    private Date registerdate;

    private Integer urole;

    private String phone;

    private String imagepath;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getMid() {
        return mid;
    }

    public void setMid(String mid) {
        this.mid = mid;
    }

    public String getUcode() {
        return ucode;
    }

    public void setUcode(String ucode) {
        this.ucode = ucode;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer  getBlogage() {
        return blogage;
    }

    public void setBlogage(Integer  blogage) {
        this.blogage = blogage;
    }

    public Integer  getIntegral() {
        return integral;
    }

    public void setIntegral(Integer  integral) {
        this.integral = integral;
    }

    public Date getRegisterdate() {
        return registerdate;
    }

    public void setRegisterdate(Date registerdate) {
        this.registerdate = registerdate;
    }

    public Integer getUrole() {
        return urole;
    }

    public void setUrole(Integer urole) {
        this.urole = urole;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }

    @Override
    public String toString() {
        return "SysUser{" +
                "userid='" + userid + '\'' +
                ", mid='" + mid + '\'' +
                ", ucode='" + ucode + '\'' +
                ", pwd='" + pwd + '\'' +
                ", uname='" + uname + '\'' +
                ", gender=" + gender +
                ", address='" + address + '\'' +
                ", birthday=" + birthday +
                ", blogage=" + blogage +
                ", integral=" + integral +
                ", registerdate=" + registerdate +
                ", urole=" + urole +
                ", phone='" + phone + '\'' +
                ", imagepath='" + imagepath + '\'' +
                '}';
    }
}