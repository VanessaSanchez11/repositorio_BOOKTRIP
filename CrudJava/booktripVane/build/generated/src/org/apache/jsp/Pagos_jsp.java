package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Pagos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\"   href=\"vistas/css/Pagos_estilo.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap-grid.min.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap-reboot.min.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\"/>\n");
      out.write("        <script src=\"bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("          <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("         <title>Pagos</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"contenedor\">\n");
      out.write("          <header>\n");
      out.write("              <nav>\n");
      out.write("                  <ul>\n");
      out.write("                      <li> <a href=\"#\">Inicio</a> </li>\n");
      out.write("                      <li> <a href=\"#\">Alojamientos</a> </li>\n");
      out.write("                      <li> <a href=\"#\">Actividades</a> </li>\n");
      out.write("                      <li> <a href=\"#\"> Contactenos</a> </li>\n");
      out.write("                 </ul>\n");
      out.write("            </nav>\n");
      out.write("       </header>\n");
      out.write("            \n");
      out.write("       <section class=\"main\">\n");
      out.write("         <div class=\"imagen\">\n");
      out.write("               <img src=\"vistas/imagenes/2.jpg\"/>\n");
      out.write("          <section class=\"Posts\">\n");
      out.write("          <article>\n");
      out.write("               <h2>Recorrido en lancha por el Rio Magdalena</h2>\n");
      out.write("               <p>Recorrido en lancha por el Rio Magdalena, principal arteria fluvial del país y un atractivo natural e histórico de Girardot, en el que se pueden realizar actividades como navegación de contemplación, pesca artesanal y balneario. En décadas pasadas fue el soporte que permitió que Girardot constituyera uno de los principales puertos fluviales por donde desemboca el río Bogotá y llegaba mercancía enviada desde Barranquilla con destino a Bogotá y a través del cual se embarcaba el café de exportación proveniente del centro del país.</p> \n");
      out.write("          </article>\n");
      out.write("          </section>\n");
      out.write("     </section>\n");
      out.write("     <!-- agregar barra lateral -->\n");
      out.write("     <aside>\n");
      out.write("          <div class=\"modulo\">\n");
      out.write("               <h3 class=\"titulo\">Seleccione metodo de Pago</h3>\n");
      out.write("               <ul>\n");
      out.write("                <div class=\"form-check\">\n");
      out.write("                    <input class=\"form-check-input\" type=\"radio\" name=\"exampleRadios\" id=\"exampleRadios1\" value=\"Visa\" checked>\n");
      out.write("                    <label class=\"form-check-label\" for=\"\">\n");
      out.write("                      VISA\n");
      out.write("                    </label>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-check\">\n");
      out.write("                    <input class=\"form-check-input\" type=\"radio\" name=\"exampleRadios\" id=\"exampleRadios2\" value=\"Master Card\">\n");
      out.write("                    <label class=\"form-check-label\" for=\"\">\n");
      out.write("                      MASTER CARD\n");
      out.write("                    </label>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-check\">\n");
      out.write("                    <input class=\"form-check-input\" type=\"radio\" name=\"exampleRadios\" id=\"exampleRadios3\" value=\"AMEX\">\n");
      out.write("                    <label class=\"form-check-label\" for=\"\">\n");
      out.write("                      AMEX\n");
      out.write("                    </label>\n");
      out.write("                  </div>\n");
      out.write("                  <div class=\"form-check\">\n");
      out.write("                    <input class=\"form-check-input\" type=\"radio\" name=\"exampleRadios\" id=\"exampleRadios3\" value=\"Codensa\">\n");
      out.write("                    <label class=\"form-check-label\" for=\"\">\n");
      out.write("                      CODENSA\n");
      out.write("                    </label>\n");
      out.write("                  </div>\n");
      out.write("                    \n");
      out.write("               </ul>\n");
      out.write("          </div>\n");
      out.write("\n");
      out.write("        <div class=\"modulo\">\n");
      out.write("            <h3 class=\"titulo\">Detalle del Pago</h3>\n");
      out.write("            <div class=\"total\">\n");
      out.write("            <h4>Total</h4>\n");
      out.write("            <span class=\"signo\">$<b class=\"signo2\">30000</b></span>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("          <div class=\"modulo\">\n");
      out.write("               <h3 class=\"titulo\">Cuotas a Diferir</h3>\n");
      out.write("               <select class=\"custom-select\">\n");
      out.write("                <option selected>cuotas</option>\n");
      out.write("                <option value=\"1\">1.Cuota</option>\n");
      out.write("                <option value=\"2\">12.cuotas</option>\n");
      out.write("                <option value=\"3\">24.cuotas</option>\n");
      out.write("              </select>\n");
      out.write("               \n");
      out.write("             \n");
      out.write("          </div>\n");
      out.write("\n");
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
