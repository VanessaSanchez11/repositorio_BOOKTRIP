<%@page import="controlador.serviciosDAO"%>
<%@page import="modelo.servicios"%>
<%@include file="header.jsp" %>
<%@include file="sidebar.jsp" %>
<%@include file="content.jsp" %>

<center>
         
    <div class="container">
            
             <div class="container  col-md-6 mt-5 bg-light">
        <center>
        <h3>Actualizar servicio</h3>
        <hr>
        <br>
       <form action="/booktripO/controllerServicio" method="POST"  onsubmit="return validar()" >
            <label>Nombres:</label>
            <input type="text" name="txtNombre" value="${dato.getNombre()}">
            
            <label>Descripcion:</label>
            <input type="text" name="txtDescripcion" value="${dato.getDescripcion()}">
           
            <input type="hidden" name="id" value="${dato.getIdServicio()}">
            
           <div col-md-6>
                <div col-md-3><input type="submit" name="accion" value="Actualizar"  class="btn btn-success btn-block mt-1" onclick="VolverAEstados()" ></div>
                    <div col-md-3> <input type="submit" name="accion" value="Regresar" class="btn btn-danger btn-block mt-1 my-4" onclick="VolverAEstados()" ></div>
                </div>
        </form>
    </center>
            </div>
            </div>
</center>

<%@include file="footer.jsp" %>
