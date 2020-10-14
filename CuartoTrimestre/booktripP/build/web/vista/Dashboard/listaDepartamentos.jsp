

<%@page import="modelo.departamento"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.departamentosDAO"%>



<body onload="visualizaOcultaDepa('<%=request.getParameter("Vista")%>');">
    <% String buscando = request.getParameter("buscando");
        if (buscando == null) {
            buscando = "";
        }
    %>

    

        <!-- Page Heading -->
        <div class="d-sm-flex align-items-center justify-content-between mb-4">
            <h1 class="h3 mb-0 text-gray-800">Dashboard</h1>


        </div>
        <div class=" justify-content-end align-items-center justify-content-between mb-4">
            <a href="indexListaDepartamentos.jsp" class="d-none d-sm-inline-block btn  btn-primary shadow-sm Z"> Lista de los Departamentos</a>
            <a href="indexDepartamentos.jsp" class="d-none d-sm-inline-block btn btn-success shadow-sm"> registrar Departamento</a>
            <button type="button" class="d-none d-sm-inline-block btn btn-warning shadow-sm ml-3" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false" onClick="visualizaOcultaTipoD('Actualizar')">Actualizar Departamento</button>

        </div>
       <body onload="mueveReloj()" onload="visualizaOculta('<%=request.getParameter("Vista")%>');" >
        <% String buscando = request.getParameter("buscando");
        if (buscando == null) {
            buscando = "";
        }
        %>

            <div class="contenedor">

                <h1 class="mb-5">Atualiza el departameto aqui amigo </h1>

                <div class="row justify-content-md-center">

                    <div id="Actualizar" class="bd-example d-none ">

                        <form action="/booktripP/actualizarDepartamentos" id="form" class="formu" method="post" onsubmit=" return checkInputsNombre();">
                            <label for="exampleFormControlInput1">Nombre del Departamento</label>
                            <div class="form-group col-sm-5">

                                <input type="text" class="form-control " name="nombre" id="idNombre" value="<%=request.getParameter("nombre")%>">
                                <p>error</p>
                                    
                                <br>
                                <input type="submit" class="btn btn-primary btn-user btn-block" value="Actualizar">
                               
                            </div>

                        </form>
                    </div>
                </div>
                <!--   ------------------------------------------------------LISTAR------------------------------------   -->
                <form action="/booktripP/consultarDepartamentos" method = "post" >
                    
                    <div class="row justify-content-md-center">
                        <div id="Listado" class="bd-example">

                            <div id="ControlRegistro" class="input-group">

                                <input id ="idDepa" type = "text" class="form-control"
                                       name= "IdConsultado" value="<%=buscando%>" autofocus
                                       placeholder="Buscar"/>
                                <button type="button" class="btn btn-primary" data-toggle="dropdown"
                                        aria-haspopup="true" aria-expanded="false"
                                        onClick="realizarBusquedaDepa()">Buscar</button>
                            </div>
                            <br>
                            <div>
                                <h1>Listado Departamentos</h1>
                                <br>
                                <div id="Tabla_Usuarios"></div>
                                <%
                                    departamentosDAO DepaC = new departamentosDAO();
                                    ArrayList<departamento> milistadepartamento = new ArrayList<departamento>();
                                    milistadepartamento = DepaC.ConsularListaDepartamento(buscando);
                                    out.println("<table class='table table-bordered table-responsive' id='dataTable'><tr><td>Id Departamento</td><td>Nombre</td>"
                                            + "<td>Editar</td > <td>Eliminar</td ></tr>");
                                    for (departamento D : milistadepartamento) {
                                        out.println("<tr>");
                                        out.println("<td>" + D.getIdDepartamento() + "</td>");
                                        out.println("<td>" + D.getNombre() + "</td>");
                                        out.println("<td>" + "<input type = 'submit' class='btn btn-warning form-control btn btn-login' value='Actualizar' name ='Actualizar' onclick ='SetIdConsulta(" + D.getNombre() + ")'/>" + "</td>");
                                        out.println("<td>" + "<input type = 'submit' class='btn btn-danger form-control btn btn-login' value= 'Eliminar' name='Eliminar' onclick='SetIdConsulta(" + D.getIdDepartamento() + ")'/>" + "</td>");
                                        out.println("</tr>");
                                    }
                                    out.println("</table>");
                                %>
                            </div>
                        </div>
                    </div>
                </form>




            </div>

/div>
</body>
