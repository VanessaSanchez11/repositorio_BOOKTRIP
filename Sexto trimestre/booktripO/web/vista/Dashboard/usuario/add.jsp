
<%@page import="modelo.rol"%>
<%@page import="controlador.rolDAO"%>
<%@page import="modelo.tipoDocumentos"%>
<%@page import="controlador.tipoDocumentosDAO"%>
<%@page import="modelo.usuario"%>
<%@page import="controlador.usuarioDao"%>
<%@page import="modelo.estados"%>
<%@page import="controlador.estadosDAO"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="modelo.inmuebles"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.inmueblesDAO"%>

<%@page import="java.util.ArrayList"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="css/estilosRegister.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    </head>

    <body>
    <center>
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

                                <form action="/booktripO/controllerUsuario" method="POST">


                                    <div class="form-group row">
                                        <div class="col-sm-6 mb-3 mb-sm-0 ">
                                            <label>Tipo de documento</label>

                                            <div class="col-sm-6 ">

                                                <%
                                                    tipoDocumentosDAO UDAO = new tipoDocumentosDAO();
                                                    ArrayList<tipoDocumentos> listaU = UDAO.ConsultarListadoTipos("");
                                                %> 
                                                <select name="txtTipoDocumento" class="form-control Combobox">
                                                    <%
                                                        for (tipoDocumentos i : listaU) {%>
                                                    <option value="<%=i.getIdTipoDocumento()%>"><%=i.getNombre()%> </option>
                                                    <%
                                                        }
                                                    %>
                                                </select>

                                            </div>
                                        </div>
                                        <div class="col-sm-6">     
                                            <label>Numero de documento</label>
                                            <input type="text" name="txtNumDocu" class="form-control ">
                                        </div>
                                        <div class="col-sm-6 mb-3 mb-sm-0">
                                            <label>Rol</label>
                                            <div class="col-sm-6">

                                                <%
                                                    rolDAO RDAO = new rolDAO();
                                                    ArrayList<rol> listaR = RDAO.ConsultarListadoRoles("");
                                                %> 
                                                <select name="txtRol" class='form-control'>
                                                    <%
                                                        for (rol i : listaR) {%>
                                                    <option value="<%=i.getIdRol()%>"><%=i.getNombre()%> </option>
                                                    <%
                                                        }
                                                    %>
                                                </select>

                                            </div>
                                        </div>
                                    </div>
                                    <div class="form-group row d-flex justify-content-around">
                                        <div class="col-sm-6 mb-3 mb-sm-0 ">
                                            <input type="text" class="form-control " name="txtNombre" id="idNombre" placeholder="Nombre">
                                            <!--<small>Error message</small>-->
                                        </div>
                                        <div class="col-sm-6">
                                            <input type="text" class="form-control " name="txtApellido" id="idApellido" placeholder="Apellidos">
                                            <!--<small>Error message</small>-->
                                        </div>
                                    </div>

                                    <div class="form-group row d-flex justify-content-around">
                                        <div class="col-sm-6 mb-3 mb-sm-0">
                                            <input type="text" class="form-control " name="txtDireccion" id="idDireccion" placeholder="Direccion">
                                            <!--<small>Error message</small>-->
                                        </div>
                                        <div class="col-sm-6">
                                            <input type="text" class="form-control " name="txtTelefono" id="idTelefono" placeholder="Telefono">
                                            <!--<small>Error message</small>-->
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <input type="email" class="form-control " name="txtEmail" id="idEmail" placeholder="Email">
                                        <!--<small>Error message</small>-->
                                    </div>

                                    <div class="form-group row d-flex justify-content-around">
                                        <div class="col-sm-6 mb-3 mb-sm-0">
                                            <input type="text" class="form-control " name="txtFecha" id="idFecha" placeholder="Fecha de nacimiento">
                                            <!--<small>Error message</small>-->
                                        </div>
                                        <div class="col-sm-6">
                                            <input type="password" class="form-control " name="txtPassword" id="idPass" placeholder="Contraseña">
                                            <!--<small>Error message</small>-->
                                        </div>
                                    </div>
                                    <div>  
                                        <input type="submit" name="accion" class="btn btn-success btn-user btn-block" value="Guardar" class="btn-primary btn-block">
                                        <input type="submit" name="accion" class="btn btn-danger btn-user btn-block" value="Regresar" class="btn-danger btn-block">
                                    </div>
                                </form>
                                                 <hr>
                                
                                <div class="text-center">
                                    <a class="small" href="../../login.jsp">Ya tienes una cuenta? Login!</a>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>


</center>
<script src="../js/jquery-1.11.0.min.js"></script>
<script src="../js/validaciones.js"</script>
<script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>

</body>
</html>
