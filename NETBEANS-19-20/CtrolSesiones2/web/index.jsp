<%-- 
    Document   : index.jsp
    Created on : Mar 3, 2020, 10:48:19 AM
    Author     : tux
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Control de Login</title>
  </head>
  <body>
    <h1>Control de Login</h1>
    <%
      if (session.getAttribute("usuario") == null)
      {
        %>
        <form action="controlAcceso.jsp" method="post">
          <input type="submit" value="Login">
        </form>
        <%
      } else {
        %>
        <form action="dentro.jsp" method="post">
          <input type="submit" value="Ya está logueado ... acceda">
        </form>
        <%
      }
    %>
  </body>
</html>
