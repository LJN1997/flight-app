<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<html>
  <head>
    <title>后台</title>
  </head>
  <body>

  <h3 align="center">航班信息</h3>
  <hr color="red">
  <center>

    <div class="container">
      <table class="table table-bordered">
        <tr>
          <th>航班ID</th>
          <th>航班名字</th>
          <th>起始地</th>
          <th>目的地</th>
          <th>出发时间</th>
          <th>抵达时间</th>
          <th>机票价格</th>
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
        </tr>
        </c:forEach>
      </table>
    </div>
  </center>


  </body>
</html>
