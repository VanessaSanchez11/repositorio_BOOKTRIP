
<%@page import="modelo.actividades"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.actividadesDAO"%>
<body onload="visualizaOcultaActi  ('<%=request.getParameter("Vista")%>');">
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
            <a href="indexListaActividad.jsp" class="d-none d-sm-inline-block btn  btn-primary shadow-sm Z"> Lista de las Actividades</a>
            <a href="actividad.jsp" class="d-none d-sm-inline-block btn btn-success shadow-sm"> registrar Actividad</a>
            <button type="button" class="d-none d-sm-inline-block btn btn-warning shadow-sm ml-3" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" onClick="visualizaOcultaTipoD('Actualizar')">Actualizar Galeria</button>

        </div>


        <div class="contenedor">

            <h1 class="mb-5">Lista de las Actividades</h1>

                    <div class="row justify-content-md-center">

                        <div id="Actualizar" class="bd-example d-none ">
                            <form action="/booktripP/actualizarDocumento" id="form" class="formu" method="post" onsubmit=" return checkInputsNombre();">
                                <label for="exampleFormControlInput1">Nombre de la actividad</label>
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

                                    <input id ="idActi" type = "text" class="form-control"
                                           name= "IdConsultado" value="<%=buscando%>" autofocus
                                           placeholder="Buscar"/>
                                    <button type="button" class="btn btn-primary" data-toggle="dropdown"
                                            aria-haspopup="true" aria-expanded="false"
                                            onClick="realizarBusquedaActi()">Buscar</button>
                                </div>
                                <br>
                                <div>
                                    <h1>Listado Actividades</h1>
                                    <br>
                                    <div id="Tabla_Usuarios"></div>
                                    <%
                                        actividadesDAO ActiC = new actividadesDAO();
                                        ArrayList<actividades> milistaActividades = new ArrayList<actividades>();
                                        milistaActividades = ActiC.ConsularListaActividades(buscando);
                                        out.println("<table class='table table-bordered table-responsive' id='dataTable'><tr><td>Id Actividad</td><td>Id Municipio </td><td>nombre</td><td>lugar</td><td>descripcion</td>"
                                                + "<td>Editar</td > <td>Eliminar</td ></tr>");
                                        for (actividades A :milistaActividades) {
                                            out.println("<tr>");
                                            out.println("<td>" + A.getIdActividad() + "</td>");
                                            out.println("<td>" + A.getIdMunicipio() + "</td>");
                                            out.println("<td>" + A.getNombre() + "</td>");
                                            out.println("<td>" + A.getLugar() + "</td>");
                                            out.println("<td>" + A.getDescripcion() + "</td>");
                                            out.println("<td>" + "<input type = 'submit' class='btn btn-warning form-control btn btn-login' value='Actualizar' name ='Actualizar' onclick ='SetIdConsulta(" + A.getNombre() + ")'/>" + "</td>");
                                            out.println("<td>" + "<input type = 'submit' class='btn btn-danger form-control btn btn-login' value= 'Eliminar' name='Eliminar' onclick='SetIdConsulta(" + A.getNombre() + ")'/>" + "</td>");
                                            out.println("</tr>");
                                        }
                                        out.println("</table>");
                                    %>
                                </div>
                            </div>

