<%@page import="modelo.usuario"%>
<%@page import="controlador.usuarioDao"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Driver"%>

<%@page import="javax.servlet.http.HttpSession"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <link rel="stylesheet" href="css/selecionar_roles_styl.css">
    </head>
    <body>
        
          <%
             
           try
{
             

    int cero=0;
         int uno=1;
   // Conexion con bd
//Class.forName("org.gjt.mm.mysql.Driver");
  Class.forName("com.mysql.jdbc.Driver");

   // Connection  conexion = DriverManager.getConnection("jdbc:mysql://localhost/booktripr", "root", "");
      Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/booktripr?serverTimezone=UTC", "root", "");
   if (!conexion.isClosed())
   {
        String email=request.getParameter("email"); 
         String contrasena=request.getParameter("password"); 
      Statement st = conexion.createStatement();
   // ResultSet rs= st.executeQuery("select * from usuarios WHERE email = '" + email + "'");
     ResultSet rs= st.executeQuery("select * from usuarios WHERE email = '" + email + "' AND password=md5('"+ contrasena+ "')");
       //String Email=rs.getString("email");
      session.setAttribute("autorizado", cero);
      
                
      while (rs.next())
      {
          usuario user = new usuario();
           user = new usuario();
                user.setIdUsuario(rs.getInt(1));
                user.setIdTipoDocumento(rs.getInt(2));
                user.setNumDocu(rs.getInt(3)); 
                user.setNombre(rs.getString(4));
                user.setApellido(rs.getString(5));
                user.setDireccion(rs.getString(6));
                user.setTelefono(rs.getInt(7));
                user.setFechaNacimiento(rs.getString(8));
                user.setEmail(rs.getString(9));
                user.setPassword(rs.getString(10));
       
                int usu=user.getIdUsuario();
             String nombre=user.getNombre();
              String apellido=user.getApellido();
              
      usuarioDao userC = new usuarioDao();
      
      user =userC.consultarUsuario(email, contrasena);
     
       request.getSession().setAttribute("email", email);
      request.getSession().setAttribute("nombre", nombre);
       request.getSession().setAttribute("apellido", apellido);
      
      session.setAttribute("usuario", usu);
      session.setAttribute("autorizado", uno);
      request.getSession().setAttribute("email", email);
    out.println("<script type=\"text/javascript\">");
                   out.println("window.location.href='/booktripO/vista/seleccionarRol.jsp';");
                   out.println("</script>"); 
      }
        
      // cierre de la conexion
      conexion.close();
   }
 
   // Error en la conexion
     out.println(" <div class='container-fluid seleccionarRol2'>");
       out.println("<h1>Error en las credenciales</h1></br>");
  out.println("<a href='salir.jsp'>Intentar nuevamente</a>");
  out.println(" </div>");
}
catch (Exception e)
{
   // Error en algun momento.
   out.println("Excepcion "+e);
   e.printStackTrace();
  }
        %>
         
      

    </body>
</html>
