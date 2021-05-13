<%@include file="header.jsp" %>

<center>
         
    <div class="container">
            
             <div class="container  col-md-6 mt-5 bg-light">
        <center>
        <h3>Actualizar estado</h3>
        <hr>
        <br>
        <form action="/booktripO/controllerEstado" method="POST" >
           
           
            <div col-md-6>
                <div col-md-3><label>Nombre:</label></div>
                <div col-md-3>
                    <input type="text" name="txtNom" value="${dato.getNombre()}">
                    <input type="hidden" name="id" value="${dato.getIdEstado()}">
                </div>
            </div>
   
            <div col-md-6>
                <div col-md-3><input type="submit" name="accion" value="Actualizar"  class="btn btn-success btn-block mt-1" onclick="VolverAEstados()" ></div>
                    <div col-md-3> <input type="submit" name="accion" value="Regresar" class="btn btn-danger btn-block mt-1 my-4" onclick="VolverAEstados()" ></div>
                </div>
                
        </form>
    </center>
            </div>
            </div>
</center>


