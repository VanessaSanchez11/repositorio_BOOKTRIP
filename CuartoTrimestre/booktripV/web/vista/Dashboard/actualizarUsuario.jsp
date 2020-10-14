<%@page import="modelo.rol"%>
<%@page import="controlador.rolDAO"%>
<%@page import="modelo.tipoDocumentos"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.tipoDocumentosDAO"%>
<div class="container-fluid">

    <!-- Page Heading -->
    <div class="d-sm-flex align-items-center justify-content-between mb-4">
        <h1 class="h3 mb-0 text-gray-800">Dashboard</h1>
        <!-- <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"> Lista de usuarios</a>
            <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-success shadow-sm"> Consultar usuario</a>
            <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-warning shadow-sm"> Actualizar usuario</a>
            <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-danger shadow-sm"> Eliminar usuario  </a> -->
    </div>
    <div class="d-sm-flex align-items-center justify-content-between mb-4">

        <a href="indexListaRol.jsp" class="d-none d-sm-inline-block btn  btn-success shadow-sm"> Lista de roles</a>



    </div>


    <div class="contenedor">

        <h1 class="tituloRol">Actualizar usuarios</h1>
        <hr>
        <div class="col-sm-5 mb-3 mb-sm-0 m-auto ">
            <form class="user" id="form"  action="/booktripV/register" method="post" onsubmit=" return checkInputs();" >
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
                            out.println("<select class='form-control' id='selectTipoRol' size='1' onchange='setIdRol()'>");
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

                <input type="submit" class="btn btn-primary btn-user btn-block" value="Actualizar">


            </form>
        </div>
    </div>


</div>

