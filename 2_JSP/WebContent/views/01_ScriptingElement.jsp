<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <title>Insert title here</title>
  </head>
  <body>
    <!-- HTML용 주석 : 개발자 도구에 노출됨   -->
    <%-- JSP용 주석 : 개발자 도구에 노출이 안됨 <% %>이 명령어를 다른 주석줄에
    쓰면 주석처리가 되지 않고 코드로서 동작해버림 --%>

    <h1>스크립팅 원소</h1>

    <% 
    // 스크립틀릿 : 이 안에 일반적인 자바 코드 작성(변수 선언, 초기화,제어문) 
    
    int sum = 0;
    
   	for(int i = 0; i<100; i++){
   		sum+=i;
   	}
   	System.out.println("결과 : "+sum);

    %>
    
    <p>
    	화면으로 출력하고자 한다면 <br>
		스크립틀릿을 이용해서 출력 가능 : <% out.println(sum); %> <br>
		표현식(출력식)으로 출력 가능 : <%= sum %>    	
    	위 두가지는 완벽하게 동일하게 작동한다 - 아랫줄에서 out.println()이 보이지 않아도 실행될때 이걸로 실행됨
    </p>
    
    
    <% 
    // 배열 사용
    String[] name = {"ddd", "aaa","cccc","gggg"};
    %>
    
    <h5>배열의 길이 : <%=name.length %></h5>
    <%= name %>
    <%= String.join(", ", name) %>
    
    <h4>반복문을 통해 html 요소를 반복적으로 화면에 출력</h4>
    
    <ul>
    	<% for(int i = 0; i<name.length; i++){	%>
   			
    		<li><%= name[i] %></li>
   		
    	<% } %>
    
    </ul>
   
  </body>
</html>
