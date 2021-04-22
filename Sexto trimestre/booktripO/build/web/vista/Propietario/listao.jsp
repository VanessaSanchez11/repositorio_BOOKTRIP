


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.estados"%>

<!DOCTYPE html> b
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
    <center>
        <div>
            <form action="/booktripO/Controlador" method="POST">
                <input type="submit" name="accion" value="Listar">
                <input type="submit" name="accion" value="Nuevo">
            </form>
        </div>
        <hr>
        <div>
            <table border="1" style="width: 500px;">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>NOMBRE</th>
                        <th>ACCIONES</th>
                    </tr>
                </thead>
                <tbody style="height: 40px;">
                    <c:forEach var="dato" items="${lista}">
                        <tr>
                            <td style="padding-left:25px;">${dato.getIdEstado()}</td>
                            <td style="padding-left:25px;">${dato.getNombre()}</td>
                            
                            <td style="padding-left:25px;">
                                <form action="/booktripO/Controlador" method="POST">
                                    <input type="hidden" name="id" value="${dato.getIdEstado()}">
                                    <input type="submit" name="accion" value="Editar">
                                    <input type="submit" name="accion" value="Delete">
                                </form>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

        </div>
    </center>
    
</body>
</html>
