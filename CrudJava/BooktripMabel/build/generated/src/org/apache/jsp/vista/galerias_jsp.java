package org.apache.jsp.vista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class galerias_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("          <link rel=\"stylesheet\"  href=\"vista/css/galeria.css\">\n");
      out.write("        <title>BOOKTRIP</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1>GALERIAS</h1>\n");
      out.write("\n");
      out.write("        <div class=\"formulario\">\n");
      out.write("            \n");
      out.write("            <label for=\"nombre\" class=\"titulos\">NOMBRES</label>\n");
      out.write("            <input type=\"text\" placeholder=\"Escriba su nombre\">\n");
      out.write("            <label for=\"nombre\" class=\"titulos\">APELLIDOS</label>\n");
      out.write("            <input type=\"text\" placeholder=\"Escriba su apellido\">\n");
      out.write("            <label for=\"propiedad\" class=\"titulos\">NOMBRE DE LA PROPIEDAD</label>\n");
      out.write("            <input type=\"text\" placeholder=\"Escriba el nombre de la propiedad\">\n");
      out.write("            <label for=\"galeria\" class=\"titulos\">AGREGE SUS IMAGENES</label>\n");
      out.write("            <input type=\"file\">\n");
      out.write("            <a href=\"\" class=\"boton\">ENVIAR</a>\n");
      out.write("        </div> \n");
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
