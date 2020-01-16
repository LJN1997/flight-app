<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<html>
  <head>
    <title>后台</title>
  </head>
  <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.css" rel="stylesheet">
  <body>
  <h3 align="center"> 航空系统 <small>航班信息</small></h3>
  <hr color="red">


    <div class="container">
      <table class="table table-bordered">
        <tr>
          <th>航班ID</th>
          <th>航班名</th>
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
          <%
            String userId = String.valueOf(session.getAttribute("userId"));
          %>
          <td><a class="btn btn-default"  role="button" href="ticket?userId=${userId}&flightId=${data.flightId}">订票</a></td>
        </tr>
        </c:forEach>
      </table>
    </div>
  </center>


  </body>
</html>
