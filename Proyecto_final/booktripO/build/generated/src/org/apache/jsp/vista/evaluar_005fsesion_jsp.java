package org.apache.jsp.vista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.usuario;
import controlador.usuarioDao;
import java.sql.DriverManager;
import java.sql.Driver;
import javax.servlet.http.HttpSession;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public final class evaluar_005fsesion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         <link rel=\"stylesheet\" href=\"css/selecionar_roles_styl.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("          ");

             
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
        
      out.write("\n");
      out.write("         \n");
      out.write("      \n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
