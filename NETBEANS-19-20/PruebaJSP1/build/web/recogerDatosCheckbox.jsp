<%-- 
    Document   : recogerDatosCheckbox
    Created on : Apr 14, 2020, 10:22:49 AM
    Author     : tux
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
  </head>
  <body>
    <h1>Hello World!</h1>
    <%
      out.print(request.getParameter("dato1")+"<br>");
      out.print(request.getParameter("dato2"));
      
    %>
  </body>
</html>
