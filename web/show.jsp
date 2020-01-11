<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%@ page import="javax.servlet.http.*,javax.servlet.*" %>
<% response.setContentType("text/html;charset=utf-8"); %>
<%
  request.setCharacterEncoding("utf-8");
  response.setContentType("text/html;charset=utf-8");
  Object data = request.getAttribute("data");

%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>盈利统计</title>
  <!-- 引入 echarts.js -->
  <script src="js/echarts.min.js"></script>
  <script src="http://code.jquery.com/jquery-2.1.4.min.js"></script>
</head>
<body>
<!-- 为ECharts准备一个具备大小（宽高）的Dom -->
<div id="main" style="width: 600px;height:400px;"></div>
<script type="text/javascript">
  var Data = ${data}
  var myChart = echarts.init(document.getElementById('main'));
  // 指定图表的配置项和数据
  var option = {
    title: {
      text: '盈利统计',
      left: 'center'
    },
    tooltip: {
      trigger: 'item',
      formatter: '{a} <br/>{b} : {c} ({d}%)'
    },
    legend: {
      orient: 'vertical',
      left: 'left',
      data: ''
    },
    series: [
      {
        name: '',
        type: 'pie',
        radius: '55%',
        center: ['50%', '60%'],
        data:Data,
        emphasis: {
          itemStyle: {
            shadowBlur: 10,
            shadowOffsetX: 0,
            shadowColor: 'rgba(0, 0, 0, 0.5)'
          }
        }
      }
    ]
  };


  // 使用刚指定的配置项和数据显示图表。
  myChart.setOption(option);


</script>
</body>
</html>