
<%@page import="modelo.usuario"%>
<%@page import="controlador.usuarioDao"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="controlador.Conexion"%>


<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html> 

    <body onload="myFunction();">
        <div class="principal" id="Listado">
            <center>

                <div class="container my-10" >
                    <div class="col-md-6">
                        <a href="#" name="accion" value="Listar" class="d-none d-sm-inline-block btn  btn-primary shadow-sm m-2"onclick="myFunctionB1()"> Listar</a>
                        
                    </div>
                    <hr>
                    <div>
                        <h1>lista de usuarios</h1>
                        <table border="1" class=" bg-light table table-bordered "  style="width: 500px;" >
                            <thead>
                                <tr>
                                    <th>TD</th>
                                    <th># documento</th>
                                    <th>Nombres</th>
                                    <th>Apellidos</th>
                                    <th>Direccion</th>
                                    <th>Telefono</th>
                                    <th>FechaNacimiento</th>
                                    <th>Email</th>
                                    
                                    
                                </tr>
                            </thead>
                            <%
                                usuarioDao dao = new usuarioDao();
                                List<usuario> lista = dao.listar();
                                request.setAttribute("lista", lista);%>
                            <tbody style="height:30px;">
                                <c:forEach var="dato" items="${lista}">
                                    <tr>

                                        <td style="padding-left:25px;">${dato.getIdTipoDocumento()}</td>
                                        <td style="padding-left:25px;">${dato.getNumDocu()}</td>
                                        <td style="padding-left:25px;">${dato.getNombre()}</td>
                                        <td style="padding-left:25px;">${dato.getApellido()}</td>
                                        <td style="padding-left:25px;">${dato.getDireccion()}</td>
                                        <td style="padding-left:25px;">${dato.getTelefono()}</td>
                                        <td style="padding-left:25px;">${dato.getFechaNacimiento()}</td>
                                        <td style="padding-left:25px;">${dato.getEmail()}</td>
                                        

                                        <td style="padding-left:25px;">
                                            <form action="/booktripO/controllerUsuario" method="POST">
                                                <input type="hidden" name="id" value="${dato.getIdUsuario()}">
                                                <input type="submit" name="accion" value="Editar" class=" btn btn-success mr-3 ">
                                                <input type="submit" name="accion" value="Delete" class="btn btn-danger ">
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
               

</body>

