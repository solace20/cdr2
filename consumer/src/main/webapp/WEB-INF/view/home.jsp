<%--
  Created by IntelliJ IDEA.
  User: Geminifly
  Date: 2017/2/10
  Time: 14:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>临床数据中心home</title>
    <style>
        body{margin:0;padding:0}
        .banner{position:relative;width:100%;height:83px;background-color:#0f5db7}
        .mainword{
            font-size: 26px;
            font-family: "Microsoft YaHei";
            color: rgb( 249, 251, 254 );
            position: absolute;
            left: 88px;
            top: -4px;
            z-index: 85;
        }

        @media screen and (max-width: 1200px) {
            .logo{position: absolute;left: 47px;top: 26px;width: 33px;height: 33px;z-index: 142;}
        }
        @media screen and (min-width: 1200px) {
            .logo{position:absolute;left: 47px;top: 26px;width: 33px;height: 33px;z-index: 142;}
        }
        .bannerbg{left: -2px;top: -44px;height: 127px;}
        .bannername{
            font-size: 14px;
            font-family: "SimHei";
            color:#fff;
            position: absolute;
            right: 100px;
            top: 23px;
            z-index: 86;
        }
        .logout{
            position:absolute;
            font-size: 14px;
            font-family: "SimHei";
            color:#fff;
            right: 40px;
            top: 23px;
            z-index: 86;
        }

        .mainmenu{
            background-color:#ebf5f7;
            display:block;
            left: -13px;
            top: 82px;
            width: 100%;
            height: 42px;
        }
        .menuul{height:30px;width:100%;margin:0;padding:0;list-style: none;display:inline-block}
        .menuul li{height:30px;padding:5px 20px;display: inline-block;text-margin:center;}
        .menuul li a{text-decoration:none;color: #3b92c3;line-height:30px;font-size: 16px;;width:100%;display:inline-block;text-align:center;font-family:"HiraginoSansGB";}
        .menuul li a:hover{
            color:#fff;border-radius: 7px;width:120%;text-margin:center;height: 30px;
            background-image: -moz-linear-gradient( 90deg, rgb(41,120,192) 0%, rgb(0,149,246) 100%);
            background-image: -webkit-linear-gradient( 90deg, rgb(41,120,192) 0%, rgb(0,149,246) 100%);
            background-image: -ms-linear-gradient( 90deg, rgb(41,120,192) 0%, rgb(0,149,246) 100%);
        }
        .triangle{
            font-size: 16px;
            font-family: "HiraginoSansGB"
            color:#3b92c3;
            margin:auto;
        }
    </style>
</head>

<body>
<!---banner--->
<div class="banner">
    <div class="logo">
        <img src="images/logo.png"/>
    </div>
    <p class="mainword">协和医院大数据智能应用分析平台</p>
    <p class="bannername">晚上好，张三！</p>
    <p class="logout">[退出]</p>
    <img calss="bannerbg" src="images/banner1.png">
</div>
<!---banner end--->


<div class="mainmenu">
    <!--菜单-->
    <div class="menu">
        <div class="menulist">
            <ul class="menuul">
                <li class="menuli">
                    <a href="#">统计图表</a>
                </li>
                <li class="menuli">
                    <a href="#">3D病历</a>
                </li>
                <li class="menuli">
                    <a href="#">待办事项</a>
                </li>
                <li class="menuli">
                    <a href="#">交叉主索引管理</a>
                </li>
                <li class="menuli">
                    <a href="#">图表设计</a>
                </li>
                <li class="menuli">
                    <a href="#">直报管理</a>
                </li>
                <li class="menuli">
                    <a href="#">数据抽取管理</a>
                </li>
                <li class="menuli">
                    <a href="#">字典管理</a>
                </li>
                <li class="menuli">
                    <a href="#">字典映射</a>
                </li>
                <li class="menuli">
                    <a href="#">系统管理</a>
                </li>
            </ul>
        </div>
    </div>
    <!--菜单 end-->
</div>

</body>
</html>


