package org.apache.jsp.vista.DashboardPropietario;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class listadoInmueble_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("   \n");
      out.write("\n");
      out.write("</div>\n");
      out.write("<div class=\"d-sm-flex align-items-center justify-content-between mb-4\">\n");
      out.write("    \n");
      out.write("    <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm\"> Lista de inmuebles</a>\n");
      out.write("    <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-success shadow-sm\"> Consultar inmueble</a>\n");
      out.write("    <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-warning shadow-sm\"> Actualizar  inmueble</a>\n");
      out.write("    <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-danger shadow-sm\"> Eliminar inmueble</a>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("<div class=\"principal_1\"> \n");
      out.write("<img src=\"img/logo.png\">\n");
      out.write("</div>\n");
      out.write("        <div class=\"principal_2\">\n");
      out.write("            \n");
      out.write("            <div class=\"cajita\">\n");
      out.write("                <center>\n");
      out.write("                    <img src=\"img/logo.png\">\n");
      out.write("                    <br>\n");
      out.write("                </center>                    \n");
      out.write("\n");
      out.write("                <div class=\"card\">\n");
      out.write("\n");
      out.write("                    <h5 class=\"card-header info-color white-text text-center py-4\">\n");
      out.write("                        <strong>Registrar inmueble</strong>\n");
      out.write("                    </h5>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <form action=\"#\">\n");
      out.write("\n");
      out.write("                        <label for=\"idInmueble\"><b>codigo inmueble</b></label>\n");
      out.write("                        <input type=\"text\" id=\"idInmueble\" class=\"form-control\" placeholder=\"El sistema asigna automáticamente el coódigo\">\n");
      out.write("                        <label for=\"idTipo\"><b>Tipo inmueble</b></label>\n");
      out.write("                        <select class=\"browser-default custom-select mb-4\" id=\"idTipo\">\n");
      out.write("                            <option value=\"\" disabled=\"\" selected=\"\">Selecione el tipo de inmueble</option>\n");
      out.write("                            <option value=\"1\">x</option>\n");
      out.write("                            <option value=\"2\">x</option>\n");
      out.write("                            <option value=\"3\">x</option>\n");
      out.write("                        </select>\n");
      out.write("                        <label for=\"idDepartamento\"><b>Departamento</b></label>\n");
      out.write("                        <select class=\"browser-default custom-select mb-4\" id=\"idDepartamento\">\n");
      out.write("                            <option value=\"\" disabled=\"\" selected=\"\">Selecione el departamento</option>\n");
      out.write("                            <option value=\"1\">x</option>\n");
      out.write("                            <option value=\"2\">x</option>\n");
      out.write("                            <option value=\"3\">x</option>\n");
      out.write("                        </select>\n");
      out.write("                        <label for=\"idUsuario\"><b>Usuario</b></label>\n");
      out.write("                        <select class=\"browser-default custom-select mb-4\" id=\"idUsuario\">\n");
      out.write("                            <option value=\"\" disabled=\"\" selected=\"\">ingrese su usuario</option>\n");
      out.write("                            <option value=\"1\">x</option>\n");
      out.write("                            <option value=\"2\">x</option>\n");
      out.write("                            <option value=\"3\">x</option>\n");
      out.write("                        </select>\n");
      out.write("                        \n");
      out.write("                        <label for=\"idEstado\"><b>Estado de la propiedad</b></label>\n");
      out.write("                        <select class=\"browser-default custom-select mb-4\" id=\"idEstado\">\n");
      out.write("                            <option value=\"\" disabled=\"\" selected=\"\">Selecione el estado de la propiedad</option>\n");
      out.write("                            <option value=\"1\">x</option>\n");
      out.write("                            <option value=\"2\">x</option>\n");
      out.write("                            <option value=\"3\">x</option>\n");
      out.write("                        </select>\n");
      out.write("                        <label for=\"nombre\"><b>Nombre inmueble</b></label>\n");
      out.write("                        <input type=\"text\" id=\"nombre\" class=\"form-control\" placeholder=\"\">\n");
      out.write("                        \n");
      out.write("                        <label for=\"direccion\"><b>Direccion</b></label>\n");
      out.write("                        <input type=\"text\" id=\"direccion\" class=\"form-control\" placeholder=\"\">\n");
      out.write("                        \n");
      out.write("                        <label for=\"capacidad\"><b>Capacidad</b></label>\n");
      out.write("                        <input type=\"number\" id=\"capacidad\" class=\"form-control\" placeholder=\"\">\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"descripcion\"><b>Descripción</b></label>\n");
      out.write("                            <textarea class=\"form-control\" id=\"descripcion\" rows=\"3\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("                        <center>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <button class=\"btn btn-success btn-block\" type=\"submit\">Registrar inmueble</button>\n");
      out.write("                            <br>\n");
      out.write("                            <button class=\"btn btn-danger btn-block\" type=\"submit\">Cancelar</button>\n");
      out.write("                        </center>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>  \n");
      out.write("        </div>\n");
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
