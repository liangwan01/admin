<%--
  Created by IntelliJ IDEA.
  User: 26659
  Date: 2021/12/20
  Time: 下午 1:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>


<form  action = "http://localhost:8080/03day/uploadServlet"  method= "post"  enctype = "multipart/form-data">

    用户名<input  type = "text"  name = "username"><br>
    头像<input  type ="file"    name   = "password"><br>
    <input type="submit" value="上传"/>
</form>



</body>
</html>
