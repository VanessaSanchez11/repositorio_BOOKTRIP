package org.apache.jsp.vista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registroUsuarios_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap-grid.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap-reboot.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/estilosUsuarios.css\">\n");
      out.write("    <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("    <title>Registro usuarios</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <h1>Registro de usuarios</h1>\n");
      out.write("    <div class=\"formulario\">\n");
      out.write("        <form action=\"\" method=\"\">\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <label for=\"\">Nombre</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Nombre\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <label for=\"\">Apellidos</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Apellidos\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <label for=\"inputState\">Rol</label>\n");
      out.write("                    <select id=\"inputState\" class=\"form-control\">\n");
      out.write("                  <option selected>Viajero</option>\n");
      out.write("                  <option>Propietario</option>\n");
      out.write("                  <option>Administrador</option>\n");
      out.write("                </select>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <label for=\"inputState\">Tipo de documento</label>\n");
      out.write("                    <select id=\"inputState\" class=\"form-control\">\n");
      out.write("                      <option selected>Cedula</option>\n");
      out.write("                      <option>Tarjeta de identidad</option>\n");
      out.write("                      <option>Cedula de extranjeria</option>\n");
      out.write("                    </select>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <label for=\"\">Direccion</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Direccion\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <label for=\"\">Telefono</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Telefono\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <label for=\"\">Fecha de nacimiento</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Fecha de nacimiento\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <br>\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <label for=\"\">Email</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Email\">\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col\">\n");
      out.write("                    <label for=\"\">Contraseña</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control\" placeholder=\"Contraseña\">\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <input type=\"submit\" class=\"btn btn-primary boton\" value=\"Crear\" onclick=\"envio();\">\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <script src=\"js/script.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
