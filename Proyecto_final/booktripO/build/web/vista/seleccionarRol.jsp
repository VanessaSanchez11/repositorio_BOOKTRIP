

<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Driver"%>
<%@page import="modelo.permisos"%>
<%@page import="javax.servlet.http.HttpSession"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="controlador.Conexion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="css/selecionar_roles_styl.css">
    </head>
    <body>
    <center>
        <div class="container-fluid seleccionarRol ">
            <div>
                <img src="imagenes/logo.png" width="225" height="148" alt="logo"/>

            </div>
        <%
           try
{
   // Conexion con bd
  Class.forName("com.mysql.jdbc.Driver");
   Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/booktripr?serverTimezone=UTC", "root", "");
   if (!conexion.isClosed())
   {
      // La consulta
       
      Statement st = conexion.createStatement();
     int Usu = (Integer)session.getAttribute("usuario");
     
     
      ResultSet rs= st.executeQuery("select * from permisos WHERE idUsuario='"+Usu+"'");
 //String ddocumento = rs.getString("documento");
      // Ponemos los resultados en un table de html
     // out.println("<table border=\"1\"><tr><td>Id</td><td>Nombre</td></tr>");
   
     
      while (rs.next())
      {
          int uno=1;
          int dos=2;
           int tres=3;
          String ffk_id_rol = rs.getString("idRol");
          int fffk_id_rol=Integer.parseInt(ffk_id_rol);
        
           
           if (fffk_id_rol == uno)
           {
           out.println("<a href='Dashboard/indexListaEstado.jsp'>Ingresar como admin</a><br/> <br/>");
           }
           if (fffk_id_rol ==dos)
           {
          out.println("<a href='Propietario/indexListaInmueble.jsp'>Ingresar como propietario</a><br/> <br/>");
           }
           if (fffk_id_rol == tres)
           {
           out.println("<a href='Viajero/indexListaReserva.jsp'>Ingresar como viajero</a><br/> <br/> <br/>");
           }
           
                 
      }
     

      // cierre de la conexion
      conexion.close();
   }
   
}
catch (Exception e)
{
   // Error en algun momento.
   out.println("Excepcion "+e);
   e.printStackTrace();
}
        %>
            <%
            out.println("<a class='a_salir' href='salir.jsp'>Salir</a><br/> <br/>");
           %>
        </div>
        </center>
    </body>
</html>
