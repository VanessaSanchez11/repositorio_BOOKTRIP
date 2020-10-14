
<%@page import="modelo.municipios"%>
<%@page import="controlador.municipiosDAO"%>
<%@page import="java.util.ArrayList"%>


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


        </div>
        <div class=" justify-content-end align-items-center justify-content-between mb-4">
            <a href="indexListaMunicipios.jsp" class="d-none d-sm-inline-block btn  btn-primary shadow-sm Z"> Lista de documentos</a>
            <a href="indexMunicipios.jsp" class="d-none d-sm-inline-block btn btn-success shadow-sm"> Crear tipo de documento</a>
            <button type="button" class="d-none d-sm-inline-block btn btn-warning shadow-sm ml-3" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" onClick="visualizaOcultaTipoD('Actualizar')">Actualizar documento</button>

        </div>


        <div class="contenedor">

            <h1 class="mb-5">Lista de documentos</h1>

                    <div class="row justify-content-md-center">

                        <div id="Actualizar" class="bd-example d-none ">
                            <h1>Aqui puede Actualizar su usuario</h1>
                            <form action="/booktripV/actualizarDocumento" id="form" class="formu" method="post" onsubmit=" return checkInputsNombre();">
                                <label for="exampleFormControlInput1">Nombre del rol</label>
                                <div class="form-group col-sm-5">

                                    <input type="text" class="form-control " name="nombre" id="idNombre" value="<%=request.getParameter("nombre")%>">
                                    <small>Error message</small>
                                    <br>
                                    <input type="submit" class="btn btn-primary btn-user btn-block" value="Actualizar">
                                    <!-- <button type="submit" class="btn btn-primary btn-sm botonRegistro">Registrar</button> -->
                                </div>

                            </form>
                        </div>
                    </div>
<!--   ------------------------------------------------------LISTAR------------------------------------   -->
                    <form action="" method = "post" >
                        <div class="row justify-content-md-center">
                            <div id="Listado" class="bd-example">

                                <div id="ControlRegistro" class="input-group">

                                    <input id ="idMuni" type = "text" class="form-control"
                                           name= "IdConsultado" value="<%=buscando%>" autofocus
                                           placeholder="Buscar"/>
                                    <button type="button" class="btn btn-primary" data-toggle="dropdown"
                                            aria-haspopup="true" aria-expanded="false"
                                            onClick="realizarBusqueda()">Buscar</button>
                                </div>
                                <br>
                                <div>
                                    <h1>Listado Municipios</h1>
                                    <br>
                                    <div id="Tabla_Usuarios"></div>
                                    <%
                                        municipiosDAO muniC = new municipiosDAO();
                                        ArrayList<municipios> milistamunicipio = new ArrayList<municipios>();
                                        milistamunicipio = muniC.ConsularListaMunicipio(buscando);
                                        out.println("<table class='table table-bordered table-responsive' id='dataTable'><tr><td>Id Municipio</td><td>Id departamento</td><td>Nombre</td>"
                                                + "<td>Editar</td><td>Eliminar</td ></tr>");
                                        for (municipios m : milistamunicipio) {
                                            out.println("<tr>");
                                            out.println("<td>" + m.getIdMunicipio() + "</td>");
                                            out.println("<td>" + m.getIdDepartamento() + "</td>");
                                            out.println("<td>" + m.getNombre() + "</td>");
                                            out.println("<td>" + "<input type = 'submit' class='btn btn-warning form-control btn btn-login' value='Actualizar' name ='Actualizar' onclick ='SetIdConsulta(" + m.getNombre() + ")'/>" + "</td>");

                                            out.println("<td>" + "<input type = 'submit' class='btn btn-danger form-control btn btn-login' value= 'Eliminar' name='Eliminar' onclick='SetIdConsulta(" + m.getNombre() + ")'/>" + "</td>");
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