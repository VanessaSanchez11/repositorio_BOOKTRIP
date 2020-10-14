package org.apache.jsp.vista.Dashboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.inmuebles;
import controlador.inmueblesDAO;
import modelo.pagos;
import java.util.ArrayList;
import controlador.pagosDAO;

public final class listaPagos_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<body onload=\"visualizaOculta('");
      out.print(request.getParameter("Vista"));
      out.write("');\">\n");
      out.write("    ");
 String buscando = request.getParameter("buscando");
        if (buscando == null) {
            buscando = "";
        }
    
      out.write("\n");
      out.write("    <div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("        <!-- Page Heading -->\n");
      out.write("        <div class=\"d-sm-flex align-items-center justify-content-between mb-4\">\n");
      out.write("            <h1 class=\"h3 mb-0 text-gray-800\">Dashboard</h1>\n");
      out.write("            <!-- <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm\"> Lista de usuarios</a>\n");
      out.write("            <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-success shadow-sm\"> Consultar usuario</a>\n");
      out.write("            <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-warning shadow-sm\"> Actualizar usuario</a>\n");
      out.write("            <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-danger shadow-sm\"> Eliminar usuario</a> -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\" align-items-center justify-content-between mb-4\">\n");
      out.write("\n");
      out.write("            <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm mr-3\"> Lista de pago</a>\n");
      out.write("            <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-warning shadow-sm\"> Actualizar pago</a>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <div class=\"contenedor\">\n");
      out.write("\n");
      out.write("            <h1> Lista Pagos</h1>\n");
      out.write("\n");
      out.write("            <!--    PARTE DE ACTUALIZAR          -->\n");
      out.write("            \n");
      out.write("            <div class=\"contenedor\">\n");
      out.write("\n");
      out.write("            <h1>Lista</h1>\n");
      out.write("\n");
      out.write("            <div class=\"row justify-content-md-center\">\n");
      out.write("\n");
      out.write("                <div id=\"Actualizar\" class=\"bd-example d-none \">\n");
      out.write("                    <h1>Actualize su Pago</h1>\n");
      out.write("                    <form action=\"/booktripG/actualizarPagos\" method= \"post\" >\n");
      out.write("                        <div class=\"form-group row cajaCombobox\">\n");
      out.write("                           \n");
      out.write("                                <input id=\"idUsuario\" type=\"text\" class=\"form-control d-none \" name=\"idUsuario\" value=\"");
      out.print(request.getParameter("idUsuario"));
      out.write("\">\n");
      out.write("                             \n");
      out.write("                          \n");
      out.write("                            <div class=\"col-sm-6 mb-3 mb-sm-0 \">\n");
      out.write("\n");
      out.write("                                <input id=\"idInmuebleAct\" type=\"text\" class=\"form-control d-none\" name=\"idInmueble\" value=\"");
      out.print(request.getParameter("idInmueble"));
      out.write("\">\n");
      out.write("                                ");

                                    inmueblesDAO miinmueble = new inmueblesDAO();
                                    ArrayList<inmuebles> ConsultarListadoInmueble = miinmueble.ConsultarListadoInmueble("");
                                    out.println("<select class='form-control' id='selectInmuebles' size='1' onchange='setIdTipoA()'>");
                                    out.println("<option value=''>" + "--Seleccione--" + "</option>");
                                    for (inmuebles t : ConsultarListadoInmueble) {
                                        out.println("<option value='" + t.getIdInmueble()+ "'>" + t.getNombre() + "</option>");
                                    }
                                    out.println("</select>");

                                
      out.write("\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                           \n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"form-group row d-flex justify-content-around\">\n");
      out.write("                            <div class=\"col-sm-6 mb-3 mb-sm-0 \">\n");
      out.write("                                <input type=\"text\" class=\"form-control  \" name=\"adjunto\" id=\"idAdjunto\" value=\"");
      out.print(request.getParameter("adjunto"));
      out.write("\">\n");
      out.write("                                <small>Error message</small>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <input type=\"text\" class=\"form-control \" name=\"monto\" id=\"idMonto\" value=\"");
      out.print(request.getParameter("monto"));
      out.write("\">\n");
      out.write("                                <small>Error message</small>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"form-group row d-flex justify-content-around\">\n");
      out.write("                            <div class=\"col-sm-6 mb-3 mb-sm-0\">\n");
      out.write("                                <input type=\"text\" class=\"form-control \" name=\"fechaPago\" id=\"idFechaPago\" value=\"");
      out.print(request.getParameter("fechaPago"));
      out.write("\">\n");
      out.write("                                <small>Error message</small>\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-sm-6\">\n");
      out.write("                                <input type=\"text\" class=\"form-control \" name=\"fechaPago2\" id=\"idFechaPago2\" value=\"");
      out.print(request.getParameter("fechaPago2"));
      out.write("\">\n");
      out.write("                                <small>Error message</small>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        \n");
      out.write("\n");
      out.write("                        <input type=\"submit\" class=\"btn btn-primary btn-user btn-block\" value=\"Actualizar\">\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("            <!--    PARTE DE LISTAR          -->\n");
      out.write("\n");
      out.write("\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <form action=\"/booktripG/consultarPagos\" method = \"post\" >\n");
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
      out.write("\n");
      out.write("                                <br>\n");
      out.write("                                <div id=\"Tabla_Usuarios\"></div>\n");
      out.write("                                ");

                                    pagosDAO pagosC = new pagosDAO();
                                    ArrayList<pagos> milistapagos = new ArrayList<pagos>();
                                    milistapagos = pagosC.ConsultarListadoPagos(buscando);
                                    out.println("<table class='table table-responsive' id='dataTable'><tr><thead class='thead-dark'><tr><th>IdPagos</th><th>IdUsuario</th><th>IdInmueble</th><th>Adjunto</th>"
                                            + "<th >Monto</th><th>FechaPago</th><th>FechaPago2</th>"
                                            + "<th >Editar </th> <th >Eliminar </th></tr></thead>");

                                    for (pagos p : milistapagos) {
                                        out.println("<tr>");
                                        out.println("<td>" + p.getIdPago() + "</td>");
                                        out.println("<td>" + p.getIdUsuario() + "</td>");
                                        out.println("<td>" + p.getIdInmueble() + "</td>");
                                        out.println("<td>" + p.getAdjunto() + "</td>");
                                        out.println("<td>" + p.getMonto() + "</td>");
                                        out.println("<td>" + p.getFechaPago() + "</td>");
                                        out.println("<td>" + p.getFechaPago2() + "</td>");

                                        out.println("<td>" + "<input type = 'submit' class='btn btn-warning form-control btn btn-login' value='Actualizar' name ='Actualizar' onclick ='SetIdConsulta(" + p.getFechaPago() + ")'/>" + "</td>");

                                        out.println("<td>" + "<input type = 'submit' class='btn btn-danger form-control btn btn-login' value= 'Eliminar' name='Eliminar' onclick='SetIdConsulta(" + p.getFechaPago() + ")'/>" + "</td>");
                                        out.println("</tr>");
                                    }
                                    out.println("</table>");
                                
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>  \n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
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
