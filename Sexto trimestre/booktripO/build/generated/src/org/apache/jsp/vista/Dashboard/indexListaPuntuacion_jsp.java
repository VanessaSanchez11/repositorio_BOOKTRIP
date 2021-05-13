package org.apache.jsp.vista.Dashboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.puntuaciones;
import controlador.puntuacionesDAO;
import java.util.Iterator;
import java.util.List;
import java.sql.ResultSet;
import java.sql.Statement;
import controlador.Conexion;
import controlador.estadosDAO;
import modelo.estados;

public final class indexListaPuntuacion_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(5);
    _jspx_dependants.add("/vista/Dashboard/header.jsp");
    _jspx_dependants.add("/vista/Dashboard/sidebar.jsp");
    _jspx_dependants.add("/vista/Dashboard/content.jsp");
    _jspx_dependants.add("/vista/Dashboard/listaPuntuacion.jsp");
    _jspx_dependants.add("/vista/Dashboard/footer.jsp");
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

/* Evitamos que la página se guarde en el caché del navegador y en los proxys */
response.setHeader("Cache-Control","no-store"); //HTTP 1.1
response.setHeader("Pragma","no-cache"); //HTTP 1.0
response.setDateHeader("Expires", 0); // prevents caching at the proxy server

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
      out.write(" <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6\" crossorigin=\"anonymous\">\r\n");
      out.write("    <link href=\"http://webapplayers.com/inspinia_admin-v2.9.4/css/plugins/dataTables/datatables.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link href=\"vendor/fontawesome-free/css/all.min.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css?family=Nunito:200,200i,300,300i,400,400i,600,600i,700,700i,800,800i,900,900i\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom styles for this template-->\r\n");
      out.write("    <link href=\"css/sb-admin-2.min.css\" rel=\"stylesheet\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/estilosBooktr.css\">\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/spanish.json\">\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body id=\"page-top\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Page Wrapper -->\r\n");
      out.write("    <div id=\"wrapper\">");
      out.write('\r');
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
      out.write("                 <a class=\"collapse-item\" href=\"indexListaRol.jsp\">Roles</a>\r\n");
      out.write("                 <a class=\"collapse-item\" href=\"indexListaUsuarios.jsp\">Lista de usuarios</a>\r\n");
      out.write("                 <a class=\"collapse-item\" href=\"indexListaTipoDocumento.jsp\">Tipo de documento</a>\r\n");
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
      out.write("                 <a class=\"collapse-item\" href=\"index1.jsp\">Lista de inmuebles</a>\r\n");
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
      out.write("                 <a class=\"collapse-item\" href=\"indexListaSolicitud.jsp\">Solicitudes</a>\r\n");
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
      out.write('\r');
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
      out.write("                       \r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                        <div class=\"topbar-divider d-none d-sm-block\"></div>\r\n");
      out.write("\r\n");
      out.write("                        <!-- Nav Item - User Information -->\r\n");
      out.write("                        <li class=\"nav-item dropdown no-arrow\">\r\n");
      out.write("                            <form action=\"login\">\r\n");
      out.write("                            \r\n");
      out.write("                            <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"userDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n");
      out.write("                                <span class=\"mr-2 d-none d-lg-inline text-white-600 medium\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${email}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</span>\r\n");
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
      out.write("                                <a class=\"dropdown-item\" href=\"../login.jsp\" data-toggle=\"#\" data-target=\"#\">\r\n");
      out.write("                                    <i class=\"fas fa-sign-out-alt fa-sm fa-fw mr-2 text-gray-400\"></i> Cerrar sesion\r\n");
      out.write("                                </a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </li>\r\n");
      out.write("\r\n");
      out.write("                    </ul>\r\n");
      out.write("</form>\r\n");
      out.write("                </nav>");
      out.write('\r');
      out.write('\n');
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
      out.write("        <form action=\"/booktripO/controllerEstado\" method=\"POST\"  onsubmit=\"return validarEstado()\">\r\n");
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
      out.write("                    <h1>lista de puntuaciones</h1>\r\n");
      out.write("\r\n");
      out.write("                    <table class=\"bg-light table table-bordered dataTables-example\">\r\n");
      out.write("                        <thead>\r\n");
      out.write("                            <tr>\r\n");
      out.write("                                <th>ID</th>\r\n");
      out.write("                                <th>idUsuario</th>\r\n");
      out.write("                                <th>idInmueble</th>\r\n");
      out.write("                                <th>fechaCreada</th>\r\n");
      out.write("                                <th>descripcion</th>\r\n");
      out.write("                                <th>calificacion</th>\r\n");
      out.write("\r\n");
      out.write("                                <th>ACCIONES</th>\r\n");
      out.write("                            </tr>\r\n");
      out.write("                        </thead>\r\n");
      out.write("                        ");

                            puntuacionesDAO dao = new puntuacionesDAO();
                            List<puntuaciones> lista = dao.listar();
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
      out.write("                <h3>Agregar nuevos estados</h3>\r\n");
      out.write("                <hr>\r\n");
      out.write("                <br>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                <form id=\"formularioEstado\" action=\"/booktripO/controllerEstado\"\r\n");
      out.write("                      method=\"POST\" onsubmit=\"return validarEstado()\">\r\n");
      out.write("                    <div col-md-6>\r\n");
      out.write("                        <div col-md-3><label>Nombre:</label></div>\r\n");
      out.write("                        <div col-md-3><input type=\"text\" name=\"txtNom\" id=\"txtNom\">\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div col-md-6>\r\n");
      out.write("                        <div col-md-3><input type=\"submit\" name=\"accion\" value=\"Guardar\"\r\n");
      out.write("                                             class=\" btn btn-success btn-block mt-1\" >\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div col-md-3> <input type=\"submit\" name=\"accion\" value=\"Regresar\" class=\"btn btn-danger btn-block mt-1 my-4\"></div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </form>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
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
      out.write("    <script type=\"text/javascript\" charset=\"utf8\" src=\"js/spanish.json\"></script>\r\n");
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
      out.write("    <script src=\"js/spanish.json\"></script>\r\n");
      out.write("    <script src=\"js/jquery-1.11.0.min.js\"></script>\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("    \r\n");
      out.write("    <script src=\"http://webapplayers.com/inspinia_admin-v2.9.4/js/jquery-3.1.1.min.js\"></script>\r\n");
      out.write("    <script src=\"http://webapplayers.com/inspinia_admin-v2.9.4/js/popper.min.js\"></script>\r\n");
      out.write("    <script src=\"http://webapplayers.com/inspinia_admin-v2.9.4/js/bootstrap.js\"></script>\r\n");
      out.write("    <script src=\"http://webapplayers.com/inspinia_admin-v2.9.4/js/plugins/metisMenu/jquery.metisMenu.js\"></script>\r\n");
      out.write("    <script src=\"http://webapplayers.com/inspinia_admin-v2.9.4/js/plugins/slimscroll/jquery.slimscroll.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <script src=\"http://webapplayers.com/inspinia_admin-v2.9.4/js/plugins/dataTables/datatables.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Custom and plugin javascript -->\r\n");
      out.write("    <script src=\"http://webapplayers.com/inspinia_admin-v2.9.4/js/inspinia.js\"></script>\r\n");
      out.write("    <script src=\"http://webapplayers.com/inspinia_admin-v2.9.4/js/plugins/pace/pace.min.js\"></script>\r\n");
      out.write(" \r\n");
      out.write("    <!-- Page-Level Scripts -->\r\n");
      out.write("    <script>\r\n");
      out.write("\r\n");
      out.write("        // Upgrade button class name\r\n");
      out.write("        $.fn.dataTable.Buttons.defaults.dom.button.className = 'btn btn-white btn-sm';\r\n");
      out.write("\r\n");
      out.write("        $(document).ready(function(){\r\n");
      out.write("            $('.dataTables-example').DataTable({\r\n");
      out.write("                \"language\": {\r\n");
      out.write("      \"url\": \"//cdn.datatables.net/plug-ins/1.10.15/i18n/Spanish.json\"\r\n");
      out.write("    },\r\n");
      out.write("                pageLength: 25,\r\n");
      out.write("                responsive: true,\r\n");
      out.write("                dom: '<\"html5buttons\"B>lTfgitp',\r\n");
      out.write("                buttons: [\r\n");
      out.write("                    { extend: 'copy'},\r\n");
      out.write("                    {extend: 'csv'},\r\n");
      out.write("                    {extend: 'excel', title: 'ExampleFile'},\r\n");
      out.write("                    {extend: 'pdf', title: 'ExampleFile'},\r\n");
      out.write("\r\n");
      out.write("                    {extend: 'print',\r\n");
      out.write("                     customize: function (win){\r\n");
      out.write("                            $(win.document.body).addClass('white-bg');\r\n");
      out.write("                            $(win.document.body).css('font-size', '10px');\r\n");
      out.write("\r\n");
      out.write("                            $(win.document.body).find('table')\r\n");
      out.write("                                    .addClass('compact')\r\n");
      out.write("                                    .css('font-size', 'inherit');\r\n");
      out.write("                    }\r\n");
      out.write("                    }\r\n");
      out.write("                ]\r\n");
      out.write("\r\n");
      out.write("            });\r\n");
      out.write("\r\n");
      out.write("        });\r\n");
      out.write("\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
      out.write("}\r\n");
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
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getIdPuntuacion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td style=\"padding-left:25px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getIdUsuario()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td style=\"padding-left:25px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getIdInmueble()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td style=\"padding-left:25px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getFechaCreada()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td style=\"padding-left:25px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getDescripcion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td style=\"padding-left:25px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getCalificacion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\r\n");
          out.write("                                    <td style=\"padding-left:25px;\">\r\n");
          out.write("                                        <form action=\"/booktripO/controllerPuntuacion\" method=\"POST\">\r\n");
          out.write("                                            <input type=\"hidden\" name=\"id\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getIdPuntuacion()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                            <input type=\"submit\" name=\"accion\" value=\"Editar\" class=\"btn-primary btn-block my-1\">\r\n");
          out.write("                                            <input type=\"submit\" name=\"accion\" value=\"Delete\" class=\"btn-danger btn-block\">\r\n");
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
