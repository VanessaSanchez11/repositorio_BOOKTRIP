
<%@page import="modelo.rol"%>
<%@page import="controlador.rolDAO"%>
<%@page import="modelo.tipoDocumentos"%>
<%@page import="controlador.tipoDocumentosDAO"%>
<%@page import="modelo.usuario"%>
<%@page import="controlador.usuarioDao"%>
<%@page import="modelo.estados"%>
<%@page import="controlador.estadosDAO"%>
<%@page import="modelo.inmuebles"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.inmueblesDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
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

    <title>Actulizar usuario</title>
  </head>
  <body style="background-image: linear-gradient(180deg, #ade5ff 0, #7dcefb 25%, #3cb5f2 50%, #009ce9 75%, #0085e0 100%);">
      <div class="principal">
 
<center>
    <div class="container">
            
             <div class="container  col-md-6 mt-5 bg-light">
        <center>
        <h3>Actualizar usuario</h3>
        <hr>
        <br>
        <form action="controllerUsuario" method="POST">
           
          
                    <label>id tipo</label>
                   
                     <div class="col-sm-6">
               
                        <%
                            tipoDocumentosDAO UDAO = new tipoDocumentosDAO();
                            ArrayList<tipoDocumentos>  listaU = UDAO.ConsultarListadoTipos("");
                        %> 
                        <select name="txtTipoDocumento">
                            <%
                        for (tipoDocumentos i : listaU) {%>
                            <option value="<%=i.getIdTipoDocumento()%>"><%=i.getNombre()%> </option>
                            <%
                                }
                            %>
                        </select>

                    </div>
                         <div class="col-sm-6">     
                    <label>numero</label>
                    <input type="text" name="txtNumDocu">
                      </div>
                    
                      
                       <div class="col-sm-6">     
                    <label>nombre</label>
                    <input type="text" name="txtNombre" value="${dato.getNombre()}">
                      </div>
                          
                       <div class="col-sm-6">     
                    <label>apellido</label>
                    <input type="text" name="txtApellido" value="${dato.getApellido()}">
                      </div>
                          
                       <div class="col-sm-6">     
                    <label>direcion</label>
                    <input type="text" name="txtDirecion" value="${dato.getDireccion()}">
                      </div>
                          
                       <div class="col-sm-6">     
                    <label>Telefono</label>
                    <input type="text" name="txtTelefono" value="${dato.getTelefono()}">
                      </div>
                          
                       <div class="col-sm-6">     
                    <label>fecha</label>
                    <input type="text" name="txtFecha" value="${dato.getFechaNacimiento()}">
                      </div>
                          
                       <div class="col-sm-6">     
                    <label>email</label>
                    <input type="text" name="txtEmail" value="${dato.getEmail()}">
                      </div>
                          
                       <div class="col-sm-6">     
                    <label>contraseña</label>
                    <input type="text" name="txtPassword" value="${dato.getPassword()}">
                      </div>
<div>  
                    <input type="submit" name="accion" value="Guardar" class="btn-primary btn-block">
                    <input type="submit" name="accion" value="Regresar" class="btn-danger btn-block">
                       </div>
                </form>
              </div>
              </div>
    </center>
            </div>
            </div>

     </div>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js" integrity="sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4" crossorigin="anonymous"></script>

    
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>

  </body>
</html>
