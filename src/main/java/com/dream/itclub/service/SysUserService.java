package com.dream.itclub.service;

import com.dream.itclub.pojo.SysUser;
import com.dream.itclub.pojo.custom.CustomSysUser;
import com.github.pagehelper.PageInfo;

public interface SysUserService {
    public SysUser selectUser(SysUser user) throws Exception;

    public SysUser selectByPhone(String phone)throws Exception;

    public int insertSysUser(SysUser sysUser)throws Exception;
    
    public int UpdatePwd(SysUser sysUser)throws Exception;

    public PageInfo<CustomSysUser> selectUserAll(SysUser sysUser, Integer pageNum, Integer pageSize) throws Exception;
}
