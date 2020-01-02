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
  <%
    request.setCharacterEncoding("utf-8");
    String id=request.getParameter("id");
    String flightNumber=request.getParameter("flightNumber");
    String fromCityName=request.getParameter("fromCityName");
    String toCityName=request.getParameter("toCityName");
    String departureTime=request.getParameter("departureTime");
    String arrivalTime=request.getParameter("arrivalTime");
    String price=request.getParameter("price");
    String toCityId=request.getParameter("toCityId");
    String fromCityId=request.getParameter("fromCityId");
  %>
  <center>
    <form action="updateFlight" method="post">
      <input type="hidden" name="id" value="<%=id %>"/>
      <input type="hidden" name="fromCityId" value="<%=fromCityId %>"/>
      <input type="hidden" name="toCityId" value="<%=toCityId %>"/>
      <label>航班名字</label>
      <input type="text" value="<%=flightNumber %>" name="flightNumber"><br>
      <label>起始地</label>
      <input type="text" value="<%=fromCityName %>" name="fromCityName"><br>
      <label>目的地</label>
      <input type="text" value="<%=toCityName %>" name="toCityName"><br>
      <label>出发时间</label>
      <input type="text" value="<%=departureTime %>" name="departureTime"><br>
      <label>抵达时间</label>
      <input type="text" value="<%=arrivalTime %>" name="arrivalTime"><br>
      <label>机票价格</label>
      <input type="text" value="<%=price %>" name="price"><br>
      <button type="submit">提交</button>
      <a href="flight">取消</a>
    </form>
  </center>
  </body>
</html>
