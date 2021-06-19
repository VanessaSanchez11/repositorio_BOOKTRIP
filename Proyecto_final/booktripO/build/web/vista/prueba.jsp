<%
 String usu = (String) session.getAttribute("sesion_usu");
    out.println(usu);
%>
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
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>


