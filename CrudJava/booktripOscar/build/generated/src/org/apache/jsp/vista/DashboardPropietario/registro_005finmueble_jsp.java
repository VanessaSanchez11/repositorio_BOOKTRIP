package org.apache.jsp.vista.DashboardPropietario;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class registro_005finmueble_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Registrar inmueble</title>\n");
      out.write("        <link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css\" integrity=\"sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk\" crossorigin=\"anonymous\">\n");
      out.write("    <!-- Custom styles for this template-->\n");
      out.write("    <link href=\"css/sb-admin-2.min.css\" rel=\"stylesheet\">\n");
      out.write("    <!-- estilos de los estados-->\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/registro_inmueble.css\">\n");
      out.write("     \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <center>\n");
      out.write("             <div  class=\"pagina\">\n");
      out.write("       <div class=\"content\">\n");
      out.write("    \n");
      out.write("<div class=\"cabecera\">\n");
      out.write("            <center>\n");
      out.write("            <img src=\"img/logo.png\">\n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"principal_1\">\n");
      out.write("                             \n");
      out.write("\n");
      out.write("                <div class=\"card\">\n");
      out.write("\n");
      out.write("                    <h5 class=\"card-header info-color dark-text text-center py-4\">\n");
      out.write("                        <strong>Registrar inmueble</strong>\n");
      out.write("                    </h5>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <form action=\"#\">\n");
      out.write("                        \n");
      out.write("                        <div class=\"register_1\">\n");
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
      out.write("                              </div>\n");
      out.write("                         <div class=\"register_2\">\n");
      out.write("                        \n");
      out.write("                        <label for=\"nombre\"><b>Nombre inmueble</b></label>\n");
      out.write("                        <input type=\"text\" id=\"nombre\" class=\"form-control\" placeholder=\"\"><br>\n");
      out.write("                        \n");
      out.write("                        <label for=\"direccion\"><b>Direccion</b></label>\n");
      out.write("                        <input type=\"text\" id=\"direccion\" class=\"form-control\" placeholder=\"\"><br>\n");
      out.write("                        \n");
      out.write("                        <label for=\"capacidad\"><b>Capacidad</b></label>\n");
      out.write("                        <input type=\"number\" id=\"capacidad\" class=\"form-control\" autofocus required maxlength=\"6\" size=\"6\"><br>\n");
      out.write("                        <div class=\"form-group\">\n");
      out.write("                            <label for=\"descripcion\"><b>Descripción</b></label>\n");
      out.write("                            <textarea class=\"form-control\" id=\"descripcion\" rows=\"3\"></textarea>\n");
      out.write("                        </div>\n");
      out.write("                         </div>\n");
      out.write("                        <center>\n");
      out.write("\n");
      out.write("\n");
      out.write("                            <button class=\"btn btn-primary btn-block\" type=\"submit\">Registrar inmueble</button>\n");
      out.write("                            <br>\n");
      out.write("                            <button class=\"btn btn-danger btn-block\" type=\"submit\">Cancelar</button>\n");
      out.write("                        </center>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>  \n");
      out.write("           <div class=\"principal_2\"> \n");
      out.write("               <img src=\"img/finca_1.jpg\" width=\"540 px\" height=\"580px\">\n");
      out.write("</div>\n");
      out.write("        </div>\n");
      out.write("                 </div>\n");
      out.write("    </center>\n");
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
