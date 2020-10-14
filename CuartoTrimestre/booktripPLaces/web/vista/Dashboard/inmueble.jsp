<%-- 
    Document   : inmueble
    Created on : 20/06/2020, 12:59:33 PM
    Author     : oscar sanabria
--%>

<%@page import="modelo.inmuebles"%>
<%@page import="controlador.inmueblesDAO"%>
<%@page import="modelo.estados"%>
<%@page import="controlador.estadosDAO"%>
<%@page import="modelo.usuario"%>
<%@page import="controlador.usuarioDao"%>
<%@page import="modelo.departamento"%>
<%@page import="controlador.departamentosDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.tipoinmuebles"%>
<%@page import="controlador.tipoinmuebleDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Inmueble</title>
    <link rel="stylesheet" type="text/css" href="./vista/css/bootstrap-grid.min.css">
    <link rel="stylesheet" type="text/css" href="./vista/css/bootstrap.css">
    <link rel="stylesheet" type="text/css" href="css/estiloInmueble.css">
    <link rel="stylesheet" type="text/css"
        href="C:\Users\oscar sanabria\Documents\NetBeansProjects\booktripPLaces\web\vista\Dashboard\css\registro_inmueble.css">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
        integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
        integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">

</head>

<body onload="mueveReloj()" onload="visualizaOculta('<%=request.getParameter("Vista")%>');">
    <% String buscando = request.getParameter("buscando");
            if (buscando == null) {
                buscando = "";
            }
        %>
    <div class="container">

        <div class="principal"> 

            <div class="fondo text-white py-5">
                <div class="container">
                    <div class="row justify-content-md-center">
                        <div class="btn-group ">
                            <button type="button" class="btn-light" data-toggle="dropdown" aria-haspopup="true"
                                aria-expanded="false" onClick="visualizaOculta('registroInmueble')">
                                Registrar
                            </button>
                            <button type="button" class="btn btn-secondary" data-toggle="dropdown" aria-haspopup="true"
                                aria-expanded="false" onClick="visualizaOculta('actualizarInmue')">
                                Actualizar
                            </button>
                            <button type="button" class="btn btn-success" data-toggle="dropdown" aria-haspopup="true"
                                aria-expanded="false" onClick="visualizaOculta('consultarInmueble')">
                                Listar
                            </button>
                            <button type="button" class="btn btn-warning" data-toggle="dropdown" aria-haspopup="true"
                                aria-expanded="false" onClick="Volver()">
                                Volver al Inicio
                            </button>
                        </div>
                    </div>
                    <div class="row d-flex h-100">


                        <div class="col-md-6 col-xm-12 text-center justify-content-center align-items-center  bd-example d-none"
                            id="Registrar">
                            <h1>
                                Registrar inmueble
                            </h1>
                            <form action="/booktripPLaces/registroInmueble" method="post"
                                onsubmit="return validarInformacionInmueble()">

                                <div class="row d-flex h-100">
                                    <div class="col-md-6">
                                        <input id="txtTipo" type="text" class="form-control d-none" name="idTipo">

                                        <%
                                                tipoinmuebleDAO TipoInmuebleDAO = new tipoinmuebleDAO();
                                                ArrayList<tipoinmuebles> milistatipoinmueble = TipoInmuebleDAO.ConsultarListadoTipoInmueble("");
                                                out.println("<select class='form-control' id='selectIdTipo' size= '1' onchange='setIdTipo()'>");
                                                out.println("<option value=''>" + "--seleccione tipo inmueble--" + "</option>");
                                                for (tipoinmuebles c : milistatipoinmueble) {
                                                    out.println("<option value='" + c.getIdTipo() + "'>" + c.getNombre() + "</option>");
                                                }
                                                out.println("</select>");
                                            %>
                                    </div>


                                    <div class="col-md-6">
                                        <input name="idDepartamento" type="text" id="txtDepartamento"
                                            class="form-control d-none my-1">
                                        <%
                                                departamentosDAO midepartamentoDAO = new departamentosDAO();
                                                ArrayList<departamento> milistadepartamento = midepartamentoDAO.ConsularListaDepartamento("");
                                                out.println("<select class='form-control' id='selectIdDepartamento' size= '1' onchange='setIdDepartamento()'>");
                                                out.println("<option value=''>" + "--seleccione el departamento--" + "</option>");
                                                for (departamento c : milistadepartamento) {
                                                    out.println("<option value='" + c.getIdDepartamento()+ "'>" + c.getNombre() + "</option>");
                                                }
                                                out.println("</select>");
                                            %>
                                    </div>
                                </div>
                                <div class="row d-flex h-100">
                                    <div class="col-md-6">
                                        <input name="idUsuario" class="form-control d-none my-1" id="txtUsuario">
                                        <%
                                                usuarioDao miusuarioDAO = new usuarioDao();
                                                ArrayList<usuario> milistausuario = miusuarioDAO.ListadoUsuarios("");
                                                out.println("<select class='form-control' id='selectIdUsuario' size= '1' onchange='setIdUsuario()'>");
                                                out.println("<option value=''>" + "--seleccione usuario--" + "</option>");
                                                for (usuario c : milistausuario) {
                                                    out.println("<option value='" + c.getIdUsuario()+ "'>" + c.getNombre()+ "</option>");

                                                }
                                                out.println("</select>");
                                            %>
                                    </div>
                                    <div class="col-md-6">
                                        <input name="idEstado" class="form-control d-none my-1" id="txtEstado">
                                        <%
                                                estadosDAO miestadoDAO = new estadosDAO();
                                                ArrayList<estados> milistaestado = miestadoDAO.ConsultarListadoEstado(buscando, buscando);
                                                out.println("<select class='form-control' id='selectIdEstado' size= '1' onchange='setIdEstado()'>");
                                                out.println("<option value=''>" + "--seleccione estado--" + "</option>");
                                                for (estados c : milistaestado) {
                                                    out.println("<option value='" + c.getIdEstado() + "'>" + c.getNombre() + "</option>");

                                                }
                                                out.println("</select>");
                                            %>
                                    </div>
                                </div>
                                <div class="row d-flex h-100">
                                    <div class="col-md-6">
                                        <input name="nombre" type="text" id="txtNombre" class="form-control my-1"
                                            placeholder="Nombre inmueble">
                                    </div>
                                    <div class="col-md-6">
                                        <input name="direccion" type="text" id="txtDireccion" class="form-control my-1"
                                            placeholder="Direccion">
                                    </div>
                                </div>
                                <div class="row d-flex h-100">
                                    <div class="col-md-6">
                                        <input name="capacidad" type="text" id="txtCapacidad" class="form-control my-1"
                                            placeholder="Capacidad">
                                    </div>
                                    <div class="col-md-6">
                                        <input name="precio" type="text" id="txtPrecio" class="form-control my-1"
                                            placeholder="Precio">
                                    </div>
                                </div>
                                <div class="row d-flex h-100">
                                    <div class="col-md-6">
                                        <input name="adjunto" type="text" id="txtAdjunto" class="form-control my-1"
                                            placeholder="Adjunto">
                                    </div>
                                    <div class="col-md-6">
                                        <textarea name="descripcion" class="form-control my-1" id="txtDescripcion"
                                            rows="3" placeholder="Descripción"></textarea>
                                    </div>
                                </div>


                                <div class="col-md-12">
                                    <input id="txtBandera" type="text" name="banderaRegistro">
                                </div>


                                <div class="row d-flex h-100">

                                    <div class="col-md-6">
                                        <input type="submit" class="btn btn-primary boton my-1 btn-block my-1"
                                            value="registrar Inmueble" onclick="">
                                    </div>


                                    <div class="col-md-6">
                                        <button class="btn btn-danger btn-block my-1" type="submit">Cancelar</button>
                                    </div>
                                </div>
                            </form>

                        </div>
                        <div class="col-md-6 col-xm-12 align-items-center">
                            <div class="row d-flex w-100">
                                <div class="col-12 mt-3">
                                    <div class="carousel slide" id="principal-carousel" data-ride="carousel">
                                        <ol class="carousel-indicators">
                                            <li data-target="#principal-carousel" data-slid-to="0" class="active"></li>
                                            <li data-target="#principal-carousel" data-slid-to="1"></li>
                                            <li data-target="#principal-carousel" data-slid-to="2"></li>
                                        </ol>

                                        <div class="carousel-inner">
                                            <div class="carousel-item active">
                                                <img src="./imagenes/imagen1.jpg" class="w-100" alt="">
                                            </div>
                                            <div class="carousel-item">
                                                <img src="./imagenes/imagen2.jpg" class="w-100" alt="">
                                            </div>
                                            <div class="carousel-item">
                                                <img src="./imagenes/imagen3.jpg" class="w-100" alt="">
                                            </div>
                                        </div>

                                        <a href="#principal-carousel" class="carousel-control-prev" data-slide="prev">
                                            <span class="carousel-control-prev-icon" aria-hidden="true"></span>
                                            <span class="sr-only">Anterior</span>
                                        </a>

                                        <a href="#principal-carousel" class="carousel-control-next" data-slide="next">
                                            <span class="carousel-control-next-icon" aria-hidden="true"></span>
                                            <span class="sr-only">Siguiente</span>
                                        </a>
                                    </div>
                                </div>
                            </div>


                        </div>
                    </div>
                </div>
              
                        <div class="row d-flex h-100">

                            <div class="col-md-6 col-xm-12 text-center justify-content-center align-items-center  bd-example d-none" id="Actualizar">
                                <h1>
                                    actualizar inmueble
                                </h1>
                                <form action="/booktripPLaces/actualizarInmueble" method="post" onsubmit="return validarInformacionInmuebleAct()">

                                    <div class="row d-flex h-100">
                                        <div class="col-md-6">
                                            <input id="txtTipo" type="text" class="form-control d-none" name="idTipo">

                                            <%
                                                out.println("<select class='form-control'id ='SelectIdTipo' size = '1'");
                                                /*out.println("<option onclick='setIdTipo(\"" + "" "\")'>" + "--Seleccionar--" + "</option>");*/
                                                for (tipoinmuebles C : milistatipoinmueble) {
                                                    out.println("<option onclick='setIdTipoA(\""
                                                            + C.getIdTipo() + "\")'>" + C.getNombre()
                                                            + "</option>");
                                                }
                                                out.println("</select>");
                                            %>
                                        </div>   


                                        <div class="col-md-6">
                                            <input name="idDepartamento" type="text" id="txtDepartamentoAct" class="form-control d-none my-1">
                                            <%
                                                out.println("<select class='form-control'id ='SelectIdDepartamento' size = '1'");
                                                /*out.println("<option onclick='setIdDepartamento(\"" + "" "\")'>" + "--Seleccionar--" + "</option>");*/

                                                for (departamento c : milistadepartamento) {
                                                    out.println("<option value='" + c.getIdDepartamento() + "'>" + c.getNombre() + "</option>");
                                                }
                                                out.println("</select>");
                                            %> 
                                        </div>
                                    </div>
                                    <div class="row d-flex h-100">
                                        <div class="col-md-6">
                                            <input name="idUsuario" class="form-control d-none my-1" id="txtUsuarioAct" >
                                            <%
                                                out.println("<select class='form-control'id ='SelectIdUsuario' size = '1'");
                                                /*out.println("<option onclick='setIdUsuario(\"" + "" "\")'>" + "--Seleccionar--" + "</option>");*/

                                                for (usuario c : milistausuario) {
                                                    out.println("<option value='" + c.getIdUsuario() + "'>" + c.getNombre() + "</option>");

                                                }
                                                out.println("</select>");
                                            %> 
                                        </div>     
                                        <div class="col-md-6"> 
                                            <input name="idEstado" class="form-control d-none my-1" id="txtEstadoAct">
                                            <%
                                                out.println("<select class='form-control'id ='SelectIdEstado' size = '1'");
                                                /*out.println("<option onclick='setIdEstado(\"" + "" "\")'>" + "--Seleccionar--" + "</option>");*/

                                                for (estados c : milistaestado) {
                                                    out.println("<option value='" + c.getIdEstado() + "'>" + c.getNombre() + "</option>");

                                                }
                                                out.println("</select>");
                                            %> 
                                        </div>
                                    </div>   
                                    <div class="row d-flex h-100">
                                        <div class="col-md-6">
                                            <input name="nombre" type="text" id="txtNombreAct" class="form-control my-1" placeholder="Nombre inmueble">
                                        </div>
                                        <div class="col-md-6"> 
                                            <input name="direccion" type="text" id="txtDireccionAct" class="form-control my-1" placeholder="Direccion">
                                        </div>
                                    </div>
                                    <div class="row d-flex h-100">
                                        <div class="col-md-6">
                                            <input name="capacidad" type="text" id="txtCapacidadAct" class="form-control my-1" placeholder="Capacidad">
                                        </div>
                                        <div class="col-md-6">
                                            <input name="precio" type="text" id="txtPrecioAct" class="form-control my-1" placeholder="Precio">
                                        </div>
                                    </div>
                                    <div class="row d-flex h-100">
                                        <div class="col-md-6">    
                                            <input name="adjunto" type="text" id="txtAdjuntoAct" class="form-control my-1" placeholder="Adjunto">
                                        </div>
                                        <div class="col-md-6">
                                            <textarea name="descripcion" class="form-control my-1" id="txtDescripcionAct" rows="3" placeholder="Descripción"></textarea>
                                        </div>
                                    </div>


                                    <div class="col-md-12">
                                        <input id="txtBandera" type="text" name="banderaRegistro"> 
                                    </div>


                                    <div class="row d-flex h-100">

                                        <div class="col-md-6">
                                            <input type="submit" class="btn btn-primary boton my-1 btn-block my-1" value="Actualizar Inmueble" onclick="">
                                        </div>


                                        <div class="col-md-6">
                                            <button class="btn btn-danger btn-block my-1" type="submit">Cancelar</button>
                                        </div>
                                    </div>
                                </form>

                            </div>

                        </div>
                  <div class="container bd-example" id="Listar">
                            <form action="/booktripPLaces/listarInmueble" method = "post" >
                                <div class="row justify-content-md-center">
                                    <div id="Listado" class="bd-example">

                                         <div id="ControlRegistro" class="input-group">
                                             <!--Agregacion de parametro que se esta buscando-->
                                             <input id ="txt_Id_Consultado" type = "text" class="form-control" name= "IdConsultado" value="<%=buscando%>" autofocus placeholder="Buscar por TipoInmueble,Nombre y Direccion..."/>
                                             <button type="button" class="btn btn-primary" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" onClick="realizarBusquedaBook()">Buscar</button>
                                         </div>
                                        <div>
                                            <h1>Listado inmuebles</h1>
                                            <div id="Estados"></div>
                                            <%
                                                inmueblesDAO miinmuebleDAO = new inmueblesDAO();
                                                ArrayList<inmuebles> milistainmueble = new ArrayList<inmuebles>();
                                                milistainmueble = miinmuebleDAO.ConsultarListadoInmueble(buscando);

                                                out.println("<table class='table table-dark'><tr><td>Tipo inmueble</td><td>Departamento</td>"
                                                        + "<td>Usuario</td> <td>Estado</td><td>Nombre</td><td>Dirección</td>"
                                                        + " <td>Capacidad</td><td>Precio</td><td>Adjunto</td><td>Descripcion</td><td>Editar</td > <td>Eliminar</td> </tr>");
                                                for (inmuebles C : milistainmueble) {
                                                    out.println("<tr>");
                                                    out.println("<td>" + C.getIdTipo()+ "</td>");
                                                    out.println("<td>" + C.getIdDepartamento()+ "</td>");
                                                    out.println("<td>" + C.getIdInmueble()+ "</td>");
                                                    out.println("<td>" + C.getIdEstado()+ "</td>");
                                                    out.println("<td>" + C.getNombre() + "</td>");
                                                    out.println("<td>" + C.getDireccion() + "</td>");
                                                    out.println("<td>" + C.getCapacidad() + "</td>");
                                                    out.println("<td>" + C.getPrecio() + "</td>");
                                                    out.println("<td>" + C.getAdjunto()+ "</td>");
                                                    out.println("<td>" + C.getDescripcion() + "</td>");
                                                    out.println("<td>" + "<input type = 'submit' class='btn-primary form-control btn btn-login' value='Actualizar'name='Actualizar'onclick='SetIdConsulta(" + C.getNombre()+ ")'/>" + "</td>");
                                                    out.println("<td>" + "<input type = 'submit' class='btn btn-danger form-control btn btn-login' value= 'Eliminar'name='Eliminar'onclick='SetIdConsulta(" + C.getNombre()+ ")'/>"
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
            <script src="js/appUtilitarios.js"></script>
            <script src="js/jquery-1.11.0.min.js"></script>
            <script src="js/gestionarInmuebles.js"></script>
            <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js"
                integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj"
                crossorigin="anonymous"></script>
            <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"
                integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN"
                crossorigin="anonymous"></script>
            <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"
                integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV"
                crossorigin="anonymous"></script>
</body>

</html>