<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"  %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>员工列表</title>
    <link href="<c:url value="/static/css/employeeStyle.css"/>"/ text="text/css" rel="styleSheet">
</head>
<body>

<table  id="back">
    <tr id="emlpoyee-title">
        <td>编号</td>
        <td>姓名</td>
        <td>年龄</td>
        <td>性别</td>
    </tr>
  <c:forEach items = "${getAllEmployee}" var = "e"  varStatus = "status">
        <tr bgcolor="${status.index%2==0?'#F0F0F0':'#FFFFFF'}">
            <td>${e.id}</td>
            <td>${e.name}</td>
            <td>${e.age}</td>
            <td>${e.gender}</td>
        </tr>
    </c:forEach>

  </table>

</body>
</html>
