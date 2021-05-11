
<%@page import="modelo.inmuebles"%>
<%@page import="controlador.inmueblesDAO"%>
<%@page import="modelo.usuario"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.usuarioDao"%>
<%@page import="modelo.pagos"%>
<%@page import="controlador.pagosDAO"%>
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

<%@page import="controlador.estadosDAO"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.estados"%>


<body onload="myFunction();">

<center> <div class="col-md-6">
        <form action="/booktripO/controllerPago" method="POST"  onsubmit="return validarEstado()">

            <a href="#" name="accion" value="Listar" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"onclick="myFunctionB1()"> Listar</a>
            <a href="#" name="accion" value="Nuevo" class="d-none d-sm-inline-block btn btn-sm btn-success shadow-sm" onclick="myFunctionB2()"> Nuevo</a>
        </form>

    </div>

    <div class="principal" id="Listado">

        <div class="fondo container my-10 buscar">


            <hr>
            <center>
                <div>
                    <h1>lista de pago</h1>

                    <table class="bg-light table table-bordered dataTables-example">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>idUsuario</th>
                                <th>id inmueble</th>
                                <th>adjunto</th>
                                <th>monto</th>
                                <th>fecha</th>
                                <th>fecha2</th>
                                <th>ACCIONES</th>
                            </tr>
                        </thead>
                        <%
                            pagosDAO dao = new pagosDAO();
                            List<pagos> lista = dao.listar();
                            request.setAttribute("lista", lista);%>
                        <tbody style="height: 10px;">
                            <c:forEach var="dato" items="${lista}">
                                <tr>
                                    <td style="padding-left:25px;">${dato.getIdPago()}</td>
                                    <td style="padding-left:25px;">${dato.getIdUsuario()}</td>
                                    <td style="padding-left:25px;">${dato.getIdInmueble()}</td>
                                    <td style="padding-left:25px;">${dato.getAdjunto()}</td>
                                    <td style="padding-left:25px;">${dato.getMonto()}</td>
                                    <td style="padding-left:25px;">${dato.getFechaPago()}</td>
                                    <td style="padding-left:25px;">${dato.getFechaPago2()}</td>
                                    <td style="padding-left:25px;">
                                        <form action="/booktripO/controllerPago" method="POST">
                                            <input type="hidden" name="id" value="${dato.getIdPago()}">
                                            <input type="submit" name="accion" value="Editar" class="btn-success btn-block" >
                                            <input type="submit" name="accion" value="Delete" class="btn-danger btn-block" onclick="return confirm('Está seguro que deseas eliminar el registro?');">
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
                <h3>Agregar nuevo estado</h3>
                <hr>
                <br>


                <form action="/booktripO/controllerPago" method="POST">
                    <label>id usuario</label>

                    <div class="col-sm-6">

                        <%
                            usuarioDao miusuarioDAO = new usuarioDao();
                            ArrayList<usuario> listausuario = miusuarioDAO.ListadoUsuarios("");
                        %> 
                        <select name="txtUsuario">
                            <%
                                for (usuario i : listausuario) {%>
                            <option value="<%=i.getIdUsuario()%>"><%=i.getNombre()%> </option>
                            <%
                                }
                            %>
                        </select>

                    </div>
                    <label>id inmueble</label>


                    <div class="col-sm-6">

                        <%
                            inmueblesDAO miinmuebleDAO = new inmueblesDAO();
                            ArrayList<inmuebles> listainmueble = miinmuebleDAO.ConsultarListadoInmueble("");
                        %> 
                        <select name="txtInmueble">
                            <%
                                for (inmuebles i : listainmueble) {%>
                            <option value="<%=i.getIdInmueble()%>"><%=i.getNombre()%> </option>
                            <%
                                }
                            %>
                        </select>

                    </div>
                    <div col-md-6>
                        <div col-md-3><label>Adjunto</label></div>
                        <div col-md-3><input type="text" name="txtAdjunto">
                        </div>
                    </div>
                    <div col-md-6>
                        <div col-md-3><label>Monto</label></div>
                        <div col-md-3><input type="text" name="txtMonto">
                        </div>
                    </div>
                    <div col-md-6>
                        <div col-md-3><label>fecha</label></div>
                        <div col-md-3><input type="text" name="txtFechaPago">
                        </div>
                    </div>
                    <div col-md-6>
                        <div col-md-3><label>fecha2</label></div>
                        <div col-md-3><input type="text" name="txtFechaPago2" >
                        </div>
                    </div>
                    <div col-md-6>
                        <div col-md-3><input type="submit" name="accion" value="Guardar" class="btn btn-success btn-block mt-1"></div>
                        <div col-md-3> <input type="submit" name="accion" value="Regresar" class="btn btn-danger btn-block mt-1 my-4"></div>
                    </div>    

            </div>      
        </div> 


        </form>

    </div>
</div>
</div>



