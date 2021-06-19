
<%@page import="modelo.inmuebles"%>
<%@page import="controlador.inmueblesDAO"%>
<%@page import="modelo.usuario"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.usuarioDao"%>
<%@page import="controlador.estadosDAO"%>
<%@page import="modelo.estados"%>

<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="css/estilosBooktrip.css">
     <link rel="stylesheet" href="css/estiloValidacion.css">
    <!-- Bootstrap CSS -->
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x" crossorigin="anonymous">

    <title>Actulizar pago</title>
  </head>
  <body style="background-image: linear-gradient(180deg, #ade5ff 0, #7dcefb 25%, #3cb5f2 50%, #009ce9 75%, #0085e0 100%);">
      <div class="principal">
 
<center>
    <div class="container">
            
             <div class="container  col-md-6 mt-5 bg-light">
        <center>
        <h3>Actualizar pago</h3>
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

     </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>

    
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>

  </body>
</html>


