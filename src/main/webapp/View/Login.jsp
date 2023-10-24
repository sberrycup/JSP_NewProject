<%--
  Created by IntelliJ IDEA.
  User: jhyoo
  Date: 2023-10-24
  Time: 오후 10:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
<%= request.getAttribute("LoginErrMsg") == null ? "" : request.getAttribute("LoginErrMsg") %>
<%
  if (session.getAttribute("memberId") == null) {
%>
<script>
  function validateForm(form) {
    if (!form.member_id.value) {
      alert("아이디를 입력해주세요");
      return false;
    }
    if (!form.member_pass.value) {
        alert("비밀번호를 입력해주세요");
        return false;
    }
  }
</script>
<form action="LoginProcess.jsp" method="post" name="loginForm" onsubmit="return validateForm(this);">
    아이디 : <input type="text" name="memberId" /><br/>
    비밀번호 : <input type="password" name="memberPass" /><br/>
    <input type="submit" value="로그인" />
</form>
<%
    }
  else {
%>
    <%= session.getAttribute("memberName") %> 회원님, 환영합니다. <br/>
    <a href="Logout.jsp">로그아웃</a>
<%
    }
%>
</body>
</html>