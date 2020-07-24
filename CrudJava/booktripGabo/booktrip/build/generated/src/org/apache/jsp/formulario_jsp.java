package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class formulario_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"vistas/css/formulario_estilo.css\">\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("        <div class=\"pagina\">\n");
      out.write("    <header>\n");
      out.write("    \t<div class=\"botones\">\n");
      out.write("       <a href=\"#\" class=\"botones border-radius\">Iniciar Sesion</a>\n");
      out.write("       <a href=\"#\" class=\"botones border-radius\">Crear Cuenta</a>\n");
      out.write("       </div>\n");
      out.write("\t\n");
      out.write("<div class=\"contacto\">\n");
      out.write("    <center>\n");
      out.write("     <form action=\"\" class=\"formulario\">\n");
      out.write("       <h4>Crear Cuenta</h4>\n");
      out.write("       <input type=\"text\" placeholder=\"Nombre\">\n");
      out.write("       \n");
      out.write("\n");
      out.write("       <input type=\"text\" placeholder=\"Apellido\">\n");
      out.write("       \n");
      out.write("\n");
      out.write("       <input type=\"text\" placeholder=\"Cedula\">\n");
      out.write("       \n");
      out.write("\n");
      out.write("       <input type=\"text\" placeholder=\"Telefono\">\n");
      out.write("       \n");
      out.write("\n");
      out.write("       <input type=\"text\" placeholder=\"Direccion\">\n");
      out.write("\t   \n");
      out.write("\n");
      out.write("       <input type=\"date\" placeholder=\"Fecha de Nacimiento\">\n");
      out.write("\t   \n");
      out.write("\n");
      out.write("\t   <input type=\"email\" placeholder=\"Email\">\n");
      out.write("\t   \n");
      out.write("\n");
      out.write("\t   <input type=\"password\" placeholder=\"Contraseña\">\n");
      out.write("                    <textarea name=\"\" name=\"\" placeholder=\"mensaje\"></textarea>\n");
      out.write("              <br><br><br>        \n");
      out.write("\t  \n");
      out.write("\n");
      out.write("       <div class=\"bts\">\n");
      out.write("       <a href=\"\">Crear</a>\n");
      out.write("        <a href=\"\">Volver</a>\n");
      out.write("       </center>\n");
      out.write("       </div>\n");
      out.write("     </form>\n");
      out.write("   </div>\n");
      out.write("               \n");
      out.write("               \n");
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
