package org.apache.jsp.vista.Dashboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listadoTipoInmueble_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("<!-- Page Heading -->\n");
      out.write("<div class=\"d-sm-flex align-items-center justify-content-between mb-4\">\n");
      out.write("    <h1 class=\"h3 mb-0 text-gray-800\">Dashboard</h1>\n");
      out.write("   \n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<div class=\"d-sm-flex align-items-center justify-content-between mb-4\">\n");
      out.write("    \n");
      out.write("    <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm\"> Lista de tipo inmueble</a>\n");
      out.write("    <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-success shadow-sm\"> Consultar tipos de inmueble</a>\n");
      out.write("    <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-warning shadow-sm\"> Actualizar tipo inmueble</a>\n");
      out.write("    <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-danger shadow-sm\"> Eliminar tipo de inmueble</a>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("    <center>\n");
      out.write("        <div class=\"principal\">\n");
      out.write("            <div class=\"cajita\">\n");
      out.write("                <center>\n");
      out.write("                    <img src=\"Dashboard/img/logo.png\">\n");
      out.write("                    <br>\n");
      out.write("                </center>                    \n");
      out.write("\n");
      out.write("                <div class=\"card\">\n");
      out.write("\n");
      out.write("                    <h5 class=\"card-header info-color white-text text-center py-4\">\n");
      out.write("                        <strong>Tipo de inmueble</strong>\n");
      out.write("                    </h5>\n");
      out.write("                    <form action=\"\">\n");
      out.write("\n");
      out.write("                        <center>\n");
      out.write("                            <label for=\"idTipo\"><b>Codigo tipo de inmueble</b></label>\n");
      out.write("                            <input type=\"text\" id=\"idTipo\" class=\"form-control\" placeholder=\"El sistema asigna automaticamente el codigo\"><br>\n");
      out.write("                            <label for=\"nombre\"><b>Tipo de inmueble</b></label><br>\n");
      out.write("                            <input type=\"text\" id=\"nombre\" class=\"form-control\" placeholder=\"ingresa el tipo de inmueble\"><br>\n");
      out.write("\n");
      out.write("                            <button class=\"btn btn-primary btn-block\" type=\"submit\">Guardar tipo de inmueble</button>\n");
      out.write("                            <br>\n");
      out.write("                            <button class=\"btn btn-danger btn-block\" type=\"submit\">Cancelar</button>\n");
      out.write("                        </center>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>  \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("    </center>\n");
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
