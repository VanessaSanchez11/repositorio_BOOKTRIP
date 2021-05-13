<%@page import="modelo.inmuebles"%>
<%@page import="controlador.inmueblesDAO"%>
<%@page import="modelo.usuario"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.usuarioDao"%>
<%@page import="controlador.estadosDAO"%>
<%@page import="modelo.estados"%>
<%@include file="header.jsp" %>
<%@include file="sidebar.jsp" %>
<%@include file="content.jsp" %>
<%@include file="realContent.jsp" %>
<center>
         
    <div class="container">
            
             <div class="container  col-md-6 mt-5 bg-light">
        <center>
        <h3>Actualizar estado</h3>
        <hr>
        <br>
        <form action="controllerReserva" method="POST">
            
          
            <label>id usuario</label>
             <div class="col-sm-6">
               
                        <%
                            usuarioDao miusuarioDAO = new usuarioDao();
                            ArrayList<usuario>  listausuario = miusuarioDAO.ListadoUsuarios("");
                        %> 
                        <select name="txtUsuario">
                            <%
                        for (usuario i : listausuario) {%>
                            <option value="<%=i.getIdUsuario()%>"><%=i.getNombre()%> </option>
                            <%
                                }
                            %>
                        </select>

                    </div>
                        <label>id inmueble</label>
            <div class="col-sm-6">
               
                        <%
                            inmueblesDAO miinmuebleDAO = new inmueblesDAO();
                            ArrayList<inmuebles>  listainmueble = miinmuebleDAO.ConsultarListadoInmueble("");
                        %> 
                        <select name="txtInmueble">
                            <%
                        for (inmuebles i : listainmueble) {%>
                            <option value="<%=i.getIdInmueble()%>"><%=i.getNombre()%> </option>
                            <%
                                }
                            %>
                        </select>

                    </div>
                    
            
            <label>id estado</label>
            <div class="col-sm-6">
               
                        <%
                            estadosDAO miestadoDAO = new estadosDAO();
                            ArrayList<estados>  listaestado = miestadoDAO.ConsultarListadoEstados("");
                        %> 
                        <select name="txtEstado">
                            <%
                        for (estados i : listaestado) {%>
                            <option value="<%=i.getIdEstado()%>"><%=i.getNombre()%> </option>
                            <%
                                }
                            %>
                        </select>

                    </div>
                        <div class="col-sm-6">
                             <label>fecha</label>
            <input type="text" name="txtFechaReserva" value="${dato.getFechaReserva()}">
           
            
                        </div>
             <div class="col-sm-6">
                             <label>fecha</label>
            <input type="text" name="txtCheckIn" value="${dato.getCheckIn()}">
           
            
                        </div>
            
             <div class="col-sm-6">
                             <label>fecha</label>
            <input type="text" name="txtCheckOut" value="${dato.getCheckOut()}">
           
            
                        </div>
            
            
            
            
            
            
            <input type="hidden" name="id" value="${dato.getIdReserva()}">
            
            <input type="submit" name="accion" value="Actualizar" class="btn btn-success btn-block mt-1">
            <input type="submit" name="accion" value="Regresar" class="btn btn-danger btn-block mt-1">
        </form>
    </center>
            </div>
            </div>
</center>

<%@include file="footer.jsp" %>
