<%@page import="modelo.municipios"%>
<%@page import="controlador.municipiosDAO"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="controlador.Conexion"%>
<%
    /* Evitamos que la página se guarde en el caché del navegador y en los proxys */
    response.setHeader("Cache-Control", "no-store"); //HTTP 1.1
    response.setHeader("Pragma", "no-cache"); //HTTP 1.0
    response.setDateHeader("Expires", 0); // prevents caching at the proxy server
%>


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>



<body onload="myFunction();">

<center> <div class="col-md-6">
        <form action="/booktripO/controllerMunicipio" method="POST"  onsubmit="return validarMunicipio()">

            <a href="#" name="accion" value="Listar" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"onclick="myFunctionB1()"> Listar</a>
            <a href="#" name="accion" value="Nuevo" class="d-none d-sm-inline-block btn btn-sm btn-success shadow-sm" onclick="myFunctionB2()"> Nuevo</a>
        </form>

    </div>

    <div class="principal" id="Listado">

        <div class="fondo container my-10 buscar">


            <hr>
            <center>
                <div>
                    <h1>lista de municipios</h1>

                    <table class="bg-light table table-bordered dataTables-example">
                        <thead>
                            <tr>
                                <th>DEPARTAMENTO</th>
                                <th>MUNICIPIO</th>
                                <th>NOMBRE</th>

                            </tr>
                        </thead>
                        <%
                            municipiosDAO dao = new municipiosDAO();
                            List<municipios> lista = dao.listar();
                            request.setAttribute("lista", lista);%>
                        <tbody style="height: 10px;">
                            <c:forEach var="dato" items="${lista}">
                                <tr>
                                    <td style="padding-left:25px;">${dato.getIdDepartamento()}</td>
                                    <td style="padding-left:25px;">${dato.getIdMunicipio()}</td>
                                    <td style="padding-left:25px;">${dato.getNombre()}</td>

                                    <td style="padding-left:25px;">
                                        <form action="/booktripO/controllerMunicipio" method="POST">
                                            <input type="text" name="id" value="${dato.getIdMunicipio()}">
                                            <input type="submit" name="accion" value="Editar" class="btn-success btn-block" >
                                            <input type="submit" name="accion" value="Delete" class="btn-danger btn-block" onclick="return confirm('Está seguro que deseas eliminar este Municipio?');">
                                        </form>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>

                </div>
            </center>
        </div>
    </div>


    <div class="principal" id="Registrar">
        <div class="container principal">

            <div class="container  col-md-6 mt-5 bg-light form-group">
                <h3>Agregar nuevo Municipio </h3>
                <hr>
                <br>


                <form id="formularioEstado" action="/booktripO/controllerMunicipio"
                      method="POST" onsubmit="return validarMunicipio()">
                    <div col-md-6>
                        <div col-md-3><label>Nombre</label></div>
                        <div col-md-3><input type="text" name="txtNom" id="txtNom">
                        </div>
                    </div>
                    <div col-md-6>
                        <div col-md-3><input type="submit" name="accion" value="Guardar"
                                             class=" btn btn-success btn-block mt-1" >
                        </div>
                        <div col-md-3> <input type="submit" name="accion" value="Regresar" class="btn btn-danger btn-block mt-1 my-4"></div>
                    </div>
                </form>

            </div>
        </div>
    </div>


</html>
