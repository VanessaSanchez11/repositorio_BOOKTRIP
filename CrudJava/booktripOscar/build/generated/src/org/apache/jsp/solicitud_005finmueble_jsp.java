package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class solicitud_005finmueble_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link rel=\"stylesheet\"  href=\"vista/css/solicitud_inmueble.css\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form class=\"formulario\">\n");
      out.write("\n");
      out.write("            <h1>SOLICITA TU INMUEBLE</h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div>\n");
      out.write("                <label for:nombre>USUARIO </label>\n");
      out.write("                <input type=\"text\" id=\"nombre\"  name=\"nombre\" size=\"15\" maxlength=\"15\" placeholder=\"ejem:Carolina Ortiz\">\n");
      out.write("                <br>\n");
      out.write("                <label for:contraseña>CONTRASEÑA   </label>v  \n");
      out.write("                <input type=\"text\" id=\"contraseña\" name=\"nombre\" size=\"15\" maxlength=\"15\">\n");
      out.write("                <br>\n");
      out.write("                <label for:propiedad>NOMBRE DE LA PROPIEDAD </label>\n");
      out.write("                <input type=\"text\" id=\"propiedad\"  name=\"nombre\" size=\"15\" maxlength=\"15\" placeholder=\"ejem:Santa Barbara\">\n");
      out.write("                <br>\n");
      out.write("                <label for:ubicacion>UBICACION </label>\n");
      out.write("                <selec>\n");
      out.write("                    <option>Zipaquira</option>\n");
      out.write("                    <option>Fusagasuga</option>\n");
      out.write("                    <option>La calera</option> \n");
      out.write("                    <option>Melgar</option> \n");
      out.write("                    <option>Girardo</option> \n");
      out.write("                    <option>Sasaima</option> \n");
      out.write("                    <option>otro </option>\n");
      out.write("                </selec>\n");
      out.write("                <br>\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("                <input class=\"boton\"  type=\"submit\" value=\"SOLICITAR\">\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </form>\n");
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
