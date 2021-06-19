<%@page import="modelo.departamento"%>
<%@page import="controlador.departamentosDAO"%>
<%@page import="modelo.municipios"%>
<%@page import="controlador.municipiosDAO"%>
<%@page import="java.sql.ResultSet"%>

<%@page import="java.util.ArrayList"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="css/estilosBooktrip.css">
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1" crossorigin="anonymous">
    </head>

    <body>
    <center>
        <div class="fondo-actividad container my-10" style="background: #4d80e4">
            <div class="container  col-md-6 mt-5 bg-light">
                <h3>Agregar Nuevo Municipio</h3>
                <hr>
                <br>
                <form action="/booktripO/controllerActividad" method="POST">
                    <label>DEPARTAMENTO</label>


                    <div class="col-sm-6">

                        <%
                            departamentosDAO miMDAO = new departamentosDAO();
                            ArrayList<departamento> listaD = miMDAO.ConsularListaDepartamento("");
                        %> 
                        <select name="txtDepartamento">
                            <%
                                for (departamento i : listaD) {%>
                            <option value="<%=i.getIdDepartamento()%>"><%=i.getNombre()%> </option>
                            <%
                                }
                            %>
                        </select>

                    </div>

                    <div>     
                        <label>nombre</label>
                        <input type="text" name="txtNombre">
                    </div>

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
