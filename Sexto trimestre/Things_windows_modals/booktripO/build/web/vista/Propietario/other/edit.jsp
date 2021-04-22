
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <center>
        <h3>Actualizar estado</h3>
        <hr>
        <br>
        <form action="/booktripO/Controlador" method="POST">
            <label>Nombres:</label>
            <input type="text" name="txtNom" value="${dato.getNombre()}">
           
            <input type="hidden" name="id" value="${dato.getIdEstado()}">
            
            <input type="submit" name="accion" value="Actualizar">
            <input type="submit" name="accion" value="Regresar">
        </form>
    </center>
    </body>
</html>
