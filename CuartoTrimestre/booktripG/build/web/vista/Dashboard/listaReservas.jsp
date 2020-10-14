<%@page import="modelo.reservas"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.reservasDAO"%>
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
        <div class="align-items-center justify-content-between mb-4">

            <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm mr-3"> Lista de pago</a>
            <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-warning shadow-sm"> Actualizar pago</a>

        </div>


        <div class="contenedor">

            <h1> Lista Reservas</h1>

            <!--    PARTE DE ACTUALIZAR          -->











            <!--    PARTE DE LISTAR          -->


            <div class="container">
                <form action="/booktripG/consultarReservas" method = "post" >
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

                                <br>
                                <div id="Tabla_Usuarios"></div>
                                <%
                                    reservasDAO reservasC = new reservasDAO();
                                    ArrayList<reservas> milistareservas = new ArrayList<reservas>();
                                    milistareservas = reservasC.ConsultarListadoReservas(buscando);
                                    out.println("<table class='table table-responsive' id='dataTable'><tr><thead class='thead-dark'><tr><th>IdReserva</th><th>IdUsuario</th><th>IdInmueble</th><th>IdEstado</th>"
                                            + "<th >FechaReserva</th><th>CheckIn</th><th>CheckOut</th>"
                                            + "<th >Editar </th> <th >Eliminar </th></tr></thead>");

                                    for (reservas p : milistareservas) {
                                        out.println("<tr>");
                                        out.println("<td>" + p.getIdReserva() + "</td>");
                                        out.println("<td>" + p.getIdUsuario() + "</td>");
                                        out.println("<td>" + p.getIdInmueble() + "</td>");
                                        out.println("<td>" + p.getIdEstado() + "</td>");
                                        out.println("<td>" + p.getFechaReserva() + "</td>");
                                        out.println("<td>" + p.getCheckIn() + "</td>");
                                        out.println("<td>" + p.getCheckOut() + "</td>");

                                        out.println("<td>" + "<input type = 'submit' class='btn btn-warning form-control btn btn-login' value='Actualizar' name ='Actualizar' onclick ='SetIdConsulta(" + p.getIdReserva() + ")'/>" + "</td>");

                                        out.println("<td>" + "<input type = 'submit' class='btn btn-danger form-control btn btn-login' value= 'Eliminar' name='Eliminar' onclick='SetIdConsulta(" + p.getIdReserva() + ")'/>" + "</td>");
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