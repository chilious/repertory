<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/24
  Time: 15:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>嘟嘟仓库</title>
    <link rel="icon" type="image/x-icon" href="/images/common/ico.ico">
    <link rel="stylesheet" type="text/css" href="/plugin/layui/css/layui.css">
    <link rel="stylesheet" type="text/css" href="/plugin/common/common.css">
    <link rel="stylesheet" type="text/css" href="/view/main/main.css">
</head>
<body>
    <header>
        <div>
            <img id="companylogo" src="/images/main.header/companylogo.png" />
            <c:forEach items="${menuList}" var ="menu" varStatus="status">
                <div class="nav">
                    <a href="${menu.menuEntity.url}" target="bodyIframe">${menu.menuEntity.name}<br/><span>${menu.menuEntity.enName}</span></a>
                    <c:forEach items="${menu.subMenuList}" var="m" varStatus="s">
                        <a href="${m.menuEntity.url}" target="bodyIframe">${m.menuEntity.name}</a>
                    </c:forEach>
                </div>
            </c:forEach>

            <div class="nav">
                <a href="javascript:;">我<br/><span>ME</span></a>
                <a href="javascript:update_password();">修改密码</a>
                <a href="/admin/exit">退出登录</a>
            </div>
            <div id="lastLoginTime" class="verticalCenter">上次登录：${storeAdmin.loginTime}</div>
        </div>
    </header>
    <div id="mid">
        <span class="layui-breadcrumb">
          <a href="">首页</a>
          <a href="">我的仓库</a>
        </span>
        <iframe id="bodyIframe" name="bodyIframe" src=""
                scrolling="no" frameborder="no" border="0" marginwidth="0" marginheight="0">
        </iframe>
    </div>
</body>

<script type="text/javascript" src="/plugin/jquery/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="/plugin/layui/layui.js"></script>
<script type="text/javascript" src="/plugin/layer/layer.js"></script>
<script type="text/javascript" src="/plugin/common/common.js"></script>
<script type="text/javascript" src="/plugin/common/error.js"></script>
<script type="text/javascript" src="/view/main/main.js"></script>
</html>