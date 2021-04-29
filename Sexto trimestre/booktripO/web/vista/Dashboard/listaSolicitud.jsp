
<%@page import="modelo.estados"%>
<%@page import="modelo.usuario"%>
<%@page import="controlador.usuarioDao"%>
<%@page import="modelo.inmuebles"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.inmueblesDAO"%>
<%@page import="modelo.solicitudinmuebles"%>
<%@page import="controlador.solicitudinmueblesDAO"%>
<%@page import="controlador.estadosDAO"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="controlador.Conexion"%>
<%
/* Evitamos que la página se guarde en el caché del navegador y en los proxys */
response.setHeader("Cache-Control","no-store"); //HTTP 1.1
response.setHeader("Pragma","no-cache"); //HTTP 1.0
response.setDateHeader("Expires", 0); // prevents caching at the proxy server
%>


<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>



    <body onload="myFunction();">
       
    <center> <div class="col-md-6">
            <form action="/booktripO/controllerSolicitud" method="POST"  onsubmit="return validarEstado()">
                
                <a href="#" name="accion" value="Listar" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"onclick="myFunctionB1()"> Listar</a>
                <a href="#" name="accion" value="Nuevo" class="d-none d-sm-inline-block btn btn-sm btn-success shadow-sm" onclick="myFunctionB2()"> Nuevo</a>
            </form>
            
        </div>
        
        <div class="principal" id="Listado">
            
        <div class="fondo container my-10 buscar">
            
       
        <hr>
        <center>
        <div>
        <h1>lista de solicitudes</h1>
        
<table class="bg-light table table-bordered dataTables-example">
                        <thead>
                    <tr>
                        <th>ID</th>
                        <th>inmueble</th>
                        <th>Usuario</th>
                         <th>Estado</th>
                          <th>fecha</th>
                        <th>ACCIONES</th>
                    </tr>
                </thead>
                        <% 
                    solicitudinmueblesDAO dao=new solicitudinmueblesDAO();
                    List<solicitudinmuebles>lista=dao.listar();
                request.setAttribute("lista", lista);%>
                        <tbody style="height: 10px;">
                         
                    <c:forEach var="dato" items="${lista}">
                        <tr>
                            <td style="padding-left:25px;">${dato.getIdSolicitud()}</td>
                            <td style="padding-left:25px;">${dato.getIdInmueble()}</td>
                            <td style="padding-left:25px;">${dato.getIdUsuario()}</td>
                            <td style="padding-left:25px;">${dato.getIdEstado()}</td>
                            <td style="padding-left:25px;">${dato.getFecha()}</td>
                            <td style="padding-left:25px;">
                                <form action="/booktripO/controllerSolicitud" method="POST">
                                    <input type="hidden" name="id" value="${dato.getIdSolicitud()}">
                                    <input type="submit" name="accion" value="Editar" class="btn-success btn-block my-1">
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
            <h3>Agregar nueva solicitud</h3>
            <hr>
            <br>
           
        <form action="/booktripO/controllerSolicitud" method="POST" onsubmit="return validarSolicitud()">
            <label>inmueble</label>

          <div class="col-sm-6">
               
                        <%
                            inmueblesDAO miinmuebleDAO = new inmueblesDAO();
                            ArrayList<inmuebles>  listainmueble = miinmuebleDAO.ConsultarListadoInmueble("");
                        %> 
                        <select name="txtInmueble">
                             <option value="">--selecione el inmubele-- </option>
                            <%
                        for (inmuebles i : listainmueble) {%>
                            <option value="<%=i.getIdInmueble()%>"><%=i.getNombre()%> </option>
                            <%
                                }
                            %>
                        </select>

                    </div>
                 <label>usuario</label>
             <div class="col-sm-6">
               
                        <%
                            usuarioDao miusuarioDAO = new usuarioDao();
                            ArrayList<usuario>  listausuario = miusuarioDAO.ListadoUsuarios("");
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
                     
  

                       <label>estado</label>
                      <div class="col-sm-6">

                        <%
                            estadosDAO miestadoDAO = new estadosDAO();
                            ArrayList<estados>  listaestado = miestadoDAO.ConsultarListadoEstados("");
                        %> 
                        <select name="txtEstado">
                             <option value="">--seleccione el estado-- </option>
                            <%
                        for (estados i : listaestado) {%>
                            <option value="<%=i.getIdEstado()%>"><%=i.getNombre()%> </option>
                            <%
                                }
                            %>
                        </select>

                    </div>

                       <div>     
                    <label>fecha</label>
                    <input type="text" name="txtFecha" required="">
                      </div>
<div>  
                    <input type="submit" name="accion" value="Guardar" class="btn-success btn-block">
                    <input type="submit" name="accion" value="Regresar" class="btn-danger btn-block">
                       </div>
                </form>
         </div>
          </div>
             </div>
            
            
          
