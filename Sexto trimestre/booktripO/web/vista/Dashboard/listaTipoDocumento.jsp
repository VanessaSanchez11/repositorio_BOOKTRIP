<%@page import="modelo.tipoDocumentos"%>
<%@page import="controlador.tipoDocumentosDAO"%>
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
                        <a href="#" name="accion" value="Nuevo" class="d-none d-sm-inline-block btn btn-success shadow-sm" onclick="myFunctionB2()"> Nuevo</a>
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
                            <%
                                tipoDocumentosDAO dao = new tipoDocumentosDAO();
                                List<tipoDocumentos> lista = dao.listar();
                                request.setAttribute("lista", lista);%>
                            <tbody style="height:30px;">
                                <c:forEach var="dato" items="${lista}">
                                    <tr>

                                        <td style="padding-left:25px;">${dato.getIdTipoDocumento()}</td>
                                        <td style="padding-left:25px;">${dato.getNombre()}</td>

                                        <td style="padding-left:25px;">
                                            <form action="/booktripO/controllerTipoDocumento" method="POST">
                                                <input type="hidden" name="id" value="${dato.getIdTipoDocumento()}">
                                                <input type="submit" name="accion" value="Editar" class=" btn btn-warning mr-3 ">
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
    <center>
        <div class="principal" id="Registrar">
            <div class="container" >

                <div class="container  col-md-6 mt-5 bg-light">
                    <h3>Agregar nuevo tipo de documento</h3>
                    <hr>
                    <br>
                    <form action="/booktripO/controllerTipoDocumento" class="formu" method="POST" onsubmit="return validarRol()">

                        <div col-md-6 class="form-group">
                            <label>Nombre:</label>
                            <input type="text" name="nombreTipoDocumento" id="nombreTipoDocumento" class="form-control"> 
                        </div>
                        <input type="submit" name="accion" value="Guardar" class="btn btn-success mr-3 ">
                        <input type="submit" name="accion" value="Regresar" class="btn btn-primary ">    
                    </form>

                </div>
            </div>
        </div>
    </center>            

</body>

