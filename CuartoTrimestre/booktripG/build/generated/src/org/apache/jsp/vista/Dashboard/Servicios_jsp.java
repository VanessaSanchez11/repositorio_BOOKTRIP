package org.apache.jsp.vista.Dashboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Servicios_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("    <!-- Page Heading -->\n");
      out.write("    \n");
      out.write("    <div class=\"d-sm-flex align-items-center justify-content-between mb-4\">\n");
      out.write("\n");
      out.write("        <a href=\"indexListaServicios.jsp\" class=\"d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm\"> Lista de servicio</a>\n");
      out.write("        <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-success shadow-sm\"> Consultar servicio</a>\n");
      out.write("        <a href=\"indexServiciosCrear.jsp\" class=\"d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm\"> Crear servicio</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    <div class=\"contenedor\">\n");
      out.write("\n");
      out.write("        <section class=\"main\">\n");
      out.write("            <div class=\"imagen\">\n");
      out.write("                <img src=\"imagenes/servicios.jpg\"/>\n");
      out.write("                <section class=\"Posts\">\n");
      out.write("                    <article>\n");
      out.write("                        \n");
      out.write("                        <p></p> \n");
      out.write("                    </article>\n");
      out.write("                </section>\n");
      out.write("        </section>\n");
      out.write("        <!-- agregar barra lateral -->\n");
      out.write("        <aside>\n");
      out.write("            <form class=\"user\" action=\"/booktripG/registrarServicios\" method=\"post\" onsubmit=\"return validarInformacionServicio()\"> \n");
      out.write("                <div class=\"modulo\">\n");
      out.write("                    \n");
      out.write("                <div class=\"input-group mb-3\">\n");
      out.write("                        <div class=\"input-group-prepend\">\n");
      out.write("\n");
      out.write("                            <input type=\"text\" class=\"form-control \" name =\"nombre\" id=\"txtNombre\" placeholder=\"Nombre\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"input-group mb-3\">\n");
      out.write("                        <div class=\"input-group-prepend\">\n");
      out.write("                            <input type=\"text\" class=\"form-control \" name =\"descripcion\" id=\"txtdescripcion\" placeholder=\"Descripcion\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                \n");
      out.write("                <div class=\"col-12 py-3\">\n");
      out.write("                        <input class=\"d-none\" id=\"txtBandera\" type=\"text\" name=\"BanderaRegistro\" > \n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                \n");
      out.write("                <input  type=\"submit\" class=\"btn btn-dark\" value=\"Enviar\">\n");
      out.write("            </form>\n");
      out.write("        </aside>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
