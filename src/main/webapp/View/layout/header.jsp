<%--
  Created by IntelliJ IDEA.
  User: jhyoo
  Date: 2023-10-24
  Time: 오후 7:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<header>
    <div class="container">
        <h1>JSP Blog Project</h1>
    </div>
    <table>
        <tr>
            <td>
                <%
                    if (session.getAttribute("memberId") == null) {
                %>
                    <a href="../View/Login.jsp">로그인</a>
                <%
                    }
                    else {
                %>
                    <a href="../View/Logout.jsp">로그아웃</a>
                <%
                    }
                %>
                <a href="List.jsp">게시판</a>
            </td>
        </tr>
    </table>
</header>
