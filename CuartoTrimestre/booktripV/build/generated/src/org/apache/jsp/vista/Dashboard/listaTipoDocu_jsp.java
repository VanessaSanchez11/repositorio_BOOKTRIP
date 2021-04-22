package org.apache.jsp.vista.Dashboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.tipoDocumentos;
import java.util.ArrayList;
import controlador.tipoDocumentosDAO;

public final class listaTipoDocu_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body onload=\"visualizaOcultaTipoD('");
      out.print(request.getParameter("Vista"));
      out.write("');\">\r\n");
      out.write("    ");
 String buscando = request.getParameter("buscando");
        if (buscando == null) {
            buscando = "";
        }
    
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Page Heading -->\r\n");
      out.write("        <div class=\"d-sm-flex align-items-center justify-content-between mb-4\">\r\n");
      out.write("            <h1 class=\"h3 mb-0 text-gray-800\">Dashboard</h1>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\" justify-content-end align-items-center justify-content-between mb-4\">\r\n");
      out.write("            \r\n");
      out.write("            <a href=\"indexTipoDocuRegister.jsp\" class=\"d-none d-sm-inline-block btn btn-success shadow-sm\"> Crear tipo de documento</a>\r\n");
      out.write("            <button type=\"button\" class=\"d-none d-sm-inline-block btn btn-primary shadow-sm ml-3\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\" onClick=\"visualizaOcultaTipoD('Listado')\">Lista de documentos</button>\r\n");
      out.write("            <button type=\"button\" class=\"d-none d-sm-inline-block btn btn-warning shadow-sm ml-3\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\" onClick=\"visualizaOcultaTipoD('Actualizar')\">Actualizar documento</button>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <div class=\"contenedor\">\r\n");
      out.write("\r\n");
      out.write("            <h1 class=\"mb-5\">Lista de documentos</h1>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"row justify-content-md-center\">\r\n");
      out.write("\r\n");
      out.write("                        <div id=\"Actualizar\" class=\"bd-example d-none \">\r\n");
      out.write("                            <h1>Aqui puede actualizar su tipo de documento</h1>\r\n");
      out.write("                            <form action=\"/booktripV/actualizarTipoDocu\" id=\"form\" class=\"formu\" method=\"post\" onsubmit=\" return checkInputsNombre();\">\r\n");
      out.write("                                <label for=\"exampleFormControlInput1\">Nombre del rol</label>\r\n");
      out.write("                                <div class=\"form-group col-sm-5\">\r\n");
      out.write("                                    \r\n");
      out.write("                                    <input type=\"text\" class=\"form-control d-none \" name=\"idTipoDocumento\" id=\"idDocumentos\" value=\"");
      out.print(request.getParameter("idTipoDocumento"));
      out.write("\">\r\n");
      out.write("                                    <input type=\"text\" class=\"form-control \" name=\"nombre\" id=\"idNombre\" value=\"");
      out.print(request.getParameter("nombre"));
      out.write("\">\r\n");
      out.write("                                    <small>Error message</small>\r\n");
      out.write("                                    <br>\r\n");
      out.write("                                    <input type=\"submit\" class=\"btn btn-primary btn-user btn-block\" value=\"Actualizar\">\r\n");
      out.write("                                    <!-- <button type=\"submit\" class=\"btn btn-primary btn-sm botonRegistro\">Registrar</button> -->\r\n");
      out.write("                                </div>\r\n");
      out.write("\r\n");
      out.write("                            </form>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <form action=\"/booktripV/consultarTipoDocu\" method = \"post\" >\r\n");
      out.write("                        <div class=\"row justify-content-md-center\">\r\n");
      out.write("                            <div id=\"Listado\" class=\"bd-example\">\r\n");
      out.write("\r\n");
      out.write("                                <div id=\"ControlRegistro\" class=\"input-group\">\r\n");
      out.write("\r\n");
      out.write("                                    <input id =\"idDocu\" type = \"text\" class=\"form-control\"\r\n");
      out.write("                                           name= \"IdConsultado\" value=\"");
      out.print(buscando);
      out.write("\" autofocus\r\n");
      out.write("                                           placeholder=\"Buscar\"/>\r\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"dropdown\"\r\n");
      out.write("                                            aria-haspopup=\"true\" aria-expanded=\"false\"\r\n");
      out.write("                                            onClick=\"realizarBusquedaTipoD()\">Buscar</button>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <br>\r\n");
      out.write("                                <div>\r\n");
      out.write("                                    \r\n");
      out.write("                                    <br>\r\n");
      out.write("                                    <div id=\"Tabla_Usuarios\"></div>\r\n");
      out.write("                                    ");

                                        tipoDocumentosDAO tipoC = new tipoDocumentosDAO();
                                        ArrayList<tipoDocumentos> listadoTipoDocu = new ArrayList<tipoDocumentos>();
                                        listadoTipoDocu = tipoC.ConsultarListadoTiposDocumento(buscando);
                                        out.println("<table class='table table-bordered table-responsive' id='dataTable'><tr><td>Id Documento</td><td>Nombre</td>"
                                                + "<td>Editar</td > <td>Eliminar</td ></tr>");
                                        for (tipoDocumentos t : listadoTipoDocu) {
                                            out.println("<tr>");
                                            out.println("<td>" + t.getIdTipoDocumento() + "</td>");
                                            out.println("<td>" + t.getNombre() + "</td>");
                                            out.println("<td>" + "<input type = 'submit' class='btn btn-warning form-control btn btn-login' value='Actualizar' name ='Actualizar' onclick ='SetIdConsultaDocu(" + t.getIdTipoDocumento() + ")'/>" + "</td>");

                                            out.println("<td>" + "<input type = 'submit' class='btn btn-danger form-control btn btn-login' value= 'Eliminar' name='Eliminar' onclick='SetIdConsultaDocu(" + t.getIdTipoDocumento() + ")'/>" + "</td>");
                                            out.println("</tr>");
                                        }
                                        out.println("</table>");
                                    
      out.write("\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("\r\n");
      out.write("               \r\n");
      out.write("\r\n");
      out.write("            \r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
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
