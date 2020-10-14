<%@page import="modelo.rol"%>
<%@page import="controlador.rolDAO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="modelo.tipoDocumentos"%>
<%@page import="controlador.tipoDocumentosDAO"%>
<!DOCTYPE html>
<html lang="en">

    <head>

        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <meta name="description" content="">
        <meta name="author" content="">

        <title>Register-booktrip</title>

        <link rel="stylesheet" href="bootstrap/css/bootstrap-grid.min.css">
        <link rel="stylesheet" href="bootstrap/css/bootstrap-reboot.min.css">
        <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
        <link rel="stylesheet" href="css/estilosRegister.css">
        <link href="https://fonts.googleapis.com/css2?family=PT+Serif:ital,wght@1,700&display=swap" rel="stylesheet">
        <script src="bootstrap/js/bootstrap.min.js"></script>
        <script src="bootstrap/js/bootstrap.bundle.min.js"></script>
        <script src="js/jquery-3.5.1.min.js"></script>

    </head>

    <body class="bg-gradient-primary">

        <a href="index.jsp" class="btn btn-outline-light ml-sm-5 mt-4">Volver al inicio</a>

        <div class="container">
            <h1 class="row justify-content-center tituloBooktrip">Booktrip</h1>
            <div class="card o-hidden border-0 shadow-lg my-5">
                <div class="card-body p-0">
                    <!-- Nested Row within Card Body -->
                    <div class="row">
                        <div class="col-lg-5 d-none d-lg-block bg-register-image"></div>
                        <div class="col-lg-7">
                            <div class="p-5">

                                <div class="text-center">
                                    <h1 class="h4 text-gray-900 mb-4">Crea una cuenta!</h1>
                                </div>

                                <!--/booktripV/register-->
                                <form class="user" id="form" action="/booktripV/register" method="post" onsubmit=" return checkInputs();" >
                                    <div class="form-group row cajaCombobox">
                                        <div class="col-sm-6 mb-3 mb-sm-0 ">

                                            <input id="idDocumento" type="text" class="form-control d-none" name="idTipoDocumento"  >
                                            <%
                                                tipoDocumentosDAO tipoDocu = new tipoDocumentosDAO();
                                                ArrayList<tipoDocumentos> listadoTipoDocu = tipoDocu.ConsultarListadoTiposDocumento("");
                                                out.println("<select class='form-control' id='selectTipoDocu' size='1' onchange='setIdTipo()'>");
                                                out.println("<option value=''>" + "--Seleccione--" + "</option>");
                                                for (tipoDocumentos t : listadoTipoDocu) {
                                                    out.println("<option value='" + t.getIdTipoDocumento() + "'>" + t.getNombre() + "</option>");
                                                }
                                                out.println("</select>");

                                            %>

                                        </div>
                                        <div class="col-sm-6 mb-3 mb-sm-0">
                                            <input id="idRoles" type="text" class="form-control d-none " name="idRol"  >
                                            <%                                                rolDAO rolC = new rolDAO();
                                                ArrayList<rol> listadoRol = rolC.ConsultarListadoRol("");
                                                out.println("<select class='form-control' id='selectTipoRol' size='1' onchange='setIdRoles()'>");
                                                out.println("<option value=''>" + "--Seleccione--" + "</option>");
                                                for (rol r : listadoRol) {
                                                    out.println("<option value='" + r.getIdRol() + "'>" + r.getNombre() + "</option>");
                                                }
                                                out.println("</select>");

                                            %>
                                        </div>
                                    </div>
                                    <div class="form-group row d-flex justify-content-around">
                                        <div class="col-sm-6 mb-3 mb-sm-0 ">
                                            <input type="text" class="form-control " name="nombre" id="idNombre" placeholder="Nombre">
                                            <small>Error message</small>
                                        </div>
                                        <div class="col-sm-6">
                                            <input type="text" class="form-control " name="apellido" id="idApellido" placeholder="Apellidos">
                                            <small>Error message</small>
                                        </div>
                                    </div>

                                    <div class="form-group row d-flex justify-content-around">
                                        <div class="col-sm-6 mb-3 mb-sm-0">
                                            <input type="text" class="form-control " name="direccion" id="idDireccion" placeholder="Direccion">
                                            <small>Error message</small>
                                        </div>
                                        <div class="col-sm-6">
                                            <input type="text" class="form-control " name="telefono" id="idTelefono" placeholder="Telefono">
                                            <small>Error message</small>
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <input type="email" class="form-control " name="email" id="idEmail" placeholder="Email">
                                        <small>Error message</small>
                                    </div>

                                    <div class="form-group row d-flex justify-content-around">
                                        <div class="col-sm-6 mb-3 mb-sm-0">
                                            <input type="text" class="form-control " name="fechaNacimiento" id="idFecha" placeholder="Fecha de nacimiento">
                                            <small>Error message</small>
                                        </div>
                                        <div class="col-sm-6">
                                            <input type="password" class="form-control " name="password" id="idPass" placeholder="Contraseña">
                                            <small>Error message</small>
                                        </div>
                                    </div>

                                    <input type="submit" class="btn btn-primary btn-user btn-block" value="Registrar">


                                </form>
                                <hr>
                                <div class="text-center">
                                    <a class="small" href="#">Olvidaste tu contraseña?</a>
                                </div>
                                <div class="text-center">
                                    <a class="small" href="login.jsp">Ya tienes una cuenta? Login!</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>

        </div>


        <script src="js/validaciones.js"></script>
    </body>

</html>