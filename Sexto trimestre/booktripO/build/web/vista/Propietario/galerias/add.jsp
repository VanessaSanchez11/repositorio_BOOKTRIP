<%-- 
    Document   : add
    Created on : 15/02/2021, 11:21:23 AM
    Author     : 57321
--%>

<%@page import="modelo.inmuebles"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.inmueblesDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class="container  col-md-6 mt-5 bg-light">
                <h3>Agregar Nuevo Municipio</h3>
                <hr>
                <br>
                <form action="/booktripO/controllerGaleria" method="POST">
                    <label>registrar galeria</label>


                    <div class="col-sm-6">

                        <%
                            inmueblesDAO miMDAO = new inmueblesDAO();
                            ArrayList<inmuebles> listaD = miMDAO.ConsultarListadoInmueble("");
                        %> 
                        <select name="txtInmueble">
                            <%
                                for (inmuebles i : listaD) {%>
                            <option value="<%=i.getIdInmueble()%>"><%=i.getNombre()%> </option>
                            <%
                                }
                            %>
                        </select>

                    </div>

                    <div>     
                        <label>nombre</label>
                        <input type="text" name="txtImagen">
                    </div> <div>     
                        <label>nombre</label>
                        <input type="text" name="txtUrl">
                    </div

                    <div>  
                        <input type="submit" name="accion" value="Guardar" class="btn-primary btn-block">
                        <input type="submit" name="accion" value="Regresar" class="btn-danger btn-block">
                    </div>
                </form>
            </div>
        </div>
    </center>
    <script src="../js/jquery-1.11.0.min.js"></script>
    <script src="../js/validaciones.js"</script>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>

    </body>
</html>
