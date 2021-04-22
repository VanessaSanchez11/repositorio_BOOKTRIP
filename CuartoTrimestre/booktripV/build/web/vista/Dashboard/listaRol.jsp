<%@page import="modelo.rol"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.rolDAO"%>

<body   >
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
        <div class=" justify-content-end align-items-center justify-content-between mb-4">
            
            <a href="indexRolRegister.jsp" class="d-none d-sm-inline-block btn btn-success shadow-sm"> Crear rol</a>
            <button type="button" class="d-none d-sm-inline-block btn btn-primary shadow-sm ml-3" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" onClick="visualizaOcultaRol('Listado')">Lista de roles</button>
            <button type="button" class="d-none d-sm-inline-block btn btn-warning shadow-sm ml-3" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" onClick="visualizaOcultaRol('Actualizar')">Actualizar Rol</button>

        </div>


        <div class="contenedor">

            <h1>Lista</h1>

            <div class="row justify-content-md-center">

                <div id="Actualizar" class="bd-example d-none ">
                    <h1>Aqui puede actualizar su rol</h1>
                    <form action="/booktripV/actualizarRol" id="form" class="formu" method="post" onsubmit=" return checkInputsNombre();">
                        <label for="exampleFormControlInput1">Nombre del rol</label>
                        <div class="form-group col-sm-5">
                            
                            <input type="text" class="form-control d-none " name="idRol" id="idNombre" value="<%=request.getParameter("idRol")%>">
                            <input type="text" class="form-control " name="nombre" id="idNombre" value="<%=request.getParameter("nombre")%>">
                            <small>Error message</small>
                            <br>
                            <input type="submit" class="btn btn-primary btn-user btn-block" value="Actualizar">
                            <!-- <button type="submit" class="btn btn-primary btn-sm botonRegistro">Registrar</button> -->
                        </div>

                    </form>
                </div>
            </div>

            <form action="/booktripV/consultarRol" method = "post" >
                <div class="row justify-content-md-center">
                    <div id="Listado" class="bd-example">

                        <div id="ControlRegistro" class="input-group">

                            <input id ="idSearchRol" type = "text" class="form-control"
                                   name= "IdConsultado" value="<%=buscando%>" autofocus
                                   placeholder="Buscar"/>
                            <button type="button" class="btn btn-primary" data-toggle="dropdown"
                                    aria-haspopup="true" aria-expanded="false"
                                    onClick="realizarBusquedaRol()">Buscar</button>
                        </div>
                        <br>
                        <div>
                            <h1>Listado roles</h1>
                            <br>
                            <div id="Tabla_Usuarios"></div>
                            <%
                                rolDAO rolC = new rolDAO();
                                ArrayList<rol> listadoRol = new ArrayList<rol>();
                                listadoRol = rolC.ConsultarListadoRol(buscando);
                                out.println("<table class='table table-bordered table-responsive' id='dataTable'><tr><td>Id rol</td><td>Nombre</td>"
                                        + "<td>Editar</td > <td>Eliminar</td ></tr>");
                                for (rol r : listadoRol) {
                                    out.println("<tr>");
                                    out.println("<td>" + r.getIdRol() + "</td>");
                                    out.println("<td>" + r.getNombre() + "</td>");
                                    out.println("<td>" + "<input type = 'submit' class='btn btn-warning form-control btn btn-login' value='Actualizar' name ='Actualizar' onclick ='SetIdConsultaRol(" + r.getIdRol() + ")'/>" + "</td>");

                                    out.println("<td>" + "<input type = 'submit' class='btn btn-danger form-control btn btn-login' value= 'Eliminar' name='Eliminar' onclick='SetIdConsultaRol(" + r.getIdRol() + ")'/>" + "</td>");
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
</body>