package org.apache.jsp.vista.Dashboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class editEstado_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("<!doctype html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("  <head>\r\n");
      out.write("    <!-- Required meta tags -->\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/estilosBooktrip.css\">\r\n");
      out.write("     <link rel=\"stylesheet\" href=\"css/estiloValidacion.css\">\r\n");
      out.write("    <!-- Bootstrap CSS -->\r\n");
      out.write("    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-+0n0xVW2eSR5OomGNYDnhzAbDsOXxcvSN1TPprVMTNDbiYZCxYbOOl7+AMvyTG2x\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("    <title>Actulizar estado</title>\r\n");
      out.write("  </head>\r\n");
      out.write("  <body>\r\n");
      out.write("      <div class=\"principal\">\r\n");
      out.write("          \r\n");
      out.write("   \r\n");
      out.write("<center>\r\n");
      out.write("         \r\n");
      out.write("    <div class=\"container \">\r\n");
      out.write("            \r\n");
      out.write("             <div class=\"container  col-md-6 mt-5 bg-light cajita\">\r\n");
      out.write("        <center>\r\n");
      out.write("        <h3>Actualizar estado</h3>\r\n");
      out.write("        <hr>\r\n");
      out.write("        <br>\r\n");
      out.write("        <form action=\"/booktripO/controllerEstado\" method=\"POST\" >\r\n");
      out.write("           \r\n");
      out.write("           \r\n");
      out.write("            <div col-md-6>\r\n");
      out.write("                <div col-md-3><label>Nombre:</label></div>\r\n");
      out.write("                <div col-md-3>\r\n");
      out.write("                    <input type=\"text\" name=\"txtNom\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                    <input type=\"hidden\" name=\"id\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getIdEstado()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\">\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("   \r\n");
      out.write("            <div col-md-6>\r\n");
      out.write("                <div col-md-3><input type=\"submit\" name=\"accion\" value=\"Actualizar\"  class=\"btn btn-success btn-block mt-1\" onclick=\"VolverAEstados()\" ></div>\r\n");
      out.write("                    <div col-md-3> <input type=\"submit\" name=\"accion\" value=\"Regresar\" class=\"btn btn-danger btn-block mt-1 my-4\" onclick=\"VolverAEstados()\" ></div>\r\n");
      out.write("                </div>\r\n");
      out.write("                \r\n");
      out.write("        </form>\r\n");
      out.write("    </center>\r\n");
      out.write("            </div>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("     </div>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.1/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-gtEjrD/SeCtmISkJkNUaaKMoLD0//ElJ19smozuHV6z3Iehds+3Ulb9Bn9Plx0x4\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js\" integrity=\"sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("  </body>\r\n");
      out.write("</html>\r\n");
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
