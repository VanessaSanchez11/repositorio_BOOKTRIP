
<%@page import="modelo.departamento"%>
<%@page import="controlador.departamentosDAO"%>
<%@page import="modelo.tipoinmuebles"%>
<%@page import="controlador.tipoinmuebleDAO"%>
<%@page import="modelo.usuario"%>
<%@page import="controlador.usuarioDao"%>
<%@page import="modelo.estados"%>
<%@page import="controlador.estadosDAO"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="modelo.inmuebles"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.inmueblesDAO"%>
<%@page import="modelo.inmuebles"%>
<%@page import="controlador.inmueblesDAO"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="controlador.Conexion"%>
<%
    /* Evitamos que la página se guarde en el caché del navegador y en los proxys */
    response.setHeader("Cache-Control", "no-store"); //HTTP 1.1
    response.setHeader("Pragma", "no-cache"); //HTTP 1.0
    response.setDateHeader("Expires", 0); // prevents caching at the proxy server
%>

<%@page import="controlador.estadosDAO"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.estados"%>


<body onload="myFunction();">

<center> <div class="col-md-6">
        <form action="/booktripO/controllerInmueble" method="POST"  onsubmit="return validarEstado()">

            <a href="#" name="accion" value="Listar" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"onclick="myFunctionB1()"> Listar</a>
            <a href="#" name="accion" value="Nuevo" class="d-none d-sm-inline-block btn btn-sm btn-success shadow-sm" onclick="myFunctionB2()"> Nuevo</a>
        </form>

    </div>

    <div class="principal" id="Listado">

        <div class="fondo container my-10 buscar">


            <hr>
            <center>
                <div>
                    <h1>lista de inmuebles</h1>

                    <table class="bg-light table table-bordered dataTables-example">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>TIP</th>
                                <th>D/MENTO</th>
                                <th>U</th>
                                <th>ESTADO</th>
                                <th>NOMBRE</th>
                                <th>DIREC</th>
                                <th>#</th>
                                <th>DESCRIP</th> 
                                <th>PRECIO</th>
                                <th>ADJUNTO</th>
                                <th>ACCIONES</th>
                            </tr>
                        </thead>
                        <% 
                    inmueblesDAO dao=new inmueblesDAO();
                    List<inmuebles>lista=dao.listar();
                request.setAttribute("lista", lista);%>
                        <tbody style="height: 10px;">
                          <c:forEach var="dato" items="${lista}">
                                <tr>
                                    <td style="">${dato.getIdInmueble()}</td>
                                    <td style="">${dato.getIdTipo()}</td>
                                     <td style="">${dato.getIdDepartamento()}</td>
                                    <td style="">${dato.getIdUsuario()}</td>
                                    <td style="">${dato.getIdEstado()}</td>
                                    <td style="">${dato.getNombre()}</td>
                                    <td style="">${dato.getDireccion()}</td>
                                    <td style="">${dato.getCapacidad()}</td>
                                    <td style="">${dato.getDescripcion()}</td>
                                    <td style="">${dato.getPrecio()}</td>
                                     <td style="">${dato.getAdjunto()}</td>

                                    <td style="">
                                        <form action="/booktripO/controllerInmueble" method="POST">
                                            <input type="hidden" name="id" value="${dato.getIdInmueble()}">
                                            <input type="submit" name="accion" value="Editar" class="btn-success btn-block" >
                                            <input type="submit" name="accion" value="Delete" class="btn-danger btn-block" onclick="return confirm('Está seguro que deseas eliminar el registro?');">
                                        </form>
                                    </td>
                                </tr>
                            </c:forEach>
                        </tbody>
                    </table>

                </div>
            </center>
        </div>
    </div>


    <div class="principal" id="Registrar">
        <div class="container principal">

            <div class="container  col-md-6 mt-5 bg-light form-group">
                <h3>Agregar nuevo inmueble</h3>
                <hr>
                <br>
<form action="/booktripO/controllerInmueble" method="POST">
            <div class="col-sm-6">

                <%
                    tipoinmuebleDAO mitipoDAO = new tipoinmuebleDAO();
                    ArrayList<tipoinmuebles> listainmueble = mitipoDAO.ConsultarListadoTipos("");
                %> 
                <select name="txtTipo">
                     <option value="">--seleccione el inmueble </option>
                    <%
                                for (tipoinmuebles i : listainmueble) {%>
                    <option value="<%=i.getIdTipo()%>"><%=i.getNombre()%> </option>
                    <%
                        }
                    %>
                </select>

            </div>
              
            <div class="col-sm-6">

                <%
                    departamentosDAO midepartamentoDAO = new departamentosDAO();
                    ArrayList<departamento> listadepartamento = midepartamentoDAO.ConsularListaDepartamento("");
                %> 
                <select name="txtDepartamento">
                     <option value="">--seleccione el departamento </option>
                    <%
                                for (departamento i : listadepartamento) {%>
                    <option value="<%=i.getIdDepartamento()%>"><%=i.getNombre()%> </option>
                    <%
                        }
                    %>
                </select>

            </div>
                 <div class="col-sm-6">
               
                        <%
                            usuarioDao miusuarioDAO = new usuarioDao();
                            ArrayList<usuario>  listausuario = miusuarioDAO.ConsultarListadoUsuarios("");
                        %> 
                        <select name="txtUsuario">
                              <option value="">--selecione el usuario-- </option>
                            <%
                        for (usuario i : listausuario) {%>
                            <option value="<%=i.getIdUsuario()%>"><%=i.getNombre()%> </option>
                            <%
                                }
                            %>
                        </select>

                    </div>
            <div class="col-sm-6">

                <%
                    estadosDAO miestadoDAO = new estadosDAO();
                    ArrayList<estados> listaestado = miestadoDAO.ConsultarListadoEstados("");
                %> 
                <select name="txtEstado">
                     <option value="">--seleccione el estado </option>
                    <%
                                for (estados i : listaestado) {%>
                    <option value="<%=i.getIdEstado()%>"><%=i.getNombre()%> </option>
                    <%
                        }
                    %>
                </select>

            </div>
            <div class="col-sm-6">
                <label>Nombre</label>
                <input type="text" name="txtNombre" required="">
            </div>
                <div class="col-sm-6">
                <label>Direccion</label>
                <input type="text" name="txtDireccion" required="">
            </div>  
                <div class="col-sm-6">
                <label>Capacidad</label>
                <input type="text" name="txtCapacidad" required="">
            </div>  
                <div class="col-sm-6">
                <label>Descripcion</label>
                <input type="text" name="txtDescripcion" required="">
            </div>  
                <div class="col-sm-6">
                <label>Precio</label>
                <input type="text" name="txtPrecio" required="">
            </div>  
                
                
                <div class="col-sm-6">
                <label>Adjunto</label>
                <input type="file" name="txtAdjunto" required="">
            </div>  

            <input type="submit" name="accion" value="Guardar" class="btn-success btn-block">
            <input type="submit" name="accion" value="Regresar" class="btn-danger btn-block">
        </form>

                

            </div>
        </div>
    </div>



