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
       <form action="controllerPago" method="POST">

            <label>id usuario</label>
            <div class="col-sm-6">

                <%
                    usuarioDao miusuarioDAO = new usuarioDao();
                    ArrayList<usuario> listausuario = miusuarioDAO.ListadoUsuarios("");
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
                    ArrayList<inmuebles> listainmueble = miinmuebleDAO.ConsultarListadoInmueble("");
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
            <div col-md-6>
                <div col-md-3><label>Adjunto</label></div>
                <div col-md-3><input type="text" name="txtAdjunto"value="${dato.getAdjunto()}" id="txtAdjunto">
                </div>
            </div>  
            <div col-md-6>
                <div col-md-3><label>Monto</label></div>
                <div col-md-3><input type="text" name="txtMonto"value="${dato.getMonto()}" id="txtMonto">
                </div>
            </div> 
                

            <div col-md-6>
                <div col-md-3><label>fecha</label></div>
                <div col-md-3><input type="text" name="txtFechaPago"value="${dato.getFechaPago()}" id="txtPago1">
                </div>
            </div>  
                 <div col-md-6>
                <div col-md-3><label>fecha2</label></div>
                <div col-md-3><input type="text" name="txtFechaPago2" value="${dato.getFechaPago2()}" id="txtPago2">
                </div>
            </div>  



            <input type="hidden" name="id" value="${dato.getIdPago()}">
            <div col-md-6>
                <div col-md-3><input type="submit" name="accion" value="Actualizar" class="btn btn-success btn-block mt-1"></div>
                <div col-md-3> <input type="submit" name="accion" value="Regresar" class="btn btn-danger btn-block mt-1 my-4"></div>
            </div>

        </form>
    </center>
            </div>
            </div>
</center>

<%@include file="footer.jsp" %>
