<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + 	request.getServerPort() + request.getContextPath() + "/";
%>
<html>
<head>
    <base href="<%=basePath%>">
    <title>mytitle</title>
    <script src="jquery-1.7.2.js"></script>
    <script>


        $(function () {


            $("#djBtn").click(function () {



                $.ajax({

                url :"myServlet01.do" ,
                    type:"get",
                    dataType: "json",
                    success(data){

                    alert(data.s1.id)
                    alert(data.s1.name)
                    alert(data.s1.age)
                    alert(data.s2.id)
                    alert(data.s2.name)
                    alert(data.s2.age)


                    }



                });

            });
        });




    </script>
</head>
<body>


<button id="djBtn">点击</button>

<br/>
<br/>

<div id="msg" style="width: 200px;height: 200px;background-color: pink">



</div>

<br/>
<br/>

<div style="width: 200px;height: 200px;background-color: pink">

    abcdef

</div>

</body>
</html>
