package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.inmuebles;
import controlador.inmueblesDAO;
import java.util.ArrayList;
import modelo.usuario;
import controlador.usuarioDao;

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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("\n");
      out.write("        <link rel=\"stylesheet\"   href=\"css/Pagos_estilo.css\" />\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap-grid.min.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap-reboot.min.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\"/>\n");
      out.write("        <script src=\"bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        <script src=\"bootstrap/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("        <title>Pagos</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"contenedor\">\n");
      out.write("\n");
      out.write("            <section class=\"main\">\n");
      out.write("                <div class=\"imagen\">\n");
      out.write("                    <img src=\"imagenes/2.jpg\"/>\n");
      out.write("                </div>    \n");
      out.write("                <section class=\"Posts\">\n");
      out.write("                    <article>\n");
      out.write("                        <h2>Recorrido en lancha por el Rio Magdalena</h2>\n");
      out.write("                        <p>Recorrido en lancha por el Rio Magdalena, principal arteria fluvial del país y un atractivo natural e histórico de Girardot, en el que se pueden realizar actividades como navegación de contemplación, pesca artesanal y balneario. En décadas pasadas fue el soporte que permitió que Girardot constituyera uno de los principales puertos fluviales por donde desemboca el río Bogotá y llegaba mercancía enviada desde Barranquilla con destino a Bogotá y a través del cual se embarcaba el café de exportación proveniente del centro del país.</p> \n");
      out.write("                    </article>\n");
      out.write("                </section>\n");
      out.write("            </section>\n");
      out.write("            <!-- agregar barra lateral -->\n");
      out.write("            <aside>\n");
      out.write("                <form class=\"user\" action=\"/booktripG/registroPagos\" method=\"post\" onsubmit=\"return validarInformacionPagos()\">\n");
      out.write("\n");
      out.write("                    <div class=\"input-group mb-3\">\n");
      out.write("\n");
      out.write("                        <input name=\"idUsuario\" class=\"form-control d-none my-1\" id=\"txtUsuario\" >\n");
      out.write("                        ");

                            usuarioDao miusuarioDAO = new usuarioDao();
                            ArrayList<usuario> milistausuario = miusuarioDAO.ListadoUsuarios("");
                            out.println("<select class='form-control' id='selectIdUsuario' size= '1' onchange='setIdUsuario()'>");
                            out.println("<option value=''>" + "--seleccione usuario--" + "</option>");

                            for (usuario c : milistausuario) {
                                out.println("<option value='" + c.getIdUsuario() + "'>" + c.getNombre() + "</option>");

                            }
                            out.println("</select>");
                        
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"input-group mb-3\">\n");
      out.write("                        <input name=\"idInmueble\" class=\"form-control d-none my-1\" id=\"txtInmueble\" >\n");
      out.write("                        ");

                            inmueblesDAO miinmuebleDAO = new inmueblesDAO();
                            ArrayList<inmuebles> milistainmueble = miinmuebleDAO.ConsultarListadoInmueble("");
                            out.println("<select class='form-control' id='selectIdInmueble' size= '1' onchange='setIdInmueble()'>");
                            out.println("<option value=''>" + "--seleccione inmueble--" + "</option >");
                            for (inmuebles c : milistainmueble) {
                                out.println("<option value='" + c.getIdInmueble() + "'>" + c.getNombre() + "</option>");

                            }
                            out.println("</select>");
                        
      out.write(" \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"input-group mb-3\">\n");
      out.write("\n");
      out.write("                        <div class=\"input-group-prepend\">\n");
      out.write("\n");
      out.write("                            <input type=\"file\" class=\"form-control \" name =\"adjunto\" id=\"txtAdjunto\" placeholder=\"Adjunto\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"input-group mb-3\">\n");
      out.write("                        <div class=\"input-group-prepend\">\n");
      out.write("\n");
      out.write("                            <input type=\"text\" class=\"form-control \" name =\"monto\" id=\"txtMonto\" placeholder=\"Monto\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>                       \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"input-group mb-3\">\n");
      out.write("                        <div class=\"input-group-prepend\">\n");
      out.write("\n");
      out.write("                            <input type=\"text\" class=\"form-control \" name =\"fechaPago\" id=\"txtFechapago\" placeholder=\"FechaPago\">\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <div class=\"input-group mb-3\">\n");
      out.write("                        <div class=\"input-group-prepend\">\n");
      out.write("                            <input type=\"text\" class=\"form-control \" name =\"fechaPago2\" id=\"txtFechaPago2\" placeholder=\"FechaPago2\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"col-12 py-3\">\n");
      out.write("                        <input class=\"d-none\" id=\"txtBandera\" type=\"text\" name=\"banderaRegistro\" > \n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                    <input  type=\"submit\" class=\"btn btn-dark\" value=\"Enviar\">\n");
      out.write("                </form>\n");
      out.write("            </aside>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <script src=\"js/jquery-1.11.0.min.js\"></script>\n");
      out.write("        <script src=\"js/gestionarPagos.js\"></script>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
