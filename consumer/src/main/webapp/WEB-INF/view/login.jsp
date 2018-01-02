<%--
  Created by IntelliJ IDEA.
  User: Geminifly
  Date: 2017/2/10
  Time: 14:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>康华数海大数据智能分析平台</title>
    <link href="css/login.css" rel="stylesheet"  type="text/css" />
    <link href="css/font-awesome.css" rel="stylesheet" type="text/css" />

</head>

<body>

<div class="title">康华数海大数据智能分析平台</div>
<div class="img"><img src="images/image.png" /></div>


<!--登录表单-->
<form action="dologin" method="post">
<div class="loginBox">
    <div class="form form-horizontal" >
        <div class="userlog">用&nbsp;户&nbsp;登&nbsp;录</div>
        <div class="row">
            <label class="label_pos"><i class="fa fa-user" aria-hidden="true" style="padding-top:1px;"></i></label>
            <input type="text" placeholder="请输入用户名" class="input-username" name="userName" id="personname" value=""></input>
        </div>

        <div class="row">
            <label class="label_pos"><i class="fa fa-lock" aria-hidden="true" style="padding-top:3px;"></i></label>
            <input type="password" placeholder="请输入密码" class="input-password" name="password" id="password" value=""></input>
        </div>

        <div class="row">
            <input name="captcha" id="captcha" class="input-text" type="text" placeholder="请输入验证码">
            <img class="code_img" id="code_img" src="captcha.form">
            <span><a id="kanbuq" href="#" onclick="changeCaptha()">换一张</a></span>
        </div>

        <center><div class="row" style="color: #0764ae; font-size: 16px;">
            <input name="login" id="login" type="submit" class="btn btn-success radius size-L"
                   value="登&nbsp;&nbsp;录" onclick="validate();" style="background-color: #3973cb;">
        </div></center>

    </div>
</div>
<!--登录表单 end-->
</form>
</div>

<script src="js/jquery-1.8.3.min.js" type="text/javascript"></script>
<script>
    function changeCaptha() {
        $("#code_img").attr("src","captcha.form?timestamp="+(new Date().valueOf()));
    }
    $("#code_img").click(function () {
        $("#code_img").attr("src","captcha.form?timestamp="+(new Date().valueOf()));
    });
    $(document).ready(function() {
        document.getElementsByTagName('body')[0].style.height = window.innerHeight+'px';
        //console.log(window.innerHeight);
    });

    function validate() {
        var personname = $("#personname").val();
        var password = $("#password").val();
        var captcha = $("#captcha").val();
        if (personname == "") {
            alert("请填写用户名");
            return false;
        } else if (password == "") {
            alert("请填写密码");
            return false;
        } else if (captcha == "验证码") {
            alert("请填写验证码");
            return false;
        }

        window.location.href = "./index.html";

    }

</script>

</body>
</html>

