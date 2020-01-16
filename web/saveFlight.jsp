<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<html>
  <head>
    <title>增加航班</title>
  </head>
  <link href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.css" rel="stylesheet">
  <body>
  <h3 align="center">增加航班信息</h3>
  <hr color="red">
  <center>
    <form action="saveFlight" method="post">
      <label>航班名字</label>
      <input type="text"  name="flightNumber"><br>
      <label>起始地</label>
      <select name="fromCityId">
        <option value="1">北京</option>
        <option value="2">太原</option>
      </select>
      <label>目的地</label>
      <select name="toCityId">
        <option value="1">北京</option>
        <option value="2">太原</option>
      </select><br>
      <label>出发时间</label>
      <input type="text"  name="departureTime"><br>
      <label>抵达时间</label>
      <input type="text"  name="arrivalTime"><br>
      <label>机票价格</label>
      <input type="text"  name="price"><br>
      <button type="submit">提交</button>
      <a href="flight">取消</a>
    </form>
  </center>
  </body>
</html>
