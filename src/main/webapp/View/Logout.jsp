<%--
  Created by IntelliJ IDEA.
  User: jhyoo
  Date: 2023-10-24
  Time: 오후 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
  session.removeAttribute("memberId");
  session.removeAttribute("memberName");

  //로그아웃 이후 이동할 페이지
  response.sendRedirect("Main.jsp");
%>
