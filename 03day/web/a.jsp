<%@ page import="com.pjpowernode.pojo.Person" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: 26659
  Date: 2021/12/19
  Time: 下午 8:25
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    Person person = new Person();
    person.setName("张三");

    person.setPhones(new String[]{"45645","745"} );


    List<String>   cities = new ArrayList();

    cities.add("宿迁");
    cities.add("涨价干");
    cities.add("伤害");

    person.setCities(cities);


    Map<String ,Object> map = new HashMap<>();

    map.put("key1", "value1");
    map.put("key2", "value2");
    map.put("key3", "value3");

    pageContext.setAttribute("person", person);



%>

${person}

 ${person.name}



</body>
</html>
