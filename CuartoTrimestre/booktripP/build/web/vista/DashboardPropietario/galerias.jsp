
<%@page import="modelo.inmuebles"%>
<%@page import="controlador.inmuebleDAO"%>
<%@page import="modelo.galeria"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.galeriasDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body class="bg-gradient-primary">



        <div class="container"> 
            <a href="indexListaGaleria.jsp" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"> Lista de la galeria</a>
            <h1 class="row justify-content-center tituloBooktrip">Booktrip</h1>

            <!-- Outer Row -->
            <div class="row justify-content-center">

                <div class="col-xl-10 col-lg-12 col-md-9">

                    <div class="card o-hidden border-0 shadow-lg my-5">
                        <div class="card-body p-0">
                            <!-- Nested Row within Card Body -->
                            <div class="row"> 
                                <div class="col-lg-6 d-none d-lg-block bg-login-image"></div>
                                <div class="col-lg-6">
                                    <div class="p-5">
                                        <div class="text-center">
                                            <h1 class="h4 text-gray-900 mb-4"> REGISTRA TU GALERIA</h1>
                                        </div>
                                        <form class="user" action="/booktripP/registarGalerias" method="post">
                                            
                                            <div class="form-group">
                                            <label>Inmuebles</label>

                                            <%
                                                    inmuebleDAO InmuC = new inmuebleDAO();
                                                    ArrayList<inmuebles> milistainmueble = InmuC.ConsultarListadoInmueble("");
                                                    out.println("<select class='form-control' id='selectGale' size='1' onchange='setIdGale()'>");
                                                    out.println("<option value=''>" + "--Seleccione--" + "</option>");
                                                    for (inmuebles I : milistainmueble) {
                                                        out.println("<option value='" + I.getIdInmueble() + "'>" + I.getNombre() + "</option>");

                                                    }
                                                

                                                out.println("</select>");

                                            %>
                                            <br>
                                            <br>

                                            <div class="form-group">
                                                <input type="file" class="form-control form-control-user" name="Photo" id="IdImagen" aria-describedby="emailHelp" placeholder="Nombre de la actividad">
                                            </div>
                                            <div class="form-group">
                                                <input type="text" class="form-control form-control-user" name="Url" id="IdUrl" placeholder="URL">
                                            </div>

                                            <input type="submit" class="btn btn-primary btn-user btn-block" value="Registrar">

                                            </div>

                                        </form>


                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                </div>

            </div>

        </div>


    </body>
</html>
