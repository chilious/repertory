<%--
  Created by IntelliJ IDEA.
  User: Chilious
  Date: 2017/9/4
  Time: 1:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">

    <link rel="stylesheet" type="text/css" href="/plugin/common/common.css">
    <link rel="stylesheet" type="text/css" href="/view/password/update.css">
    <title></title>
</head>
<body>
    <p class="verticalCenter"><span>原密码：</span><input id="old_password" type="password" maxlength="50"/></p>
    <p class="verticalCenter"><span>新密码：</span><input id="new_password" type="password" maxlength="50"/></p>
    <p class="verticalCenter"><span>确认新密码：</span><input id="renew_password" type="password" maxlength="50"/></p>
    <p class="verticalCenter" id="submit">提交</p>
</body>

<script type="text/javascript" src="/plugin/jquery/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="/plugin/common/common.js"></script>
<script type="text/javascript" src="/plugin/common/error.js"></script>
<script type="text/javascript" src="/plugin/layer/layer.js"></script>
<script type="text/javascript" src="/view/password/update.js"></script>
</html>
