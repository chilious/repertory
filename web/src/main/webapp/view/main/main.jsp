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

    <link rel="stylesheet" type="text/css" href="/view/main/main.css">
</head>
<body>
    <header>
        <div>
            <img id="companylogo" src="/images/main.header/companylogo.png" />
            <c:forEach items="${menuList}" var ="menu" varStatus="status">
                <div class="nav">
                    <a href="${menu.menuEntity.url}">${menu.menuEntity.name}<br/><span>${menu.menuEntity.enName}</span></a>
                    <c:forEach items="${menu.subMenuList}" var="m" varStatus="s">
                        <a href="${m.menuEntity.url}">${m.menuEntity.name}</a>
                    </c:forEach>
                </div>
            </c:forEach>

            <%--<div class="nav">--%>
                <%--<a href="#" target="_self">首页<br/><span>HOME</span></a>--%>
                <%--<a href="#">个人中心</a>--%>
                <%--<a href="#">商城</a>--%>
                <%--<a href="#">玩家工坊</a>--%>
            <%--</div>--%>

            <div class="nav">
                <a href="#">我<br/><span>ME</span></a>
                <a href="#">安全管理</a>
                <a href="#">退出登录</a>
            </div>
            <span>上次登录：${storeAdmin.loginTime}</span>
        </div>
    </header>
    <div id="mid">
        <iframe id="bodyIframe" name="bodyIframe" src="/admin/mystore"
                scrolling="no" frameborder="no" border="0" marginwidth="0" marginheight="0">
        </iframe>
    </div>
</body>

<script type="text/javascript" src="/plugin/jquery/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="/plugin/common/common.js"></script>
<script type="text/javascript" src="/plugin/common/error.js"></script>
<script type="text/javascript" src="/view/main/main.js"></script>
</html>