
<%@page import="modelo.estados"%>
<%@page import="controlador.estadosDAO"%>
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
                    <h1>Aqui puede Actualizar su estado</h1>
                    <form action="/booktripPLaces/actualizarEstado" method= "post" >
                        
                        <div class="form-group row d-flex justify-content-around">
                            <div class="col-sm-6 mb-3 mb-sm-0 ">
                                <input type="text" class="form-control  " name="idEstado" id="idEstado" value="<%=request.getParameter("idEstado")%>">
                                
                            </div>
                            <div class="col-sm-6">
                                <input type="text" class="form-control " name="nombre" id="nombre" value="<%=request.getParameter("apellido")%>">
                                
                            </div>
                        </div>

                       

                        <input type="submit" class="btn btn-primary btn-user btn-block" value="Actualizar">

                    </form>
                </div>
            </div>
            <!-- ---------------------------------------------------------------------------------------- -->            
            <div class="container">
                <form action="listarEstado" method = "post" >
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
                                    estadosDAO estadosC = new estadosDAO();
                                    ArrayList<estados> milistaestado = new ArrayList<estados>();
                                    milistaestado = estadosC.ConsultarListadoEstado(buscando);
                                    out.println("<table class='table table-bordered table-responsive' id='dataTable'><tr><td>IdEstado</td><td>Nombre</td>"
                                             + "<td>Editar</td > <td>Eliminar</td ></tr>");
                                    for (estados u : milistaestado) {
                                        out.println("<tr>");
                                        out.println("<td>" + u.getIdEstado() + "</td>");
                                        out.println("<td>" + u.getNombre() + "</td>");
                             
                                       
                                        
                                        out.println("<td>" + "<input type = 'submit' class='btn btn-warning form-control btn btn-login' value='Actualizar' name ='Actualizar' onclick ='SetIdConsulta(" + u.getIdEstado() + ")'/>" + "</td>");

                                        out.println("<td>" + "<input type = 'submit' class='btn btn-danger form-control btn btn-login' value= 'Eliminar' name='Eliminar' onclick='SetIdConsulta(" + u.getIdEstado() + ")'/>" + "</td>");
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