<%@page import="modelo.rol"%>
<%@page import="controlador.rolDAO"%>
<%@page import="modelo.tipoDocumentos"%>
<%@page import="controlador.tipoDocumentosDAO"%>
<%@page import="modelo.usuario"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.usuarioDao"%>

<body onload="visualizaOculta('<%=request.getParameter("Vista")%>');">
    <% String buscando = request.getParameter("buscando");
        if (buscando == null) {
            buscando = "";
        }
    %>

    <div class="container-fluid">

        <!-- Page Heading -->
        <div class="d-sm-flex align-items-center justify-content-between mb-4">
            <h1 class="h3 mb-0 text-gray-800">Dashboard</h1>
            <!-- <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"> Lista de usuarios</a>
           <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-success shadow-sm"> Consultar usuario</a>
           <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-warning shadow-sm"> Actualizar usuario</a>
           <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-danger shadow-sm"> Eliminar usuario</a> -->

        </div>
        <div class=" align-items-center justify-content-between mb-4">

            <button type="button" class="d-none d-sm-inline-block btn btn-sm btn-warning shadow-sm" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" onClick="visualizaOculta('Actualizar')">Actualizar Usuarios</button>
            <button type="button" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" onClick="visualizaOculta('Listado')">Listado Usuarios</button>

        </div>

 <!-- ---------------------------------------------------------------------------------------- -->   
 
        <div class="contenedor">

            <h1>Lista</h1>

            <div class="row justify-content-md-center">

                <div id="Actualizar" class="bd-example d-none ">
                    <h1>Aqui puede Actualizar su usuario</h1>
                    <form action="/booktripV/actualizarUser" method= "post" >
                        <div class="form-group row cajaCombobox">
                           
                                <input id="idUsuario" type="text" class="form-control d-none " name="idUsuario" value="<%=request.getParameter("idUsuario")%>">
                             
                          
                            <div class="col-sm-6 mb-3 mb-sm-0 ">

                                <input id="idDocumentoAct" type="text" class="form-control d-none" name="idTipoDocumento" value="<%=request.getParameter("idTipoDocumento")%>">
                                <%
                                    tipoDocumentosDAO tipoDocu = new tipoDocumentosDAO();
                                    ArrayList<tipoDocumentos> listadoTipoDocu = tipoDocu.ConsultarListadoTiposDocumento("");
                                    out.println("<select class='form-control' id='selectTipoDocAct' size='1' onchange='setIdTipoA()'>");
                                    out.println("<option value=''>" + "--Seleccione--" + "</option>");
                                    for (tipoDocumentos t : listadoTipoDocu) {
                                        out.println("<option value='" + t.getIdTipoDocumento() + "'>" + t.getNombre() + "</option>");
                                    }
                                    out.println("</select>");

                                %>

                            </div>
                            <div class="col-sm-6 mb-3 mb-sm-0">
                                <input id="idRolesAct" type="text" class="form-control d-none " name="idRol" value="<%=request.getParameter("idRol")%>">
                                <%     
                                    rolDAO rolC = new rolDAO();
                                    ArrayList<rol> listadoRol = rolC.ConsultarListadoRol("");
                                    out.println("<select class='form-control' id='selectTipoRolAct' size='1' onchange='setIdRol()'>");
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
                                <input type="text" class="form-control  " name="nombre" id="idNombre" value="<%=request.getParameter("nombre")%>">
                                <small>Error message</small>
                            </div>
                            <div class="col-sm-6">
                                <input type="text" class="form-control " name="apellido" id="idApellido" value="<%=request.getParameter("apellido")%>">
                                <small>Error message</small>
                            </div>
                        </div>

                        <div class="form-group row d-flex justify-content-around">
                            <div class="col-sm-6 mb-3 mb-sm-0">
                                <input type="text" class="form-control " name="direccion" id="idDireccion" value="<%=request.getParameter("direccion")%>">
                                <small>Error message</small>
                            </div>
                            <div class="col-sm-6">
                                <input type="text" class="form-control " name="telefono" id="idTelefono" value="<%=request.getParameter("telefono")%>">
                                <small>Error message</small>
                            </div>
                        </div>
                        <div class="form-group">
                            <input type="email" class="form-control " name="email" id="idEmail" value="<%=request.getParameter("email")%>">
                            <small>Error message</small>
                        </div>

                        <div class="form-group row d-flex justify-content-around">
                            <div class="col-sm-6 mb-3 mb-sm-0">
                                <input type="text" class="form-control " name="fechaNacimiento" id="idFecha" value="<%=request.getParameter("fechaNacimiento")%>" >
                                <small>Error message</small>
                            </div>
                            <div class="col-sm-6">
                                <input type="password" class="form-control " name="password" id="idPass" value="<%=request.getParameter("password")%>" >
                                <small>Error message</small>
                            </div>
                        </div>

                        <input type="submit" class="btn btn-primary btn-user btn-block" value="Actualizar">

                    </form>
                </div>
            </div>
            <!-- ---------------------------------------------------------------------------------------- -->            
            <div class="container">
                <form action="/booktripV/consultarUser" method = "post" >
                    <div class="row justify-content-md-center">
                        <div id="Listado" class="bd-example">

                            <div id="ControlRegistro" class="input-group">

                                <input id ="txt_Id_Consultado" type = "text" class="form-control"
                                       name= "IdConsultado" value="<%=buscando%>" autofocus
                                       placeholder="Buscar"/>
                                <button type="button" class="btn btn-primary" data-toggle="dropdown"
                                        aria-haspopup="true" aria-expanded="false"
                                        onClick="realizarBusqueda()">Buscar</button>
                            </div>
                            <br>
                            <div>
                                <h1>Listado Usuarios</h1>
                                <br>
                                <div id="Tabla_Usuarios"></div>
                                <%
                                    usuarioDao userC = new usuarioDao();
                                    ArrayList<usuario> listadoUsuarios = new ArrayList<usuario>();
                                    listadoUsuarios = userC.ListadoUsuarios(buscando, buscando, buscando);
                                    out.println("<table class='table table-bordered table-responsive' id='dataTable'><tr><td>IdUsuario</td><td>IdTipoDeDocumento</td><td>IdRol</td><td>Nombre</td >"
                                            + "<td>Apellidos</td ><td>Direccion</td ><td>Telefono</td >"
                                            + "<td>Email</td ><td>Editar</td > <td>Eliminar</td ></tr>");
                                    for (usuario u : listadoUsuarios) {
                                        out.println("<tr>");
                                        out.println("<td>" + u.getIdUsuario() + "</td>");
                                        out.println("<td>" + u.getIdTipoDocumento() + "</td>");
                                        out.println("<td>" + u.getIdRol() + "</td>");
                                        out.println("<td>" + u.getNombre() + "</td>");
                                        out.println("<td>" + u.getApellido() + "</td>");
                                        out.println("<td>" + u.getDireccion() + "</td>");
                                        out.println("<td>" + u.getTelefono() + "</td>");
                                        
                                        out.println("<td>" + u.getEmail() + "</td>");
                                       
                                        
                                        out.println("<td>" + "<input type = 'submit' class='btn btn-warning form-control btn btn-login' value='Actualizar' name ='Actualizar' onclick ='SetIdConsulta(" + u.getIdUsuario() + ")'/>" + "</td>");

                                        out.println("<td>" + "<input type = 'submit' class='btn btn-danger form-control btn btn-login' value= 'Eliminar' name='Eliminar' onclick='SetIdConsulta(" + u.getIdUsuario() + ")'/>" + "</td>");
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
</body>