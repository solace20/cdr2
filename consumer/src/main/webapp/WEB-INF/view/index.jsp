<%--
  Created by IntelliJ IDEA.
  User: Geminifly
  Date: 2017/2/10
  Time: 14:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <title>临床数据中心</title>
    <link href="<%=basePath%>css/index.css" rel="stylesheet" type="text/css" />
    <script type="text/javascript" src="<%=basePath%>js/echarts/3/echarts.js"></script>
</head>

<body>

<!--home-->
<div class="homebody">
    <!---banner--->
    <div class="banner">
        <div class="logo"><img src="images/logo.png"/></div>
        <p class="mainword">协和医院大数据智能应用分析平台</p>
        <p class="bannername">晚上好，张三！</p>
        <p class="logout">[退出]</p>
        <img calss="bannerbg" src="images/banner1.png">
    </div>
    <!---banner end--->
    <!--mainmenu-->
    <div class="mainmenu">
        <!--菜单-->
        <div class="menu">
            <div class="menulist">
                <ul class="menuul">
                    <li class="menuli">
                        <a href="#"  class="menuulSelect">等级医院评审</a>
                    </li>
                    <li class="menuli">
                        <a href="#">院级运营分析</a>
                    </li>
                    <li class="menuli">
                        <a href="#">院长驾驶舱</a>
                    </li>
                    <li class="menuli">
                        <a href="#">数据上报</a>
                    </li>
                    <li class="menuli">
                        <a href="#">直报申请</a>
                    </li>
                    <li class="menuli">
                        <a href="#">病历搜索器</a>
                    </li>
                    <li class="menuli">
                        <a href="#">交叉主索引</a>
                    </li>
                    <li class="menuli">
                        <a href="#">直报管理</a>
                    </li>
                    <li class="menuli">
                        <a href="#">ETL控制台</a>
                    </li>
                    <li class="menuli">
                        <a href="#">字典管理</a>
                    </li>
                    <li class="menuli">
                        <a href="#">系统管理</a>
                    </li>
                </ul>
            </div>
        </div>
        <!--菜单 end-->
    </div>
    <!-- mainmenu end-->
</div>
<!--home end -->


<!--submenu-->
<div>
    <div style="float:left;  width:15%; height:100%;">
        <!-- tree begin -->
        <div class="container">
            <div class="leftsidebar_box">
                <div class="header">主菜单</div>
                <div class="headertraingle"><img src="images/menu_triangle.png"></div>
                <dl class="submenu_list">
                    <dt>医院运行指标<img src="images/submenu_sum.png"></dt>
                    <dd><img src="images/submenu_right.png">&nbsp;&nbsp;&nbsp;<a href="#">资源配置</a></dd>
                    <hr   style="display:none;">
                    <dd><img src="images/submenu_right.png">&nbsp;&nbsp;&nbsp;<a href="#">工作负荷</a></dd>
                    <hr style="display:none">
                    <dd><img src="images/submenu_right.png">&nbsp;&nbsp;&nbsp;<a href="#">治疗质量</a></dd>
                    <hr style="display:none">
                    <dd><img src="images/submenu_right.png">&nbsp;&nbsp;&nbsp;<a href="#">工作效率</a></dd>
                    <hr style="display:none">
                    <dd><img src="images/submenu_right.png">&nbsp;&nbsp;&nbsp;<a href="#">资产运营</a></dd>
                    <hr style="display:none">
                    <dd><img src="images/submenu_right.png">&nbsp;&nbsp;&nbsp;<a href="#">科研成果</a></dd>
                    <hr style="display:none">
                </dl>
                <dl class="submenu_list">
                    <dt>住院医疗质量安全<img src="images/submenu_sum.png"></dt>
                    <dd><img src="images/submenu_right.png">&nbsp;&nbsp;&nbsp;<a href="#">麻醉统计指标</a></dd>
                    <hr style="display:none">
                    <dd><img src="images/submenu_right.png">&nbsp;&nbsp;&nbsp;<a href="#">入院前压疮统计</a></dd>
                    <hr style="display:none">
                    <dd><img src="images/submenu_right.png">&nbsp;&nbsp;&nbsp;<a href="#">住院期间压疮统计</a></dd>
                    <hr style="display:none">
                    <dd><img src="images/submenu_right.png">&nbsp;&nbsp;&nbsp;<a href="#">院内跌倒与坠床统计</a></dd>
                    <hr style="display:none">
                    <dd><img src="images/submenu_right.png">&nbsp;&nbsp;&nbsp;<a href="#">手术并发症指标统计</a></dd>
                    <hr style="display:none">
                    <dd><img src="images/submenu_right.png">&nbsp;&nbsp;&nbsp;<a href="#">住院安全监测指标</a></dd>
                    <hr style="display:none">
                </dl>
                <dl class="submenu_list">
                    <dt>单病种质量指标<img src="images/submenu_sum.png"></dt>
                    <dd><img src="images/submenu_right.png">&nbsp;&nbsp;&nbsp;<a href="#">单病种卫生经济统计指标</a></dd>
                    <hr style="display:none">
                    <dd><img src="images/submenu_right.png">&nbsp;&nbsp;&nbsp;<a href="#">临床路径指标</a></dd>
                    <hr style="display:none">
                    <dd><img src="images/submenu_right.png">&nbsp;&nbsp;&nbsp;<a href="#">抗生素使用情况</a></dd>
                    <hr style="display:none">
                </dl>
                <dl class="submenu_list">
                    <dt>重症医学监测指标<img src="images/submenu_sum.png"></dt>
                    <dd><img src="images/submenu_right.png">&nbsp;&nbsp;&nbsp;<a href="#">重症医学监测指标</a></dd>
                    <hr style="display:none">

                </dl>
                <dl class="submenu_list">
                    <dt>临床药学监测指标<img src="images/submenu_sum.png"></dt>
                    <dd><img src="images/submenu_right.png">&nbsp;&nbsp;&nbsp;<a href="#">合理用药监测指标</a></dd>
                    <hr style="display:none">

                </dl>
                <dl class="submenu_list">
                    <dt>医院感染控制质量<img src="images/submenu_sum.png"></dt>
                    <dd><img src="images/submenu_right.png">&nbsp;&nbsp;&nbsp;<a href="#">感染控制监测指标</a></dd>
                    <hr style="display:none">

                </dl>
            </div>
        </div>
        <!--end  tree -->
    </div>

    <!--submenu end-->
    <div class="togglemenu_show"></div>
    <!-- body-->


    <div style=" width:100%;background-color:#f1f2f7;overflow:hidden; text-align: left">
        <div class="main">
            <div class="myhome">我的主页</div>
            <div class="tri"></div><span class="index">等级医院评审 > 医院运行指标</span></div>
    </div>
    <div style="width: 85%; height: 85%; border: 1px  gray; float: right">

    </div>
    <div id="content" style="display: block;">
        <div class="row-fluid" style=" margin: 0 20px;">
            <div id="first" class="span4 column ui-sortable" style="width: 55%; height: 400px;"></div>
            <div id="second" class="span4 column ui-sortable" style="width: 40%; height: 400px;" ></div>

        </div>
    </div>


</div>
</div>


<!-- body end-->


<!-- footer-->
<div>
    <div class="footer">
        <p class="footertxt">技术支持：武汉康华数海科技有限公司</p>
    </div>
</div>
<!-- footer end-->
<script src="js/jquery.js"></script>
<script src="js/index.js"></script>

</body>
</html>

