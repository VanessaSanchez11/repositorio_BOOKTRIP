
<%@page import="modelo.municipios"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.municipiosDAO"%>
<%@page import="controlador.actividadesDAO"%>
<%@page import="modelo.actividades"%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-wEmeIV1mKuiNpC+IOBjI7aAzPcEZeedi5yW5f2yOq55WWLwNGmvvx4Um1vskeMj0" crossorigin="anonymous">
!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="css/estilosBooktrip.css">
     <link rel="stylesheet" href="css/estiloValidacion.css">
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">

    <title>Actulizar actividad</title>
  </head>
  <body style="background-image: linear-gradient(180deg, #ade5ff 0, #7dcefb 25%, #3cb5f2 50%, #009ce9 75%, #0085e0 100%);">
      <div class="principal">
 
<center>
    <div class="container">
            
             <div class="container  col-md-6 mt-5 bg-light">
        <center>
        <h3>Actualizar actividad</h3>
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
    </center>
            </div>
            </div>
</center>


