<%@page import="modelo.inmuebles"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.inmueblesDAO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
          <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    </head>
    
    <body>
          
    <center>
         <div class="container my-10" style="background: #4d80e4">
        <div>
            <form action="/booktripO/controllerInmueble" method="POST">
                <input type="submit" name="accion" value="Listar">
                <input type="submit" name="accion" value="Nuevo">
            </form>
             <form class="form-inline">
               <input type="search" name="txtBuscar" class="form-control">
                <input type="submit" name="accion"  value="Buscar" class="btn-outline-success">
              </form>
        </div>
        <hr>
        <div>
            <table border="1" class=" bg-light table table-bordered table-responsive-xl"  style="width: 500px;">
                <thead>
                    <tr>
                        <th># inmueble</th>
                        <th>Tipo de inmueble</th>
                        <th>Departamento</th>
                        <th>Usuario</th>
                        <th>Estado</th>
                        <th>Nombre</th>
                        <th>Dirección</th> 
                        <th>Capacidad</th> 
                        <th>Descripcion</th>
                        <th>Precio</th>
                        <th>Adjunto</th>


                        <th>ACCIONES</th>
                    </tr>
                </thead>
                <tbody style="height: 40px;">  
                    <c:forEach var="dato" items="${lista}">
                        <tr>
                            <td style="padding-left:25px;">${dato.getIdInmueble()}</td>
                            <td style="padding-left:25px;">${dato.getIdTipo()}</td>
                            <td style="padding-left:25px;">${dato.getIdDepartamento()}</td>
                            <td style="padding-left:25px;">${dato.getIdUsuario()}</td>
                            <td style="padding-left:25px;">${dato.getIdEstado()}</td>
                            <td style="padding-left:25px;">${dato.getNombre()}</td>
                             <td style="padding-left:25px;">${dato.getDireccion()}</td>
                              <td style="padding-left:25px;">${dato.getCapacidad()}</td>
                               <td style="padding-left:25px;">${dato.getDescripcion()}</td>
                                <td style="padding-left:25px;">${dato.getPrecio()}</td>
                                <td style="padding-left:25px;"> <img src="${dato.getAdjunto()}" height="50px" width="50px"/></td>
                   

                            <td style="padding-left:25px;">
                                <form action="/booktripO/controllerInmueble" method="POST">
                                    <input type="hidden" name="id" value="${dato.getIdInmueble()}">
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
</body>
</html>
