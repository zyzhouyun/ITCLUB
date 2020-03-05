package com.dream.itclub.pojo.custom;

import com.dream.itclub.pojo.RepMessage;
import com.dream.itclub.pojo.SysUser;

public class CustomRepMessage extends RepMessage {
    private SysUser sysUser;
    private String repMessageUserName;

    public String getRepMessageUserName() {
        return repMessageUserName;
    }

    public void setRepMessageUserName(String repMessageUserName) {
        this.repMessageUserName = repMessageUserName;
    }

    public SysUser getSysUser() {
        return sysUser;
    }

    public void setSysUser(SysUser sysUser) {
        this.sysUser = sysUser;
    }

    @Override
    public String toString() {
        return "CustomRepMessage{" +
                "sysUser=" + sysUser +
                ", RepMessageUserName='" + repMessageUserName +
                super.toString()+'\'' +
                '}';
    }
}
