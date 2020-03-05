package com.dream.itclub.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("ref")
@Controller
public class RefHandler {

        /**
         * 跳转到首页
         */
        @RequestMapping(value = "/toIndexPage")
        public String toIndexPage(){
            return "index";
        }

    @RequestMapping(value = "/toReadPage")
        public String toReadPage(){
            return "read";
        }


        /**
         * 跳转到博客页面
         * @return
         */
        @RequestMapping(value = "/toArtclePage")
        public String toArtclePage(){
            return "article";
        }

    /**
     * 跳转到发布博客页面
     */
    @RequestMapping(value = "/toPublishPage")
    public String toPublishPage(){
        return "publish";
    }

        /**
         * 跳转到留言
         */
        @RequestMapping(value = "/toMessagePage")
        public String toMessagePage(){
            return "redirect:/findMessage";
        }


        /**
         * 跳转到链接页
         */
        @RequestMapping(value = "/toLinkPage")
        public String toLinkPage(){
            return "link";
        }


    /**
     * 跳转到个人中心页面
     */
    @RequestMapping("/toUserInfoPage")
    public String toUserInfoPage(){
        return "userinfo";
    }

    /**
     * 跳转到个人中心页面
     */
    @RequestMapping("/toHomePage")
    public String toHomePage(){
        return "homePage";
    }


}
