<%@page import="modelo.puntuaciones"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.puntuacionesDAO"%>
<body onload="visualizaOcultaPuntuaciones('<%=request.getParameter("Vista")%>');">
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
        <div class="align-items-center justify-content-between mb-4">

            <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm  mr-3"> Lista de puntuacion</a>
            <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-warning shadow-sm"> Actualizar puntuacion</a>


        </div>


        <div class="contenedor">

            <h1> Lista Puntuaciones</h1>

            <!--    PARTE DE ACTUALIZAR          -->









            <!--    PARTE DE LISTAR          -->

            <div class="container">
                <form action="/booktripG/consultarPuntuaciones" method = "post" >
                    <div class="row justify-content-md-center">
                        <div id="Listado" class="bd-example">

                            <div id="ControlRegistro" class="input-group">

                                <input id ="txt_Id_Consultado" type = "text" class="form-control"
                                       name= "IdConsultado" value="<%=buscando%>" autofocus
                                       placeholder="Buscar"/>
                                <button type="button" class="btn btn-primary" data-toggle="dropdown"
                                        aria-haspopup="true" aria-expanded="false"
                                        onClick="realizarBusquedaPuntuaciones()">Buscar</button>
                            </div>
                            <br>
                            <div>

                                <br>
                                <div id="Tabla_Usuarios"></div>
                                <%
                                    puntuacionesDAO puntuacionesC = new puntuacionesDAO();
                                    ArrayList<puntuaciones> milistapuntuaciones = new ArrayList<puntuaciones>();
                                    milistapuntuaciones = puntuacionesC.ConsultarListadoPuntuaciones(buscando,buscando);
                                    out.println("<table class='table table-responsive' id='dataTable'><tr><thead class='thead-dark'><tr><th>IdPuntuacion</th><th>IdUsuario</th><th>IdInmueble</th><th>FechaCreada</th>"
                                            + "<th >Descripcion</th><th>Calificacion</th>"
                                            + "<th >Editar </th> <th >Eliminar </th></tr></thead>");

                                    for (puntuaciones p : milistapuntuaciones) {
                                        out.println("<tr>");
                                        out.println("<td>" + p.getIdPuntuacion() + "</td>");
                                        out.println("<td>" + p.getIdUsuario() + "</td>");
                                        out.println("<td>" + p.getIdInmueble() + "</td>");
                                        out.println("<td>" + p.getFechaCreada() + "</td>");
                                        out.println("<td>" + p.getDescripcion() + "</td>");
                                        out.println("<td>" + p.getCalificacion() + "</td>");

                                        out.println("<td>" + "<input type = 'submit' class='btn btn-warning form-control btn btn-login' value='Actualizar' name ='Actualizar' onclick ='SetIdConsulta(" + p.getIdPuntuacion() + ")'/>" + "</td>");

                                        out.println("<td>" + "<input type = 'submit' class='btn btn-danger form-control btn btn-login' value= 'Eliminar' name='Eliminar' onclick='SetIdConsulta(" + p.getIdPuntuacion() + ")'/>" + "</td>");
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