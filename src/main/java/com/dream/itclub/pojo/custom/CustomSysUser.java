package com.dream.itclub.pojo.custom;

import com.dream.itclub.pojo.Member;
import com.dream.itclub.pojo.SysUser;

/**
 * 自定义用户类
 */
public class CustomSysUser extends SysUser {

    private Member member;

    public Member getMember() {
        return member;
    }

    public void setMember(Member member) {
        this.member = member;
    }
}
