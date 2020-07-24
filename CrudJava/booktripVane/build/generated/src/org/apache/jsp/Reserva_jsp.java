package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Reserva_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("             <title>Reserva</title>\n");
      out.write("\n");
      out.write("    <link rel=\"stylesheet\" href=\"vista/css/Reserva_estilo.css\" />\n");
      out.write("    </head>\n");
      out.write("    \n");
      out.write("    <body>\n");
      out.write("       <div class=\"pagina\">\n");
      out.write("        <header>\n");
      out.write("            \n");
      out.write("            <form action=\"\" class=\"reserva\">\n");
      out.write("\n");
      out.write("        <h1 class=\"reserva__titulo\">Alojamientos con Reserva Flexible</h1>\n");
      out.write("        <h2 class=\"reserva__titulo\">Encuentra hoteles que puedes cancelar si tus planes cambian</h2>\n");
      out.write("        \n");
      out.write("        <div class=\"row\">\n");
      out.write("        <div class=\"column\">\n");
      out.write("            <select class=\"lugares__input\">\n");
      out.write("            <option value=\"medellin\">Bogota</option>\n");
      out.write("            <option value=\"bogota\">Medellin</option>\n");
      out.write("            <option value=\"cali\">Cali</option>\n");
      out.write("            <option value=\"medellin\">Melgar</option>\n");
      out.write("            <option value=\"medellin\">Girardot</option>\n");
      out.write("            <option value=\"medellin\">Villa de leyva</option>\n");
      out.write("          </select>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("            <div class=\"column\">\n");
      out.write("            <select class=\"lugares__input\">\n");
      out.write("                <option value=\"medellin\">Hotel</option>\n");
      out.write("                <option value=\"bogota\">Finca</option>\n");
      out.write("                <option value=\"cali\">Casa</option>\n");
      out.write("                <option value=\"medellin\">Apartamento</option>\n");
      out.write("                <option value=\"medellin\">Camping</option>\n");
      out.write("                \n");
      out.write("              </select>\n");
      out.write("        </div>\n");
      out.write("            \n");
      out.write("             <div class=\"column\">\n");
      out.write("          <input type=\"date\" class=\"reserva__input\" />\n");
      out.write("          <label for=\"\" class=\"reserva__label\">Checkin</label>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"column\">\n");
      out.write("          <input type=\"date\" class=\"reserva__input\" />\n");
      out.write("          <label for=\"\" class=\"reserva__label\">Checkout</label>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"bts\">\n");
      out.write("            <a href=\"\">Buscar</a>\n");
      out.write("            </div>\n");
      out.write("            \n");
      out.write("      </div>\n");
      out.write("    </form>\n");
      out.write("    \n");
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
