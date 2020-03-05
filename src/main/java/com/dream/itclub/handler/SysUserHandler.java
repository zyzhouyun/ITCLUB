package com.dream.itclub.handler;

import com.dream.itclub.pojo.SysUser;
import com.dream.itclub.service.SysUserService;
import com.dream.itclub.utils.UUIDUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.security.auth.login.LoginException;
import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
public class SysUserHandler extends BaseController {
    @Resource
    private SysUserService userService;

    @RequestMapping(value = "/goUpdatePwd")
    public String goUpdatePwd(){return "password";}

    @RequestMapping(value = "/goUpdatePwd2")
    public String goUpdatePwd2(){return "password_2";}

    @RequestMapping(value = "/goUserLogin")
    public String goUserLogin(){return "UserLogin";}

    @RequestMapping(value = "/gozhuce")
    public String gozhuce(){return "zhuce";}

    @RequestMapping(value = "/gozhuce1")
    public String gozhuce1(){return "zhuce1";}

    @RequestMapping(value = "/toHomePage")
    public String toHomePage(HttpSession session){
        SysUser login = (SysUser)session.getAttribute("login");
        if (login==null){
            return "UserLogin";
        }else {
            return "homePage"; //改动
        }
    }

    @RequestMapping(value ="/doLogin")
    public String doLogin(SysUser user, HttpSession session) throws LoginException {
        SysUser user1 = null;
        try {
            user1= userService.selectUser(user);
            session.setAttribute("login", user1);
            if (user1.getUrole()==1){
                return "admin";
            }else {
                return "homePage";
            }
        } catch (Exception e) {
            throw new LoginException("手机号或密码错误!");
        }
    }

    @RequestMapping(value ="/selectByPhone")
    public String selectByPhone(String phone, HttpSession session) throws Exception {
        SysUser sysUser = userService.selectByPhone(phone);
        if (sysUser!=null){
            //提示注册过，跳转到找回密码页面
            return"password";
        }else {
            //没有查询到此电话，则可以注册
            session.setAttribute("phone", phone);
            return"zhuce1";
        }
    }

    @RequestMapping(value ="/selectByPhoneUpda")
    public String selectByPhoneUpda(String phone, HttpSession session) throws Exception {
        SysUser sysUser = userService.selectByPhone(phone);
        if (sysUser!=null){
            //提示注册过，跳转到找回密码页面
            session.setAttribute("phone", phone);
            return"password_2";
        }else {
            //没有查询到此电话，则可以注册
            return"zhuce";
        }
    }

    @RequestMapping(value ="/doregistered")
    public String doregistered(SysUser sysUser, Model model) throws Exception {
        sysUser.setUserid(UUIDUtil.createUUID());
        sysUser.setUrole(2);
        sysUser.setRegisterdate(new Date());
        int i = userService.insertSysUser(sysUser);
        if (i==1){
            return "zhuceSucc";
        }else {
            model.addAttribute("error","请求失败！，请联系管理员");
            return "zhuce1";
        }

    }
    @RequestMapping(value ="/doPassWord_3")
    public String doPassWord_3(SysUser sysUser, Model model) throws Exception {
        int i = userService.UpdatePwd(sysUser);
        if (i==1){
            return "password_3";
        }else {
            model.addAttribute("error","请求失败！，请联系管理员");
            return "password_2";
        }

    }



    /**
     * 用于进行手机验证码正确与否的验证
     */
/*    @RequestMapping(value = "/phoneCaptcha")
    @ResponseBody
    public int phoneCaptcha(String phone) {
        //用户名
        final String Uid = "J饮多佐";

        //接口安全秘钥
        final String Key = "d41d8cd98f00b204e981";

        int smsCode = ((int) ((Math.random() * 9 + 1) * 100000));
        String smsText = "ItClub--注册账号验证码：" + smsCode;

        HttpClientUtil client = HttpClientUtil.getInstance();//*实例化短信接口对象

        int rs = client.sendMsgUtf8(Uid, Key, smsText, phone);//执行UTF的短信发送
        if (rs > 0) {
            return smsCode;
        }else {
            return rs;
        }
    }*/
}
