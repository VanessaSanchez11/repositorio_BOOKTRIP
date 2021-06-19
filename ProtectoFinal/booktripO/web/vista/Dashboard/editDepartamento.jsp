
<%@page import="controlador.departamentosDAO"%>
<%@page import="modelo.departamento"%>
<%@include file="header.jsp" %>
<%@include file="sidebar.jsp" %>
<%@include file="content.jsp" %>
<%@include file="realContent.jsp" %>
<center>
         
    <div class="container">
            
             <div class="container  col-md-6 mt-5 bg-light">
        <center>
        <h3>Actualizar Departamento</h3>
        <hr>
        <br>
        <form action="/booktripO/controllerDepartamento" method="POST" >
           
           
            <div col-md-6>
                <div col-md-3><label>Nombre:</label></div>
                <div col-md-3>
                    <input type="text" name="txtNom" value="${dato.getNombre()}">
                    <input type="text" name="id" value="${dato.getIdDepartamento()}">
                </div>
            </div>
   
            <div col-md-6>
                <div col-md-3><input type="submit" name="accion" value="Actualizar"  class="btn btn-success btn-block mt-1" onclick="VolverADepartamentos()" ></div>
                    <div col-md-3> <input type="submit" name="accion" value="Regresar" class="btn btn-danger btn-block mt-1 my-4" onclick="VolverADepartamentos()" ></div>
                </div>
                
        </form>
    </center>
            </div>
            </div>
</center>

<%@include file="footer.jsp" %>
