


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.estados"%>

<!DOCTYPE html> 
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <!-- CSS only -->
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    </head>
    <body>
    <center>
        <div class="container my-10" style="background: #4d80e4">
        <div class="col-md-6">
            <form action="/booktripO/controllerTipoDocumento" method="POST"  onsubmit="return validarEstado()">
                <input type="submit" name="accion" value="Listar" class="btn-primary">
                <input type="submit" name="accion" value="Nuevo" class="btn-success">
            </form>
           
        </div>
        <hr>
        <div>
        <h1>lista de tipo de documentos</h1>
            <table border="1" class=" bg-light table table-bordered "  style="width: 500px;" >
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>NOMBRE</th>
                        <th>ACCIONES</th>
                    </tr>
                </thead>
                <tbody style="height:30px;">
                    <c:forEach var="dato" items="${lista}">
                        <tr>
                
                            <td style="padding-left:25px;">${dato.getIdTipoDocumento()}</td>
                            <td style="padding-left:25px;">${dato.getNombre()}</td>
                            
                            <td style="padding-left:25px;">
                                <form action="/booktripO/controllerTipoDocumento" method="POST">
                                    <input type="hidden" name="id" value="${dato.getIdTipoDocumento()}">
                                    <input type="submit" name="accion" value="Editar" class="btn-primary btn-block">
                                    <input type="submit" name="accion" value="Delete" class="btn-danger btn-block">
                                </form>
                            </td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>

        </div>
    </div>
        </center>
    <script src="../js/jquery-1.11.0.min.js"></script>
    <script src="../js/validaciones.js"</script>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
   
</body>
</html>
