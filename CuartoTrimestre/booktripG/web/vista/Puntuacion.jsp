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

        <link rel="stylesheet"   href="css/Puntuacion_estilo.css" />
        <link rel="stylesheet" href="bootstrap/css/bootstrap-grid.min.css"/>
        <link rel="stylesheet" href="bootstrap/css/bootstrap-reboot.min.css"/>
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css"/>
        <script src="bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="bootstrap/js/bootstrap.min.js"></script>

        <title>Puntuacion</title>
    </head>
    <body>
        <div class="contenedor">

            <section class="main">
                <div class="imagen">
                    <img src="imagenes/2.jpg"/>
                </div>    
                <section class="Posts">
                    <article>
                        <h2>Recorrido en lancha por el Rio Magdalena</h2>
                        <p>Recorrido en lancha por el Rio Magdalena, principal arteria fluvial del país y un atractivo natural e histórico de Girardot, en el que se pueden realizar actividades como navegación de contemplación, pesca artesanal y balneario. En décadas pasadas fue el soporte que permitió que Girardot constituyera uno de los principales puertos fluviales por donde desemboca el río Bogotá y llegaba mercancía enviada desde Barranquilla con destino a Bogotá y a través del cual se embarcaba el café de exportación proveniente del centro del país.</p> 
                    </article>
                </section>
            </section>
            <!-- agregar barra lateral -->
            <aside>
                <form class="user" action="/booktripG/registrarPuntuaciones" method="post" onsubmit="return validarInformacionPuntuacion()">
                    
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
                            <div class="input-group-prepend">

                                <input type="text" class="form-control " name ="fechaCreada" id="txtFechaCreada" placeholder="FechaCreada">
                            </div>

                        </div>



                        <div class="input-group mb-3">
                            <div class="input-group-prepend">

                                <input type="text" class="form-control " name ="descripcion" id="txtDescripcion" placeholder="Descripcion">
                            </div>

                        </div>

                        <div class="input-group mb-3">
                            <div class="input-group-prepend">
                                <input type="text" class="form-control " name ="calificacion" id="txtCalificacion" placeholder="Calificacion">
                            </div>
                        </div>

                        <div class="col-12 py-3">
                            <input class="d-none" id="txtBandera" type="text" name="banderaRegistro" > 

                        </div>

                        <input  type="submit" class="btn btn-dark" value="Enviar">
                        </form>
                        </aside>

                    </div>
                    <script src="js/jquery-1.11.0.min.js"></script>
                    <script src="js/gestionarPuntuaciones.js"></script>




                    </body>
                    </html>
