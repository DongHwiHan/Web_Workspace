<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%
	String pizza = (String) request.getAttribute("pizza");
String[] foods = (String[]) request.getAttribute("foods");
String[] foods1 = (String[]) request.getAttribute("foods1");
int price = (int) request.getAttribute("price");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>피자 결제 페이지</title>
<style>
span {
	font-weight: bold;
}
</style>
</head>
<body>

	<h2>주문 내역</h2>
	<span> 피자는 <span style='color: red;'><%=pizza%></span> 토핑은 <span
		style='color: green;'> <%
 	if (foods == null) {
 %> 없고 <%
 	} else {
 %> <%=String.join(",", foods)%> <%
 	}
 %>
	</span>, 사이드는 <span style='color: blue;'> <%
 	if (foods1 == null) {
 %> 없고 <%
 	} else {
 %> <%=String.join(",", foods1)%> <%
 	}
 %>
	</span> 주문하셨습니다.

		<h3>
			총합 :
			<%=price%>원
		</h3>

		<h2 style='color: pink;'>즐거운 식사 되세요 ~</h2>

	</span>
</body>
</html>