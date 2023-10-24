<%--
  Created by IntelliJ IDEA.
  User: jhyoo
  Date: 2023-10-24
  Time: 오후 11:14
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="com.example.jsp_1.Model.MemberDTO" %>
<%@ page import="com.example.jsp_1.Model.MemberDAO" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
  String memberId = request.getParameter("memberId");
  String memberPass = request.getParameter("memberPass");

  String sqlDriver = application.getInitParameter("MySqlDriver");
  String sqlURL = application.getInitParameter("MySqlUrl");
  String sqlId = application.getInitParameter("MySqlUserID");
  String sqlPass = application.getInitParameter("MySqlPW");

  MemberDAO memberDAO = new MemberDAO(sqlDriver, sqlURL, sqlId, sqlPass);
  MemberDTO memberDTO = memberDAO.getMemberDTO(memberId, memberPass);
  memberDAO.DB_close();

  // 로그인 성공여부에 따른 처리
  if (memberDTO.getMemberId() != null) {
    session.setAttribute("memberId", memberDTO.getMemberId());
    session.setAttribute("memberName", memberDTO.getMemberName());
    response.sendRedirect("Login.jsp");
  }
  else {
    request.setAttribute("LoginErrMsg", "로그인 오류");
    request.getRequestDispatcher("Login.jsp").forward(request, response);
  }
%>
