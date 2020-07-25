package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class estado_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vista/css/bootstrap-grid.min.css\"\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vista/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vista/bootstrap/css/estilo.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vista/css/estado_estilo.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    <center>\n");
      out.write("        <div class=\"principal\">\n");
      out.write("            <div class=\"cajita\">\n");
      out.write("                <center>\n");
      out.write("                    <img src=\"vista/imagenes/logo.png\">\n");
      out.write("                    <br>\n");
      out.write("                </center>                    \n");
      out.write("\n");
      out.write("                <div class=\"card\">\n");
      out.write("\n");
      out.write("                    <h5 class=\"card-header info-color white-text text-center py-4\">\n");
      out.write("                        <strong>Estados</strong>\n");
      out.write("                    </h5>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <form action=\"\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <center>\n");
      out.write("                            <label for=\"idActividad\"><b>Codigo estado</b></label><br>\n");
      out.write("                            <input type=\"text\" id=\"idActividad\" class=\"form-control\" placeholder=\"El sistema asigna automaticamente el codigo\">\n");
      out.write("                            <br>\n");
      out.write("                            <label for=\"idEstado\"><b>Departamento</b></label><br>\n");
      out.write("                            <select class=\"browser-default custom-select mb-4\" id=\"idEstado\">\n");
      out.write("                                <option value=\"\" disabled=\"\" selected=\"\">Selecione el estado</option>\n");
      out.write("                                <option value=\"1\">x</option>\n");
      out.write("                                <option value=\"2\">x</option>\n");
      out.write("                                <option value=\"3\">x</option>\n");
      out.write("                            </select> <br> \n");
      out.write("\n");
      out.write("                            <button class=\"btn btn-success btn-block\" type=\"submit\">Registrar actividad</button><br>\n");
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
      out.write("</body>\n");
      out.write("</html>\n");
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
