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
      out.write("      \n");
      out.write("        <link rel=\"stylesheet\"   href=\"vistas/css/Reserva_estilo.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap-grid.min.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap-reboot.min.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\"/>\n");
      out.write("        <script src=\"bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("          <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("         <title>Reservas</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"contenedor\">\n");
      out.write("          <header>\n");
      out.write("              <nav>\n");
      out.write("                  <ul>\n");
      out.write("                      <li> <a href=\"#\">Inicio</a> </li>\n");
      out.write("                      <li> <a href=\"#\">Alojamientos</a> </li>\n");
      out.write("                      <li> <a href=\"#\">Actividades</a> </li>\n");
      out.write("                      <li> <a href=\"#\">Contactenos</a> </li>\n");
      out.write("                 </ul>\n");
      out.write("            </nav>\n");
      out.write("       </header>\n");
      out.write("            \n");
      out.write("       <section class=\"main\">\n");
      out.write("         <div class=\"imagen\">\n");
      out.write("               <img src=\"vistas/imagenes/4.jpg\"/>\n");
      out.write("          <section class=\"Posts\">\n");
      out.write("          <article>\n");
      out.write("               <h2>BIENVENIDO A BOOKTRIP</h2>\n");
      out.write("          </article>\n");
      out.write("          </section>\n");
      out.write("     </section>\n");
      out.write("     <!-- agregar barra lateral -->\n");
      out.write("     <aside>\n");
      out.write("          <div class=\"modulo\">\n");
      out.write("               <h3 class=\"titulo\">RESERVE AQUI</h3>\n");
      out.write("               \n");
      out.write("                <div class=\"form-check\">\n");
      out.write("                  <div class=\"input-group mb-3\">\n");
      out.write("  <div class=\"input-group-prepend\">\n");
      out.write("    <label class=\"input-group-text\" for=\"inputGroupSelect01\">Ciudad</label>\n");
      out.write("  </div>\n");
      out.write("  <select class=\"custom-select\" id=\"inputGroupSelect01\">\n");
      out.write("    <option selected>Seleccione</option>\n");
      out.write("    <option value=\"1\">Bogota</option>\n");
      out.write("    <option value=\"2\">Silvania</option>\n");
      out.write("    <option value=\"3\">Melgar</option>\n");
      out.write("    <option value=\"3\">Girardot</option>\n");
      out.write("    <option value=\"3\">Flandes</option>\n");
      out.write("    <option value=\"3\">Prado</option>\n");
      out.write("  </select>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"input-group mb-3\">\n");
      out.write("  <select class=\"custom-select\" id=\"inputGroupSelect02\">\n");
      out.write("    <option selected>Seleccione</option>\n");
      out.write("    <option value=\"1\">Hotel</option>\n");
      out.write("    <option value=\"2\">Finca</option>\n");
      out.write("    <option value=\"3\">finca hotel</option>\n");
      out.write("    <option value=\"3\">Apartemento</option>\n");
      out.write("    <option value=\"3\">Camping</option>\n");
      out.write("  </select>\n");
      out.write("  <div class=\"input-group-append\">\n");
      out.write("    <label class=\"input-group-text\" for=\"inputGroupSelect02\">Alojamiento</label>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"input-group mb-3\">\n");
      out.write("  <div class=\"input-group-prepend\">\n");
      out.write("    <button class=\"btn btn-outline-secondary\" type=\"button\">Button</button>\n");
      out.write("  </div>\n");
      out.write("  <select class=\"custom-select\" id=\"inputGroupSelect03\" aria-label=\"Example select with button addon\">\n");
      out.write("    <option selected>Choose...</option>\n");
      out.write("    <option value=\"1\">One</option>\n");
      out.write("    <option value=\"2\">Two</option>\n");
      out.write("    <option value=\"3\">Three</option>\n");
      out.write("  </select>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<div class=\"input-group\">\n");
      out.write("  <select class=\"custom-select\" id=\"inputGroupSelect04\" aria-label=\"Example select with button addon\">\n");
      out.write("    <option selected>Choose...</option>\n");
      out.write("    <option value=\"1\">One</option>\n");
      out.write("    <option value=\"2\">Two</option>\n");
      out.write("    <option value=\"3\">Three</option>\n");
      out.write("  </select>\n");
      out.write("  <div class=\"input-group-append\">\n");
      out.write("    <button class=\"btn btn-outline-secondary\" type=\"button\">Button</button>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("                </div>\n");
      out.write("                    \n");
      out.write("               \n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        <div class=\"modulo\">\n");
      out.write("            <h3 class=\"titulo\">Detalle del Pago</h3>\n");
      out.write("            <div class=\"total\">\n");
      out.write("            <h4>Total</h4>\n");
      out.write("            <span class=\"signo\">$<b class=\"signo2\">30000</b></span>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("         \n");
      out.write("          <div class=\"modulo\">\n");
      out.write("            <h3 class=\"titulo\">Titular de la Actividad</h3>\n");
      out.write("            <form>\n");
      out.write("                <div class=\"form-row\">\n");
      out.write("                  <div class=\"col-md-6 mb-3\">\n");
      out.write("                    <label for=\"validationServer01\">Nombres</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control is-valid\" id=\"validationServer01\" value=\"\" required>\n");
      out.write("                    <div class=\"valid-feedback\">\n");
      out.write("                    \n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"col-md-6 mb-3\">\n");
      out.write("                    <label for=\"validationServer02\">Apellidos</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control is-valid\" id=\"validationServer02\" value=\"\" required>\n");
      out.write("                    <div class=\"valid-feedback\">\n");
      out.write("                    \n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"form-row\">\n");
      out.write("                  <div class=\"col-md-6 mb-3\">\n");
      out.write("                    <label for=\"validationServer03\">Ciudad</label>\n");
      out.write("                    <input type=\"text\" class=\"form-control is-invalid\" id=\"validationServer03\" required>\n");
      out.write("                    <div class=\"invalid-feedback\">\n");
      out.write("                      \n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("\n");
      out.write("                    <div class=\"col-md-3 mb-3\">\n");
      out.write("                        <label for=\"validationServer05\">Email</label>\n");
      out.write("                        <input type=\"text\" class=\"form-control is-invalid\" id=\"validationServer05\" required>\n");
      out.write("\n");
      out.write("                        <div class=\"invalid-feedback\">\n");
      out.write("                          \n");
      out.write("                        </div>\n");
      out.write("                      </>\n");
      out.write("                    <div class=\"invalid-feedback\">\n");
      out.write("                      \n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                \n");
      out.write("                <div class=\"form-group\">\n");
      out.write("                  <div class=\"form-check\">\n");
      out.write("                    <input class=\"form-check-input is-invalid\" type=\"checkbox\" value=\"\" id=\"invalidCheck3\" required>\n");
      out.write("                    <label class=\"form-check-label\" for=\"invalidCheck3\">\n");
      out.write("                      Aceptar terminos y condiciones\n");
      out.write("                    </label>\n");
      out.write("                    <div class=\"invalid-feedback\">\n");
      out.write("                    \n");
      out.write("                    </div>\n");
      out.write("                  </div>\n");
      out.write("                </div>\n");
      out.write("                <button class=\"btn btn-primary\" type=\"submit\">Pagar</button>\n");
      out.write("              </form>\n");
      out.write("            \n");
      out.write("          \n");
      out.write("       </div>\n");
      out.write("     </aside>\n");
      out.write("     <footer>\n");
      out.write("          <p> CopyRight @gabrielbernal - Booktrip.co</p>\n");
      out.write("     </footer>\n");
      out.write("</div>\n");
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
