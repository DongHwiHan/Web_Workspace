<%@ page import="java.util.ArrayList, java.util.Date" %>
<!-- 일반적으로 기본속성 외에 개발자가 수정/추가하는 자체 속성들은 따로 빼서 관리함  -->
<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%> <%-- errorPage="error500.jsp" --%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>page 지시어</title>
  </head>
  <body>
    <h1>page 지시어</h1>

    <% 
    // ArrayList 사용 
    // 지시어 부분에 import = "java.util.ArrayList"추가시 에러는 사라짐
    ArrayList<String> list = new ArrayList<>();
    
    list.add("Servlet");
    list.add("jsp");
    
    Date today = new Date();
    
    
    %>
    
    <p>
    	리스트의 길이 : <%= list.size() %> <br>
    	0번 인덱스의 값 : <%= list.get(0) %><br>
    	1번 인덱스의 값 : <%= list.get(1) %><br>
    	현재 날짜는 : <%= today %><br>
    <!-- 없는 값을 출력할 경우 에러 500 발생하며 페이지 자체가 에러 페이지로 바뀌어버림 -->
    </p>
    
    <%= list.get(10) %>
    
    
  </body>
</html>
