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

public final class indexSolicitudInmueble_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(5);
    _jspx_dependants.add("/vista/Dashboard/header.jsp");
    _jspx_dependants.add("/vista/Dashboard/sidebar.jsp");
    _jspx_dependants.add("/vista/Dashboard/content.jsp");
    _jspx_dependants.add("/vista/Dashboard/listadoSolicitudInmueble.jsp");
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
      out.write("<div id=\"content-wrapper\" class=\"d-flex flex-column\">\n");
      out.write("\n");
      out.write("            <!-- Main Content -->\n");
      out.write("            <div id=\"content\">\n");
      out.write("\n");
      out.write("                <!-- Topbar -->\n");
      out.write("                <nav class=\"navbar navbar-expand navbar-light bg-secondary topbar mb-4 static-top shadow\">\n");
      out.write("\n");
      out.write("                    <!-- Sidebar Toggle (Topbar) -->\n");
      out.write("                    <button id=\"sidebarToggleTop\" class=\"btn btn-link d-md-none rounded-circle mr-3\">\n");
      out.write("            <i class=\"fa fa-bars\"></i>\n");
      out.write("          </button>\n");
      out.write("\n");
      out.write("                    <!-- Topbar Search -->\n");
      out.write("                    <form class=\"d-none d-sm-inline-block form-inline mr-auto ml-md-3 my-2 my-md-0 mw-100 navbar-search\">\n");
      out.write("                        <div class=\"input-group\">\n");
      out.write("                            <input type=\"text\" class=\"form-control bg-light border-0 small\" placeholder=\"Buscar...\" aria-label=\"Search\" aria-describedby=\"basic-addon2\">\n");
      out.write("                            <div class=\"input-group-append\">\n");
      out.write("                                <button class=\"btn btn-primary\" type=\"button\">\n");
      out.write("                  <i class=\"fas fa-search fa-sm\"></i>\n");
      out.write("                </button>\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </form>\n");
      out.write("\n");
      out.write("                    <!-- Topbar Navbar -->\n");
      out.write("                    <ul class=\"navbar-nav ml-auto\">\n");
      out.write("\n");
      out.write("                        <!-- Nav Item - Search Dropdown (Visible Only XS) -->\n");
      out.write("                        <li class=\"nav-item dropdown no-arrow d-sm-none\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"searchDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                <i class=\"fas fa-search fa-fw\"></i>\n");
      out.write("                            </a>\n");
      out.write("                            <!-- Dropdown - Messages -->\n");
      out.write("                            <div class=\"dropdown-menu dropdown-menu-right p-3 shadow animated--grow-in\" aria-labelledby=\"searchDropdown\">\n");
      out.write("                                <form class=\"form-inline mr-auto w-100 navbar-search\">\n");
      out.write("                                    <div class=\"input-group\">\n");
      out.write("                                        <input type=\"text\" class=\"form-control bg-light border-0 small\" placeholder=\"Search for...\" aria-label=\"Search\" aria-describedby=\"basic-addon2\">\n");
      out.write("                                        <div class=\"input-group-append\">\n");
      out.write("                                            <button class=\"btn btn-primary\" type=\"button\">\n");
      out.write("                        <i class=\"fas fa-search fa-sm\"></i>\n");
      out.write("                      </button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <!-- Nav Item - Alerts -->\n");
      out.write("                        <li class=\"nav-item dropdown no-arrow mx-1\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"alertsDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                <i class=\"fas fa-bell fa-fw\"></i>\n");
      out.write("                                <!-- Counter - Alerts -->\n");
      out.write("                                <span class=\"badge badge-danger badge-counter\">3+</span>\n");
      out.write("                            </a>\n");
      out.write("                            <!-- Dropdown - Alerts -->\n");
      out.write("                            <div class=\"dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in\" aria-labelledby=\"alertsDropdown\">\n");
      out.write("                                <h6 class=\"dropdown-header\">\n");
      out.write("                                    Alerts Center\n");
      out.write("                                </h6>\n");
      out.write("                                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
      out.write("                                    <div class=\"mr-3\">\n");
      out.write("                                        <div class=\"icon-circle bg-primary\">\n");
      out.write("                                            <i class=\"fas fa-file-alt text-white\"></i>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>\n");
      out.write("                                        <div class=\"small text-gray-500\">December 12, 2019</div>\n");
      out.write("                                        <span class=\"font-weight-bold\">A new monthly report is ready to download!</span>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
      out.write("                                    <div class=\"mr-3\">\n");
      out.write("                                        <div class=\"icon-circle bg-success\">\n");
      out.write("                                            <i class=\"fas fa-donate text-white\"></i>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>\n");
      out.write("                                        <div class=\"small text-gray-500\">December 7, 2019</div>\n");
      out.write("                                        $290.29 has been deposited into your account!\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
      out.write("                                    <div class=\"mr-3\">\n");
      out.write("                                        <div class=\"icon-circle bg-warning\">\n");
      out.write("                                            <i class=\"fas fa-exclamation-triangle text-white\"></i>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>\n");
      out.write("                                        <div class=\"small text-gray-500\">December 2, 2019</div>\n");
      out.write("                                        Spending Alert: We've noticed unusually high spending for your account.\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                                <a class=\"dropdown-item text-center small text-gray-500\" href=\"#\">Show All Alerts</a>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <!-- Nav Item - Messages -->\n");
      out.write("                        <li class=\"nav-item dropdown no-arrow mx-1\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"messagesDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                <i class=\"fas fa-envelope fa-fw\"></i>\n");
      out.write("                                <!-- Counter - Messages -->\n");
      out.write("                                <span class=\"badge badge-danger badge-counter\">7</span>\n");
      out.write("                            </a>\n");
      out.write("                            <!-- Dropdown - Messages -->\n");
      out.write("                            <div class=\"dropdown-list dropdown-menu dropdown-menu-right shadow animated--grow-in\" aria-labelledby=\"messagesDropdown\">\n");
      out.write("                                <h6 class=\"dropdown-header\">\n");
      out.write("                                    Message Center\n");
      out.write("                                </h6>\n");
      out.write("                                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
      out.write("                                    <div class=\"dropdown-list-image mr-3\">\n");
      out.write("                                        <img class=\"rounded-circle\" src=\"https://source.unsplash.com/fn_BT9fwg_E/60x60\" alt=\"\">\n");
      out.write("                                        <div class=\"status-indicator bg-success\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"font-weight-bold\">\n");
      out.write("                                        <div class=\"text-truncate\">Hi there! I am wondering if you can help me with a problem I've been having.</div>\n");
      out.write("                                        <div class=\"small text-gray-500\">Emily Fowler · 58m</div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
      out.write("                                    <div class=\"dropdown-list-image mr-3\">\n");
      out.write("                                        <img class=\"rounded-circle\" src=\"https://source.unsplash.com/AU4VPcFN4LE/60x60\" alt=\"\">\n");
      out.write("                                        <div class=\"status-indicator\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>\n");
      out.write("                                        <div class=\"text-truncate\">I have the photos that you ordered last month, how would you like them sent to you?</div>\n");
      out.write("                                        <div class=\"small text-gray-500\">Jae Chun · 1d</div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
      out.write("                                    <div class=\"dropdown-list-image mr-3\">\n");
      out.write("                                        <img class=\"rounded-circle\" src=\"https://source.unsplash.com/CS2uCrpNzJY/60x60\" alt=\"\">\n");
      out.write("                                        <div class=\"status-indicator bg-warning\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>\n");
      out.write("                                        <div class=\"text-truncate\">Last month's report looks great, I am very happy with the progress so far, keep up the good work!</div>\n");
      out.write("                                        <div class=\"small text-gray-500\">Morgan Alvarez · 2d</div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                                <a class=\"dropdown-item d-flex align-items-center\" href=\"#\">\n");
      out.write("                                    <div class=\"dropdown-list-image mr-3\">\n");
      out.write("                                        <img class=\"rounded-circle\" src=\"https://source.unsplash.com/Mv9hjnEUHR4/60x60\" alt=\"\">\n");
      out.write("                                        <div class=\"status-indicator bg-success\"></div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div>\n");
      out.write("                                        <div class=\"text-truncate\">Am I a good boy? The reason I ask is because someone told me that people say this to all dogs, even if they aren't good...</div>\n");
      out.write("                                        <div class=\"small text-gray-500\">Chicken the Dog · 2w</div>\n");
      out.write("                                    </div>\n");
      out.write("                                </a>\n");
      out.write("                                <a class=\"dropdown-item text-center small text-gray-500\" href=\"#\">Read More Messages</a>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                        <div class=\"topbar-divider d-none d-sm-block\"></div>\n");
      out.write("\n");
      out.write("                        <!-- Nav Item - User Information -->\n");
      out.write("                        <li class=\"nav-item dropdown no-arrow\">\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                <span class=\"mr-2 d-none d-lg-inline text-white-600 medium\">Oscar Sanabria</span>\n");
      out.write("                                <img class=\"img-profile rounded-circle\" src=\"https://source.unsplash.com/QAB-WJcbgJk/60x60\">\n");
      out.write("                            </a>\n");
      out.write("                            <!-- Dropdown - User Information -->\n");
      out.write("                            <div class=\"dropdown-menu dropdown-menu-right shadow animated--grow-in\" aria-labelledby=\"userDropdown\">\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                                    <i class=\"fas fa-user fa-sm fa-fw mr-2 text-gray-400\"></i> Perfil\n");
      out.write("                                </a>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\">\n");
      out.write("                                    <i class=\"fas fa-cogs fa-sm fa-fw mr-2 text-gray-400\"></i> Configuracion\n");
      out.write("                                </a>\n");
      out.write("                                \n");
      out.write("                                <div class=\"dropdown-divider\"></div>\n");
      out.write("                                <a class=\"dropdown-item\" href=\"#\" data-toggle=\"modal\" data-target=\"#logoutModal\">\n");
      out.write("                                    <i class=\"fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400\"></i> Cerrar sesion\n");
      out.write("                                </a>\n");
      out.write("                            </div>\n");
      out.write("                        </li>\n");
      out.write("\n");
      out.write("                    </ul>\n");
      out.write("\n");
      out.write("                </nav>");
      out.write('\n');
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
      out.write("    <script src=\"js/appUtilitariosEstados.js\"></script>\n");
      out.write("    <script src=\"js/jquery-1.11.0.min.js\"></script>\n");
      out.write("    <script src=\"js/gestionarEstado.js\"></script>\n");
      out.write("\n");
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
      out.write("     <!-- librerias-->\n");
      out.write("    <script src=\"js/jquery-1.11.0.min.js\"></script>\n");
      out.write("    <script src=\"js/script.js\"></script>\n");
      out.write("    <script src=\"js/jquery-1.11.0.min.js\"></script>\n");
      out.write("    <script src=\"js/gestionarSolicitudes.js\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
      out.write("\n");
      out.write("    ");
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
