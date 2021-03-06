package com.dream.itclub.service.impl;

import com.dream.itclub.dao.SysUserMapper;
import com.dream.itclub.pojo.SysUser;
import com.dream.itclub.pojo.SysUserExample;
import com.dream.itclub.pojo.custom.CustomSysUser;
import com.dream.itclub.service.SysUserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {
    @Resource
    private SysUserMapper userMapper;

    @Override
    public SysUser selectUser(SysUser user) throws Exception {
        //获取封装查询的对象
        SysUserExample userExample = new SysUserExample();
        SysUserExample.Criteria criteria = userExample.createCriteria();
        //设置查询条件
        criteria.andUnameEqualTo(user.getUname()).andPwdEqualTo(user.getPwd());
        //执行查询操作,获取查询的集合
        List<SysUser> sysUsers = userMapper.selectByExample(userExample);
        SysUser login = sysUsers.get(0);
        return login;
    }

    @Override
    public SysUser selectByPhone(String phone) throws Exception {
        SysUser user =null;
        SysUserExample example=new SysUserExample();
        SysUserExample.Criteria criteria = example.createCriteria();
        criteria.andPhoneEqualTo(phone);
        List<SysUser> users = userMapper.selectByExample(example);
        if (users.size()!=0){
            user = users.get(0);
        }else {
            return null;
        }
        return user;
    }

    @Override
    public int insertSysUser(SysUser sysUser) throws Exception {
        int i = userMapper.insertSelective(sysUser);
        return i;
    }

    @Override
    public int UpdatePwd(SysUser sysUser) throws Exception {
        SysUserExample example=new SysUserExample();
        SysUserExample.Criteria criteria = example.createCriteria();
        criteria.andPhoneEqualTo(sysUser.getPhone());
        int i = userMapper.updateByExampleSelective(sysUser, example);
        return i;
    }

    @Override
    public PageInfo<CustomSysUser> selectUserAll(SysUser sysUser, Integer pageNum, Integer pageSize) throws Exception {
        if(pageNum==null){
            pageNum=1;
        }
        if(pageSize==null){
            pageSize=5;
        }
        PageHelper.startPage(pageNum,pageSize);
        List<CustomSysUser> userCustoms = userMapper.UserList(sysUser);
        PageInfo<CustomSysUser> customPageInfo = new PageInfo<>(userCustoms);
        return customPageInfo;
    }

}
