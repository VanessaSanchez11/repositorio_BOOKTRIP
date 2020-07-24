package org.apache.jsp.vistas.Dashboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listaServicios_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("<!-- Page Heading -->\n");
      out.write("<div class=\"d-sm-flex align-items-center justify-content-between mb-4\">\n");
      out.write("    <h1 class=\"h3 mb-0 text-gray-800\">Dashboard</h1>\n");
      out.write("    <!-- <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm\"> Lista de usuarios</a>\n");
      out.write("    <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-success shadow-sm\"> Consultar usuario</a>\n");
      out.write("    <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-warning shadow-sm\"> Actualizar usuario</a>\n");
      out.write("    <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-danger shadow-sm\"> Eliminar usuario</a> -->\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<div class=\"d-sm-flex align-items-center justify-content-between mb-4\">\n");
      out.write("    \n");
      out.write("    <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm\"> Lista de servicio</a>\n");
      out.write("    <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-success shadow-sm\"> Consultar servicio</a>\n");
      out.write("    <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-warning shadow-sm\"> Actualizar servicio</a>\n");
      out.write("    <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-danger shadow-sm\"> Eliminar servicio</a>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"contenedor\">\n");
      out.write("\n");
      out.write("    <h1> Lista Servicios</h1>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <table class=\"table\">\n");
      out.write("  <thead class=\"thead-dark\">\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"col\">#</th>\n");
      out.write("      <th scope=\"col\">First</th>\n");
      out.write("      <th scope=\"col\">Last</th>\n");
      out.write("      <th scope=\"col\">Handle</th>\n");
      out.write("    </tr>\n");
      out.write("  </thead>\n");
      out.write("  <tbody>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">1</th>\n");
      out.write("      <td>Mark</td>\n");
      out.write("      <td>Otto</td>\n");
      out.write("      <td>@mdo</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">2</th>\n");
      out.write("      <td>Jacob</td>\n");
      out.write("      <td>Thornton</td>\n");
      out.write("      <td>@fat</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">3</th>\n");
      out.write("      <td>Larry</td>\n");
      out.write("      <td>the Bird</td>\n");
      out.write("      <td>@twitter</td>\n");
      out.write("    </tr>\n");
      out.write("  </tbody>\n");
      out.write("</table>\n");
      out.write("\n");
      out.write("<table class=\"table\">\n");
      out.write("  <thead class=\"thead-light\">\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"col\">#</th>\n");
      out.write("      <th scope=\"col\">First</th>\n");
      out.write("      <th scope=\"col\">Last</th>\n");
      out.write("      <th scope=\"col\">Handle</th>\n");
      out.write("    </tr>\n");
      out.write("  </thead>\n");
      out.write("  <tbody>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">1</th>\n");
      out.write("      <td>Mark</td>\n");
      out.write("      <td>Otto</td>\n");
      out.write("      <td>@mdo</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">2</th>\n");
      out.write("      <td>Jacob</td>\n");
      out.write("      <td>Thornton</td>\n");
      out.write("      <td>@fat</td>\n");
      out.write("    </tr>\n");
      out.write("    <tr>\n");
      out.write("      <th scope=\"row\">3</th>\n");
      out.write("      <td>Larry</td>\n");
      out.write("      <td>the Bird</td>\n");
      out.write("      <td>@twitter</td>\n");
      out.write("    </tr>\n");
      out.write("  </tbody>\n");
      out.write("</table>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
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
