package org.apache.jsp.vista.Dashboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.estados;
import controlador.estadosDAO;
import java.util.ArrayList;

public final class listadoEstados_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<body onload=\"visualizaOculta('");
      out.print(request.getParameter("Vista"));
      out.write("');\">\n");
      out.write("    ");
 String buscando = request.getParameter("buscando");
        if (buscando == null) {
            buscando = "";
        }
    
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("        <!-- Page Heading -->\n");
      out.write("        <div class=\"d-sm-flex align-items-center justify-content-between mb-4\">\n");
      out.write("            <h1 class=\"h3 mb-0 text-gray-800\">Dashboard</h1>\n");
      out.write("            <!-- <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm\"> Lista de usuarios</a>\n");
      out.write("           <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-success shadow-sm\"> Consultar usuario</a>\n");
      out.write("           <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-warning shadow-sm\"> Actualizar usuario</a>\n");
      out.write("           <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-danger shadow-sm\"> Eliminar usuario</a> -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\" align-items-center justify-content-between mb-4\">\n");
      out.write("\n");
      out.write("            <button type=\"button\" class=\"d-none d-sm-inline-block btn btn-sm btn-warning shadow-sm\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\" onClick=\"visualizaOculta('Actualizar')\">Actualizar Usuarios</button>\n");
      out.write("            <button type=\"button\" class=\"d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\" onClick=\"visualizaOculta('Listado')\">Listado Usuarios</button>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write(" <!-- ---------------------------------------------------------------------------------------- -->   \n");
      out.write(" \n");
      out.write("        <div class=\"contenedor\">\n");
      out.write("\n");
      out.write("            <h1>Lista</h1>\n");
      out.write("\n");
      out.write("            <div class=\"row justify-content-md-center\">\n");
      out.write("\n");
      out.write("                <div id=\"Actualizar\" class=\"bd-example d-none \">\n");
      out.write("                    <h1>Aqui puede Actualizar su estado</h1>\n");
      out.write("                    <form action=\"/booktripPLaces/actualizarEstado\" method= \"post\" >\n");
      out.write("                        \n");
      out.write("                        <div class=\"form-group row d-flex justify-content-around\">\n");
      out.write("                            <div class=\"col-sm-6 mb-3 mb-sm-0 \">\n");
      out.write("                                <input type=\"text\" class=\"form-control  \" name=\"idEstado\" id=\"idEstado\" value=\"");
      out.print(request.getParameter("idEstado"));
      out.write("\">\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <input type=\"text\" class=\"form-control \" name=\"nombre\" id=\"nombre\" value=\"");
      out.print(request.getParameter("apellido"));
      out.write("\">\n");
      out.write("                                \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                       \n");
      out.write("\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-primary btn-user btn-block\" value=\"Actualizar\">\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <!-- ---------------------------------------------------------------------------------------- -->            \n");
      out.write("            <div class=\"container\">\n");
      out.write("                <form action=\"listarEstado\" method = \"post\" >\n");
      out.write("                    <div class=\"row justify-content-md-center\">\n");
      out.write("                        <div id=\"Listado\" class=\"bd-example\">\n");
      out.write("\n");
      out.write("                            <div id=\"ControlRegistro\" class=\"input-group\">\n");
      out.write("\n");
      out.write("                                <input id =\"txt_Id_Consultado\" type = \"text\" class=\"form-control\"\n");
      out.write("                                       name= \"IdConsultado\" value=\"");
      out.print(buscando);
      out.write("\" autofocus\n");
      out.write("                                       placeholder=\"Buscar\"/>\n");
      out.write("                                <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"dropdown\"\n");
      out.write("                                        aria-haspopup=\"true\" aria-expanded=\"false\"\n");
      out.write("                                        onClick=\"realizarBusqueda()\">Buscar</button>\n");
      out.write("                            </div>\n");
      out.write("                            <br>\n");
      out.write("                            <div>\n");
      out.write("                                <h1>Listado Usuarios</h1>\n");
      out.write("                                <br>\n");
      out.write("                                <div id=\"Tabla_Usuarios\"></div>\n");
      out.write("                                ");

                                    estadosDAO estadosC = new estadosDAO();
                                    ArrayList<estados> milistaestado = new ArrayList<estados>();
                                    milistaestado = estadosC.ConsultarListadoEstado(buscando);
                                    out.println("<table class='table table-bordered table-responsive' id='dataTable'><tr><td>IdEstado</td><td>Nombre</td>"
                                             + "<td>Editar</td > <td>Eliminar</td ></tr>");
                                    for (estados u : milistaestado) {
                                        out.println("<tr>");
                                        out.println("<td>" + u.getIdEstado() + "</td>");
                                        out.println("<td>" + u.getNombre() + "</td>");
                             
                                       
                                        
                                        out.println("<td>" + "<input type = 'submit' class='btn btn-warning form-control btn btn-login' value='Actualizar' name ='Actualizar' onclick ='SetIdConsulta(" + u.getIdEstado() + ")'/>" + "</td>");

                                        out.println("<td>" + "<input type = 'submit' class='btn btn-danger form-control btn btn-login' value= 'Eliminar' name='Eliminar' onclick='SetIdConsulta(" + u.getIdEstado() + ")'/>" + "</td>");
                                        out.println("</tr>");
                                    }
                                    out.println("</table>");
                                
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>              \n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>");
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
