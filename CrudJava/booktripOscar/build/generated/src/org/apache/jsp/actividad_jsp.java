package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class actividad_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>Actividades</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vista/bootstrap/css/bootstrap-grid.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vista/bootstrap/css/bootstrap.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vista/css/estilo.css\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"vista/css/actividad_estilo.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
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
      out.write("                        <strong>Registrar actividad</strong>\n");
      out.write("                    </h5>\n");
      out.write("\n");
      out.write("                        <form action=\"/ControlInsert\">\n");
      out.write("\n");
      out.write("                            <label for=\"idActividad\"><b>codigo actividad</b></label>\n");
      out.write("                            <input type=\"text\" id=\"idActividad\" class=\"form-control\" placeholder=\"\">\n");
      out.write("                            <label for=\"idNombre\">Nombre actividad</label>\n");
      out.write("                            <input type=\"text\" id=\"idNombre\" class=\"form-control\" placeholder=\"\">\n");
      out.write("                            <label for=\"\">Lugar</label>\n");
      out.write("                            <input type=\"text\" id=\"\" class=\"form-control\" placeholder=\"\">\n");
      out.write("                            <label for=\"idMunicipio\">Codigo municipio</label>\n");
      out.write("                            <input type=\"text\" id=\"idMunicipio\" class=\"form-control\" placeholder=\"\">\n");
      out.write("                            <div class=\"form-group\">\n");
      out.write("                                <label for=\"exampleFormControlTextarea3\">Descripción</label>\n");
      out.write("                                <textarea class=\"form-control\" id=\"exampleFormControlTextarea3\" rows=\"3\"></textarea>\n");
      out.write("                            </div>\n");
      out.write("                            <center>\n");
      out.write("                                \n");
      out.write("                                \n");
      out.write("                            <button class=\"btn btn-success btn-block\" type=\"submit\">Registrar actividad</button>\n");
      out.write("                            <br>\n");
      out.write("                            <button class=\"btn btn-danger btn-block\" type=\"submit\">Cancelar</button>\n");
      out.write("                            </center>\n");
      out.write("                        </form>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("            </div>  \n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("<script>\n");
      out.write("    var nombre =prompt(\"Dime tu nombre\");\n");
      out.write("     alert( 'Su nombre es: '+nombre );\n");
      out.write("</script>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </center>\n");
      out.write("\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js\" integrity=\"sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/js/bootstrap.min.js\" integrity=\"sha384-OgVRvuATP1z7JjHLkuOU7Xw704+h835Lr+6QL9UvYjZE3Ipu6Tp75j7Bh/kR0JKI\" crossorigin=\"anonymous\"></script>\n");
      out.write("</body>\n");
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
