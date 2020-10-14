
<%@page import="modelo.galeria"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.galeriasDAO"%>

<body onload="visualizaOcultaGale('<%=request.getParameter("Vista")%>');">
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
            <a href="indexListaGalerias.jsp" class="d-none d-sm-inline-block btn  btn-primary shadow-sm Z"> Lista de la Galeria</a>
            <a href="indexGalerias.jsp" class="d-none d-sm-inline-block btn btn-success shadow-sm"> registrar Galeria</a>
            <button type="button" class="d-none d-sm-inline-block btn btn-warning shadow-sm ml-3" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" onClick="visualizaOcultaTipoD('Actualizar')">Actualizar Galeria</button>

        </div>


        <div class="contenedor">

            <h1 class="mb-5">Lista de la Galeria</h1>

                    <div class="row justify-content-md-center">

                        <div id="Actualizar" class="bd-example d-none ">
                            <form action="/booktripP/actualizarDocumento" id="form" class="formu" method="post" onsubmit=" return checkInputsNombre();">
                                <label for="exampleFormControlInput1">Nombre de la imagen </label>
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

                                    <input id ="idGale" type = "text" class="form-control"
                                           name= "IdConsultado" value="<%=buscando%>" autofocus
                                           placeholder="Buscar"/>
                                    <button type="button" class="btn btn-primary" data-toggle="dropdown"
                                            aria-haspopup="true" aria-expanded="false"
                                            onClick="realizarBusquedaGale()">Buscar</button>
                                </div>
                                <br>
                                <div>
                                  
                                    <br>
                                    <div id="Tabla_Usuarios"></div>
                                    <%
                                        galeriasDAO GaleC = new galeriasDAO();
                                        ArrayList<galeria> milistagalerias = new ArrayList<galeria>();
                                        milistagalerias = GaleC.ConsularListaGaleria(buscando);
                                        out.println("<table class='table table-bordered table-responsive' id='dataTable'><tr><td>Id Galeria</td><td>Id Inmueble </td><td>Url </td>"
                                                + "<td>Editar</td > <td>Eliminar</td ></tr>");
                                        for (galeria G :milistagalerias) {
                                            out.println("<tr>");
                                            out.println("<td>" + G.getIdGaleria() + "</td>");
                                            out.println("<td>" + G.getIdInmueble() + "</td>");
                                            //out.println("<td>" + G.getImagen() + "</td>");
                                            out.println("<td>" + G.getUrl() + "</td>");
                                            out.println("<td>" + "<input type = 'submit' class='btn btn-warning form-control btn btn-login' value='Actualizar' name ='Actualizar' onclick ='SetIdConsulta(" + G.getIdGaleria() + ")'/>" + "</td>");
                                            out.println("<td>" + "<input type = 'submit' class='btn btn-danger form-control btn btn-login' value= 'Eliminar' name='Eliminar' onclick='SetIdConsulta(" + G.getIdGaleria() + ")'/>" + "</td>");
                                            out.println("</tr>");
                                        }
                                        out.println("</table>");
                                    %>
                                </div>
                            </div>
