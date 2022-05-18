<%--
  Created by IntelliJ IDEA.
  User: user
  Date: 2022-05-18
  Time: 오전 9:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>save-form</title>
</head>
<body>
    <h2>Save-Form</h2>
    <h2>개인정보 입력</h2>
    <form action="save2" method="post">
        이름: <input type="text" name="name"><br />
        나이: <input type="text" name="age"><br />
        <input type="submit" value="전송">
    </form>
</body>
</html>
