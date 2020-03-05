package com.dream.itclub.handler;

import com.dream.itclub.conf.FileDTO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.util.ClassUtils;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.util.UUID;

@RequestMapping("file")
@Controller
public class FileHandler {

    private static final String host="http://localhost:";

    private static final String dir="upload";

    @Value("${server.port}")
    private String port;

    @ResponseBody
    @RequestMapping("/upload")
    public FileDTO upload(@RequestParam("editormd-image-file") MultipartFile multipartFile, HttpServletResponse response){
        String NewFileName=null;
        try {
        String realPath = ClassUtils.getDefaultClassLoader().getResource("").getPath()
                + "static" + File.separator + dir + File.separator + "";
        NewFileName =UUID.randomUUID().toString().replace("-","")+"."+StringUtils.getFilenameExtension(multipartFile.getOriginalFilename());
        //System.out.println("新文件名："+NewFileName);
        File uploadFile=new File(realPath,NewFileName);
        if(!uploadFile.exists()){
            uploadFile.mkdirs();
        }
        multipartFile.transferTo(uploadFile);
        //图片路径；博客项图片
        Cookie ck=new Cookie("imgpath",NewFileName);
        ck.setPath("/");
        response.addCookie(ck);
        } catch (Exception e) {
            e.printStackTrace();
            return new FileDTO(0,"服务器异常："+e.getMessage(),"");
        }
        return new FileDTO(1,"",host+port+File.separator+dir+File.separator+NewFileName);
    }



}
