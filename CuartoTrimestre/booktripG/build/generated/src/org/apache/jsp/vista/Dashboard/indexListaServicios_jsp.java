package org.apache.jsp.vista.Dashboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.servicios;
import java.util.ArrayList;
import controlador.serviciosDAO;

public final class indexListaServicios_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(4);
    _jspx_dependants.add("/vista/Dashboard/header.jsp");
    _jspx_dependants.add("/vista/Dashboard/sidebar.jsp");
    _jspx_dependants.add("/vista/Dashboard/listaServicios.jsp");
    _jspx_dependants.add("/vista/Dashboard/footer.jsp");
  }

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

      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("    <meta charset=\"utf-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("    <meta name=\"description\" content=\"\">\n");
      out.write("    <meta name=\"author\" content=\"\">\n");
      out.write("\n");
      out.write("    <title>Booktrip</title>\n");
      out.write("\n");
      out.write("    <!-- Custom fonts for this template-->\n");
      out.write(" \n");
      out.write("    <link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write("    <!-- Custom styles for this template-->\n");
      out.write("    <link href=\"css/sb-admin-2.min.css\" rel=\"stylesheet\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/estilosRol.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body id=\"page-top\">\n");
      out.write("\n");
      out.write("    <!-- Page Wrapper -->\n");
      out.write("    <div id=\"wrapper\">");
      out.write('\n');
      out.write(" <!-- Sidebar -->\n");
      out.write(" <ul class=\"navbar-nav bg-gradient-primary sidebar sidebar-dark accordion\" id=\"accordionSidebar\">\n");
      out.write("\n");
      out.write("     <!-- Sidebar - Brand -->\n");
      out.write("     <a class=\"sidebar-brand d-flex align-items-center justify-content-center\" href=\"index1.php\">\n");
      out.write("         <div class=\"sidebar-brand-icon rotate-n-15\">\n");
      out.write("             <i class=\"fas fa-laugh-wink\"></i>\n");
      out.write("         </div>\n");
      out.write("         <div class=\"sidebar-brand-text mx-3\">Booktrip</div>\n");
      out.write("     </a>\n");
      out.write("\n");
      out.write("     <!-- Divider -->\n");
      out.write("     <hr class=\"sidebar-divider my-0\">\n");
      out.write("\n");
      out.write("     <!-- Nav Item - Dashboard -->\n");
      out.write("     <li class=\"nav-item active\">\n");
      out.write("         <a class=\"nav-link\" href=\"index1.php\">\n");
      out.write("             <i class=\"fas fa-fw fa-tachometer-alt\"></i>\n");
      out.write("             <span>Dashboard</span></a>\n");
      out.write("     </li>\n");
      out.write("\n");
      out.write("     <!-- Divider -->\n");
      out.write("     <hr class=\"sidebar-divider\">\n");
      out.write("\n");
      out.write("     <!-- Heading -->\n");
      out.write("     <div class=\"sidebar-heading\">\n");
      out.write("         Interface\n");
      out.write("     </div>\n");
      out.write("\n");
      out.write("     <!-- Nav Item - Pages Collapse Menu -->\n");
      out.write("     <li class=\"nav-item\">\n");
      out.write("         <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseTwo\" aria-expanded=\"true\" aria-controls=\"collapseTwo\">\n");
      out.write("             <i class=\"fa fa-user\"></i>\n");
      out.write("             <span>Usuarios</span>\n");
      out.write("         </a>\n");
      out.write("         <div id=\"collapseTwo\" class=\"collapse\" aria-labelledby=\"headingTwo\" data-parent=\"#accordionSidebar\">\n");
      out.write("             <div class=\"bg-white py-2 collapse-inner rounded\">\n");
      out.write("                 <h6 class=\"collapse-header\">Opciones</h6>\n");
      out.write("                 <a class=\"collapse-item\" href=\"indexRolRegister.jsp\">Roles</a>\n");
      out.write("                 <a class=\"collapse-item\" href=\"indexListaUsuario.jsp\">Lista de usuarios</a>\n");
      out.write("                 <a class=\"collapse-item\" href=\"indexTipoDocuRegister.jsp\">Tipo de documento</a>\n");
      out.write("\n");
      out.write("             </div>\n");
      out.write("         </div>\n");
      out.write("     </li>\n");
      out.write("     <!-- Inmueble -->\n");
      out.write("     <li class=\"nav-item\">\n");
      out.write("         <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseUtilities\" aria-expanded=\"true\" aria-controls=\"collapseUtilities\">\n");
      out.write("             <i class=\"fa fa-building\"></i>\n");
      out.write("             <span>Inmuebles</span>\n");
      out.write("         </a>\n");
      out.write("         <div id=\"collapseUtilities\" class=\"collapse\" aria-labelledby=\"headingUtilities\" data-parent=\"#accordionSidebar\">\n");
      out.write("             <div class=\"bg-white py-2 collapse-inner rounded\">\n");
      out.write("                 <h6 class=\"collapse-header\">Opciones</h6>\n");
      out.write("                 <a class=\"collapse-item\" href=\"index1.php\">Lista de inmuebles</a>\n");
      out.write("                 <a class=\"collapse-item\" href=\"indexTipoInmueble.jsp\">Tipos de inmuebles</a>\n");
      out.write("                 <a class=\"collapse-item\" href=\"indexListaEstado.jsp\">Estados</a>\n");
      out.write("                \n");
      out.write("             </div>\n");
      out.write("         </div>\n");
      out.write("     </li>\n");
      out.write("\n");
      out.write("     <li class=\"nav-item\">\n");
      out.write("         <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseLugares\" aria-expanded=\"true\" aria-controls=\"collapseUtilities\">\n");
      out.write("             <i class=\"fa fa-map-marked-alt\"></i>\n");
      out.write("             <span>Lugares</span>\n");
      out.write("         </a>\n");
      out.write("         <div id=\"collapseLugares\" class=\"collapse\" aria-labelledby=\"headingUtilities\" data-parent=\"#accordionSidebar\">\n");
      out.write("             <div class=\"bg-white py-2 collapse-inner rounded\">\n");
      out.write("                 <h6 class=\"collapse-header\">Opciones</h6>\n");
      out.write("                 <a class=\"collapse-item\" href=\"indexDepartamentos.jsp\">Departamentos</a>\n");
      out.write("                 <a class=\"collapse-item\" href=\"indexMunicipios.jsp\">Municipios</a>\n");
      out.write("                 <a class=\"collapse-item\" href=\"indexActividad.jsp\">Actividades</a>\n");
      out.write("             </div>\n");
      out.write("         </div>\n");
      out.write("     </li>\n");
      out.write("     <li class=\"nav-item\">\n");
      out.write("         <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseReserva\" aria-expanded=\"true\" aria-controls=\"collapseUtilities\">\n");
      out.write("             <i class=\"fa fa-book\"></i>\n");
      out.write("             <span>Reservas</span>\n");
      out.write("         </a>\n");
      out.write("         <div id=\"collapseReserva\" class=\"collapse\" aria-labelledby=\"headingUtilities\" data-parent=\"#accordionSidebar\">\n");
      out.write("             <div class=\"bg-white py-2 collapse-inner rounded\">\n");
      out.write("                 <h6 class=\"collapse-header\">Opciones</h6>\n");
      out.write("                 <a class=\"collapse-item\" href=\"indexListaReserva.jsp\">Lista de reservas</a>\n");
      out.write("                 <a class=\"collapse-item\" href=\"indexListaPagos.jsp\">Pagos</a>\n");
      out.write("                 \n");
      out.write("\n");
      out.write("             </div>\n");
      out.write("         </div>\n");
      out.write("     </li>\n");
      out.write("     <li class=\"nav-item\">\n");
      out.write("         <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseInfo\" aria-expanded=\"true\" aria-controls=\"collapseUtilities\">\n");
      out.write("             <i class=\"fa fa-city\"></i>\n");
      out.write("             <span>Info propiedades</span>\n");
      out.write("         </a>\n");
      out.write("         <div id=\"collapseInfo\" class=\"collapse\" aria-labelledby=\"headingUtilities\" data-parent=\"#accordionSidebar\">\n");
      out.write("             <div class=\"bg-white py-2 collapse-inner rounded\">\n");
      out.write("                 <h6 class=\"collapse-header\">Opciones</h6>\n");
      out.write("                 <a class=\"collapse-item\" href=\"indexListaServicios.jsp\">Servicios</a>\n");
      out.write("                 <a class=\"collapse-item\" href=\"indexSolicitudInmueble.jsp\">Solicitudes</a>\n");
      out.write("                 <a class=\"collapse-item\" href=\"indexListaPuntuaciones.jsp\">Puntuaciones</a>\n");
      out.write("                 \n");
      out.write("\n");
      out.write("             </div>\n");
      out.write("         </div>\n");
      out.write("     </li>\n");
      out.write("\n");
      out.write("\n");
      out.write("     <!-- Divider -->\n");
      out.write("     <hr class=\"sidebar-divider\">\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("     <!-- Sidebar Toggler (Sidebar) -->\n");
      out.write("     <div class=\"text-center d-none d-md-inline\">\n");
      out.write("         <button class=\"rounded-circle border-0\" id=\"sidebarToggle\"></button>\n");
      out.write("     </div>\n");
      out.write("\n");
      out.write(" </ul>");
      out.write('\n');
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<body onload=\"visualizaOcultaServicios('");
      out.print(request.getParameter("Vista"));
      out.write("');\">\n");
      out.write("    ");
 String buscando = request.getParameter("buscando");
        if (buscando == null) {
            buscando = "";
        }
    
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("    <!-- Page Heading -->\n");
      out.write("    <div class=\"d-sm-flex align-items-center justify-content-between mb-4\">\n");
      out.write("        <h1 class=\"h3 mb-0 text-gray-800\">Dashboard</h1>\n");
      out.write("        <!-- <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm\"> Lista de usuarios</a>\n");
      out.write("        <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-success shadow-sm\"> Consultar usuario</a>\n");
      out.write("        <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-warning shadow-sm\"> Actualizar usuario</a>\n");
      out.write("        <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-danger shadow-sm\"> Eliminar usuario</a> -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <div class=\"align-items-center justify-content-between mb-4\">\n");
      out.write("\n");
      out.write("        <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm  mr-3\"> Lista de servicio</a>\n");
      out.write("        <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-warning shadow-sm\"> Actualizar servicio</a>\n");
      out.write("        <a href=\"indexServiciosCrear.jsp\" class=\"d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm ml-3\"> Crear servicio</a>\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"contenedor\">\n");
      out.write("\n");
      out.write("        <h1> Lista Servicios</h1>\n");
      out.write("        \n");
      out.write("        <!--    PARTE DE ACTUALIZAR          -->\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <!--    PARTE DE LISTAR          -->\n");
      out.write("        \n");
      out.write("        <div class=\"container\">\n");
      out.write("                <form action=\"/booktripG/consultarServicios\" method = \"post\" >\n");
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
      out.write("                                        onClick=\"realizarBusquedaServicios()\">Buscar</button>\n");
      out.write("                            </div>\n");
      out.write("                            <br>\n");
      out.write("                            <div>\n");
      out.write("                               \n");
      out.write("                                <br>\n");
      out.write("                                <div id=\"Tabla_Usuarios\"></div>\n");
      out.write("                                ");

                                    serviciosDAO servicioC = new serviciosDAO();
                                    ArrayList<servicios> milistaservicios = new ArrayList<servicios>();
                                    milistaservicios = servicioC.ConsultarListadoServicios(buscando, buscando);
                                    out.println("<table class='table table-responsive' id='dataTable'><tr><thead class='thead-dark'><tr><th>IdServicio</th><th>Nombre</th><th>Descripcion</th>"
                                            + "<th >Editar </th> <th >Eliminar </th></tr></thead>");

                                    for (servicios p : milistaservicios) {
                                        out.println("<tr>");
                                        out.println("<td>" + p.getIdServicio() + "</td>");
                                        out.println("<td>" + p.getNombre() + "</td>");
                                        out.println("<td>" + p.getDescripcion() + "</td>");
                                       
                                        out.println("<td>" + "<input type = 'submit' class='btn btn-warning form-control btn btn-login' value='Actualizar' name ='Actualizar' onclick ='SetIdConsulta(" + p.getNombre() + ")'/>" + "</td>");
                                        out.println("<td>" + "<input type = 'submit' class='btn btn-danger form-control btn btn-login' value= 'Eliminar' name='Eliminar' onclick='SetIdConsulta(" + p.getNombre() + ")'/>" + "</td>");
                                        out.println("</tr>");
                                    }
                                    out.println("</table>");
                                
      out.write("\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </form>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</body>\n");
      out.write('\n');
      out.write("</div>\n");
      out.write("            <!-- End of Main Content -->\n");
      out.write("\n");
      out.write("            <!-- Footer -->\n");
      out.write("            <footer class=\"sticky-footer bg-white\">\n");
      out.write("                <div class=\"container my-auto\">\n");
      out.write("                    <div class=\"copyright text-center my-auto\">\n");
      out.write("                        <span>Copyright &copy; Booktrip 2020</span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </footer>\n");
      out.write("            <!-- End of Footer -->\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <!-- End of Content Wrapper -->\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("    <!-- End of Page Wrapper -->\n");
      out.write("\n");
      out.write("    <!-- Scroll to Top Button-->\n");
      out.write("    <a class=\"scroll-to-top rounded\" href=\"#page-top\">\n");
      out.write("        <i class=\"fas fa-angle-up\"></i>\n");
      out.write("    </a>\n");
      out.write("\n");
      out.write("    <!-- Logout Modal-->\n");
      out.write("    <div class=\"modal fade\" id=\"logoutModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\n");
      out.write("        <div class=\"modal-dialog\" role=\"document\">\n");
      out.write("            <div class=\"modal-content\">\n");
      out.write("                <div class=\"modal-header\">\n");
      out.write("                    <h5 class=\"modal-title\" id=\"exampleModalLabel\">Quieres cerrar la sesion?</h5>\n");
      out.write("                    <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\n");
      out.write("            <span aria-hidden=\"true\">×</span>\n");
      out.write("          </button>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"modal-body\">Seleccione salir si estas listo para cerrar la sesion actual</div>\n");
      out.write("                <div class=\"modal-footer\">\n");
      out.write("                    <button class=\"btn btn-secondary\" type=\"button\" data-dismiss=\"modal\">Cancelar</button>\n");
      out.write("                    <a class=\"btn btn-primary\" href=\"#\">Salir</a>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    <script src=\"../js/funciones.js\"></script>\n");
      out.write("    \n");
      out.write("    <!-- Bootstrap core JavaScript-->\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("    <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Core plugin JavaScript-->\n");
      out.write("    <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Custom scripts for all pages-->\n");
      out.write("    <script src=\"js/sb-admin-2.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Page level plugins -->\n");
      out.write("    <script src=\"vendor/chart.js/Chart.min.js\"></script>\n");
      out.write("\n");
      out.write("    <!-- Page level custom scripts -->\n");
      out.write("    <script src=\"js/demo/chart-area-demo.js\"></script>\n");
      out.write("    <script src=\"js/demo/chart-pie-demo.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
      out.write('\n');
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
