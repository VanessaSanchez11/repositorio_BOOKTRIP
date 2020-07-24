package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Pagina1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("         <link rel=\"stylesheet\" href=\"vistas/css/Pagina1_estilo.css\">\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("       \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"contenedor\">\n");
      out.write("          <header>\n");
      out.write("              <nav>\n");
      out.write("                  <ul>\n");
      out.write("                      <li> <a href=\"#\">Hoteles</a> </li>\n");
      out.write("                      <li> <a href=\"#\">Actividades</a> </li>\n");
      out.write("                      <li> <a href=\"#\">Comuniquese con nosotros</a> </li>\n");
      out.write("                      <li> <a href=\"#\">Inicie sesión</a> </li>\n");
      out.write("                 </ul>\n");
      out.write("            </nav>\n");
      out.write("       </header>\n");
      out.write("       <section class=\"main\">\n");
      out.write("         <div class=\"imagen\">\n");
      out.write("               <img src=\"vistas/imagenes/finca.jpg\">\n");
      out.write("          </div>\n");
      out.write("          <section class=\"Posts\">\n");
      out.write("          <article>\n");
      out.write("               <h2>BookTrip</h2>\n");
      out.write("               <p>La misión de BookTrip es crear experiencias únicas para los propietarios y viajeros de Bogota y sus alrededores. Por eso, BookTrip permite a sus usuarios ahorrar dinero y acceder a lugares únicos que bajo otro modelo simplemente no estarían disponibles. La forma en que es presentada la oferta pretende que el usuario tenga la mayor cantidad de información posible, con el fin de evitar sorpresas negativas. El usuario podrá analizar la oferta disponible a partir de las fotos de la propiedad, el perfil del Propietario, la valoración de otros usuarios que ya han disfrutado del lugar. Lo anterior apunta a que la experiencia sea cada vez más social, confortable y segura.</p> \n");
      out.write("                <h2>Como Viajar con BookTrip?</h2>\n");
      out.write("               <p>\n");
      out.write("                Al ingresar a BookTrip lo primero que hay que hacer es seleccionar la ciudad al cual te diriges, la fecha de llegada y salida, y el número de personas que se hospedarán. A partir de esta información la plataforma mostrará una amplia oferta de alojamientos, sobre los que podrás escoger entre habitaciones, casas, apartamentos o casa quintas. También se podrá filtrar por rango de precio según el presupuesto,ciudad o municipio, y los servicios que deseas que tenga esta propiedad (Internet, cocina, TV, lavaropa, piscina, jacuzzi, chimenea o gimnasio son algunas de las variables que puedes tener en cuenta para la búsqueda).</p>\n");
      out.write("          </article>\n");
      out.write("             \n");
      out.write("          </div>\n");
      out.write("     </aside>\n");
      out.write("     <footer>\n");
      out.write("          <p>copyright Gabriel Bernal</p>\n");
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
