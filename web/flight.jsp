<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<html>
  <head>
    <title>后台</title>
  </head>
  <body>
  <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.css" rel="stylesheet">
  <h3 align="center">航班信息</h3>
  <hr color="red">
  <center>
      <table class="table table-bordered">
        <tr>
          <th>航班ID</th>
          <th>航班名字</th>
          <th>起始地</th>
          <th>目的地</th>
          <th>出发时间</th>
          <th>抵达时间</th>
          <th>机票价格</th>
          <th>操作</th>
        </tr>
        <c:forEach items="${data}" var="data">
        <tr>
          <td>${data.flightId}</td>
          <td>${data.flightNumber}</td>
          <td>${data.fromCityName}</td>
          <td>${data.toCityName}</td>
          <td>${data.departureTime}</td>
          <td>${data.arrivalTime}</td>
          <td>${data.price}</td>
          <td>
            <a href="delFlight?id=<c:out value="${data.flightId}"/>">删除</a>
            <a href="editFlight.jsp?id=${data.flightId}&flightNumber=${data.flightNumber}&fromCityId=${data.fromCityId}&fromCityName=${data.fromCityName}&toCityId=${data.toCityId}&toCityName=${data.toCityName}&departureTime=${data.departureTime}&arrivalTime=${data.arrivalTime}&price=${data.price}">编辑</a></td>
          </td>
        </tr>
        </c:forEach>
      </table>
      <a href="saveFlight.jsp">添加</a>
  </center>
  </body>
</html>
