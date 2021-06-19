package org.apache.jsp.vista.Dashboard.municipio;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.departamento;
import controlador.departamentosDAO;
import modelo.municipios;
import controlador.municipiosDAO;
import java.sql.ResultSet;
import java.util.ArrayList;

public final class add_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\r\n");
      out.write("        <title>JSP Page</title>\r\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estilosBooktrip.css\">\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-giJF6kkoqNQ00vy+HMDP7azOuL0xtbfIcaT9wjKHr8RbDVddVHyTfAAsrekwKmP1\" crossorigin=\"anonymous\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("    <center>\r\n");
      out.write("        <div class=\"fondo-actividad container my-10\" style=\"background: #4d80e4\">\r\n");
      out.write("            <div class=\"container  col-md-6 mt-5 bg-light\">\r\n");
      out.write("                <h3>Agregar Nuevo Municipio</h3>\r\n");
      out.write("                <hr>\r\n");
      out.write("                <br>\r\n");
      out.write("                <form action=\"/booktripO/controllerActividad\" method=\"POST\">\r\n");
      out.write("                    <label>DEPARTAMENTO</label>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-sm-6\">\r\n");
      out.write("\r\n");
      out.write("                        ");

                            departamentosDAO miMDAO = new departamentosDAO();
                            ArrayList<departamento> listaD = miMDAO.ConsularListaDepartamento("");
                        
      out.write(" \r\n");
      out.write("                        <select name=\"txtDepartamento\">\r\n");
      out.write("                            ");

                                for (departamento i : listaD) {
      out.write("\r\n");
      out.write("                            <option value=\"");
      out.print(i.getIdDepartamento());
      out.write('"');
      out.write('>');
      out.print(i.getNombre());
      out.write(" </option>\r\n");
      out.write("                            ");

                                }
                            
      out.write("\r\n");
      out.write("                        </select>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div>     \r\n");
      out.write("                        <label>nombre</label>\r\n");
      out.write("                        <input type=\"text\" name=\"txtNombre\">\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div>  \r\n");
      out.write("                        <input type=\"submit\" name=\"accion\" value=\"Guardar\" class=\"btn-primary btn-block\">\r\n");
      out.write("                        <input type=\"submit\" name=\"accion\" value=\"Regresar\" class=\"btn-danger btn-block\">\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </center>\r\n");
      out.write("    <script src=\"../js/jquery-1.11.0.min.js\"></script>\r\n");
      out.write("    <script src=\"../js/validaciones.js\"</script>\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\" integrity=\"sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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
