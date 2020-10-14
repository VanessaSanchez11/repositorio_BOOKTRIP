<%@page import="modelo.estados"%>
<%@page import="controlador.estadosDAO"%>
<%@page import="modelo.inmuebles"%>
<%@page import="controlador.inmueblesDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.usuario"%>
<%@page import="controlador.usuarioDao"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

        <link rel="stylesheet"   href="css/Reserva_estilo.css" />
        <link rel="stylesheet" href="bootstrap/css/bootstrap-grid.min.css"/>
        <link rel="stylesheet" href="bootstrap/css/bootstrap-reboot.min.css"/>
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css"/>
        <script src="bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>

        <title>Reservas</title>
    </head>
    <body>
        <div class="contenedor">

            <section class="main">
                <div class="imagen">
                    <img src="imagenes/4.jpg"/>
                </div>
                <section class="Posts">
                    <article>
                        <h2>BIENVENIDO A BOOKTRIP</h2>
                    </article>
                </section>
            </section>
            <!-- agregar barra lateral -->
            <aside>            
                <form class="user" action="/booktripG/registroReservas" method="post" onsubmit="return validarInformacionReserva()">
                    <div class="form-check">
                        <div class="input-group mb-3">
                            <input name="idUsuario" class="form-control d-none my-1" id="txtUsuario" >
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

                        <div class="input-group mb-3">
                            <input name="idInmueble" class="form-control d-none my-1" id="txtInmueble" >
                            <%
                                inmueblesDAO miinmuebleDAO = new inmueblesDAO();
                                ArrayList<inmuebles> milistainmueble = miinmuebleDAO.ConsultarListadoInmueble("");
                                out.println("<select class='form-control' id='selectIdInmueble' size= '1' onchange='setIdInmueble()'>");
                                out.println("<option value=''>" + "--seleccione inmueble--" + "</option >");
                                for (inmuebles c : milistainmueble) {
                                    out.println("<option value='" + c.getIdInmueble() + "'>" + c.getNombre() + "</option>");

                                }
                                out.println("</select>");
                            %> 
                        </div>

                        <div class="input-group mb-3">
                            <input name="idEstado" class="form-control d-none my-1" id="txtEstado" >
                            <%
                                estadosDAO miestadosDAO = new estadosDAO();
                                ArrayList<estados> milistaestados = miestadosDAO.ConsultarListadoEstado("");
                                out.println("<select class='form-control' id='selectIdEstado' size= '1' onchange='setIdEstado()'>");
                                out.println("<option value=''>" + "--seleccione estado--" + "</option >");
                                for (estados c : milistaestados) {
                                    out.println("<option value='" + c.getIdEstado() + "'>" + c.getNombre() + "</option>");

                                }
                                out.println("</select>");
                            %> 
                        </div>

                        <div class="input-group mb-3">
                            <div class="input-group-prepend">

                                <input type="text" class="form-control " name ="fechaReserva" id="txtFechaReserva" placeholder="FechaReserva">
                            </div>

                        </div>



                        <div class="input-group mb-3">
                            <div class="input-group-prepend">

                                <input type="text" class="form-control " name ="checkIn" id="txtCheckIn" placeholder="CheckIn">
                            </div>

                        </div>

                                                

                        <div class="input-group mb-3">
                            <div class="input-group-prepend">

                                <input type="text" class="form-control " name ="checkOut" id="txtCheckOut" placeholder="CheckOut">
                            </div>

                        </div>
                        
                        <div class="col-12 py-3">
                            <input class="d-none" id="txtBandera" type="text" name="banderaRegistro" > 

                        </div>
                        
                        <input  type="submit" class="btn btn-dark" value="Enviar">
                    </div>
                </form>
            </aside>
        </div>
        <script src="js/jquery-1.11.0.min.js"></script>
        <script src="js/gestionarReservas.js"></script>



    </body>
</html>
