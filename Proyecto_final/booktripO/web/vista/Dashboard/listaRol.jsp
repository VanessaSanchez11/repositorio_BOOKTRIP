
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="controlador.Conexion"%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.rol"%>
<%@page import="controlador.rolDAO"%>

<!DOCTYPE html> 

    <body onload="myFunction();">
        <div class="principal" id="Listado">
            <center>

                <div class="container my-10" >
                    <div class="col-md-6">
                        <a href="#" name="accion" value="Listar" class="d-none d-sm-inline-block btn  btn-primary shadow-sm m-2"onclick="myFunctionB1()"> Listar</a>
                        <a href="#" name="accion" value="Nuevo" class="d-none d-sm-inline-block btn btn-success shadow-sm" onclick="myFunctionB2()"> Nuevo</a>
                    </div>
                    <hr>
                    <div>
                        <h1>lista de roles</h1>
                        <table border="1" class=" bg-light table table-bordered "  style="width: 500px;" >
                            <thead>
                                <tr>
                                    <th>ID</th>
                                    <th>NOMBRE</th>
                                    <th>ACCIONES</th>
                                </tr>
                            </thead>
                            <%
                                rolDAO dao = new rolDAO();
                                List<rol> lista = dao.listar();
                                request.setAttribute("lista", lista);%>
                            <tbody style="height:30px;">
                                <c:forEach var="dato" items="${lista}">
                                    <tr>

                                        <td style="padding-left:25px;">${dato.getIdRol()}</td>
                                        <td style="padding-left:25px;">${dato.getNombre()}</td>

                                        <td style="padding-left:25px;">
                                <form action="/booktripO/controllerRoles" method="POST">
                                    <input type="hidden" name="id" value="${dato.getIdRol()}">
                  <input type="submit" name="accion" value="Editar" class="btn-success btn-block" >
                                    <input type="submit" name="accion" value="Delete" class="btn-danger btn-block" onclick="return confirm('Está seguro que deseas eliminar el registro?');">
                                </form>
                            </td>
                                    </tr>
                                </c:forEach>
                            </tbody>
                        </table>

                    </div>
                </div>

            </center>
        </div>
    <center>
        <div class="principal" id="Registrar">
            <div class="container" >

                <div class="container  col-md-6 mt-5 bg-light">
                    <h3>Agregar nuevo rol</h3>
                    <hr>
                    <br>
                    <form action="/booktripO/controllerRoles" class="formu" method="POST" onsubmit="return validarRol()">

                        <div col-md-6 class="form-group">
                            <label>Nombre:</label>
                            <input type="text" name="nombreRol" id="nombreRol" class="form-control"> 
                        </div>
                        <input type="submit" name="accion" value="Guardar" class="btn btn-success mr-3 ">
                        <input type="submit" name="accion" value="Regresar" class="btn btn-primary ">    
                    </form>

                </div>
            </div>
        </div>
    </center>    
    <center>
        <div class="principal" id="Actualizar">
            <div class="container" >

                <div class="container  col-md-6 mt-5 bg-light">
                    <h3>Actualizar rol</h3>
                    <hr>
                    <br>
                    <form action="/booktripO/controllerRoles" class="formu" method="POST" onsubmit="return validarRol()">

                        <div col-md-6 class="form-group">
                            <label>Nombress:</label>
                           <input type="text" name="txtNom" value="${dato.getNombre()}">
                           <input type="hidden" name="id" value="${dato.getIdRol()}">
                        </div>
                        <input type="submit" name="accion" value="Guardar" class="btn btn-success mr-3 ">
                        <input type="submit" name="accion" value="Regresar" class="btn btn-primary ">    
                    </form>

                </div>
            </div>
        </div>
    </center>   

</body>

