<%@page import="modelo.usuario"%>
<%@page import="controlador.usuarioDao"%>
<%@page import="modelo.inmuebles"%>
<%@page import="controlador.inmueblesDAO"%>
<%@page import="modelo.pagos"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.pagosDAO"%>
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

            <button type="button" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" onClick="visualizaOculta('Listado')">Listado Pagos</button>
            <button type="button" class="d-none d-sm-inline-block btn btn-sm btn-warning shadow-sm" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" onClick="visualizaOculta('Actualizar')">Actualizar Pagos</button>

        </div>


        <div class="contenedor">

            <h1> Lista Pagos</h1>

            <!--    PARTE DE ACTUALIZAR          -->

            <div class="row justify-content-md-center">

                <div id="Actualizar" class="bd-example d-none ">
                    <h1>Actualize su Pago</h1>
                    <form action="/booktripG/actualizarPagos" method= "post" >
                        <div class="form-group row cajaCombobox">
                            
                            <div class="col-sm-6 mb-3 mb-sm-0 ">
                                <input id="idUsuario" type="text" class="form-control d-none " name="idUsuario" value="<%=request.getParameter("idUsuario")%>">
                                <%
                                    usuarioDao miUsuario = new usuarioDao();
                                    ArrayList<usuario> ListadoUsuarios = miUsuario.ListadoUsuarios("");
                                    out.println("<select class='form-control' id='selectInmuebles' size='1' onchange='setIdTipoA()'>");
                                    out.println("<option value=''>" + "--Seleccione--" + "</option>");
                                    for (usuario t : ListadoUsuarios) {
                                        out.println("<option value='" + t.getIdUsuario()+ "'>" + t.getNombre() + "</option>");
                                    }
                                    out.println("</select>");

                                %>
                                </div>
                             
                          
                            <div class="col-sm-6 mb-3 mb-sm-0 ">

                                <input id="idInmuebleAct" type="text" class="form-control d-none" name="idInmueble" value="<%=request.getParameter("idInmueble")%>">
                                <%
                                    inmueblesDAO miinmueble = new inmueblesDAO();
                                    ArrayList<inmuebles> ConsultarListadoInmueble = miinmueble.ConsultarListadoInmueble("");
                                    out.println("<select class='form-control' id='selectInmuebles' size='1' onchange='setIdTipoA()'>");
                                    out.println("<option value=''>" + "--Seleccione--" + "</option>");
                                    for (inmuebles t : ConsultarListadoInmueble) {
                                        out.println("<option value='" + t.getIdInmueble()+ "'>" + t.getNombre() + "</option>");
                                    }
                                    out.println("</select>");

                                %>

                            </div>
                           
                        </div>
                        <div class="form-group row d-flex justify-content-around">
                            <div class="col-sm-6 mb-3 mb-sm-0 ">
                                <input type="text" class="form-control  " name="adjunto" id="txtAdjunto" value="<%=request.getParameter("adjunto")%>">
                                <small>Error message</small>
                            </div>
                            <div class="col-sm-6">
                                <input type="text" class="form-control " name="monto" id="txtMonto" value="<%=request.getParameter("monto")%>">
                                <small>Error message</small>
                            </div>
                        </div>

                        <div class="form-group row d-flex justify-content-around">
                            <div class="col-sm-6 mb-3 mb-sm-0">
                                <input type="text" class="form-control " name="fechaPago" id="txtFechapago" value="<%=request.getParameter("fechaPago")%>">
                                <small>Error message</small>
                            </div>
                            <div class="col-sm-6">
                                <input type="text" class="form-control " name="fechaPago2" id="txtFechaPago2" value="<%=request.getParameter("fechaPago2")%>">
                                <small>Error message</small>
                            </div>
                        </div>
                        

                        <input type="submit" class="btn btn-primary btn-user btn-block" value="Actualizar">

                    </form>
                </div>
            </div>



            <!--    PARTE DE LISTAR          -->


            <div class="container">
                <form action="/booktripG/consultarPagos" method = "post" >
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
                                    pagosDAO pagosC = new pagosDAO();
                                    ArrayList<pagos> milistapagos = new ArrayList<pagos>();
                                    milistapagos = pagosC.ConsultarListadoPagos(buscando);
                                    out.println("<table class='table table-responsive' id='dataTable'><tr><thead class='thead-dark'><tr><th>IdPagos</th><th>IdUsuario</th><th>IdInmueble</th><th>Adjunto</th>"
                                            + "<th >Monto</th><th>FechaPago</th><th>FechaPago2</th>"
                                            + "<th >Editar </th> <th >Eliminar </th></tr></thead>");

                                    for (pagos p : milistapagos) {
                                        out.println("<tr>");
                                        out.println("<td>" + p.getIdPago() + "</td>");
                                        out.println("<td>" + p.getIdUsuario() + "</td>");
                                        out.println("<td>" + p.getIdInmueble() + "</td>");
                                        out.println("<td>" + p.getAdjunto() + "</td>");
                                        out.println("<td>" + p.getMonto() + "</td>");
                                        out.println("<td>" + p.getFechaPago() + "</td>");
                                        out.println("<td>" + p.getFechaPago2() + "</td>");

                                        out.println("<td>" + "<input type = 'submit' class='btn btn-warning form-control btn btn-login' value='Actualizar' name ='Actualizar' onclick ='SetIdConsulta(" + p.getIdPago()+ ")'/>" + "</td>");

                                        out.println("<td>" + "<input type = 'submit' class='btn btn-danger form-control btn btn-login' value= 'Eliminar' name='Eliminar' onclick='SetIdConsulta(" + p.getIdPago()+ ")'/>" + "</td>");
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