package org.apache.jsp.vista.Propietario;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.departamento;
import controlador.departamentosDAO;
import modelo.tipoinmuebles;
import controlador.tipoinmuebleDAO;
import modelo.usuario;
import controlador.usuarioDao;
import modelo.estados;
import controlador.estadosDAO;
import java.sql.ResultSet;
import modelo.inmuebles;
import java.util.ArrayList;
import controlador.inmueblesDAO;
import modelo.inmuebles;
import controlador.inmueblesDAO;
import java.util.Iterator;
import java.util.List;
import java.sql.ResultSet;
import java.sql.Statement;
import controlador.Conexion;
import controlador.estadosDAO;
import modelo.estados;

public final class indexListaInmueble_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(6);
    _jspx_dependants.add("/vista/Propietario/header.jsp");
    _jspx_dependants.add("/vista/Propietario/sidebar.jsp");
    _jspx_dependants.add("/vista/Propietario/content.jsp");
    _jspx_dependants.add("/vista/Propietario/realContent.jsp");
    _jspx_dependants.add("/vista/Propietario/listaInmueble.jsp");
    _jspx_dependants.add("/vista/Propietario/footer.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
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

      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("    <title>Booktrip</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom fonts for this template-->\r\n");
      out.write(" \r\n");
      out.write("    <link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom styles for this template-->\r\n");
      out.write("    <link href=\"css/sb-admin-2.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/estilosRol.css\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body id=\"page-top\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Page Wrapper -->\r\n");
      out.write("    <div id=\"wrapper\">");
      out.write('\n');
      out.write(" <!-- Sidebar -->\r\n");
      out.write(" <ul class=\"navbar-nav bg-gradient-primary sidebar sidebar-dark accordion\" id=\"accordionSidebar\">\r\n");
      out.write("\r\n");
      out.write("     <!-- Sidebar - Brand -->\r\n");
      out.write("     <a class=\"sidebar-brand d-flex align-items-center justify-content-center\" href=\"index1.php\">\r\n");
      out.write("         <div class=\"sidebar-brand-icon rotate-n-15\">\r\n");
      out.write("             <i class=\"fas fa-laugh-wink\"></i>\r\n");
      out.write("         </div>\r\n");
      out.write("         <div class=\"sidebar-brand-text mx-3\">Booktrip</div>\r\n");
      out.write("     </a>\r\n");
      out.write("\r\n");
      out.write("     <!-- Divider -->\r\n");
      out.write("     <hr class=\"sidebar-divider my-0\">\r\n");
      out.write("\r\n");
      out.write("     <!-- Nav Item - Dashboard -->\r\n");
      out.write("     <li class=\"nav-item active\">\r\n");
      out.write("         <a class=\"nav-link\" href=\"index1.php\">\r\n");
      out.write("             <i class=\"fas fa-fw fa-tachometer-alt\"></i>\r\n");
      out.write("             <span>Dashboard</span></a>\r\n");
      out.write("     </li>\r\n");
      out.write("\r\n");
      out.write("     <!-- Divider -->\r\n");
      out.write("     <hr class=\"sidebar-divider\">\r\n");
      out.write("\r\n");
      out.write("     <!-- Heading -->\r\n");
      out.write("     <div class=\"sidebar-heading\">\r\n");
      out.write("         Interface\r\n");
      out.write("     </div>\r\n");
      out.write("\r\n");
      out.write("     <!-- Nav Item - Pages Collapse Menu -->\r\n");
      out.write("     <li class=\"nav-item\">\r\n");
      out.write("         <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseTwo\" aria-expanded=\"true\" aria-controls=\"collapseTwo\">\r\n");
      out.write("             <i class=\"fa fa-user\"></i>\r\n");
      out.write("             <span>Usuarios</span>\r\n");
      out.write("         </a>\r\n");
      out.write("         <div id=\"collapseTwo\" class=\"collapse\" aria-labelledby=\"headingTwo\" data-parent=\"#accordionSidebar\">\r\n");
      out.write("             <div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("                 <h6 class=\"collapse-header\">Opciones</h6>\r\n");
      out.write("                 <a class=\"collapse-item\" href=\"indexRolRegister.jsp\">Roles</a>\r\n");
      out.write("                 <a class=\"collapse-item\" href=\"indexListaUsuario.jsp\">Lista de usuarios</a>\r\n");
      out.write("                 <a class=\"collapse-item\" href=\"indexTipoDocuRegister.jsp\">Tipo de documento</a>\r\n");
      out.write("\r\n");
      out.write("             </div>\r\n");
      out.write("         </div>\r\n");
      out.write("     </li>\r\n");
      out.write("     <!-- Inmueble -->\r\n");
      out.write("     <li class=\"nav-item\">\r\n");
      out.write("         <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseUtilities\" aria-expanded=\"true\" aria-controls=\"collapseUtilities\">\r\n");
      out.write("             <i class=\"fa fa-building\"></i>\r\n");
      out.write("             <span>Inmuebles</span>\r\n");
      out.write("         </a>\r\n");
      out.write("         <div id=\"collapseUtilities\" class=\"collapse\" aria-labelledby=\"headingUtilities\" data-parent=\"#accordionSidebar\">\r\n");
      out.write("             <div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("                 <h6 class=\"collapse-header\">Opciones</h6>\r\n");
      out.write("                 <a class=\"collapse-item\" href=\"index1.php\">Lista de inmuebles</a>\r\n");
      out.write("                 <a class=\"collapse-item\" href=\"indexTipoInmueble.jsp\">Tipos de inmuebles</a>\r\n");
      out.write("                 <a class=\"collapse-item\" href=\"indexListaEstado.jsp\">Estados</a>\r\n");
      out.write("                \r\n");
      out.write("             </div>\r\n");
      out.write("         </div>\r\n");
      out.write("     </li>\r\n");
      out.write("\r\n");
      out.write("     <li class=\"nav-item\">\r\n");
      out.write("         <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseLugares\" aria-expanded=\"true\" aria-controls=\"collapseUtilities\">\r\n");
      out.write("             <i class=\"fa fa-map-marked-alt\"></i>\r\n");
      out.write("             <span>Lugares</span>\r\n");
      out.write("         </a>\r\n");
      out.write("         <div id=\"collapseLugares\" class=\"collapse\" aria-labelledby=\"headingUtilities\" data-parent=\"#accordionSidebar\">\r\n");
      out.write("             <div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("                 <h6 class=\"collapse-header\">Opciones</h6>\r\n");
      out.write("                 <a class=\"collapse-item\" href=\"indexDepartamentos.jsp\">Departamentos</a>\r\n");
      out.write("                 <a class=\"collapse-item\" href=\"indexMunicipios.jsp\">Municipios</a>\r\n");
      out.write("                 <a class=\"collapse-item\" href=\"indexActividad.jsp\">Actividades</a>\r\n");
      out.write("             </div>\r\n");
      out.write("         </div>\r\n");
      out.write("     </li>\r\n");
      out.write("     <li class=\"nav-item\">\r\n");
      out.write("         <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseReserva\" aria-expanded=\"true\" aria-controls=\"collapseUtilities\">\r\n");
      out.write("             <i class=\"fa fa-book\"></i>\r\n");
      out.write("             <span>Reservas</span>\r\n");
      out.write("         </a>\r\n");
      out.write("         <div id=\"collapseReserva\" class=\"collapse\" aria-labelledby=\"headingUtilities\" data-parent=\"#accordionSidebar\">\r\n");
      out.write("             <div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("                 <h6 class=\"collapse-header\">Opciones</h6>\r\n");
      out.write("                 <a class=\"collapse-item\" href=\"indexListaReserva.jsp\">Lista de reservas</a>\r\n");
      out.write("                 <a class=\"collapse-item\" href=\"indexListaPagos.jsp\">Pagos</a>\r\n");
      out.write("                 \r\n");
      out.write("\r\n");
      out.write("             </div>\r\n");
      out.write("         </div>\r\n");
      out.write("     </li>\r\n");
      out.write("     <li class=\"nav-item\">\r\n");
      out.write("         <a class=\"nav-link collapsed\" href=\"#\" data-toggle=\"collapse\" data-target=\"#collapseInfo\" aria-expanded=\"true\" aria-controls=\"collapseUtilities\">\r\n");
      out.write("             <i class=\"fa fa-city\"></i>\r\n");
      out.write("             <span>Info propiedades</span>\r\n");
      out.write("         </a>\r\n");
      out.write("         <div id=\"collapseInfo\" class=\"collapse\" aria-labelledby=\"headingUtilities\" data-parent=\"#accordionSidebar\">\r\n");
      out.write("             <div class=\"bg-white py-2 collapse-inner rounded\">\r\n");
      out.write("                 <h6 class=\"collapse-header\">Opciones</h6>\r\n");
      out.write("                 <a class=\"collapse-item\" href=\"indexListaServicios.jsp\">Servicios</a>\r\n");
      out.write("                 <a class=\"collapse-item\" href=\"indexSolicitudInmueble.jsp\">Solicitudes</a>\r\n");
      out.write("                 <a class=\"collapse-item\" href=\"indexListaPuntuaciones.jsp\">Puntuaciones</a>\r\n");
      out.write("                 \r\n");
      out.write("\r\n");
      out.write("             </div>\r\n");
      out.write("         </div>\r\n");
      out.write("     </li>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("     <!-- Divider -->\r\n");
      out.write("     <hr class=\"sidebar-divider\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("     <!-- Sidebar Toggler (Sidebar) -->\r\n");
      out.write("     <div class=\"text-center d-none d-md-inline\">\r\n");
      out.write("         <button class=\"rounded-circle border-0\" id=\"sidebarToggle\"></button>\r\n");
      out.write("     </div>\r\n");
      out.write("\r\n");
      out.write(" </ul>");
      out.write('\n');
      out.write("<div id=\"content-wrapper\" class=\"d-flex flex-column\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Main Content -->\r\n");
      out.write("            <div id=\"content\">\r\n");
      out.write("\r\n");
      out.write("                <!-- Topbar -->\r\n");
      out.write("                <nav class=\"navbar navbar-expand navbar-light bg-secondary topbar mb-4 static-top shadow\">\r\n");
      out.write("\r\n");
      out.write("                    <!-- Sidebar Toggle (Topbar) -->\r\n");
      out.write("                    <button id=\"sidebarToggleTop\" class=\"btn btn-link d-md-none rounded-circle mr-3\">\r\n");
      out.write("            <i class=\"fa fa-bars\"></i>\r\n");
      out.write("          </button>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Topbar Search -->\r\n");
      out.write("                    <form class=\"d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search\">\r\n");
      out.write("                        <div class=\"input-group\">\r\n");
      out.write("                            <input type=\"text\" class=\"form-control bg-light border-0 small\" placeholder=\"Buscar...\" aria-label=\"Search\" aria-describedby=\"basic-addon2\">\r\n");
      out.write("                            <div class=\"input-group-append\">\r\n");
      out.write("                                <button class=\"btn btn-primary\" type=\"button\">\r\n");
      out.write("                  <i class=\"fas fa-search fa-sm\"></i>\r\n");
      out.write("                </button>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </form>\r\n");
      out.write("\r\n");
      out.write("                    <!-- Topbar Navbar -->\r\n");
      out.write("                    <ul class=\"navbar-nav ml-auto\">\r\n");
      out.write("\r\n");
      out.write("                        <!-- Nav Item - Search Dropdown (Visible Only XS) -->\r\n");
      out.write("                        <li class=\"nav-item dropdown no-arrow d-sm-none\">\r\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"searchDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                <i class=\"fas fa-search fa-fw\"></i>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <!-- Dropdown - Messages -->\r\n");
      out.write("                            <div class=\"dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in\" aria-labelledby=\"searchDropdown\">\r\n");
      out.write("                                <form class=\"form-inline mr-auto w-100 navbar-search\">\r\n");
      out.write("                                    <div class=\"input-group\">\r\n");
      out.write("                                        <input type=\"text\" class=\"form-control bg-light border-0 small\" placeholder=\"Search for...\" aria-label=\"Search\" aria-describedby=\"basic-addon2\">\r\n");
      out.write("                                        <div class=\"input-group-append\">\r\n");
      out.write("                                            <button class=\"btn btn-primary\" type=\"button\">\r\n");
      out.write("                        <i class=\"fas fa-search fa-sm\"></i>\r\n");
      out.write("                      </button>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Nav Item - Alerts -->\r\n");
      out.write("                        <li class=\"nav-item dropdown no-arrow mx-1\">\r\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"alertsDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                <i class=\"fas fa-bell fa-fw\"></i>\r\n");
      out.write("                                <!-- Counter - Alerts -->\r\n");
      out.write("                                <span class=\"badge badge-danger badge-counter\">3+</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <!-- Dropdown - Alerts -->\r\n");
      out.write("                            <div class=\"dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in\" aria-labelledby=\"alertsDropdown\">\r\n");
      out.write("                                <h6 class=\"dropdown-header\">\r\n");
      out.write("                                    Alerts Center\r\n");
      out.write("                                </h6>\r\n");
      out.write("                                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("                                    <div class=\"mr-3\">\r\n");
      out.write("                                        <div class=\"icon-circle bg-primary\">\r\n");
      out.write("                                            <i class=\"fas fa-file-alt text-white\"></i>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <div class=\"small text-gray-500\">December 12, 2019</div>\r\n");
      out.write("                                        <span class=\"font-weight-bold\">A new monthly report is ready to download!</span>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("                                    <div class=\"mr-3\">\r\n");
      out.write("                                        <div class=\"icon-circle bg-success\">\r\n");
      out.write("                                            <i class=\"fas fa-donate text-white\"></i>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <div class=\"small text-gray-500\">December 7, 2019</div>\r\n");
      out.write("                                        $290.29 has been deposited into your account!\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("                                    <div class=\"mr-3\">\r\n");
      out.write("                                        <div class=\"icon-circle bg-warning\">\r\n");
      out.write("                                            <i class=\"fas fa-exclamation-triangle text-white\"></i>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <div class=\"small text-gray-500\">December 2, 2019</div>\r\n");
      out.write("                                        Spending Alert: We've noticed unusually high spending for your account.\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <a class=\"dropdown-item text-center small text-gray-500\" href=\"#\">Show All Alerts</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Nav Item - Messages -->\r\n");
      out.write("                        <li class=\"nav-item dropdown no-arrow mx-1\">\r\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"messagesDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                <i class=\"fas fa-envelope fa-fw\"></i>\r\n");
      out.write("                                <!-- Counter - Messages -->\r\n");
      out.write("                                <span class=\"badge badge-danger badge-counter\">7</span>\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <!-- Dropdown - Messages -->\r\n");
      out.write("                            <div class=\"dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in\" aria-labelledby=\"messagesDropdown\">\r\n");
      out.write("                                <h6 class=\"dropdown-header\">\r\n");
      out.write("                                    Message Center\r\n");
      out.write("                                </h6>\r\n");
      out.write("                                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("                                    <div class=\"dropdown-list-image mr-3\">\r\n");
      out.write("                                        <img class=\"rounded-circle\" src=\"https://source.unsplash.com/fn_BT9fwg_E/60x60\" alt=\"\">\r\n");
      out.write("                                        <div class=\"status-indicator bg-success\"></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"font-weight-bold\">\r\n");
      out.write("                                        <div class=\"text-truncate\">Hi there! I am wondering if you can help me with a problem I've been having.</div>\r\n");
      out.write("                                        <div class=\"small text-gray-500\">Emily Fowler · 58m</div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("                                    <div class=\"dropdown-list-image mr-3\">\r\n");
      out.write("                                        <img class=\"rounded-circle\" src=\"https://source.unsplash.com/AU4VPcFN4LE/60x60\" alt=\"\">\r\n");
      out.write("                                        <div class=\"status-indicator\"></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <div class=\"text-truncate\">I have the photos that you ordered last month, how would you like them sent to you?</div>\r\n");
      out.write("                                        <div class=\"small text-gray-500\">Jae Chun · 1d</div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("                                    <div class=\"dropdown-list-image mr-3\">\r\n");
      out.write("                                        <img class=\"rounded-circle\" src=\"https://source.unsplash.com/CS2uCrpNzJY/60x60\" alt=\"\">\r\n");
      out.write("                                        <div class=\"status-indicator bg-warning\"></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <div class=\"text-truncate\">Last month's report looks great, I am very happy with the progress so far, keep up the good work!</div>\r\n");
      out.write("                                        <div class=\"small text-gray-500\">Morgan Alvarez · 2d</div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\r\n");
      out.write("                                    <div class=\"dropdown-list-image mr-3\">\r\n");
      out.write("                                        <img class=\"rounded-circle\" src=\"https://source.unsplash.com/Mv9hjnEUHR4/60x60\" alt=\"\">\r\n");
      out.write("                                        <div class=\"status-indicator bg-success\"></div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div>\r\n");
      out.write("                                        <div class=\"text-truncate\">Am I a good boy? The reason I ask is because someone told me that people say this to all dogs, even if they aren't good...</div>\r\n");
      out.write("                                        <div class=\"small text-gray-500\">Chicken the Dog · 2w</div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <a class=\"dropdown-item text-center small text-gray-500\" href=\"#\">Read More Messages</a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"topbar-divider d-none d-sm-block\"></div>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Nav Item - User Information -->\r\n");
      out.write("                        <li class=\"nav-item dropdown no-arrow\">\r\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                <span class=\"mr-2 d-none d-lg-inline text-white-600 medium\">Oscar Sanabria</span>\r\n");
      out.write("                                <img class=\"img-profile rounded-circle\" src=\"https://source.unsplash.com/QAB-WJcbgJk/60x60\">\r\n");
      out.write("                            </a>\r\n");
      out.write("                            <!-- Dropdown - User Information -->\r\n");
      out.write("                            <div class=\"dropdown-menu dropdown-menu-right shadow animated--grow-in\" aria-labelledby=\"userDropdown\">\r\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">\r\n");
      out.write("                                    <i class=\"fas fa-user fa-sm fa-fw mr-2 text-gray-400\"></i> Perfil\r\n");
      out.write("                                </a>\r\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">\r\n");
      out.write("                                    <i class=\"fas fa-cogs fa-sm fa-fw mr-2 text-gray-400\"></i> Configuracion\r\n");
      out.write("                                </a>\r\n");
      out.write("                                \r\n");
      out.write("                                <div class=\"dropdown-divider\"></div>\r\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\" data-toggle=\"modal\" data-target=\"#logoutModal\">\r\n");
      out.write("                                    <i class=\"fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400\"></i> Cerrar sesion\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("\r\n");
      out.write("                </nav>");
      out.write('\n');
      out.write("<div class=\"container-fluid\">\r\n");
      out.write("\r\n");
      out.write("<!-- Page Heading -->\r\n");
      out.write("<div class=\"d-sm-flex align-items-center justify-content-between mb-4\">\r\n");
      out.write("    <h1 class=\"h3 mb-0 text-gray-800\">Dashboard</h1>\r\n");
      out.write("    <!-- <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm\"> Lista de usuarios</a>\r\n");
      out.write("    <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-success shadow-sm\"> Consultar usuario</a>\r\n");
      out.write("    <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-warning shadow-sm\"> Actualizar usuario</a>\r\n");
      out.write("    <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-danger shadow-sm\"> Eliminar usuario</a> -->\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("<div class=\"d-sm-flex align-items-center justify-content-between mb-4\">\r\n");
      out.write("    \r\n");
      out.write("    <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm\"> Lista de usuarios</a>\r\n");
      out.write("    <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-success shadow-sm\"> Consultar usuario</a>\r\n");
      out.write("    <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-warning shadow-sm\"> Actualizar usuario</a>\r\n");
      out.write("    <a href=\"#\" class=\"d-none d-sm-inline-block btn btn-sm btn-danger shadow-sm\"> Eliminar usuario</a>\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div class=\"contenedor\">\r\n");
      out.write("\r\n");
      out.write("    <h1>Con toda la energia :)</h1>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>");
      out.write('\n');
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

    /* Evitamos que la página se guarde en el caché del navegador y en los proxys */
    response.setHeader("Cache-Control", "no-store"); //HTTP 1.1
    response.setHeader("Pragma", "no-cache"); //HTTP 1.0
    response.setDateHeader("Expires", 0); // prevents caching at the proxy server

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body onload=\"myFunction();\">\r\n");
      out.write("\r\n");
      out.write("<center> <div class=\"col-md-6\">\r\n");
      out.write("        <form action=\"/booktripO/controllerInmueble\" method=\"POST\"  onsubmit=\"return validarEstado()\">\r\n");
      out.write("\r\n");
      out.write("            <a href=\"#\" name=\"accion\" value=\"Listar\" class=\"d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm\"onclick=\"myFunctionB1()\"> Listar</a>\r\n");
      out.write("            <a href=\"#\" name=\"accion\" value=\"Nuevo\" class=\"d-none d-sm-inline-block btn btn-sm btn-success shadow-sm\" onclick=\"myFunctionB2()\"> Nuevo</a>\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"principal\" id=\"Listado\">\r\n");
      out.write("\r\n");
      out.write("        <div class=\"fondo container my-10 buscar\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("            <hr>\r\n");
      out.write("            <center>\r\n");
      out.write("                <div>\r\n");
      out.write("                    <h1>lista de inmuebles</h1>\r\n");
      out.write("\r\n");
      out.write("                    <table class=\"bg-light table table-bordered dataTables-example\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th>ID</th>\r\n");
      out.write("                                <th>TIPO DE INMUEBLE</th>\r\n");
      out.write("                                <th>DEPARTAMENTO</th>\r\n");
      out.write("                                <th>USUARIO</th>\r\n");
      out.write("                                <th>ESTADO</th>\r\n");
      out.write("                                <th>NOMBRE</th>\r\n");
      out.write("                                <th>DIRECCION</th>\r\n");
      out.write("                                <th>CAPACIDAD</th>\r\n");
      out.write("                                <th>DESCRIPCION</th> \r\n");
      out.write("                                <th>PRECIO</th>\r\n");
      out.write("                                <th>ADJUNTO</th>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                                <th>ACCIONES</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        ");

                            inmueblesDAO dao = new inmueblesDAO();
                            List<inmuebles> lista = dao.listar();
                            request.setAttribute("lista", lista);
      out.write("\r\n");
      out.write("                        <tbody style=\"height: 10px;\">\r\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        </tbody>\r\n");
      out.write("                    </table>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </center>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <div class=\"principal\" id=\"Registrar\">\r\n");
      out.write("        <div class=\"container principal\">\r\n");
      out.write("\r\n");
      out.write("            <div class=\"container  col-md-6 mt-5 bg-light form-group\">\r\n");
      out.write("                <h3>Agregar nuevo inmueble</h3>\r\n");
      out.write("                <hr>\r\n");
      out.write("                <br>\r\n");
      out.write("<form action=\"/booktripO/controllerInmueble\" method=\"POST\">\r\n");
      out.write("            <div class=\"col-sm-6\">\r\n");
      out.write("\r\n");
      out.write("                ");

                    tipoinmuebleDAO mitipoDAO = new tipoinmuebleDAO();
                    ArrayList<tipoinmuebles> listainmueble = mitipoDAO.ConsultarListadoTipos("");
                
      out.write(" \r\n");
      out.write("                <select name=\"txtTipo\">\r\n");
      out.write("                     <option value=\"\">--seleccione el inmueble </option>\r\n");
      out.write("                    ");

                                for (tipoinmuebles i : listainmueble) {
      out.write("\r\n");
      out.write("                    <option value=\"");
      out.print(i.getIdTipo());
      out.write('"');
      out.write('>');
      out.print(i.getNombre());
      out.write(" </option>\r\n");
      out.write("                    ");

                        }
                    
      out.write("\r\n");
      out.write("                </select>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("              \r\n");
      out.write("            <div class=\"col-sm-6\">\r\n");
      out.write("\r\n");
      out.write("                ");

                    departamentosDAO midepartamentoDAO = new departamentosDAO();
                    ArrayList<departamento> listadepartamento = midepartamentoDAO.ConsularListaDepartamento("");
                
      out.write(" \r\n");
      out.write("                <select name=\"txtDepartamento\">\r\n");
      out.write("                     <option value=\"\">--seleccione el departamento </option>\r\n");
      out.write("                    ");

                                for (departamento i : listadepartamento) {
      out.write("\r\n");
      out.write("                    <option value=\"");
      out.print(i.getIdDepartamento());
      out.write('"');
      out.write('>');
      out.print(i.getNombre());
      out.write(" </option>\r\n");
      out.write("                    ");

                        }
                    
      out.write("\r\n");
      out.write("                </select>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("                 <div class=\"col-sm-6\">\r\n");
      out.write("               \r\n");
      out.write("                        ");

                            usuarioDao miusuarioDAO = new usuarioDao();
                            ArrayList<usuario>  listausuario = miusuarioDAO.ConsultarListadoUsuarios("");
                        
      out.write(" \r\n");
      out.write("                        <select name=\"txtUsuario\">\r\n");
      out.write("                              <option value=\"\">--selecione el usuario-- </option>\r\n");
      out.write("                            ");

                        for (usuario i : listausuario) {
      out.write("\r\n");
      out.write("                            <option value=\"");
      out.print(i.getIdUsuario());
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
      out.write("            <div class=\"col-sm-6\">\r\n");
      out.write("\r\n");
      out.write("                ");

                    estadosDAO miestadoDAO = new estadosDAO();
                    ArrayList<estados> listaestado = miestadoDAO.ConsultarListadoEstados("");
                
      out.write(" \r\n");
      out.write("                <select name=\"txtEstado\">\r\n");
      out.write("                     <option value=\"\">--seleccione el estado </option>\r\n");
      out.write("                    ");

                                for (estados i : listaestado) {
      out.write("\r\n");
      out.write("                    <option value=\"");
      out.print(i.getIdEstado());
      out.write('"');
      out.write('>');
      out.print(i.getNombre());
      out.write(" </option>\r\n");
      out.write("                    ");

                        }
                    
      out.write("\r\n");
      out.write("                </select>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-sm-6\">\r\n");
      out.write("                <label>Nombre</label>\r\n");
      out.write("                <input type=\"text\" name=\"txtNombre\">\r\n");
      out.write("            </div>\r\n");
      out.write("                <div class=\"col-sm-6\">\r\n");
      out.write("                <label>Direccion</label>\r\n");
      out.write("                <input type=\"text\" name=\"txtDireccion\">\r\n");
      out.write("            </div>  \r\n");
      out.write("                <div class=\"col-sm-6\">\r\n");
      out.write("                <label>Capacidad</label>\r\n");
      out.write("                <input type=\"text\" name=\"txtCapacidad\">\r\n");
      out.write("            </div>  \r\n");
      out.write("                <div class=\"col-sm-6\">\r\n");
      out.write("                <label>Descripcion</label>\r\n");
      out.write("                <input type=\"text\" name=\"txtDescripcion\">\r\n");
      out.write("            </div>  \r\n");
      out.write("                <div class=\"col-sm-6\">\r\n");
      out.write("                <label>Precio</label>\r\n");
      out.write("                <input type=\"text\" name=\"txtPrecio\">\r\n");
      out.write("            </div>  \r\n");
      out.write("                \r\n");
      out.write("                \r\n");
      out.write("                <div class=\"col-sm-6\">\r\n");
      out.write("                <label>Adjunto</label>\r\n");
      out.write("                <input type=\"file\" name=\"txtAdjunto\">\r\n");
      out.write("            </div>  \r\n");
      out.write("\r\n");
      out.write("            <input type=\"submit\" name=\"accion\" value=\"Guardar\" class=\"btn-primary btn-block\">\r\n");
      out.write("            <input type=\"submit\" name=\"accion\" value=\"Regresar\" class=\"btn-danger btn-block\">\r\n");
      out.write("        </form>\r\n");
      out.write("\r\n");
      out.write("                \r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\n');
      out.write("</div>\r\n");
      out.write("            <!-- End of Main Content -->\r\n");
      out.write("\r\n");
      out.write("            <!-- Footer -->\r\n");
      out.write("            <footer class=\"sticky-footer bg-white\">\r\n");
      out.write("                <div class=\"container my-auto\">\r\n");
      out.write("                    <div class=\"copyright text-center my-auto\">\r\n");
      out.write("                        <span>Copyright &copy; Booktrip 2020</span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </footer>\r\n");
      out.write("            <!-- End of Footer -->\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- End of Content Wrapper -->\r\n");
      out.write("\r\n");
      out.write("    </div>\r\n");
      out.write("    <!-- End of Page Wrapper -->\r\n");
      out.write("\r\n");
      out.write("    <!-- Scroll to Top Button-->\r\n");
      out.write("    <a class=\"scroll-to-top rounded\" href=\"#page-top\">\r\n");
      out.write("        <i class=\"fas fa-angle-up\"></i>\r\n");
      out.write("    </a>\r\n");
      out.write("\r\n");
      out.write("    <!-- Logout Modal-->\r\n");
      out.write("    <div class=\"modal fade\" id=\"logoutModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"exampleModalLabel\" aria-hidden=\"true\">\r\n");
      out.write("        <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("            <div class=\"modal-content\">\r\n");
      out.write("                <div class=\"modal-header\">\r\n");
      out.write("                    <h5 class=\"modal-title\" id=\"exampleModalLabel\">Quieres cerrar la sesion?</h5>\r\n");
      out.write("                    <button class=\"close\" type=\"button\" data-dismiss=\"modal\" aria-label=\"Close\">\r\n");
      out.write("            <span aria-hidden=\"true\">×</span>\r\n");
      out.write("          </button>\r\n");
      out.write("                </div>\r\n");
      out.write("                <div class=\"modal-body\">Seleccione salir si estas listo para cerrar la sesion actual</div>\r\n");
      out.write("                <div class=\"modal-footer\">\r\n");
      out.write("                    <button class=\"btn btn-secondary\" type=\"button\" data-dismiss=\"modal\">Cancelar</button>\r\n");
      out.write("                    <a class=\"btn btn-primary\" href=\"#\">Salir</a>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"js/appUtilitariosEstados.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery-1.11.0.min.js\"></script>\r\n");
      out.write("    <script src=\"js/gestionarEstado.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap core JavaScript-->\r\n");
      out.write("    <script src=\"vendor/jquery/jquery.min.js\"></script>\r\n");
      out.write("    <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Core plugin JavaScript-->\r\n");
      out.write("    <script src=\"vendor/jquery-easing/jquery.easing.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom scripts for all pages-->\r\n");
      out.write("    <script src=\"js/sb-admin-2.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Page level plugins -->\r\n");
      out.write("    <script src=\"vendor/chart.js/Chart.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Page level custom scripts -->\r\n");
      out.write("    <script src=\"js/demo/chart-area-demo.js\"></script>\r\n");
      out.write("    <script src=\"js/demo/chart-pie-demo.js\"></script>\r\n");
      out.write("     <!-- librerias-->\r\n");
      out.write("    <script src=\"js/jquery-1.11.0.min.js\"></script>\r\n");
      out.write("    <script src=\"js/script.js\"></script>\r\n");
      out.write("    <script src=\"js/jquery-1.11.0.min.js\"></script>\r\n");
      out.write("    <script src=\"js/gestionarSolicitudes.js\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
      out.write('}');
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setVar("dato");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${lista}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <tr>\r\n");
          out.write("                                    <td style=\"padding-left:25px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getIdInmueble()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td style=\"padding-left:25px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getIdTipo()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td style=\"padding-left:25px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getIdDocumento()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td style=\"padding-left:25px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getIdUsuario()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td style=\"padding-left:25px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getIdEstado()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td style=\"padding-left:25px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getNombre()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td style=\"padding-left:25px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getDireccion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td style=\"padding-left:25px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getCapacidad()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td style=\"padding-left:25px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getDescripcion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td style=\"padding-left:25px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getPrecio()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                      <td style=\"padding-left:25px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getAdjunto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("\r\n");
          out.write("                                    <td style=\"padding-left:25px;\">\r\n");
          out.write("                                        <form action=\"/booktripO/controllerInmueble\" method=\"POST\">\r\n");
          out.write("                                            <input type=\"hidden\" name=\"id\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getIdInmueble()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                            <input type=\"submit\" name=\"accion\" value=\"Editar\" class=\"btn-success btn-block\" >\r\n");
          out.write("                                            <input type=\"submit\" name=\"accion\" value=\"Delete\" class=\"btn-danger btn-block\" onclick=\"return confirm('Está seguro que deseas eliminar el registro?');\">\r\n");
          out.write("                                        </form>\r\n");
          out.write("                                    </td>\r\n");
          out.write("                                </tr>\r\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }
}
