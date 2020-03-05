package com.dream.itclub.service.impl;

import com.dream.itclub.dao.MemberMapper;
import com.dream.itclub.dao.SysUserMapper;
import com.dream.itclub.pojo.Member;
import com.dream.itclub.pojo.SysUser;
import com.dream.itclub.service.IMemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

@Service
public class MemberServiceImpl implements IMemberService {

    @Resource private MemberMapper memberMapper;
    @Resource private SysUserMapper userMapper;

    @Override
    public void add(Member member,String userId) throws Exception {
        SysUser sysUser = this.userMapper.selectByPrimaryKey(userId); //当前用户

        if(sysUser!=null){
            if(sysUser.getMid()==null || sysUser.getMid().equals("")){
                System.out.println("第一次开通/过期开通 会员");
                //第一次开通会员/过期开通 会员
                Calendar calendar = Calendar.getInstance();
                calendar.setTime(member.getMtime());
                if(member.getMemoney().compareTo(new BigDecimal(15.00))==0){
                    calendar.add(calendar.MONTH , 1);
                }else if(member.getMemoney().compareTo(new BigDecimal(40.00)) == 0){
                    calendar.add(calendar.MONTH , 3);
                }else{
                    calendar.add(calendar.MONTH , 12);
                }
                member.setEnddate(calendar.getTime());

            }else{
                //续费
                System.out.println("续费");
                //查出当前用户之前的会员信息
                Member beforeMember = this.memberMapper.selectByPrimaryKey(sysUser.getMid());
                Calendar calendar = Calendar.getInstance();
                //开始计算时间为之前会员的结束时间
                calendar.setTime(beforeMember.getEnddate());
                //member新会员
                if(member.getMemoney().compareTo(new BigDecimal(15.00))==0){
                    calendar.add(calendar.MONTH , 1);
                }else if(member.getMemoney().compareTo(new BigDecimal(40.00)) == 0){
                    calendar.add(calendar.MONTH , 3);
                }else{
                    calendar.add(calendar.MONTH , 12);
                }
                //算出新会员的过期时间（新会员+老会员的时间最后过期时间）
                member.setEnddate(calendar.getTime());
            }
            //添加会员
            this.memberMapper.insertSelective(member);
            //加入/修改 会员字段
            sysUser.setMid(member.getMid());
            //修改用户会员信息
            this.userMapper.updateByPrimaryKeySelective(sysUser);
        }
    }

    @Override
    public void setTimerMember(SysUser sysUser) throws Exception {
        Member member =memberMapper.selectByPrimaryKey(sysUser.getMid());
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
            synchronized (this){
                System.out.println("timer"+new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
                sysUser.setMid("");
                userMapper.updateByPrimaryKeySelective(sysUser);
            }
        }
    }, member.getEnddate());
    }

}
