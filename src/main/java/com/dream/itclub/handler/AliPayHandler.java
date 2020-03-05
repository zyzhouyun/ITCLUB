package com.dream.itclub.handler;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayClient;
import com.alipay.api.DefaultAlipayClient;
import com.alipay.api.request.AlipayTradePagePayRequest;
import com.dream.itclub.dao.MemberMapper;
import com.dream.itclub.dao.SysUserMapper;
import com.dream.itclub.exception.CustomBlogException;
import com.dream.itclub.pojo.Member;
import com.dream.itclub.pojo.SysUser;
import com.dream.itclub.service.IMemberService;
import com.dream.itclub.utils.AlipayConfig;
import com.dream.itclub.utils.UUIDUtil;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

@RequestMapping("alipay")
@Controller
public class AliPayHandler {

    @RequestMapping(value = "/buyMember")
    public void buyMember(BigDecimal price, HttpServletResponse response) throws IOException {
        String memberid = UUIDUtil.createUUID();        //订单号;会员id
        String memberName ="VIP";

        AlipayClient alipayClient = new DefaultAlipayClient(AlipayConfig.gatewayUrl, AlipayConfig.app_id, AlipayConfig.merchant_private_key, "json", AlipayConfig.charset, AlipayConfig.alipay_public_key, AlipayConfig.sign_type);

        //设置请求参数
        AlipayTradePagePayRequest alipayRequest = new AlipayTradePagePayRequest();
        alipayRequest.setReturnUrl(AlipayConfig.return_url);
        alipayRequest.setNotifyUrl(AlipayConfig.notify_url);

        //商户订单号
        String out_trade_no = new String(memberid.getBytes("ISO-8859-1"),"UTF-8");
        //付款金额
        String total_amount = new String((price+"").getBytes("ISO-8859-1"),"UTF-8");
        //订单名称
        String subject = new String(memberName.getBytes("ISO-8859-1"),"UTF-8");
        //商品描述
        String body = new String(memberName.getBytes("ISO-8859-1"),"UTF-8");

        alipayRequest.setBizContent("{\"out_trade_no\":\""+ out_trade_no +"\","
                + "\"total_amount\":\""+ total_amount +"\","
                + "\"subject\":\""+ subject +"\","
                + "\"body\":\""+ body +"\","
                + "\"product_code\":\"FAST_INSTANT_TRADE_PAY\"}");

        String result = null;
        try {
            result = alipayClient.pageExecute(alipayRequest).getBody();
        } catch (AlipayApiException e) {
            e.printStackTrace();
        }
        response.getWriter().write(result);
    }


    @Resource private IMemberService memberService;
    @Resource private SysUserMapper userMapper;

    @RequestMapping("/returnURL")
    public String returnURL(HttpServletRequest request, @RequestParam("out_trade_no") String memberId, @RequestParam("total_amount") BigDecimal price, @RequestParam("timestamp")Timestamp mtime){

        String userId ;
        SysUser sysUser =(SysUser) request.getSession().getAttribute("login");
        if(sysUser!=null){
            userId=sysUser.getUserid();
        }else{
            userId="4a27f9162a2649cfbda04ee634013462"; //user:zy
        }

            Member member =new Member();
            member.setMid(memberId);
            member.setUserid(userId);
            member.setMname("VIP");
            member.setMemoney(price);
            member.setMtime(mtime);
        try {
            this.memberService.add(member,userId); //添加会员；修改用户会员id
            SysUser user = userMapper.selectByPrimaryKey(userId);
            request.getSession().setAttribute("login",user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "homePage";
    }


    @Resource private MemberMapper memberMapper;

    @ResponseBody
    @RequestMapping("/startTimer")
    public String startTimer(HttpServletRequest request) {
        try {
            request.getSession().setAttribute("isFirstLogin",true);
            SysUser sysUser=(SysUser)request.getSession().getAttribute("login");

            if(sysUser.getMid()!=null){
                Member member =memberMapper.selectByPrimaryKey(sysUser.getMid());
                Timer timer = new Timer();
                timer.schedule(new TimerTask() {
                    @Override
                    public void run() {
                        if(new Date().getTime() >= member.getEnddate().getTime()){
                            System.out.println("执行定时任务");
                            sysUser.setMid("");
                            userMapper.updateByPrimaryKeySelective(sysUser);
                        }
                    }
                }, member.getEnddate()); //时间没到，到了执行；时间过了，立即执行

                SysUser user=userMapper.selectByPrimaryKey(sysUser.getUserid());
                request.getSession().setAttribute("login",user);
            }

        } catch (Exception e) {
            e.printStackTrace();
            throw new CustomBlogException("服务器异常："+e.getMessage());
        }
        return "1";
    }



    @ResponseBody
    @RequestMapping("/getMinfo")
    public Object getMinfo(String mid){
        return memberMapper.selectByPrimaryKey(mid);
    }





}