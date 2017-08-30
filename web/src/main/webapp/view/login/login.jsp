<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/8/24
  Time: 15:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="/view/login/login.css">
    <title>仓库-登录</title>
</head>
<body>
    账号<input type="text" id="phone" placeholder="手机号" maxlength="11"/><br/>
    密码<input type="password" id="pw" maxlength="50"/><br/>
    <button id="loginBtn">登录</button>
</body>

<script type="text/javascript" src="/plugin/jquery/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="/plugin/common/common.js"></script>
<script type="text/javascript" src="/plugin/common/error.js"></script>
<script type="text/javascript" src="/plugin/layer/layer.js"></script>
<script type="text/javascript" src="/view/login/login.js"></script>
</html>