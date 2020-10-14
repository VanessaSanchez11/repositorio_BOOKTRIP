<%@page import="modelo.servicios"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.serviciosDAO"%>
<body onload="visualizaOcultaServicios('<%=request.getParameter("Vista")%>');">
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

        <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm  mr-3"> Lista de servicio</a>
        <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-warning shadow-sm"> Actualizar servicio</a>
        <a href="indexServiciosCrear.jsp" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm ml-3"> Crear servicio</a>


    </div>


    <div class="contenedor">

        <h1> Lista Servicios</h1>
        
        <!--    PARTE DE ACTUALIZAR          -->
        
        
        
        
        
        
        
        
        
        <!--    PARTE DE LISTAR          -->
        
        <div class="container">
                <form action="/booktripG/consultarServicios" method = "post" >
                    <div class="row justify-content-md-center">
                        <div id="Listado" class="bd-example">

                            <div id="ControlRegistro" class="input-group">

                                <input id ="txt_Id_Consultado" type = "text" class="form-control"
                                       name= "IdConsultado" value="<%=buscando%>" autofocus
                                       placeholder="Buscar"/>
                                <button type="button" class="btn btn-primary" data-toggle="dropdown"
                                        aria-haspopup="true" aria-expanded="false"
                                        onClick="realizarBusquedaServicios()">Buscar</button>
                            </div>
                            <br>
                            <div>
                               
                                <br>
                                <div id="Tabla_Usuarios"></div>
                                <%
                                    serviciosDAO servicioC = new serviciosDAO();
                                    ArrayList<servicios> milistaservicios = new ArrayList<servicios>();
                                    milistaservicios = servicioC.ConsultarListadoServicios(buscando, buscando);
                                    out.println("<table class='table table-responsive' id='dataTable'><tr><thead class='thead-dark'><tr><th>IdServicio</th><th>Nombre</th><th>Descripcion</th>"
                                            + "<th >Editar </th> <th >Eliminar </th></tr></thead>");

                                    for (servicios p : milistaservicios) {
                                        out.println("<tr>");
                                        out.println("<td>" + p.getIdServicio() + "</td>");
                                        out.println("<td>" + p.getNombre() + "</td>");
                                        out.println("<td>" + p.getDescripcion() + "</td>");
                                       
                                        out.println("<td>" + "<input type = 'submit' class='btn btn-warning form-control btn btn-login' value='Actualizar' name ='Actualizar' onclick ='SetIdConsulta(" + p.getNombre() + ")'/>" + "</td>");
                                        out.println("<td>" + "<input type = 'submit' class='btn btn-danger form-control btn btn-login' value= 'Eliminar' name='Eliminar' onclick='SetIdConsulta(" + p.getNombre() + ")'/>" + "</td>");
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
