/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.71
 * Generated at: 2023-04-21 00:20:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.views.member;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.kh.common.AEScryptor;
import com.kh.member.model.vo.Member;

public final class mypage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(1);
    _jspx_dependants.put("/views/member/../common/menubar.jsp", Long.valueOf(1679884391525L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.kh.common.AEScryptor");
    _jspx_imports_classes.add("com.kh.member.model.vo.Member");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>마이페이지</title>\r\n");
      out.write("<style>\r\n");
      out.write("	\r\n");
      out.write("	#mypage-form table{margin:auto;}\r\n");
      out.write("	#mypage-form input{margin:5px;}\r\n");
      out.write("	\r\n");
      out.write("	.modal {color:black;}\r\n");
      out.write("	\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

   String contextPath = request.getContextPath();

   Member loginUser = (Member)session.getAttribute("loginUser");
   // 로그인 전 : null값이 담김
   // 로그인 후 : 로그인한 회원의 Member 객체

   String alertMsg = (String)session.getAttribute("alertMsg");
   // 모든 서비스 요청 전 : null
   //          요청 성공 : alert으로 띄워줄 메세지 문구 ex) 로그인에 성공했습니다. 게시글 등록에 성공했습니다.

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Welcome C Class</title>\r\n");
      out.write("<!-- Latest compiled and minified CSS -->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\">\r\n");
      out.write("<!-- jQuery library -->\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("<!-- Popper JS -->\r\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js\"></script>\r\n");
      out.write("<!-- Latest compiled JavaScript -->\r\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("   #login-form, #user-info {float: right;}\r\n");
      out.write("   #user-info a{\r\n");
      out.write("      text-decoration : none;\r\n");
      out.write("      color : black;\r\n");
      out.write("      font-size : 12px;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   .nav-area{background : black; }\r\n");
      out.write("   \r\n");
      out.write("   .menu {\r\n");
      out.write("      display: table-cell; /* 인라인 요소처럼 배치 가능*/\r\n");
      out.write("      height : 50px;\r\n");
      out.write("      width : 150px;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   .menu a{\r\n");
      out.write("      text-decoration : none;\r\n");
      out.write("      color : white;\r\n");
      out.write("      font-size : 20px;\r\n");
      out.write("      font-weight : bold;\r\n");
      out.write("      width : 100%;\r\n");
      out.write("      height : 100%;\r\n");
      out.write("      \r\n");
      out.write("      line-height : 50px; /* 위 아래에서 가운데로 조정 */\r\n");
      out.write("   } \r\n");
      out.write("   \r\n");
      out.write("   .menu a:hover{\r\n");
      out.write("      background : darkgray;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   .outer{\r\n");
      out.write("      background : black;\r\n");
      out.write("      color : white;\r\n");
      out.write("      width : 1000px;\r\n");
      out.write("      margin : auto;\r\n");
      out.write("      margin-top : 50px;\r\n");
      out.write("   }\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("   <script>\r\n");
      out.write("      const msg = \"");
      out.print( alertMsg );
      out.write("\";\r\n");
      out.write("      \r\n");
      out.write("      if(msg != \"null\") { // \"성공적으로 로그인이 되었습니다\" / \"null\"\r\n");
      out.write("         alert(msg);\r\n");
      out.write("         // 알람창을 띄워준 후 session에 담긴 메세지는 지워줘야함\r\n");
      out.write("         // 안그러면 menubar.jsp가 로딩될때마다 매번 alert함수가 실행됨\r\n");
      out.write("         ");
 session.removeAttribute("alertMsg");
      out.write("\r\n");
      out.write("         \r\n");
      out.write("      }\r\n");
      out.write("   </script>\r\n");
      out.write("   \r\n");
      out.write("   <h1 align=\"center\">Welcome C Class</h1>\r\n");
      out.write("   \r\n");
      out.write("   <div class=\"login-area\">\r\n");
      out.write("      ");
 if(loginUser == null) { 
      out.write("\r\n");
      out.write("      <!-- 로그인 전에 보여지는 로그인 form -->\r\n");
      out.write("      <form id=\"login-form\" action=\"");
      out.print( request.getContextPath() );
      out.write("/login.me\" method=\"post\">\r\n");
      out.write("         <table>\r\n");
      out.write("            <tr>\r\n");
      out.write("               <th>아이디 : </th>\r\n");
      out.write("               <td><input type=\"text\" name=\"userId\" required></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("            <th>비밀번호 : </th>\r\n");
      out.write("            <td><input type=\"password\" name=\"userPwd\" required></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            <tr>\r\n");
      out.write("               <th colspan=\"2\">\r\n");
      out.write("                    <input type=\"checkbox\" id=\"saveId\"><label for=\"saveId\">아이디 저장</label>\r\n");
      out.write("                  <button type=\"button\" onclick=\"submitLogin();\">로그인</button>\r\n");
      out.write("                  <button type=\"button\" onclick=\"enrollPage();\">회원가입</button>\r\n");
      out.write("               </th>\r\n");
      out.write("            </tr>\r\n");
      out.write("         </table>\r\n");
      out.write("      </form>\r\n");
      out.write("      <script>\r\n");
      out.write("         function enrollPage(){\r\n");
      out.write("            // location.href = \"");
      out.print( contextPath);
      out.write("/views/member/memberEnrollForm.jsp\"; 했을때 이동은 가능\r\n");
      out.write("            // 웹에플리케이션의 디렉토리 구조가 url에 노출되면 보안에 취약\r\n");
      out.write("            \r\n");
      out.write("            // 단순한 정적인 페이지 이동요청이라고해도 반드시 servlet을 거쳐갈것 => url에 서블릿 매핑값만 노출되도록 허가\r\n");
      out.write("            location.href = \"");
      out.print( contextPath );
      out.write("/enrollForm.me\";\r\n");
      out.write("         }\r\n");
      out.write("         function submitLogin(){\r\n");
      out.write("            \r\n");
      out.write("            let userId = $(\"#login-form input[name=userId]\").val();\r\n");
      out.write("            \r\n");
      out.write("            if($(\"#saveId\").is(\":checked\") ) {// true 체크된상태\r\n");
      out.write("             document.cookie = \"saveId=\"+userId+\"; path=/; max-age=\"+60*60*24;// 쿠키 최대 유지시간 설정(하루만 유지)        \r\n");
      out.write("            }else{ // 체크하지 않고 로그인시, 저장된 쿠키를 삭제\r\n");
      out.write("               document.cookie = \"saveId=; path=/; max-age=0;\"// 최대시간을 0으로 설정해서 해당쿠키를 제거해주기.\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            \r\n");
      out.write("            $(\"#login-form\").submit();\r\n");
      out.write("            \r\n");
      out.write("         }\r\n");
      out.write("         \r\n");
      out.write("         function getCookie(){\r\n");
      out.write("            let value = \"\";\r\n");
      out.write("            if(document.cookie.length > 0){\r\n");
      out.write("               let index = document.cookie.indexOf(\"saveId=\");\r\n");
      out.write("               if(index != -1){ // saveId라는 키값의 쿠키가 있다면\r\n");
      out.write("                  index += \"saveId=\".length;\r\n");
      out.write("                  let end = document.cookie.indexOf(\";\",index);\r\n");
      out.write("                  \r\n");
      out.write("                  if(end == -1){\r\n");
      out.write("                     value = document.cookie.substring(index);\r\n");
      out.write("                  }else{\r\n");
      out.write("                     value = document.cookie.substring(index,end );\r\n");
      out.write("                  }\r\n");
      out.write("                  $(\"#login-form input[name=userId]\").val(value);\r\n");
      out.write("                  $(\"#saveId\").attr(\"checked\",true);\r\n");
      out.write("               }\r\n");
      out.write("               \r\n");
      out.write("            }\r\n");
      out.write("         }\r\n");
      out.write("         $(function(){\r\n");
      out.write("            getCookie();\r\n");
      out.write("         });\r\n");
      out.write("         \r\n");
      out.write("      </script>\r\n");
      out.write("      \r\n");
      out.write("      ");
 }else { 
      out.write("\r\n");
      out.write("         <!-- 로그인 성공 후 -->\r\n");
      out.write("         <div id=\"user-info\">\r\n");
      out.write("            <b>");
      out.print( loginUser.getUserName());
      out.write("</b>님 환영합니다.<br><br>\r\n");
      out.write("            <div align=\"center\">\r\n");
      out.write("               <a href=\"");
      out.print( contextPath );
      out.write("/myPage.me\">마이페이지</a>\r\n");
      out.write("               <a href=\"");
      out.print( contextPath );
      out.write("/logout.me\">로그아웃</a>\r\n");
      out.write("            </div>\r\n");
      out.write("         </div>\r\n");
      out.write("      ");
 } 
      out.write("\r\n");
      out.write("   </div>\r\n");
      out.write("   \r\n");
      out.write("   <br clear=\"both\"> <!-- float 속성 해제 -->\r\n");
      out.write("   <br>\r\n");
      out.write("   \r\n");
      out.write("   <div class=\"nav-area\" align=\"center\"> \r\n");
      out.write("      <div class=\"menu\"><a href=\"");
      out.print( contextPath );
      out.write("\">HOME</a></div>\r\n");
      out.write("      <div class=\"menu\"><a href=\"");
      out.print( contextPath );
      out.write("/list.no\">공지사항</a></div>\r\n");
      out.write("      <div class=\"menu\"><a href=\"");
      out.print( contextPath );
      out.write("/list.bo?current_page=1\">일반게시판</a></div>\r\n");
      out.write("      <div class=\"menu\"><a href=\"");
      out.print( contextPath );
      out.write("/list.th\">사진게시판</a></div>\r\n");
      out.write("      \r\n");
      out.write("   </div>\r\n");
      out.write("   \r\n");
      out.write("   \r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	");

		String userId = loginUser.getUserId();
		String userName = loginUser.getUserName();
		String phone = loginUser.getPhone();
		String email = loginUser.getEmail();
		email = AEScryptor.decrypt(email);
		String address = loginUser.getAddress();
		String interest = loginUser.getInterest();
	
      out.write("\r\n");
      out.write("	\r\n");
      out.write("	<div class=\"outer\">\r\n");
      out.write("		<br>\r\n");
      out.write("		<h2 align=\"center\">마이페이지</h2>\r\n");
      out.write("		\r\n");
      out.write("		<form id=\"mypage-form\" action=\"");
      out.print( contextPath );
      out.write("/update.me\" method=\"post\">\r\n");
      out.write("			<table>\r\n");
      out.write("                <!-- (tr>td*3)*8 -->\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>* 아이디</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"userId\" maxlength=\"12\" required readonly value=\"");
      out.print( userId );
      out.write("\"></td>\r\n");
      out.write("                    <td></td>\r\n");
      out.write("                </tr>               \r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>* 이름</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"userName\" maxlength=\"6\" required value=\"");
      out.print( userName );
      out.write("\"></td>\r\n");
      out.write("                    <td></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>&nbsp;&nbsp;전화번호</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"phone\" placeholder=\"- 포함해서 입력\" value=\"");
      out.print( phone == null ? "" : phone  );
      out.write("\"><td>\r\n");
      out.write("                    <td></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>&nbsp;&nbsp;이메일</td>\r\n");
      out.write("                    <td><input type=\"email\" name=\"email\" value=\"");
      out.print( email == null ? "" : email );
      out.write("\"></td>\r\n");
      out.write("                    <td></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>&nbsp;&nbsp;주소</td>\r\n");
      out.write("                    <td><input type=\"text\" name=\"address\" value=\"");
      out.print( address == null ? "" : address );
      out.write("\"></td>\r\n");
      out.write("                    <td></td>\r\n");
      out.write("                </tr>\r\n");
      out.write("                <tr>\r\n");
      out.write("                    <td>&nbsp;&nbsp;관심분야</td>\r\n");
      out.write("                    <td colspan=\"2\">\r\n");
      out.write("                        <!-- (input[type=checkbox name=interest id= value=]+label)*6 -->\r\n");
      out.write("\r\n");
      out.write("                        <input type=\"checkbox\" name=\"interest\" id=\"sports\" value=\"운동\" \r\n");
      out.write("                        ");
      out.write("\r\n");
      out.write("                         >\r\n");
      out.write("                        <label for=\"sports\">운동</label>\r\n");
      out.write("\r\n");
      out.write("                        <input type=\"checkbox\" name=\"interest\" id=\"hiking\" value=\"등산\">\r\n");
      out.write("                        <label for=\"hiking\">등산</label>\r\n");
      out.write("\r\n");
      out.write("                        <input type=\"checkbox\" name=\"interest\" id=\"fishing\" value=\"낚시\">\r\n");
      out.write("                        <label for=\"fishing\">낚시</label>\r\n");
      out.write("\r\n");
      out.write("                        <br>\r\n");
      out.write("\r\n");
      out.write("                        <input type=\"checkbox\" name=\"interest\" id=\"cooking\" value=\"요리\">\r\n");
      out.write("                        <label for=\"cooking\">요리</label>\r\n");
      out.write("\r\n");
      out.write("                        <input type=\"checkbox\" name=\"interest\" id=\"game\" value=\"게임\">\r\n");
      out.write("                        <label for=\"game\">게임</label>\r\n");
      out.write("\r\n");
      out.write("                        <input type=\"checkbox\" name=\"interest\" id=\"movie\" value=\"영화\">\r\n");
      out.write("                        <label for=\"movie\">영화</label>\r\n");
      out.write("                    </td>\r\n");
      out.write("                </tr>\r\n");
      out.write("            </table>\r\n");
      out.write("            \r\n");
      out.write("            <script>\r\n");
      out.write("            	$(function(){\r\n");
      out.write("            		let interest = \"");
      out.print( interest == null ? "" : interest );
      out.write("\";\r\n");
      out.write("            		// \"\" / \"운동,등산,게임\"\r\n");
      out.write("            		\r\n");
      out.write("            		$(\"input[name='interest']\").each( function(){\r\n");
      out.write("            			\r\n");
      out.write("            			// 순차적으로 접근한 input 요소의 value값을 가져와서 interest변수 안에 value값이 포함되어있는지 확인\r\n");
      out.write("            			// 포함되어있따면 현재 접근한 input요소의 checked속성을 부여.\r\n");
      out.write("            			if( interest.search($(this).val()) >= 0  ){ // interest문자열로부터 현재 체크박스의 value가 포함되어있는지 확인\r\n");
      out.write("            				$(this).attr(\"checked\",true);\r\n");
      out.write("            			}            			\r\n");
      out.write("            		});\r\n");
      out.write("            	});\r\n");
      out.write("            </script>\r\n");
      out.write("            \r\n");
      out.write("            <br><br>\r\n");
      out.write("            \r\n");
      out.write("            <div align=\"center\">\r\n");
      out.write("            	<button type=\"submit\" class=\"btn btn-secondary btn-sm\">정보변경</button>\r\n");
      out.write("            	<button type=\"button\" class=\"btn btn-warning btn-sm\" data-toggle=\"modal\" data-target=\"#updatePwdForm\">비밀번호 변경</button>\r\n");
      out.write("            	<button type=\"button\" class=\"btn btn-danger btn-sm\" data-toggle=\"modal\" data-target=\"#deleteForm\">회원탈퇴</button>\r\n");
      out.write("            </div>\r\n");
      out.write("		</form>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	<!--  Modal  -->\r\n");
      out.write("	<div class=\"modal\" id=\"deleteForm\">\r\n");
      out.write("		<div class=\"modal-dialog\">\r\n");
      out.write("			<div class=\"modal-content\">\r\n");
      out.write("				\r\n");
      out.write("				<!--  모달 해더 -->\r\n");
      out.write("				<div class=\"modal-header\">\r\n");
      out.write("					<h4 class=\"modal-title\">회원탈퇴</h4>\r\n");
      out.write("					<button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("				<!--  모달 바디 -->\r\n");
      out.write("				<div class=\"modal-body\" align=\"center\">\r\n");
      out.write("				\r\n");
      out.write("				<form action=\"");
      out.print(contextPath );
      out.write("/delete.me\" method=\"post\" >\r\n");
      out.write("					<table>\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td>비밀번호</td>\r\n");
      out.write("							<td><input type=\"password\" name=\"userPwd\" required></td>\r\n");
      out.write("						</tr>\r\n");
      out.write("					</table>\r\n");
      out.write("					<br>\r\n");
      out.write("					<input type=\"hidden\" name=\"userId\" value=\"");
      out.print( loginUser.getUserId() );
      out.write("\">\r\n");
      out.write("					\r\n");
      out.write("					<button type=\"submit\" class=\"btn btn-danger btn-sm\">탈퇴하기</button>\r\n");
      out.write("				</form>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	<div class=\"modal\" id=\"updatePwdForm\">\r\n");
      out.write("		<div class=\"modal-dialog\">\r\n");
      out.write("			<div class=\"modal-content\">\r\n");
      out.write("				\r\n");
      out.write("				<!--  모달 해더 -->\r\n");
      out.write("				<div class=\"modal-header\">\r\n");
      out.write("					<h4 class=\"modal-title\">비밀번호 변경</h4>\r\n");
      out.write("					<button type=\"button\" class=\"close\" data-dismiss=\"modal\">&times;</button>\r\n");
      out.write("				</div>\r\n");
      out.write("				\r\n");
      out.write("				<!--  모달 바디 -->\r\n");
      out.write("				<div class=\"modal-body\" align=\"center\">\r\n");
      out.write("				\r\n");
      out.write("				<form action=\"");
      out.print(contextPath );
      out.write("/updatePwd.me\" method=\"post\" >\r\n");
      out.write("					<table>\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td>현재 비밀번호</td>\r\n");
      out.write("							<td><input type=\"password\" name=\"userPwd\" required></td>\r\n");
      out.write("						</tr>\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td>변경할 비밀번호</td>\r\n");
      out.write("							<td><input type=\"password\" name=\"updatePwd\" required></td>\r\n");
      out.write("						</tr>\r\n");
      out.write("						<tr>\r\n");
      out.write("							<td>변경할 비밀번호 확인</td>\r\n");
      out.write("							<td><input type=\"password\" name=\"checkPwd\" required></td>\r\n");
      out.write("						</tr>\r\n");
      out.write("					</table>\r\n");
      out.write("					<br>					\r\n");
      out.write("					<button type=\"submit\" class=\"btn btn-secondary btn-sm\" onclick=\"return validate(); \">비밀번호 변경</button>\r\n");
      out.write("					\r\n");
      out.write("					<script>\r\n");
      out.write("						function validate(){\r\n");
      out.write("							if($(\"input[name='updatePwd']\").val() != $(\"input[name='checkPwd']\").val()){\r\n");
      out.write("								alert(\"비밀번호가 일치하지 않습니다\");\r\n");
      out.write("								\r\n");
      out.write("								return false;\r\n");
      out.write("							}\r\n");
      out.write("						}\r\n");
      out.write("					</script>\r\n");
      out.write("				</form>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
