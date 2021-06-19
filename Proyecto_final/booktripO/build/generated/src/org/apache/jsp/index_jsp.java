package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("   <!-- <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap-grid.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap-reboot.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">-->\n");
      out.write("   <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x\" crossorigin=\"anonymous\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"vista/css/style.css\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=PT+Serif:ital,wght@1,700&display=swap\" rel=\"stylesheet\">\n");
      out.write("    <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("    <script src=\"bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    <title>Booktrip</title>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <header>\n");
      out.write("        <nav class=\"navbar navbar-light bg-primary justify-content-between\">\n");
      out.write("            <a href=\"#\"><img src=\"vista/imagenes/logo.JPG\" alt=\"\"></a>\n");
      out.write("            <h1 class=\"font-italic m-auto text-uppercase txt-title text-white \">Booktrip</h1>\n");
      out.write("            <form class=\"form-inline\">\n");
      out.write("                <a href=\"vista/Dashboard/usuario/add.jsp\" class=\"btn btn-outline-light mr-sm-4\">Registrarse</a>\n");
      out.write("                <a href=\"vista/login.jsp\" class=\"btn btn-outline-light mr-sm-4\">Iniciar sesion</a>\n");
      out.write("                \n");
      out.write("            </form>\n");
      out.write("        </nav>\n");
      out.write("    </header>\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div class=\"container\">\n");
      out.write("\n");
      out.write("            <div class=\"input-group mb-7 mt-5\">\n");
      out.write("                <input type=\"text\" class=\"form-control\" placeholder=\"Busca tu destino\" aria-label=\"Recipient's username\" aria-describedby=\"basic-addon2\">\n");
      out.write("                <div class=\"input-group-append\">\n");
      out.write("                    <button class=\"btn btn-outline-primary\" type=\"button\">Buscar</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <h1 class=\"font-italic  text-lg-left mt-4 mb-0\">Destinos</h1>\n");
      out.write("\n");
      out.write("            <hr class=\"mt-2 mb-5\">\n");
      out.write("\n");
      out.write("            <div class=\"row text-center text-lg-left mb-4\">\n");
      out.write("\n");
      out.write("                <div class=\"col-lg-4 col-md-4 col-6 mb-3\">\n");
      out.write("\n");
      out.write("                    <img class=\"img-fluid img-thumbnail\" src=\"vista/imagenes/palmera.jpg\" alt=\"\">\n");
      out.write("                    <h5 class=\"mt-3 font-weight-bold text-info\">San Andres</h5>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 col-md-4 col-6\">\n");
      out.write("\n");
      out.write("                    <img class=\"img-fluid img-thumbnail\" src=\"vista/imagenes/desierto.jpg\" alt=\"\">\n");
      out.write("                    <h5 class=\"mt-3 font-weight-bold text-info\">Desierto de la tatacoa</h5>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 col-md-4 col-6\">\n");
      out.write("\n");
      out.write("                    <img class=\"img-fluid img-thumbnail\" src=\"vista/imagenes/arbol.jpg\" alt=\"\">\n");
      out.write("                    <h5 class=\"mt-3 font-weight-bold text-info\">Tolima</h5>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 col-md-4 col-6\">\n");
      out.write("\n");
      out.write("                    <img class=\"img-fluid img-thumbnail\" src=\"vista/imagenes/agua.jpg\" alt=\"\">\n");
      out.write("                    <h5 class=\"mt-3 font-weight-bold text-info\">Cartagena</h5>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 col-md-4 col-6\">\n");
      out.write("\n");
      out.write("                    <img class=\"img-fluid img-thumbnail\" src=\"vista/imagenes/mujer.jpg\" alt=\"\">\n");
      out.write("                    <h5 class=\"mt-3 font-weight-bold text-info\">Santa Marta</h5>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-lg-4 col-md-4 col-6\">\n");
      out.write("\n");
      out.write("                    <img class=\"img-fluid img-thumbnail\" src=\"vista/imagenes/patineta.jpg\" alt=\"\">\n");
      out.write("                    <h5 class=\"mt-3 font-weight-bold text-info\">Medellin</h5>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <section class=\"banner\">\n");
      out.write("            <div class=\"contenedorTexto\">\n");
      out.write("                <h2>BOGOTÁ</h2>\n");
      out.write("                <div class=\"btn\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-outline-dark\">Ver Lugares</button>\n");
      out.write("                    <button type=\"button\" class=\"btn btn-outline-dark\">Reservar ahora</button>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </section>\n");
      out.write("        <h1 class=\"font-weight-bold text-center text-lg-center mt-4 mb-5\">Actividades</h1>\n");
      out.write("        <section class=\"actividades\">\n");
      out.write("\n");
      out.write("            <div class=\"card \">\n");
      out.write("                <img class=\"card-img-top\" src=\"vista/imagenes/escalar.png\" alt=\"Card image cap\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h5 class=\"card-title\">Escalar</h5>\n");
      out.write("                    <p class=\"card-text\">Es una práctica deportiva que, en su modalidad cl?sica, consiste en subir o recorrer paredes de roca, laderas escarpadas u otros relieves naturales.</p>\n");
      out.write("                    <a href=\"#\" class=\"btn btn-primary\">Ir a la actividad</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <img class=\"card-img-top\" src=\"vista/imagenes/treaking.jpg\" alt=\"Card image cap\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h5 class=\"card-title\">Treaking</h5>\n");
      out.write("                    <p class=\"card-text\">consiste en recorrer a pie largas distancias o zonas determinadas, generalmente de alta monta?a y poco frecuentadas por el turismo convencional.</p>\n");
      out.write("                    <a href=\"#\" class=\"btn btn-primary\">Ir a la actividad</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <img class=\"card-img-top\" src=\"vista/imagenes/rafting.jpeg\" alt=\"Card image cap\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h5 class=\"card-title\">Rafting</h5>\n");
      out.write("                    <p class=\"card-text\">Es una actividad deportiva y recreativa que consiste en recorrer el r?o en la direcci?n de la corriente (r?o abajo)</p>\n");
      out.write("                    <a href=\"#\" class=\"btn btn-primary\">Ir a la actividad</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card \">\n");
      out.write("                <img class=\"card-img-top\" src=\"vista/imagenes/futbol.jpg\" alt=\"Card image cap\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h5 class=\"card-title\">Futbol</h5>\n");
      out.write("                    <p class=\"card-text\">Podras encontran canchas de futbol 5, futbol 8 y hasta futbol 11 , ideal para grupo de amigos o familia.</p>\n");
      out.write("                    <a href=\"#\" class=\"btn btn-primary\">Ir a la actividad</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <img class=\"card-img-top\" src=\"vista/imagenes/evento.jpg\" alt=\"Card image cap\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h5 class=\"card-title\">Eventos Especiales</h5>\n");
      out.write("                    <p class=\"card-text\">Fiestas de 15 , matrimonio,despedida de 11, podra reservarlo para cualquier evento que desee.</p>\n");
      out.write("                    <a href=\"#\" class=\"btn btn-primary\">Ir a la actividad</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <img class=\"card-img-top\" src=\"vista/imagenes/billar.jpg\" alt=\"Card image cap\">\n");
      out.write("                <div class=\"card-body\">\n");
      out.write("                    <h5 class=\"card-title\">Billar</h5>\n");
      out.write("                    <p class=\"card-text\">Es un deporte de precisi?n que se practica impulsando con un taco un n?mero variable de bolas .</p>\n");
      out.write("                    <a href=\"#\" class=\"btn btn-primary\">Ir a la actividad</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </section>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <footer>\n");
      out.write("        <p>BOOKTRIP</p>\n");
      out.write("    </footer>\n");
      out.write("\n");
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
