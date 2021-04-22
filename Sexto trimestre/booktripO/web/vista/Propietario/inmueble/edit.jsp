
<%@page import="modelo.departamento"%>
<%@page import="controlador.departamentosDAO"%>
<%@page import="modelo.tipoinmuebles"%>
<%@page import="controlador.tipoinmuebleDAO"%>
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
    <body>
        <div class="container" style="background: #4d80e4">
            
        <div class="container  col-md-6 mt-5 bg-light">
       <center>
        <h3>Actualizar inmueble</h3>
        <hr>
        <br>
        <form action="/booktripO/controllerInmueble" method="POST">
            <div class="col-sm-6">

                <%
                    tipoinmuebleDAO mitipoDAO = new tipoinmuebleDAO();
                    ArrayList<tipoinmuebles> listatipo = mitipoDAO.ConsultarListadoTipos("");
                %> 
                <select name="txtTipo">
                     <option value="${dato.getNombre()}">--seleccione el tipo de inmueble </option>
                    <%
                                for (tipoinmuebles i : listatipo) {%>
                    <option value="<%=i.getIdTipo()%>"><%=i.getNombre()%> </option>
                    <%
                        }
                    %>
                </select>

            </div>

            <div class="col-sm-6">

                <%
                    departamentosDAO midepartamentoDAO = new departamentosDAO();
                    ArrayList<departamento> listadepartamento = midepartamentoDAO.ConsularListaDepartamento("");
                %> 
                <select name="txtDepartamento">
                     <option value="${dato.getIdDepartamento()}">--seleccione el departamento </option>
                    <%
                                for (departamento i : listadepartamento) {%>
                    <option value="<%=i.getIdDepartamento()%>"><%=i.getNombre()%> </option>
                    <%
                        }
                    %>
                </select>

            </div>

            <div class="col-sm-6">
               
                        <%
                            usuarioDao miusuarioDAO = new usuarioDao();
                            ArrayList<usuario>  listausuario = miusuarioDAO.ListadoUsuarios("");
                        %> 
                        <select name="txtUsuario">
                              <option value="">--selecione el usuario-- </option>
                            <%
                        for (usuario i : listausuario) {%>
                            <option value="<%=i.getIdUsuario()%>"><%=i.getNombre()%> </option>
                            <%
                                }
                            %>
                        </select>

                    </div>
            </div>

              <div class="col-sm-6">

                <%
                    estadosDAO miestadoDAO = new estadosDAO();
                    ArrayList<estados> listaestado = miestadoDAO.ConsultarListadoEstados("");
                %> 
                <select name="txtEstado">
                     <option value="${dato.getIdEstado()}">--seleccione el estado </option>
                    <%
                                for (estados i : listaestado) {%>
                    <option value="<%=i.getIdEstado()%>"><%=i.getNombre()%> </option>
                    <%
                        }
                    %>
                </select>

            </div>
          
            <div class="col-sm-6">
                <label>Nombre</label>
                <input type="text" name="txtNombre" value="${dato.getNombre()}">
            </div>
                <div class="col-sm-6">
                <label>Direccion</label>
                <input type="text" name="txtDireccion" value="${dato.getDireccion()}">
            </div>  
                <div class="col-sm-6">
                <label>Capacidad</label>
                <input type="text" name="txtCapacidad" value="${dato.getCapacidad()}">
            </div>  
                <div class="col-sm-6">
                <label>Descripcion</label>
                <input type="text" name="txtDescripcion" value="${dato.getDescripcion()}">
            </div>  
                <div class="col-sm-6">
                <label>Precio</label>
                <input type="text" name="txtPrecio" value="${dato.getPrecio()}">
            </div>  
                <div class="col-sm-6">
                <label>Adjunto</label>
                <input type="text" name="txtAdjunto" value="${dato.getAdjunto()}">
            </div>  

            <input type="submit" name="accion" value="Actualizar"class="btn btn-success btn-block mt-1" >
            <input type="submit" name="accion" value="Regresar"class="btn btn-danger btn-block mt-1" >
        </form>
    </center>
              </div>  
              </div>  
            
    </body>
     <script src="../js/jquery-1.11.0.min.js"></script>
    <script src="../js/validaciones.js"</script>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js" integrity="sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV" crossorigin="anonymous"></script>
    
</html>
