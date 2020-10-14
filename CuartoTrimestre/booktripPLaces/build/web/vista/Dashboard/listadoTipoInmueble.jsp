<%-- 
    Document   : tipoInmueble
    Created on : 28/08/2020, 10:02:52 AM
    Author     : oscar sanabria
--%>

<%@page import="modelo.tipoinmuebles"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.tipoinmuebleDAO"%>
<%@page import="controlador.estadosDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="css/estiloTipoInmueble.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    </head>
    <body onload="mueveReloj()" onload="visualizaOculta('<%=request.getParameter("Vista")%>');" >
        <% String buscando = request.getParameter("buscando");
            if (buscando == null) {
                buscando = "";
            }
        %>
        <div>

            <div class="container col-12">

                <div class="principal">

                    <div class="fondo py-5 text-white">
                        <div class="btn-group py-5 ">
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
                                Consultar
                            </button>
                            <button type="button" class="btn btn-warning" data-toggle="dropdown"
                                    aria-haspopup="true" aria-expanded="false" onClick="Volver()">
                                Volver al Inicio
                            </button>
                        </div>
                        <div class="container bd-example d-none" id="Registrar">

                            <h5>
                                <strong>Tipos de inmueble</strong>
                            </h5>

                            <form action="/booktripPLaces/registroTipoInmueble" method="post" onsubmit="return validarInformacionTipoInmueble()">


                                <div class="row d-flex h-100">
                                    <div class="col-md-12 my-1">
                                        <input type="text" name="nombre" id="txtNombreTipo" class="form-control" placeholder="nombre del tipo de inmueble">
                                    </div>
                                </div>

                                <div class="row d-flex h-100">
                                    <div class="col-md-6 my-1">
                                        <input type="submit" class="btn btn-primary boton btn-block" value="registrar tipo inmueble" onclick="">
                                    </div>
                                    <div class="col-md-6 my-1">
                                        <button class="btn btn-danger btn-block" type="submit">Cancelar</button>
                                    </div>
                                </div>

                                <div class="col-12 py-3">
                                    <input id="txtBandera" type="text" name="banderaRegistro" > 

                                </div>

                            </form>

                        </div>

                        <div class="container bd-example d-none" id="Actualizar">
                            <h5>
                                <strong>Tipos de inmueble</strong>
                            </h5>

                            <form action="/booktripPLaces/actualizarTipoInmueble" method="post" onsubmit="return validarInformacionTipoInmuebleAct()">


                                <div class="row d-flex h-100">
                                    <div class="col-md-12 my-1">
                                        <input type="text" name="nombre" id="txtNombreAct" class="form-control" placeholder="nombre del tipo de inmueble" value="<%=request.getParameter("nombre")%>">
                                    </div>
                                </div>

                                <div class="row d-flex h-100">
                                    <div class="col-md-6 my-1">
                                        <input type="submit" class="btn btn-primary boton btn-block" value="registrar tipo inmueble" onclick="">
                                    </div>
                                    <div class="col-md-6 my-1">
                                        <button class="btn btn-danger btn-block" type="submit">Cancelar</button>
                                    </div>
                                </div>

                                <div class="col-12 py-3">
                                    <input id="txtBanderaAct" type="text" name="banderaActualiza" > 

                                </div>

                            </form>

                        </div>
                        <div class="container bd-example" id="listarTipoInmueble">
                            <form action="/booktripPLaces/listarEstado" method="post">
                                <div class="row justify-content-md-center">
                                    <div id="Listado" class="bd-example">


                                        <div id="ControlRegistro" class="input-group">
                                            <!--Agregacion de parametro que se esta buscando-->
                                            <input id="txt_Id_Consultado" type="text" class="form-control" name="IdConsultado"
                                                   value="<%=buscando%>" autofocus
                                                   placeholder="Buscar por Nombre.." />
                                            <button type="button" class="btn btn-primary" data-toggle="dropdown"
                                                    aria-haspopup="true" aria-expanded="false"
                                                    onClick="realizarBusqueda()">Buscar</button>
                                            <div>
                                                <h1>Listado tipo inmuebles</h1>
                                                <div id="inmuebles"></div>
                                                <%
                                                    tipoinmuebleDAO mitipoinmuebleDAO = new tipoinmuebleDAO();
                                                    ArrayList<tipoinmuebles> milistatipoinmueble = new ArrayList<tipoinmuebles>();
                                                    milistatipoinmueble = mitipoinmuebleDAO.ConsultarListadoTipoInmueble(buscando);

                                                    out.println("<table class='table table-dark'><tr><td>Nombre</td>"
                                                            + " <td>Editar</td > <td>Eliminar</td> </tr>");
                                                    for (tipoinmuebles C : milistatipoinmueble) {
                                                        out.println("<tr>");

                                                        out.println("<td>" + C.getNombre() + "</td>");

                                                        out.println("<td>" + "<input type = 'submit' class='btn-primary form-control btn btn-login' value='Actualizar'name='Actualizar'onclick='SetIdConsulta(" + C.getIdTipo()+ ")'/>" + "</td>");
                                                        out.println("<td>" + "<input type = 'submit' class='btn btn-danger form-control btn btn-login' value= 'Eliminar'name='Eliminar'onclick='SetIdConsulta(" + C.getIdTipo() + ")'/>"
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
            </div>
        </div>
        <script src="js/appUtilitariosTipoInmuebles.js"></script>
        <script src="js/jquery-1.11.0.min.js"></script>
        <script src="js/gestionarTipoInmueble.js"></script>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    </body>
</body>
</html>
