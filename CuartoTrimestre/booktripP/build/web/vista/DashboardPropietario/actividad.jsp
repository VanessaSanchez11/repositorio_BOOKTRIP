
<%@page import="modelo.municipios"%>
<%@page import="controlador.municipiosDAO"%>
<%@page import="modelo.actividades"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.actividadesDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet"  href="vista/css/actividad_estilo.css">
        <title>Actividades</title>
    </head>

    <body>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Iniciar sesion</title>

        <link rel="stylesheet" href="bootstrap/css/bootstrap-grid.min.css">
        <link rel="stylesheet" href="bootstrap/css/bootstrap-reboot.min.css">
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="css/estilosRegister.css">
        <link href="https://fonts.googleapis.com/css2?family=PT+Serif:ital,wght@1,700&display=swap" rel="stylesheet">
        <script src="bootstrap/js/bootstrap.min.js"></script>
        <script src="bootstrap/js/bootstrap.bundle.min.js"></script>

    </head>

<body class="bg-gradient-primary">

    <div class="container">
        <h1 class="row justify-content-center tituloBooktrip">Booktrip</h1>
        <a href="indexListaActividad.jsp" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"> Lista de las actividades</a>
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
                                        <h1 class="h4 text-gray-900 mb-4"> REGISTRA LA ACTIVIDAD </h1>
                                    </div>
                                    
                                    
                                    <form class="user" action="/booktripP/registrarActi" method="post" onsubmit="return checkActi();">
                                        <div class="form-group">
                                            <label class="label">SELECIONA MUNICIPIO</label>
                                            <%
                                                municipiosDAO actiC = new municipiosDAO();
                                                ArrayList<municipios> milistaMunicipios = actiC.ConsularListaMunicipio("");
                                                out.println("<select class='form-control' id='selectActividad' size='1' onchange='setIdActivid()'>");
                                                out.println("<option value=''>" + "--Seleccione--" + "</option>");
                                                for (municipios a : milistaMunicipios) {
                                                    out.println("<option value='" + a.getIdMunicipio()+ "'>" + a.getNombre()+ "</option>");
                                                }
                                                out.println("</select>");

                                            %>
                                            <br>
                                            <input type="text" class="form-control form-control-user" name="actividad" id="IdActividades"  placeholder="Nombre de la actividad">
                                      
                                        <div class="form-group">
                                            <input type="text" class="form-control form-control-user" name="place" id="IdLugar" placeholder="Lugar">
                                        </div>
                                        <div class="form-group">

                                            <textarea class="form-control" id="exampleFormControlTextarea1" rows="3" id="IdDescripcion"  placeholder="Descripcion" name="descripcion"></textarea>
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
    <footer>
        <script src="../js/Validaciones.js"></script>
    </footer>


</body>
</html>
