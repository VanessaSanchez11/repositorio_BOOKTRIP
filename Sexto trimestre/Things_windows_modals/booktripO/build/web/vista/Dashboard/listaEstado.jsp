

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

<%@page import="controlador.estadosDAO"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="modelo.estados"%>


    <body onload="myFunction();">
       
    <center> <div class="col-md-6">
            <form action="/booktripO/controllerEstado" method="POST"  onsubmit="return validarEstado()">
                
                <a href="#" name="accion" value="Listar" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"onclick="myFunctionB1()"> Listar</a>
                 <button type="button" name="accion" value="Nuevo"class="d-none d-sm-inline-block btn btn-sm btn-success shadow-sm" data-bs-toggle="modal" data-bs-target="#Registrar" data-bs-whatever="@mdo">Nuevo</button>
                       <a href="#" name="accion" id="btnPrueba"class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm" onclick="VolverAEstados()"> prueba</a> 
            </form>
           
        </div>
        
        <div class="principal" id="Listado">
            
        <div class="fondo container my-10 buscar">
            
       
        <hr>
        <center>
        <div>
        <h1>lista de estados</h1>
        
<table class="bg-light table table-bordered dataTables-example">
                        <thead>
                            <tr>
                                <th>ID</th>
                                <th>NOMBRE</th>
                                <th>ACCIONES</th>
                            </tr>
                        </thead>
                        <tbody style="height: 10px;">
                            <% estadosDAO dao = new estadosDAO();
                                List<estados> list = dao.listar();
                                Iterator<estados> ite = list.iterator();
                                estados e = null;
                                while (ite.hasNext()) {
                                    e = ite.next();

                            %>
           
                            <tr>
                                <td style="padding-left:25px;"><%= e.getIdEstado()%></td>
                                <td style="padding-left:25px;"><%= e.getNombre()%></td>

                                <td style="padding-left:25px;">
                                    
                                    
                                   <button type="button" name="accion" value="Editar"class="d-none d-sm-inline-block btn btn-sm btn-success shadow-sm btn-block" data-bs-toggle="modal" data-id="<%= e.getIdEstado()%>" data-bs-target="#Actualizar" data-bs-whatever="@mdo"><i class="fas fa-edit">Editar</i></button>
                                    <a href="controllerEstado?accion=Delete&idd=<%=e.getIdEstado()%>"> <input type="submit" name="accion" value="Delete" id="idd"class="btn-danger btn-block"onsubmit="return confirmacion()"></a>
                                    </form
                                </td>
                            </tr>
                            <%}%>
                        </tbody>
                    </table>

        </div>
                                            </center>
    </div>
            </div>
            
            
                        <div class="modal fade" id="Registrar" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
       <h5 class="modal-title" id="exampleModalLabel">Registrar estado</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <div class="modal-body">
          <form id="formularioEstado" action="/booktripO/controllerEstado"
                <div col-md-6>
                    <div col-md-3><label>Nombre:</label></div>
                    <div col-md-3><input type="text" name="txtNom" id="txtNom"> </div>
                   
                </div>
                 <div class="modal-footer">
        <div col-md-3><input  type="submit" name="accion" value="Guardar"
                                         class=" btn btn-success btn-block mt-1" onclick="VolverAEstados()"></div>
                    <div col-md-3> <input type="submit" name="accion"  data-bs-dismiss="modal" value="Regresar" class="btn btn-danger btn-block mt-1 my-4"></div>
      </div>
      </form>
      </div>
     
    </div>
  </div>
</div>
  <div class="modal fade" id="Actualizar" tabindex="<%= e.getIdEstado()%>" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
       <h5 class="modal-title" id="exampleModalLabel">Actualizar estado</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div
      <div class="modal-body">
          <form id="formularioEstado" action="/booktripO/controllerEstado"
                <div>
                <div col-md-3><label>Nombre:</label></div>
                       
                            <input type="text" name="txtNom" value="<%= e.getNombre()%>">
                            <input type="hidden" name="id" id="id" value="<%= e.getIdEstado()%>">
                        </div>
                 <div class="modal-footer">
        <div col-md-3><a href="indexListaEstado"><input id="btnActualizar" type="submit" name="accion" value="Actualizar"
                                         class=" btn btn-success btn-block mt-1"onclick="VolverAEstados()" ></a></div>
                    <div col-md-3> <input type="submit" name="accion"  data-bs-dismiss="modal" value="Regresar" class="btn btn-danger btn-block mt-1 my-4"></div>
      </div>
               </div>         
      </form>
                       
           </div>
      </div>
     
    </div>
  </div>
</div>  
                
                

            
            
          
