﻿var area;
layui.use(['element', 'jquery', 'form', 'layedit', 'flow'], function () {
    var element = layui.element;
    var form = layui.form;
    var $ = layui.jquery;
    var layedit = layui.layedit;
    var flow = layui.flow;
    var userId=$("#messageUserId").val();
    //留言的编辑器
    var editIndex = layedit.build('remarkEditor', {
        height: 150,
        tool: ['face', '|', 'link'],
    });
    //留言的编辑器的验证
    form.verify({
        content: function (value) {
            value = $.trim(layedit.getContent(editIndex));
            if (value == ""){
                return "请输入内容";
            }else if(userId=='') {
                return "请先登录哦"
            }else{
                $.ajax({
                    url:"/addMessage",
                    type:"post",
                    dataType:"json",
                    data:{"userid":userId,"msgcontent":value,"messageuser":"c9f5400076474e93a91ef8baf7de3117"},
                    success:function (result) {
                        var C_message=result.data;
                        var d = new Date(C_message.msgtime);
                        var times=d.getFullYear() + '-' + (d.getMonth() + 1) + '-' + d.getDate() + ' ' + d.getHours() + ':' + d.getMinutes() + ':' + d.getSeconds();
                        $("#message-list").prepend($("<li class=\"zoomIn article\">\n" +
                            "                <input type=\"hidden\" value="+C_message.msgid+">"+
                            "                <div class=\"comment-parent\">\n" +
                            "                    <a name=\"remark-1\"></a>\n" +
                            "                    <img src=\"https://thirdqq.qlogo.cn/qqapp/101465933/7627F745B95BFAC18C6C481FE72B4EB1/100\" />\n" +
                            "                    <div class=\"info\">\n" +
                            "                        <span class=\"username\">"+C_message.messageUserName+"</span>\n" +
                            "                    </div>\n" +
                            "                    <div  class=\"comment-content\">"+C_message.msgcontent+
                            "               </div>\n" +
                            "                    <p class=\"info info-footer\">\n"+
                            "                        <i class=\"fa fa-map-marker\" aria-hidden=\"true\"></i>\n" +
                            "                        <span class=\"comment-time\">"+times+"</span>\n" +
                            "                        <a href=\"javascript:;\" class=\"btn-reply\" data-targetid="+C_message.messageuser+" data-targetname="+C_message.messageUserName+"\>回复</a>\n" +
                            "                    </p>\n" +
                            "                </div>\n" +
                            "                <hr/>\n" +
                            "                <div class=\"replycontainer layui-hide\"> \n" +
                            "                    <form class=\"layui-form\" action=\"\"> \n" +
                            "                        <input type=\"hidden\" name=\"remarkId\" value=\"1\"> \n" +
                            "                        <input type=\"hidden\" name=\"targetUserId\" value=\"0\"> \n" +
                            "                        <div class=\"layui-form-item\"> \n" +
                            "                            <textarea name=\"replyContent\" lay-verify=\"replyContent\" placeholder=\"请输入回复内容\" class=\"layui-textarea\" style=\"min-height:80px;\"></textarea> \n" +
                            "                        </div> \n" +
                            "                        <div class=\"layui-form-item\"> \n" +
                            "                            <button type=\"button\" class=\"layui-btn layui-btn-xs\" lay-submit=\"formReply\" lay-filter=\"formReply\">提交</button> \n" +
                            "                        </div> \n" +
                            "                    </form> \n" +
                            "                </div>\n" +
                            "            </li>"));
                    },
                    error:function () {
                        alert("服务器异常，请联系管理员")
                    }
                })
            }
        },
        replyContent: function (value) {
            if (value == ""){
                return "请输入内容";
            }
            if(userId==''){
                return "请先登录哦"
            }
        }
    });

    //回复留言
    var one=0;//当前回复对象id
    form.on('submit(formReply)', function(data){
        var userId=$("#messageUserId").val();//获取登录对象的ID
        var msgId = $(data.elem).parents('.replycontainer').siblings('.comment-parent').prev().val();//此条留言id
        var siblings = $(data.elem).parents('.replycontainer').siblings('.comment-child:last');
        var str=data.field.replyContent;
        if(siblings.length==0){
            siblings=$(data.elem).parents('.replycontainer').prev();
        }
        $.ajax({
            url:"/addRepMessage",
            type:"post",
            dataType:"json",
            data:{"msgid":msgId,"userid":userId,"remsgcontent":str,"remessageuser":one},
            success:function (result) {
                var repMessage= result.data;
                var d = new Date(repMessage.remsgtime);
                var times=d.getFullYear() + '-' + (d.getMonth() + 1) + '-' + d.getDate() + ' ' + d.getHours() + ':' + d.getMinutes() + ':' + d.getSeconds();
                siblings.after($("<div class=\"comment-child\">\n" +
                    "                    <a name=\"reply-1\"></a>\n" +
                    "                    <img src=\"https://thirdqq.qlogo.cn/qqapp/101465933/7627F745B95BFAC18C6C481FE72B4EB1/100\">\n" +
                    "                    <div class=\"info\">\n" +
                    "                        <span class=\"username\">"+repMessage.sysUser.uname+"</span>\n" +
                    "                        <span style=\"padding-right:0;margin-left:-5px;\">回复</span>\n" +
                    "                        <span class=\"username\">"+repMessage.repMessageUserName+"</span>\n" +
                    "                        <span>"+repMessage.remsgcontent+"</span>\n" +
                    "                    </div>\n" +
                    "                    <p class=\"info\">\n" +
                    "                        <i class=\"fa fa-map-marker\" aria-hidden=\"true\"></i>\n" +
                    "                        <span class=\"comment-time\">"+times+"</span>\n" +
                    "                        <a href=\"javascript:;\" class=\"btn-reply\" data-targetid="+repMessage.userid+" data-targetname="+repMessage.sysUser.uname+">回复</a>\n" +
                    "                    </p>\n" +
                    "                    <hr/>\n" +
                    "                </div>"))
                $(data.elem).parents('.replycontainer').addClass('layui-hide');
            },
            error:function () {
                alert("服务器异常请联系管理员")
            }
        });
    });
    //回复按钮点击事件
    $('#message-list').on('click', '.btn-reply', function () {
        alert(123111111111111)
         var targetId = $(this).data('targetid')
             , targetName = $(this).data('targetname')
             , $container = $(this).parent('p').parent().siblings('.replycontainer');
         one=targetId;//当回复按钮点击时将targetid赋值给one
         if ($(this).text() == '回复') {
             $container.find('textarea').attr('placeholder', '回复【' + targetName + '】');
             $container.removeClass('layui-hide');
             $container.find('input[name="targetUserId"]').val(targetId);
             $(this).parents('.message-list li').find('.btn-reply').text('回复');
             $(this).text('收起');
         } else {
             $container.addClass('layui-hide');
             $container.find('input[name="targetUserId"]').val(0);
             $(this).text('回复');
         }
     });

    //查看按钮点击事件
    $('#message-list').on('click','.lookAll',function () {
        $(this).siblings('.comment-child').attr("style","display:block;");
        $(this).attr("style","display:none;");
    })
 
});
 
