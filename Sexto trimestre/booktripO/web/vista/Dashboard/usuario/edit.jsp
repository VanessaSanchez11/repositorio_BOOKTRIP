
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
                    
                      <label>id rol</label>
                      <div class="col-sm-6">
               
                        <%
                            rolDAO RDAO = new rolDAO();
                            ArrayList<rol>  listaR = RDAO.ConsultarListadoRoles("");
                        %> 
                        <select name="txtRol">
                            <%
                        for (rol i : listaR) {%>
                            <option value="<%=i.getIdRol()%>"><%=i.getNombre()%> </option>
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
             <script src="../js/jquery-1.11.0.min.js"></script>
    <script src="../js/validaciones.js"</script>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    
    </body>
</html>
