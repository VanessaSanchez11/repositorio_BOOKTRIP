<%  
int uno=1;
    int autorizado= (Integer)session.getAttribute("autorizado");
    if(autorizado!=1)
    {
        out.println("<script type=\"text/javascript\">");
                    out.println("window.location.href='/booktripO/vista/salir.jsp';");
                    out.println("</script>");
    }
    %>
<%@include file="header.jsp" %>
<%@include file="sidebar.jsp" %>
<%@include file="content.jsp" %>
<%@include file="realContent.jsp" %>
<%@include file="footer.jsp" %>}
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello administrador</h1>
    </body>
</html>
