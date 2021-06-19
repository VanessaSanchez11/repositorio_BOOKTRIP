
<%@page import="modelo.municipios"%>
<%@page import="controlador.municipiosDAO"%>
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
    </head>
    <body>
        <div class="container" style="background: #4d80e4">
            
        <div class="container  col-md-6 mt-5 bg-light">
        <center>
        <h3>Actualizar solicitud</h3>
        <hr>
        <br>
        <form action="controllerActividad" method="POST">
            <label>id Municipio</label>

            
            <div class="col-sm-6">
               
                        <%
                           municipiosDAO miMDAO = new municipiosDAO();
                            ArrayList<municipios>  listaM = miMDAO.ConsularListaMunicipios("");
                        %> 
                        <select name="txtMunicipio">
                            <%
                        for (municipios i : listaM) {%>
                            <option value="<%=i.getIdMunicipio()%>"><%=i.getNombre()%> </option>
                            <%
                                }
                            %>
                        </select>

                    </div>
                        <div class="col-sm-6">
            <label>nombre</label>
            <input type="text" name="txtNombre" value="${dato.getNombre()}">
            </div>
             <div class="col-sm-6">
            <label>lugar</label>
            <input type="text" name="txtLugar" value="${dato.getLugar()}">
            </div>
             <div class="col-sm-6">
            <label>descripcion</label>
            <input type="text" name="txtDescripcion" value="${dato.getDescripcion()}">
            </div>
            
            
            <input type="hidden" name="id" value="${dato.getIdActividad()}">
            
            <input type="submit" name="accion" value="Actualizar" class="btn btn-success btn-block mt-1">
            <input type="submit" name="accion" value="Regresar" class="btn btn-danger btn-block mt-1">
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
