
<%@page import="modelo.usuario"%>
<%@page import="controlador.usuarioDao"%>
<%@page import="modelo.estados"%>
<%@page import="controlador.estadosDAO"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="modelo.inmuebles"%>
<%@page import="java.util.ArrayList"%>
<%@page import="controlador.inmueblesDAO"%>

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
       <div class="fondo-estado container my-10" style="background: #4d80e4">
             <div class="container  col-md-6 mt-5 bg-light"> 
    <center>
        <h3>Agregar Nuevo pago</h3>
        <hr>
        <br>
        <form action="/booktripO/controllerPago" method="POST">
              <label>id usuario</label>
                   
                     <div class="col-sm-6">
               
                        <%
                            usuarioDao miusuarioDAO = new usuarioDao();
                            ArrayList<usuario>  listausuario = miusuarioDAO.ListadoUsuarios("");
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
                            ArrayList<inmuebles>  listainmueble = miinmuebleDAO.ConsultarListadoInmueble("");
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
                    <div col-md-3><input type="text" name="txtAdjunto">
                    </div>
                </div>
                          <div col-md-6>
                    <div col-md-3><label>Monto</label></div>
                    <div col-md-3><input type="text" name="txtMonto">
                    </div>
                </div>
                          <div col-md-6>
                    <div col-md-3><label>fecha</label></div>
                    <div col-md-3><input type="text" name="txtFechaPago">
                    </div>
                </div>
                     <div col-md-6>
                    <div col-md-3><label>fecha2</label></div>
                    <div col-md-3><input type="text" name="txtFechaPago2" >
                    </div>
                </div>
                <div col-md-6>
                    <div col-md-3><input type="submit" name="accion" value="Guardar" class="btn btn-success btn-block mt-1"></div>
                    <div col-md-3> <input type="submit" name="accion" value="Regresar" class="btn btn-danger btn-block mt-1 my-4"></div>
                </div>    
                  
                   </div>      
                        </div>  
                   
                </form>
            </center>
                        
                          <script src="../js/jquery-1.11.0.min.js"></script>
    <script src="../js/validaciones.js"</script>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
   
        </body>
    </html>
