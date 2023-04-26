<%@page import="com.kh.member.model.vo.Member"%>
<%@ page import="com.kh.common.AEScryptor"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
<style>
#mypage-form table {
	margin: auto;
}

#mypage-form input {
	margin: 5px;
}

.modal {
	color: black;
}
</style>
</head>
<body>

	<%
	
	String contextPath = request.getContextPath();
	Member loginUser = (Member) session.getAttribute("loginUser");

	String userId = loginUser.getUserId();
	String userName = loginUser.getUserName();
	String phone = loginUser.getPhone();
	String email = loginUser.getEmail();
	String address = loginUser.getAddress();
	String interest = loginUser.getInterest();
	%>

	<div class="outer">
		<br>
		<h2 align="center">회원 수정</h2>

		<form id="mypage-form" action="<%=contextPath%>/update.me"
			method="post">

			<table align="center">
				<tr>
					<td>이름</td>
					<td><input type="text" name="userName" maxlength="6" required
						value="<%=userName%>"></td>
					<td></td>
				</tr>
				<tr>
					<td>아이디</td>
					<td><input type="text" name="userId" maxlength="12" required
						readonly value="<%=userId%>"></td>
					<td><button type="button" onclick="idCheck();">중복체크</button></td>
				</tr>
				<tr>
					<td>암호</td>
					<td><input type="password" name="userPwd" maxlength="15"
						required>*</td>
					<td></td>
				</tr>
				<tr>
					<td>암호 확인</td>
					<td><input type="password" maxlength="15" required>*</td>
					<td></td>
				</tr>

				<tr>
					<td>이메일</td>
					<td><input type="email" name="email"></td>
					<td></td>
				</tr>
				<tr>
					<td>전화번호</td>
					<td><input type="text" name="phone" placeholder="- 포함해서 입력"
						value="<%=phone == null ? "" : phone%>">
					<td>
					<td></td>
				</tr>
				<tr>
					<td>등급</td>
					<td colspan="2"><input type="checkbox" name="grade"
						id="member" value="회원"> <label for="member">회원</label> <input
						type="checkbox" name="grade" id="manager" value="관리자"> <label
						for="manager">관리자</label></td>
				</tr>

			</table>

			<br>
			<br>
			<div align="center">
				<button type="submit" class="btn btn-secondary btn-sm">확인</button>
				<button type="reset" class="btn btn-secondary btn-sm">취소</button>
				<button type="button" class="btn btn-secondary btn-sm" onclick="hrefLink();">뒤로가기</button>				
			</div>
			<br>
			<br>
		</form>



	</div>

	<script>
      function idCheck(){
         const $userId = $("#enroll-form [name=userId]");
         
         $()
         $.ajax({
            url : "<%=contextPath%>/idCheck.me",
				data : {
					userId : $userId.val()
				},
				success : function(result) {
					if (result == 'NNNNN') {
						alert("이미 존재하거나 회원탈퇴한 아이디입니다");
						$userId.focus();
					} else {
						if (confirm("사용가능한 아이디입니다. 사용하시겠습니까?")) {
							$userId.attr("readonly", true);
							$("#enroll-form :submit").removeAttr("disabled");
						} else { 
							$userId.val("");
							$userId.focus();
						}
					}
				},
				error : function() {
					console.log("아이디 중복체크 실패");
				}
			});

		}
    </script>
    <script type="text/javascript">
    
    link = "<%=contextPath%>";
    
    function hrefLink(){
	  	location.href = link;
	}

    </script>
      



</body>
</html>