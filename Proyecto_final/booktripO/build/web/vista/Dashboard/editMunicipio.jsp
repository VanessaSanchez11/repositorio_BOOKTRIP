
<%@page import="controlador.municipiosDAO"%>
<%@page import="modelo.municipios"%>
<%@include file="header.jsp" %>
<%@include file="sidebar.jsp" %>
<%@include file="content.jsp" %>
<%@include file="realContent.jsp" %>
<center>
         
    <div class="container">
            
             <div class="container  col-md-6 mt-5 bg-light">
        <center>
        <h3>Actualizar Municipio</h3>
        <hr>
        <br>
         <form action="/booktripO/controllerMunicipio" method="POST"  onsubmit="return validar()" >
           
            <div col-md-6>
                <div col-md-3><label>Nombre:</label></div>
                <div col-md-3>
                    <input type="hidden" name="id" value="${dato.getIdDepartamento()}">
                    <input type="hidden" name="id" value="${dato.getIdMunicipio()}">
                    <input type="text" name="txtNom" value="${dato.getNombre()}">
                    
                </div>
            </div>
   
            <div col-md-6>
                <div col-md-3><input type="submit" name="accion" value="Actualizar"  class="btn btn-success btn-block mt-1" onclick="VolverAMunicipio()" ></div>
                    <div col-md-3> <input type="submit" name="accion" value="Regresar" class="btn btn-danger btn-block mt-1 my-4" onclick="VolverAMunicipio()" ></div>
                </div>
                
        </form>
    </center>
            </div>
            </div>
</center>

<%@include file="footer.jsp" %>


