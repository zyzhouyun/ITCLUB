package com.dream.itclub.pojo.custom;

import com.dream.itclub.pojo.Message;
import com.dream.itclub.pojo.SysUser;

import java.util.List;

public class CustomMessage extends Message {
    private SysUser sysUser;//用户
    private String messageUserName;//保存留言用户姓名
    private List<CustomRepMessage> customRepMessage;//保存回复留言信息

    public List<CustomRepMessage> getCustomRepMessage() {
        return customRepMessage;
    }

    public void setCustomRepMessage(List<CustomRepMessage> customRepMessage) {
        this.customRepMessage = customRepMessage;
    }

    public String getMessageUserName() {
        return messageUserName;
    }

    public void setMessageUserName(String messageUserName) {
        this.messageUserName = messageUserName;
    }

    public SysUser getSysUser() {
        return sysUser;
    }

    public void setSysUser(SysUser sysUser) {
        this.sysUser = sysUser;
    }

    @Override
    public String toString() {
        return "CustomMessage{" +
                "sysUser=" + sysUser +
                super.toString()+
                '}';
    }
}
