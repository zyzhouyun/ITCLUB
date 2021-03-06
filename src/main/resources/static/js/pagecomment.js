﻿layui.use(['element', 'jquery', 'form', 'layedit', 'flow'], function () {
    var element = layui.element;
    var form = layui.form;
    var $ = layui.jquery;
    var layedit = layui.layedit;
    var flow = layui.flow;
    var userId=$("#messageUserId").val();
    var editIndex = layedit.build('remarkEditor', {
        height: 150,
        tool: ['face', '|', 'link'],
    });
    //评论和留言的编辑器的验证
    form.verify({
        content: function (value) {
            value = $.trim(layedit.getContent(editIndex));
            if (value == ""){
                return "请输入内容";
            }
            if(userId==''){
                return "请先登录哦"
            }
            layedit.sync(editIndex);
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
    //添加评论
    form.on('submit(formLeaveMessage)', function(data){
        var userId=$("#messageUserId").val();//获取当前登录对象
        var blogId=$("#blogtypeid").val();//获取博客Id
        var str =data.field.editorContent;//获取提交文本内容
       $.ajax({
           url:"/addComments",
           type:"post",
           dataType:"json",
           data:{"bid":blogId,"userid":userId,"comcontent":str},
           success:function (result) {
               var comments= result.data;
               var d = new Date(comments.comdatetime);
               var times=d.getFullYear() + '-' + (d.getMonth() + 1) + '-' + d.getDate() + ' ' + d.getHours() + ':' + d.getMinutes() + ':' + d.getSeconds();
               $("#blog-comment").prepend($("<li class=\"zoomIn article\">\n" +
                   "                <input type=\"hidden\" value="+comments.comid+">"+
                   "                <div class=\"comment-parent\">\n" +
                   "                    <a name=\"remark-1\"></a>\n" +
                   "                    <img src=\"https://thirdqq.qlogo.cn/qqapp/101465933/7627F745B95BFAC18C6C481FE72B4EB1/100\" />\n" +
                   "                    <div class=\"info\">\n" +
                   "                        <span class=\"username\">"+comments.sysUser.uname+"</span>\n" +
                   "                    </div>\n" +
                   "                    <div  class=\"comment-content\">"+comments.comcontent+
                   "               </div>\n" +
                   "                    <p class=\"info info-footer\">\n"+
                   "                        <i class=\"fa fa-map-marker\" aria-hidden=\"true\"></i>\n" +
                   "                        <span class=\"comment-time\">"+times+"</span>\n" +
                   "                        <a href=\"javascript:;\" class=\"btn-reply\" data-targetid="+comments.userid+" data-targetname="+comments.sysUser.uname+"\>回复</a>\n" +
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
               alert("服务器异常请联系管理员")
           }
       });
    });

    //回复评论
    var replyCommentId;//回复对象Id
    var replyCommentName;//回复对象名称
    form.on('submit(formReply)',function (data) {
        var userId=$("#messageUserId").val();//获取当前登录对象
        var comId = $(data.elem).parents('.replycontainer').siblings('.comment-parent').prev().val();//获取当前此条评论id
        var siblings = $(data.elem).parents('.replycontainer').siblings('.comment-child:last');//获取回复评论元素的最后一个
        var str=data.field.replyContent;//获取回复评论的文本
        if(siblings.length==0){//当回复的评论元素为0时
            siblings=$(data.elem).parents('.replycontainer').prev();//则添加第一条元素
        }
        $.ajax({
            url:"/addRepCom",
            type:"post",
            dataType:"json",
            data:{"comid":comId,"userid":userId,"recontent":str},
            success:function (result) {
                var repCom= result.data;
                var d = new Date(repCom.retime);
                var times=d.getFullYear() + '-' + (d.getMonth() + 1) + '-' + d.getDate() + ' ' + d.getHours() + ':' + d.getMinutes() + ':' + d.getSeconds();
                siblings.after($("<div class=\"comment-child\">\n" +
                    "                    <a name=\"reply-1\"></a>\n" +
                    "                    <img src=\"https://thirdqq.qlogo.cn/qqapp/101465933/7627F745B95BFAC18C6C481FE72B4EB1/100\">\n" +
                    "                    <div class=\"info\">\n" +
                    "                        <span class=\"username\">"+repCom.sysUser.uname+"</span>\n" +
                    "                        <span style=\"padding-right:0;margin-left:-5px;\">回复</span>\n" +
                    "                        <span class=\"username\">"+replyCommentName+"</span>\n" +
                    "                        <span>"+repCom.recontent+"</span>\n" +
                    "                    </div>\n" +
                    "                    <p class=\"info\">\n" +
                    "                        <i class=\"fa fa-map-marker\" aria-hidden=\"true\"></i>\n" +
                    "                        <span class=\"comment-time\">"+times+"</span>\n" +
                    "                        <a href=\"javascript:;\" class=\"btn-reply\" data-targetid="+repCom.userid+" data-targetname="+repCom.sysUser.uname+">回复</a>\n" +
                    "                    </p>\n" +
                    "                    <hr/>\n" +
                    "                </div>"))
                $(data.elem).parents('.replycontainer').addClass('layui-hide');
            },
            error:function () {
                alert("服务器异常请联系管理员")
            }
        });
    })
     
    //回复按钮点击事件
    $('#blog-comment').on('click', '.btn-reply', function () {
        var targetId = $(this).data('targetid')
            , targetName = $(this).data('targetname')
            , $container = $(this).parent('p').parent().siblings('.replycontainer');
        replyCommentId=targetId;//回复按钮点击时，拿到回复对象的id
        replyCommentName=targetName;//回复按钮点击时，拿到回复对象的姓名
        if ($(this).text() == '回复') {
            $container.find('textarea').attr('placeholder', '回复【' + targetName + '】');
            $container.removeClass('layui-hide');
            $container.find('input[name="targetUserId"]').val(targetId);
            $(this).parents('.blog-comment li').find('.btn-reply').text('回复');
            $(this).text('收起');
        } else {
            $container.addClass('layui-hide');
            $container.find('input[name="targetUserId"]').val(0);
            $(this).text('回复');
        }
    });

    //查看按钮点击事件
    $('#blog-comment').on('click','.lookAll',function () {
        $(this).siblings('.comment-child').attr("style","display:block;");
        $(this).attr("style","display:none;");
    })
});
 