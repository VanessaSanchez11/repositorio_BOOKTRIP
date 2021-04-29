
<%@page import="modelo.estados"%>
<%@page import="controlador.estadosDAO"%>
<%@page import="modelo.usuario"%>
<%@page import="controlador.usuarioDao"%>
<%@page import="modelo.inmuebles"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.inmueblesDAO"%>
<%@include file="header.jsp" %>
<%@include file="sidebar.jsp" %>
<%@include file="content.jsp" %>
<%@include file="realContent.jsp" %>
<center>
         
    <div class="container">
            
             <div class="container  col-md-6 mt-5 bg-light">
        <center>
        <h3>Actualizar solicitud</h3>
        <hr>
        <br>
        <form action="controllerSolicitud" method="POST">
            <label>id inmueble</label>
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
          
            <label>id usuario</label>
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
                    
            
            <label>id estado</label>
            <div class="col-sm-6">
               
                        <%
                            estadosDAO miestadoDAO = new estadosDAO();
                            ArrayList<estados>  listaestado = miestadoDAO.ConsultarListadoEstados("");
                        %> 
                        <select name="txtEstado">
                              <option value="">--selecione el inmubele-- </option>
                            <%
                        for (estados i : listaestado) {%>
                            <option value="<%=i.getIdEstado()%>"><%=i.getNombre()%> </option>
                            <%
                                }
                            %>
                        </select>

                    </div>
            <label>fecha</label>
            <input type="text" name="txtFecha" value="${dato.getFecha()}">
            <input type="hidden" name="id" value="${dato.getIdSolicitud()}">
            
            <input type="submit" name="accion" value="Actualizar" class="btn btn-success btn-block mt-1">
            <input type="submit" name="accion" value="Regresar" class="btn btn-danger btn-block mt-1">
        </form>
    </center>
            </div>
            </div>
</center>

<%@include file="footer.jsp" %>
