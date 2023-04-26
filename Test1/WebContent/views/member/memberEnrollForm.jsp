<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 폼</title>
<style>
#enroll-form table {
	margin: auto;
}

#enroll-form input {
	margin: 5px;
}
</style>
</head>
<body>
	<%
		String contextPath = request.getContextPath();
	%>
	<!--  ../ : 현재 위치로부터 한번 빠져나감(상위 디렉토리로 이동) -->
	<div class="outer">
		<br>
		<h2 align="center">회원가입</h2>
		<form id="enroll-form" action="<%=contextPath%>/insert.me"
			method="post">
			<table>
				<tr>
					<td>'*' 표시 항목은 필수 입력 항목입니다.</td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="userName" maxlength="6" required>*</td>
					<td></td>
				</tr>
				<tr>
					<td>아이디</td>
					<td><input type="text" name="userId" maxlength="12" required>*</td>
					<td><button type="button" onclick="idCheck();">중복체크</button></td>
				</tr>
				<tr>
					<td>암호</td>
					<td><input type="password" name="userPwd" id="pwd1"
						maxlength="15" required>*</td>
					<td></td>
				</tr>
				<tr>
					<td>암호 확인</td>
					<td><input type="password" maxlength="15" id="pwd2"
						onchange="pwdCheck()" required>*</td>
					<td></td>
				</tr>
				<tr>
					<td>이메일</td>
					<td><input type="email" name="email"></td>
					<td></td>
				</tr>
				<tr>
					<td>전화번호</td>
					<td><input type="text" name="phone" placeholder="- 포함해서 입력">
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
				<button type="submit" disabled>회원가입</button>
				<button type="reset">취소</button>
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
            url : "<%=contextPath%>
		/idCheck.me",
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

		function pwdCheck() {
			var p1 = document.getElementById('pwd1').value;
			var p2 = document.getElementById('pwd2').value;
			if (p1 != p2) {
				alert("비밀번호가 일치 하지 않습니다");
				return false;
			} else {
				alert("비밀번호가 일치합니다");
				return true;
			}
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