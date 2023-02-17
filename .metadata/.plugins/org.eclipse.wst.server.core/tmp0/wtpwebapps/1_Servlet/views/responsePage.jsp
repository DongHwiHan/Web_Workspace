<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!-- 이안에 @가 붙으면 지시어를 의미한다 -->
<%
	/* 이 구문을 스크립틀릿이라고 부르며 html 문서내에 자바코드를 쓸 수 있는 영역
		현재 이 jsp에서 필요로 하는 데이터들 => request의 attribute영역에 담겨있음
		request.getAttribute("key") : Object(그에 해당하는 밸류값의 자료형으로 형변환 해줘야 함)
	*/
	String name = (String) request.getAttribute("name");
	int age = (int) request.getAttribute("age");
	String gender = (String) request.getAttribute("gender");
	String city = (String) request.getAttribute("city");
	double height = (double) request.getAttribute("height");
	String[] foods = (String[]) request.getAttribute("foods");

%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style >

	h2{color :red;}
	span { font-weight:bold;}
	#name{color:orange;}
	#age{color: yellow;}
	#city{color: green;}
	#height{color:blue;}
	#gender{color: pink;}
	
	li {color: purple;}
	
</style>

</head>
<body>
	<h2>개인정보 응답 화면</h2>
	
	<!-- 변수를 사용할때는 '%=' 를 사용함-->
	<span id="name"><%= name %></span> 님은
	<span id="age"><%= age %></span> 살이며
	<span id="city"><%= city %></span> 에살고
	<span id="height"><%= height %></span> cm입니다
	
	
	성별은
	<% if(gender == null){ %>
		선택을 하지 않았음			
	<% } else {	%>
		<% if(gender.equals("M")){ %>
		
			<span id="gender">남자입니다</span> <br>
		
		<% } else {	%>
		
			<span id="gender">여자입니다</span> <br>
		
		<% } %>
	
	<% } %>
	
	좋아하는 음식은
	
	<% if(foods == null) { %>
		없습니다
	<% } else {	%>
		
		<ul>
			<% for(String str : foods){ %>
				
				<li><%= str %></li>
			
			<% } %>
		
		</ul>
		
	<% } %>
	
	


</body>
</html>