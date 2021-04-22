<%-- 
    Document   : formulario
    Created on : 4/02/2021, 10:19:44 AM
    Author     : oscar sanabria
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>reportes</h1>
        <form action="reportEstado.jsp" method="POST">
            <label>codigo</label>
           
            <input type="text" name="codigo" value="0">
            
        <input type="submit" value="Generar reporte">
        </form>
    </body>
</html>
