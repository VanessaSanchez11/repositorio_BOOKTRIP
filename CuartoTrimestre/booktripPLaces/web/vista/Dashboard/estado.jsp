<%-- 
    Document   : estado
    Created on : 9/10/2020, 09:58:06 AM
    Author     : oscar sanabria
--%>

<%@page import="modelo.estados"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.estadosDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Estados</title>
        <link rel="stylesheet" type="text/css" href="./vista/css/bootstrap-grid.min.css">
        <link rel="stylesheet" type="text/css" href="./vista/css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="css/estiloEstado.css">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css" integrity="sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z" crossorigin="anonymous">
    </head>
    <body onload="visualizaOculta('<%=request.getParameter("Vista")%>');" >

        <% String buscando = request.getParameter("buscando");
            if (buscando == null) {
                buscando = "";
            }
        %>


        <!--///////////////////////////////////////////////////////////////////////////////////////////////-->   

        <div class="row justify-content-md-center contenedor contenido-centrado">

            <div class="btn-group contenedor contenido-centrado">

                <button type="button" class="btn btn-secondary" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" onClick="visualizaOculta('Registrar')">
                    Registrar
                </button>

                <button type="button" class="btn btn-secondary" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" onClick="visualizaOculta('Actualizar')">
                    Actualizar
                </button>

                <button type="button" class="btn btn-secondary" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" onClick="visualizaOculta('Listado')">
                    Consultar
                </button>

                <button type="button" class="btn btn-secondary" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" onClick="VolverAlInicio()">
                    Volver al Inicio
                </button>

            </div>

        </div>

        <!--///////////////////////////////////////////////////////////////////////////////////////////////-->   

        <div class="container p-4">

            <div class="row justify-content-md-center">

                <div id="Registrar" class="bd-example d-none">

                    <main class="contenedor contenido-centrado">

                        <h2 class="fw-300 centrar-texto">Ingresa los Roles</h2>

                        <form action="registrarEstado" method="post" class="formulario" onsubmit="return validarInformacionEstado()">

                            <fieldset> <!-- agrupar campos que esten relacionados -->

                                <legend>Información</legend>

                                <label for="rol"> Rol:  </label>
                                <input type="text" name="rol" id="txtRol" placeholder="Ingresa aqui el Rol">

                            </fieldset>

                            <br>

                            <div id="ControlRegistro" class="bd-example d-none">

                                <input id="txtBanderaReg" type="text" class="form-control" name="BanderaRegistro"> 

                            </div>

                            <input type="submit" value="Registrar" name="" id="" class="boton boton-rojo">

                        </form>

                    </main>

                </div>

            </div>

        </div>

        <!--///////////////////////////////////////////////////////////////////////////////////////////////-->   

        <div class="container p-4">

            <div class="row justify-content-md-center contenedor contenido-centrado">

                <div id="Actualizar" class="bd-example d-none">

                    <main class="contenedor contenido-centrado">

                        <h2 class="fw-300 centrar-texto">Aqui puede Actualizar el rol</h2>

                        <form action="actualizarEstado" method="post" onsubmit="return validarInformacionEstadoAct()">

                            <div class="form-group">


                                <input type="text" id="txtIdEstadoAct" class="form-control" name="idEstado" value="<%=request.getParameter("idEstado")%>"

                                       <label for="Rol">Rol</label>
                                <input type="text" id="txtNombreAct" class="form-control" name="nombre" value="<%=request.getParameter("nombre")%>"/> 

                                <br>

                                <div id="ControlRegistro" class="bd-example">

                                    <input id ="txt_Bandera_Act" type= "text" class="form-control" name="BanderaActualiza"/>

                                </div>

                                <input type="submit" class="boton boton-rojo" value="Actualizar">

                            </div>

                        </form>

                    </main>

                </div>

            </div>

        </div>

        <!--///////////////////////////////////////////////////////////////////////////////////////////////-->                              

        <div class="container">

            <form action="listarEstado" method="post" >

                <div class="row justify-content-md-center">

                    <div id="Listado" class="bd-example">

                        <!--Se crea esta caja de texto con el fin de almacenar el rol que se va a modificar-->

                        <div id="ControlRegistro" class="input-group">

                            <!--Agregacion de parametro que se esta buscando-->


                            <input id ="txt_Id_Consultado" type="text" class="form-control" name="IdConsultado" 
                                   value="<%=buscando%>" autofocus placeholder="Buscar por Rol..."/>

                            <button type="button" class="btn btn-primary" data-toggle="dropdown"
                                    aria-haspopup="true" aria-expanded="false" onClick="realizarBusqueda()">Buscar</button>

                        </div>

                        <div>

                            <h2 class="fw-300 centrar-texto">Listado Roles</h2>

                            <div id="Tabla_Roles"></div>

                            <%
                                estadosDAO miestadoDAO = new estadosDAO();
                                ArrayList<estados> milistaestado = new ArrayList<estados>();
                                milistaestado = miestadoDAO.ConsultarListadoEstado(buscando, buscando);
                                out.println("<table class='table table-dark contenido-centrado'><tr><td>Rol</td><td>Editar</td><td>Eliminar</td></tr>");

                                for (estados C : milistaestado) {

                                    out.println("<tr>");
                                    out.println("<td>" + C.getNombre()+ "</td>");
                                    out.println("<td>" + "<input type ='submit' class='btn btn - primary form - control btn btn-login' value='Actualizar' "
                                            + "name='Actualizar' onclick='SetIdConsulta(" + C.getIdEstado()+ ")'/>" + "</td>");

                                    //Se agrega nuevo boton para eliminar, Cambio la clase
                                    //btn - primary : btn - danger para que se vea el color rojo.
                                    out.println("<td>" + "<input type = 'submit' class='btn btn - danger form - control btn btn-login' value='Eliminar' "
                                                + "name='Eliminar' onclick='SetIdConsulta(" + C.getIdEstado()+ ")' />" + "</td>");
                                    out.println("</tr>");

                                }

                                out.println("</table>");

                            %>

                        </div>

                    </div>

                </div>

            </form>

        </div>          

        <!--///////////////////////////////////////////////////////////////////////////////////////////////-->
        <script src="js/appUtilitariosEstados.js"></script>
        <script src="js/jquery-1.11.0.min.js"></script>
        <script src="js/gestionarEstados.js"></script>
        <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
        <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
        <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    </body>


</html>
