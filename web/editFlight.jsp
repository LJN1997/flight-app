<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<html>
  <head>
    <title>修改航班</title>
  </head>
  <body>
  <h3 align="center">修改航班信息</h3>
  <hr color="red">
  <center>
    <form action="updateFlight" method="post">
      <input type="hidden" name="id" value="${param.id}"/>
      <input type="hidden" name="fromCityId" value="${param.fromCityId}"/>
      <input type="hidden" name="toCityId" value="${param.toCityId}"/>
      <label>航班名字</label>
      <input type="text" value="${param.flightNumber}" name="flightNumber"><br>
      <label>起始地</label>
      <input type="text" value="${param.fromCityName}" name="fromCityName"><br>
      <label>目的地</label>
      <input type="text" value="${param.toCityName}" name="toCityName"><br>
      <label>出发时间</label>
      <input type="text" value="${param.departureTime}" name="departureTime"><br>
      <label>抵达时间</label>
      <input type="text" value="${param.arrivalTime}" name="arrivalTime"><br>
      <label>机票价格</label>
      <input type="text" value="${param.price}" name="price"><br>
      <button type="submit">提交</button>
      <a href="flight">取消</a>
    </form>
  </center>
  </body>
</html>
