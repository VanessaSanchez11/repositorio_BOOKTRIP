package org.apache.jsp.vista.Dashboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.tipoinmuebles;
import controlador.tipoinmuebleDAO;
import modelo.solicitudinmuebles;
import controlador.solicitudinmueblesDAO;
import modelo.inmuebles;
import controlador.inmueblesDAO;
import modelo.estados;
import controlador.estadosDAO;
import modelo.usuario;
import java.util.ArrayList;
import controlador.usuarioDao;

public final class listadoSolicitudInmueble_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("    \n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estiloSolicitud.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\" integrity=\"sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("<body onload=\"mueveReloj()\" onload=\"visualizaOculta('");
      out.print(request.getParameter("vista"));
      out.write("');\" >\n");
      out.write("        ");
 String buscando = request.getParameter("buscando");
            if (buscando == null) {
                buscando = "";
            }
        
      out.write("\n");
      out.write("    <center>\n");
      out.write("\n");
      out.write("\n");
      out.write("        <!-- Page Heading -->\n");
      out.write("        <div class=\"d-sm-flex align-items-center justify-content-between mb-4\">\n");
      out.write("            <h1 class=\"h3 mb-0 text-gray-800\">Dashboard</h1>\n");
      out.write("\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("       \n");
      out.write("\n");
      out.write("        <div class=\"principal\">\n");
      out.write("            <div class=\"fondo py-5 text-white\">\n");
      out.write("                 <div class=\"row justify-content-md-center\">\n");
      out.write("                <div class=\"btn-group pb-5\">\n");
      out.write("                    <button type=\"button\" class=\"btn-light\" data-toggle=\"dropdown\"\n");
      out.write("                            aria-haspopup=\"true\" aria-expanded=\"false\" onClick=\"visualizaOculta('registroSolicitudInmueble')\">\n");
      out.write("                        Registrar\n");
      out.write("                    </button>\n");
      out.write("                    <button type=\"button\" class=\"btn btn-secondary\" data-toggle=\"dropdown\"\n");
      out.write("                            aria-haspopup=\"true\" aria-expanded=\"false\"\n");
      out.write("                            onClick=\"visualizaOculta('actualizarSolicitud')\">\n");
      out.write("                        Actualizar\n");
      out.write("                    </button>\n");
      out.write("                    <button type=\"button\" class=\"btn btn-success\" data-toggle=\"dropdown\"\n");
      out.write("                            aria-haspopup=\"true\" aria-expanded=\"false\" onClick=\"visualizaOculta('listarSolicitud')\">\n");
      out.write("                        Listar\n");
      out.write("                    </button>\n");
      out.write("                    <button type=\"button\" class=\"btn btn-warning\" data-toggle=\"dropdown\"\n");
      out.write("                            aria-haspopup=\"true\" aria-expanded=\"false\" onClick=\"Volver()\">\n");
      out.write("                        Volver al Inicio\n");
      out.write("                    </button>\n");
      out.write("                </div>\n");
      out.write("            </div> \n");
      out.write("                <div class=\"container bd-example d-none\" id=\"Registrar\">\n");
      out.write("                    <h5>\n");
      out.write("                        <strong>Solicitudes de inmuebles</strong>\n");
      out.write("                    </h5>\n");
      out.write("\n");
      out.write("                    <form action=\"/booktripPLaces/registroSolicitudInmueble\" method=\"post\" onsubmit=\"return validarInformacionSolicitud()\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"row d-flex h-100\">\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <input  name=\"idInmueble\" class=\"form-control d-none my-1\" id=\"txtInmueble\">\n");
      out.write("                                   ");

                                                inmueblesDAO miinmuebleDAO = new inmueblesDAO();
                                                ArrayList<inmuebles> milistainmueble = miinmuebleDAO.ConsultarListadoInmueble("");
                                                out.println("<select class='form-control' id='selectIdInmueble' size= '1' onchange='setIdInmueble()'>");
                                                out.println("<option value=''>" + "--seleccione inmueble--" + "</option>");
                                                for (inmuebles c : milistainmueble) {
                                                    out.println("<option value='" + c.getIdInmueble()+ "'>" + c.getNombre() + "</option>");

                                                }
                                                out.println("</select>");
                                            
      out.write(" \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6\"> \n");
      out.write("                                <input name=\"idUsuario\" class=\"form-control d-none my-1\" id=\"txtUsuario\">\n");
      out.write("                               ");

                                                usuarioDao miusuarioDAO = new usuarioDao();
                                                ArrayList<usuario> milistausuario = miusuarioDAO.ListadoUsuarios("");
                                                out.println("<select class='form-control' id='selectIdUsuario' size= '1' onchange='setIdUsuario()'>");
                                                out.println("<option value=''>" + "--seleccione usuario--" + "</option>");
                                                for (usuario c : milistausuario) {
                                                    out.println("<option value='" + c.getIdUsuario() + "'>" + c.getNombre() + "</option>");

                                                }
                                                out.println("</select>");
                                            
      out.write(" \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row d-flex h-100\">\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <input name=\"idEstado\" class=\"form-control d-none my-1\" id=\"txtEstado\" >\n");
      out.write("                                 ");

                                                estadosDAO miestadoDAO = new estadosDAO();
                                                ArrayList<estados> milistaestado = miestadoDAO.ConsultarListadoEstado("");
                                                out.println("<select class='form-control' id='selectIdEstado' size= '1' onchange='setIdEstado()'>");
                                                out.println("<option value=''>" + "--seleccione estado--" + "</option>");
                                                for (estados c : milistaestado) {
                                                    out.println("<option value='" + c.getIdEstado() + "'>" + c.getNombre() + "</option>");

                                                }
                                                out.println("</select>");
                                            
      out.write(" \n");
      out.write("                               \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <input name=\"fecha\" type=\"text\" id=\"txtFecha\" class=\"form-control my-1\" placeholder=\"fecha\">\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row d-flex h-100\">\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <input type=\"submit\" class=\"btn btn-primary boton btn-block\" value=\"registrar solicitud\" onclick=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <button class=\"btn btn-danger btn-block\" type=\"submit\">Cancelar</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-12 py-3 d-none\">\n");
      out.write("                            <input id=\"txtBandera\" type=\"text\" name=\"banderaRegistro\" > \n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("                                     <div class=\"container bd-example d-none\" id=\"Actualizar\">\n");
      out.write("                    <h5>\n");
      out.write("                        <strong>Solicitudes de inmuebles</strong>\n");
      out.write("                    </h5>\n");
      out.write("\n");
      out.write("                    <form action=\"/booktripPLaces/actulizarSolicitudInmueble\" method=\"post\" onsubmit=\"return validarInformacionSolicitud()\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"row d-flex h-100\">\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <input  name=\"idInmueble\" class=\"form-control d-none my-1\" id=\"txtInmueble\" value=\"");
      out.print(request.getParameter("idInmueble"));
      out.write("\">\n");
      out.write("                                ");

                                                out.println("<select class='form-control'id ='SelectIdInmueble' size = '1'");
                                                /*out.println("<option onclick='setIdInmueble(\"" + "" "\")'>" + "--Seleccionar--" + "</option>");*/

                                                for (inmuebles c : milistainmueble) {
                                                    out.println("<option value='" + c.getIdInmueble()+ "'>" + c.getNombre() + "</option>");

                                                }
                                                out.println("</select>");
                                            
      out.write(" \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6\"> \n");
      out.write("                                <input name=\"idUsuario\" class=\"form-control d-none my-1\" id=\"txtUsuario\" value=\"");
      out.print(request.getParameter("idUsuario"));
      out.write("\">\n");
      out.write("                                ");

                                                out.println("<select class='form-control'id ='SelectIdUsuario' size = '1'");
                                                /*out.println("<option onclick='setIdUsuario(\"" + "" "\")'>" + "--Seleccionar--" + "</option>");*/

                                                for (usuario c : milistausuario) {
                                                    out.println("<option value='" + c.getIdUsuario() + "'>" + c.getNombre() + "</option>");

                                                }
                                                out.println("</select>");
                                            
      out.write(" \n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row d-flex h-100\">\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <input name=\"idEstado\" class=\"form-control d-none my-1\" id=\"txtEstado\" value=\"");
      out.print(request.getParameter("idEstado"));
      out.write("\">\n");
      out.write("                            ");

                                                out.println("<select class='form-control'id ='SelectIdEstado' size = '1'");
                                                /*out.println("<option onclick='setIdEstado(\"" + "" "\")'>" + "--Seleccionar--" + "</option>");*/

                                                for (estados c : milistaestado) {
                                                    out.println("<option value='" + c.getIdEstado() + "'>" + c.getNombre() + "</option>");

                                                }
                                                out.println("</select>");
                                            
      out.write(" \n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <input name=\"fecha\" type=\"text\" id=\"txtFecha\" class=\"form-control my-1\" placeholder=\"fecha\" value=\"");
      out.print(request.getParameter("fecha"));
      out.write("\">\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"row d-flex h-100\">\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <input type=\"submit\" class=\"btn btn-primary boton btn-block\" value=\"guardar solicitud\" onclick=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"col-md-6\">\n");
      out.write("                                <button class=\"btn btn-danger btn-block\" type=\"submit\">Cancelar</button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                        <div class=\"col-12 py-3\">\n");
      out.write("                            <input id=\"txtBandera\" type=\"text\" name=\"banderaRegistro\" class=\"d-none\"> \n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("                    </form>\n");
      out.write("                </div>  \n");
      out.write("                                      <div class=\"container bd-example\" id=\"listarSolicitud\">\n");
      out.write("                    <form action=\"/booktripPLaces/listarSolicitud\" method=\"post\">\n");
      out.write("                        <div class=\"row justify-content-md-center\">\n");
      out.write("                            <div id=\"Listado\" class=\"bd-example\">\n");
      out.write("\n");
      out.write("                                <div id=\"ControlRegistro\" class=\"input-group\">\n");
      out.write("                                    <!--Agregacion de parametro que se esta buscando-->\n");
      out.write("                                    <input id=\"txt_Id_Consultado\" type=\"text\" class=\"form-control\" name=\"IdConsultado\"\n");
      out.write("                                        value=\"");
      out.print(buscando);
      out.write("\" autofocus\n");
      out.write("                                        placeholder=\"Buscarpor fecha \" />\n");
      out.write("                                    <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"dropdown\"\n");
      out.write("                                        aria-haspopup=\"true\" aria-expanded=\"false\"\n");
      out.write("                                        onClick=\"realizarBusquedaBook()\">Buscar</button>\n");
      out.write("                                </div>\n");
      out.write("                                <div>\n");
      out.write("                                    <h1>Listado solicitudes</h1>\n");
      out.write("                                    <div id=\"solicitudes\"></div>\n");
      out.write("                                    ");

                                                solicitudinmueblesDAO misolicitudDAO = new solicitudinmueblesDAO();
                                                ArrayList<solicitudinmuebles> milistasolicitud = new ArrayList<solicitudinmuebles>();
                                                milistasolicitud = misolicitudDAO.ConsultarListadoSolicitudInmueble(buscando );

                                                out.println("<table class='table table-dark'><tr><td>inmueble</td>"
                                                        + "<td>Usuario</td> <td>Estado</td><td>fecha</td>"
                                                        + " <td>Editar</td > <td>Eliminar</td> </tr>");
                                                for (solicitudinmuebles C : milistasolicitud) {
                                                    out.println("<tr>");
                                                  
                                                    out.println("<td>" + C.getIdInmueble()+ "</td>");
                                                    out.println("<td>" + C.getIdUsuario()+ "</td>");
                                                    out.println("<td>" + C.getIdEstado()+ "</td>");
                                                    out.println("<td>" + C.getFecha()+ "</td>");
                                                   
                                                    out.println("<td>" + "<input type = 'submit' class='btn-primary form-control btn btn-login' value='Actualizar'name='Actualizar'onclick='SetIdConsulta(" + C.getFecha()+ ")'/>" + "</td>");
                                                    out.println("<td>" + "<input type = 'submit' class='btn btn-danger form-control btn btn-login' value= 'Eliminar'name='Eliminar'onclick='SetIdConsulta(" + C.getFecha()+ ")'/>"
                                                            + "</td>");
                                                    out.println("</tr>");
                                                }
                                                out.println("</table>");
                                            
      out.write("\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </center>\n");
      out.write("                             <script src=\"js/appUtilitariosSolicitudes.js\"></script>\n");
      out.write("    <script src=\"js/jquery-1.11.0.min.js\"></script>\n");
      out.write("    <script src=\"js/gestionarSolicitudes.js\"></script>\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\" integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\" integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\" crossorigin=\"anonymous\"></script>\n");
      out.write("    <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\" integrity=\"sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV\" crossorigin=\"anonymous\"></script>\n");
      out.write("</body>\n");
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
