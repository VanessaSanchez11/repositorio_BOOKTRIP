    <%@page import="modelo.tipoinmuebles"%>
<%@page import="controlador.tipoinmuebleDAO"%>
<%-- 
    Document   : solicitud
    Created on : 28/08/2020, 10:02:36 AM
    Author     : oscar sanabria
--%>

<%@page import="modelo.solicitudinmuebles"%>
<%@page import="controlador.solicitudinmueblesDAO"%>
<%@page import="modelo.inmuebles"%>
<%@page import="controlador.inmueblesDAO"%>
<%@page import="modelo.estados"%>
<%@page import="controlador.estadosDAO"%>
<%@page import="modelo.usuario"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.usuarioDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="css/estiloSolicitud.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    </head>
<body onload="mueveReloj()" onload="visualizaOculta('<%=request.getParameter("vista")%>');" >
        <% String buscando = request.getParameter("buscando");
            if (buscando == null) {
                buscando = "";
            }
        %>
    <center>


        <!-- Page Heading -->
        <div class="d-sm-flex align-items-center justify-content-between mb-4">
            <h1 class="h3 mb-0 text-gray-800">Dashboard</h1>


        </div>
       

        <div class="principal">
            <div class="fondo py-5 text-white">
                 <div class="row justify-content-md-center">
                <div class="btn-group pb-5">
                    <button type="button" class="btn-light" data-toggle="dropdown"
                            aria-haspopup="true" aria-expanded="false" onClick="visualizaOculta('Registrar')">
                        Registrar
                    </button>
                    <button type="button" class="btn btn-secondary" data-toggle="dropdown"
                            aria-haspopup="true" aria-expanded="false"
                            onClick="visualizaOculta('Actualizar')">
                        Actualizar
                    </button>
                    <button type="button" class="btn btn-success" data-toggle="dropdown"
                            aria-haspopup="true" aria-expanded="false" onClick="visualizaOculta('Listado')">
                        Listar
                    </button>
                    <button type="button" class="btn btn-warning" data-toggle="dropdown"
                            aria-haspopup="true" aria-expanded="false" onClick="Volver()">
                        Volver al Inicio
                    </button>
                </div>
            </div> 
                <div class="container bd-example d-none" id="Registrar">
                    <h5>
                        <strong>Solicitudes de inmuebles</strong>
                    </h5>

                    <form action="/booktripPLaces/registroSolicitudInmueble" method="post" onsubmit="return validarInformacionSolicitud()">


                        <div class="row d-flex h-100">
                            <div class="col-md-6">
                                <input  name="idInmueble" class="form-control d-none my-1" id="txtInmueble">
                                   <%
                                                inmueblesDAO miinmuebleDAO = new inmueblesDAO();
                                                ArrayList<inmuebles> milistainmueble = miinmuebleDAO.ConsultarListadoInmueble("");
                                                out.println("<select class='form-control' id='selectIdInmueble' size= '1' onchange='setIdInmueble()'>");
                                                out.println("<option value=''>" + "--seleccione inmueble--" + "</option>");
                                                for (inmuebles c : milistainmueble) {
                                                    out.println("<option value='" + c.getIdInmueble()+ "'>" + c.getNombre() + "</option>");

                                                }
                                                out.println("</select>");
                                            %> 
                            </div>
                            <div class="col-md-6"> 
                                <input name="idUsuario" class="form-control d-none my-1" id="txtUsuario">
                               <%
                                                usuarioDao miusuarioDAO = new usuarioDao();
                                                ArrayList<usuario> milistausuario = miusuarioDAO.ListadoUsuarios("");
                                                out.println("<select class='form-control' id='selectIdUsuario' size= '1' onchange='setIdUsuario()'>");
                                                out.println("<option value=''>" + "--seleccione usuario--" + "</option>");
                                                for (usuario c : milistausuario) {
                                                    out.println("<option value='" + c.getIdUsuario() + "'>" + c.getNombre() + "</option>");

                                                }
                                                out.println("</select>");
                                            %> 
                            </div>
                        </div>
                        <div class="row d-flex h-100">
                            <div class="col-md-6">
                                <input name="idEstado" class="form-control d-none my-1" id="txtEstado" >
                                 <%
                                                estadosDAO miestadoDAO = new estadosDAO();
                                                ArrayList<estados> milistaestado = miestadoDAO.ConsultarListadoEstado("");
                                                out.println("<select class='form-control' id='selectIdEstado' size= '1' onchange='setIdEstado()'>");
                                                out.println("<option value=''>" + "--seleccione estado--" + "</option>");
                                                for (estados c : milistaestado) {
                                                    out.println("<option value='" + c.getIdEstado() + "'>" + c.getNombre() + "</option>");

                                                }
                                                out.println("</select>");
                                            %> 
                               
                            </div>
                            <div class="col-md-6">
                                <input name="fecha" type="text" id="txtFecha" class="form-control my-1" placeholder="fecha">

                            </div>
                        </div>
                        <div class="row d-flex h-100">
                            <div class="col-md-6">
                                <input type="submit" class="btn btn-primary boton btn-block" value="registrar solicitud" onclick="">
                            </div>
                            <div class="col-md-6">
                                <button class="btn btn-danger btn-block" type="submit">Cancelar</button>
                            </div>
                        </div>

                        <div class="col-12 py-3 d-none">
                            <input id="txtBandera" type="text" name="banderaRegistro" > 

                        </div>

                    </form>
                </div>
                                     <div class="container bd-example d-none" id="Actualizar">
                    <h5>
                        <strong>Solicitudes de inmuebles</strong>
                    </h5>

                    <form action="/booktripPLaces/actulizarSolicitudInmueble" method="post" onsubmit="return validarInformacionSolicitud()">


                        <div class="row d-flex h-100">
                            <div class="col-md-6">
                                <input  name="idInmueble" class="form-control d-none my-1" id="txtInmueble" value="<%=request.getParameter("idInmueble")%>">
                                <%
                                                out.println("<select class='form-control'id ='SelectIdInmueble' size = '1'");
                                                /*out.println("<option onclick='setIdInmueble(\"" + "" "\")'>" + "--Seleccionar--" + "</option>");*/

                                                for (inmuebles c : milistainmueble) {
                                                    out.println("<option value='" + c.getIdInmueble()+ "'>" + c.getNombre() + "</option>");

                                                }
                                                out.println("</select>");
                                            %> 
                            </div>
                            <div class="col-md-6"> 
                                <input name="idUsuario" class="form-control d-none my-1" id="txtUsuario" value="<%=request.getParameter("idUsuario")%>">
                                <%
                                                out.println("<select class='form-control'id ='SelectIdUsuario' size = '1'");
                                                /*out.println("<option onclick='setIdUsuario(\"" + "" "\")'>" + "--Seleccionar--" + "</option>");*/

                                                for (usuario c : milistausuario) {
                                                    out.println("<option value='" + c.getIdUsuario() + "'>" + c.getNombre() + "</option>");

                                                }
                                                out.println("</select>");
                                            %> 
                            </div>
                        </div>
                        <div class="row d-flex h-100">
                            <div class="col-md-6">
                                <input name="idEstado" class="form-control d-none my-1" id="txtEstado" value="<%=request.getParameter("idEstado")%>">
                            <%
                                                out.println("<select class='form-control'id ='SelectIdEstado' size = '1'");
                                                /*out.println("<option onclick='setIdEstado(\"" + "" "\")'>" + "--Seleccionar--" + "</option>");*/

                                                for (estados c : milistaestado) {
                                                    out.println("<option value='" + c.getIdEstado() + "'>" + c.getNombre() + "</option>");

                                                }
                                                out.println("</select>");
                                            %> 
                            </div>
                            <div class="col-md-6">
                                <input name="fecha" type="text" id="txtFecha" class="form-control my-1" placeholder="fecha" value="<%=request.getParameter("fecha")%>">

                            </div>
                        </div>
                        <div class="row d-flex h-100">
                            <div class="col-md-6">
                                <input type="submit" class="btn btn-primary boton btn-block" value="guardar solicitud" onclick="">
                            </div>
                            <div class="col-md-6">
                                <button class="btn btn-danger btn-block" type="submit">Cancelar</button>
                            </div>
                        </div>

                        <div class="col-12 py-3">
                            <input id="txtBandera" type="text" name="banderaRegistro" class="d-none"> 

                        </div>

                    </form>
                </div>  
                                      <div class="container bd-example" id="Listado">
                    <form action="/booktripPLaces/listarSolicitud" method="post">
                        <div class="row justify-content-md-center">
                            <div id="Listado" class="bd-example">

                                <div id="ControlRegistro" class="input-group">
                                    <!--Agregacion de parametro que se esta buscando-->
                                    <input id="txt_Id_Consultado" type="text" class="form-control" name="IdConsultado"
                                        value="<%=buscando%>" autofocus
                                        placeholder="Buscarpor fecha " />
                                    <button type="button" class="btn btn-primary" data-toggle="dropdown"
                                        aria-haspopup="true" aria-expanded="false"
                                        onClick="realizarBusquedaBook()">Buscar</button>
                                </div>
                                <div>
                                    <h1>Listado solicitudes</h1>
                                    <div id="solicitudes"></div>
                                    <%
                                                solicitudinmueblesDAO misolicitudDAO = new solicitudinmueblesDAO();
                                                ArrayList<solicitudinmuebles> milistasolicitud = new ArrayList<solicitudinmuebles>();
                                                milistasolicitud = misolicitudDAO.ConsultarListadoSolicitudInmueble(buscando );

                                                out.println("<table class='table table-dark'><tr><td>inmueble</td>"
                                                        + "<td>Usuario</td> <td>Estado</td><td>fecha</td>"
                                                        + " <td>Editar</td > <td>Eliminar</td> </tr>");
                                                for (solicitudinmuebles C : milistasolicitud) {
                                                    out.println("<tr>");
                                                  
                                                    out.println("<td>" + C.getIdInmueble()+ "</td>");
                                                    out.println("<td>" + C.getIdUsuario()+ "</td>");
                                                    out.println("<td>" + C.getIdEstado()+ "</td>");
                                                    out.println("<td>" + C.getFecha()+ "</td>");
                                                   
                                                    out.println("<td>" + "<input type = 'submit' class='btn-primary form-control btn btn-login' value='Actualizar'name='Actualizar'onclick='SetIdConsulta(" + C.getFecha()+ ")'/>" + "</td>");
                                                    out.println("<td>" + "<input type = 'submit' class='btn btn-danger form-control btn btn-login' value= 'Eliminar'name='Eliminar'onclick='SetIdConsulta(" + C.getFecha()+ ")'/>"
                                                            + "</td>");
                                                    out.println("</tr>");
                                                }
                                                out.println("</table>");
                                            %>
                                </div>
                            </div>
                        </div>
                    </form>
                </div>
            </div>

        </div>


    </center>
                             <script src="js/appUtilitariosSolicitudes.js"></script>
    <script src="js/jquery-1.11.0.min.js"></script>
    <script src="js/gestionarSolicitudes.js"></script>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
</body>
</body>
</html>
