package org.apache.jsp.vista.Dashboard;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.inmuebles;
import controlador.inmueblesDAO;
import modelo.estados;
import controlador.estadosDAO;
import modelo.usuario;
import controlador.usuarioDao;
import modelo.departamento;
import controlador.departamentosDAO;
import java.util.ArrayList;
import modelo.tipoinmuebles;
import controlador.tipoinmuebleDAO;

public final class inmueble_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>Inmueble</title>\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./vista/css/bootstrap-grid.min.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"./vista/css/bootstrap.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" href=\"css/estiloInmueble.css\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\"\n");
      out.write("        href=\"C:\\Users\\oscar sanabria\\Documents\\NetBeansProjects\\booktripPLaces\\web\\vista\\Dashboard\\css\\registro_inmueble.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\"\n");
      out.write("        integrity=\"sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z\" crossorigin=\"anonymous\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css\"\n");
      out.write("        integrity=\"sha384-JcKb8q3iqJ61gNV9KGb8thSsNjpSL0n8PARn9HuZOnIxN0hoP+VmmDGMN5t9UJ0Z\" crossorigin=\"anonymous\">\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body onload=\"mueveReloj()\" onload=\"visualizaOculta('");
      out.print(request.getParameter("Vista"));
      out.write("');\">\n");
      out.write("    ");
 String buscando = request.getParameter("buscando");
            if (buscando == null) {
                buscando = "";
            }
        
      out.write("\n");
      out.write("    <div class=\"container\">\n");
      out.write("\n");
      out.write("        <div class=\"principal\"> \n");
      out.write("\n");
      out.write("            <div class=\"fondo text-white py-5\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row justify-content-md-center\">\n");
      out.write("                        <div class=\"btn-group \">\n");
      out.write("                            <button type=\"button\" class=\"btn-light\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("                                aria-expanded=\"false\" onClick=\"visualizaOculta('registroInmueble')\">\n");
      out.write("                                Registrar\n");
      out.write("                            </button>\n");
      out.write("                            <button type=\"button\" class=\"btn btn-secondary\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("                                aria-expanded=\"false\" onClick=\"visualizaOculta('actualizarInmue')\">\n");
      out.write("                                Actualizar\n");
      out.write("                            </button>\n");
      out.write("                            <button type=\"button\" class=\"btn btn-success\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("                                aria-expanded=\"false\" onClick=\"visualizaOculta('consultarInmueble')\">\n");
      out.write("                                Listar\n");
      out.write("                            </button>\n");
      out.write("                            <button type=\"button\" class=\"btn btn-warning\" data-toggle=\"dropdown\" aria-haspopup=\"true\"\n");
      out.write("                                aria-expanded=\"false\" onClick=\"Volver()\">\n");
      out.write("                                Volver al Inicio\n");
      out.write("                            </button>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"row d-flex h-100\">\n");
      out.write("\n");
      out.write("\n");
      out.write("                        <div class=\"col-md-6 col-xm-12 text-center justify-content-center align-items-center  bd-example d-none\"\n");
      out.write("                            id=\"Registrar\">\n");
      out.write("                            <h1>\n");
      out.write("                                Registrar inmueble\n");
      out.write("                            </h1>\n");
      out.write("                            <form action=\"/booktripPLaces/registroInmueble\" method=\"post\"\n");
      out.write("                                onsubmit=\"return validarInformacionInmueble()\">\n");
      out.write("\n");
      out.write("                                <div class=\"row d-flex h-100\">\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <input id=\"txtTipo\" type=\"text\" class=\"form-control d-none\" name=\"idTipo\">\n");
      out.write("\n");
      out.write("                                        ");

                                                tipoinmuebleDAO TipoInmuebleDAO = new tipoinmuebleDAO();
                                                ArrayList<tipoinmuebles> milistatipoinmueble = TipoInmuebleDAO.ConsultarListadoTipoInmueble("");
                                                out.println("<select class='form-control' id='selectIdTipo' size= '1' onchange='setIdTipo()'>");
                                                out.println("<option value=''>" + "--seleccione tipo inmueble--" + "</option>");
                                                for (tipoinmuebles c : milistatipoinmueble) {
                                                    out.println("<option value='" + c.getIdTipo() + "'>" + c.getNombre() + "</option>");
                                                }
                                                out.println("</select>");
                                            
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <input name=\"idDepartamento\" type=\"text\" id=\"txtDepartamento\"\n");
      out.write("                                            class=\"form-control d-none my-1\">\n");
      out.write("                                        ");

                                                departamentosDAO midepartamentoDAO = new departamentosDAO();
                                                ArrayList<departamento> milistadepartamento = midepartamentoDAO.ConsularListaDepartamento("");
                                                out.println("<select class='form-control' id='selectIdDepartamento' size= '1' onchange='setIdDepartamento()'>");
                                                out.println("<option value=''>" + "--seleccione el departamento--" + "</option>");
                                                for (departamento c : milistadepartamento) {
                                                    out.println("<option value='" + c.getIdDepartamento()+ "'>" + c.getNombre() + "</option>");
                                                }
                                                out.println("</select>");
                                            
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row d-flex h-100\">\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <input name=\"idUsuario\" class=\"form-control d-none my-1\" id=\"txtUsuario\">\n");
      out.write("                                        ");

                                                usuarioDao miusuarioDAO = new usuarioDao();
                                                ArrayList<usuario> milistausuario = miusuarioDAO.ListadoUsuarios("");
                                                out.println("<select class='form-control' id='selectIdUsuario' size= '1' onchange='setIdUsuario()'>");
                                                out.println("<option value=''>" + "--seleccione usuario--" + "</option>");
                                                for (usuario c : milistausuario) {
                                                    out.println("<option value='" + c.getIdUsuario()+ "'>" + c.getNombre()+ "</option>");

                                                }
                                                out.println("</select>");
                                            
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <input name=\"idEstado\" class=\"form-control d-none my-1\" id=\"txtEstado\">\n");
      out.write("                                        ");

                                                estadosDAO miestadoDAO = new estadosDAO();
                                                ArrayList<estados> milistaestado = miestadoDAO.ConsultarListadoEstado(buscando, buscando);
                                                out.println("<select class='form-control' id='selectIdEstado' size= '1' onchange='setIdEstado()'>");
                                                out.println("<option value=''>" + "--seleccione estado--" + "</option>");
                                                for (estados c : milistaestado) {
                                                    out.println("<option value='" + c.getIdEstado() + "'>" + c.getNombre() + "</option>");

                                                }
                                                out.println("</select>");
                                            
      out.write("\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row d-flex h-100\">\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <input name=\"nombre\" type=\"text\" id=\"txtNombre\" class=\"form-control my-1\"\n");
      out.write("                                            placeholder=\"Nombre inmueble\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <input name=\"direccion\" type=\"text\" id=\"txtDireccion\" class=\"form-control my-1\"\n");
      out.write("                                            placeholder=\"Direccion\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row d-flex h-100\">\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <input name=\"capacidad\" type=\"text\" id=\"txtCapacidad\" class=\"form-control my-1\"\n");
      out.write("                                            placeholder=\"Capacidad\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <input name=\"precio\" type=\"text\" id=\"txtPrecio\" class=\"form-control my-1\"\n");
      out.write("                                            placeholder=\"Precio\">\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <div class=\"row d-flex h-100\">\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <input name=\"adjunto\" type=\"text\" id=\"txtAdjunto\" class=\"form-control my-1\"\n");
      out.write("                                            placeholder=\"Adjunto\">\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <textarea name=\"descripcion\" class=\"form-control my-1\" id=\"txtDescripcion\"\n");
      out.write("                                            rows=\"3\" placeholder=\"Descripción\"></textarea>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"col-md-12\">\n");
      out.write("                                    <input id=\"txtBandera\" type=\"text\" name=\"banderaRegistro\">\n");
      out.write("                                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                <div class=\"row d-flex h-100\">\n");
      out.write("\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <input type=\"submit\" class=\"btn btn-primary boton my-1 btn-block my-1\"\n");
      out.write("                                            value=\"registrar Inmueble\" onclick=\"\">\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"col-md-6\">\n");
      out.write("                                        <button class=\"btn btn-danger btn-block my-1\" type=\"submit\">Cancelar</button>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"col-md-6 col-xm-12 align-items-center\">\n");
      out.write("                            <div class=\"row d-flex w-100\">\n");
      out.write("                                <div class=\"col-12 mt-3\">\n");
      out.write("                                    <div class=\"carousel slide\" id=\"principal-carousel\" data-ride=\"carousel\">\n");
      out.write("                                        <ol class=\"carousel-indicators\">\n");
      out.write("                                            <li data-target=\"#principal-carousel\" data-slid-to=\"0\" class=\"active\"></li>\n");
      out.write("                                            <li data-target=\"#principal-carousel\" data-slid-to=\"1\"></li>\n");
      out.write("                                            <li data-target=\"#principal-carousel\" data-slid-to=\"2\"></li>\n");
      out.write("                                        </ol>\n");
      out.write("\n");
      out.write("                                        <div class=\"carousel-inner\">\n");
      out.write("                                            <div class=\"carousel-item active\">\n");
      out.write("                                                <img src=\"./imagenes/imagen1.jpg\" class=\"w-100\" alt=\"\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"carousel-item\">\n");
      out.write("                                                <img src=\"./imagenes/imagen2.jpg\" class=\"w-100\" alt=\"\">\n");
      out.write("                                            </div>\n");
      out.write("                                            <div class=\"carousel-item\">\n");
      out.write("                                                <img src=\"./imagenes/imagen3.jpg\" class=\"w-100\" alt=\"\">\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("                                        <a href=\"#principal-carousel\" class=\"carousel-control-prev\" data-slide=\"prev\">\n");
      out.write("                                            <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                                            <span class=\"sr-only\">Anterior</span>\n");
      out.write("                                        </a>\n");
      out.write("\n");
      out.write("                                        <a href=\"#principal-carousel\" class=\"carousel-control-next\" data-slide=\"next\">\n");
      out.write("                                            <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                                            <span class=\"sr-only\">Siguiente</span>\n");
      out.write("                                        </a>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("              \n");
      out.write("                        <div class=\"row d-flex h-100\">\n");
      out.write("\n");
      out.write("                            <div class=\"col-md-6 col-xm-12 text-center justify-content-center align-items-center  bd-example d-none\" id=\"Actualizar\">\n");
      out.write("                                <h1>\n");
      out.write("                                    actualizar inmueble\n");
      out.write("                                </h1>\n");
      out.write("                                <form action=\"/booktripPLaces/actualizarInmueble\" method=\"post\" onsubmit=\"return validarInformacionInmuebleAct()\">\n");
      out.write("\n");
      out.write("                                    <div class=\"row d-flex h-100\">\n");
      out.write("                                        <div class=\"col-md-6\">\n");
      out.write("                                            <input id=\"txtTipo\" type=\"text\" class=\"form-control d-none\" name=\"idTipo\">\n");
      out.write("\n");
      out.write("                                            ");

                                                out.println("<select class='form-control'id ='SelectIdTipo' size = '1'");
                                                /*out.println("<option onclick='setIdTipo(\"" + "" "\")'>" + "--Seleccionar--" + "</option>");*/
                                                for (tipoinmuebles C : milistatipoinmueble) {
                                                    out.println("<option onclick='setIdTipoA(\""
                                                            + C.getIdTipo() + "\")'>" + C.getNombre()
                                                            + "</option>");
                                                }
                                                out.println("</select>");
                                            
      out.write("\n");
      out.write("                                        </div>   \n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <div class=\"col-md-6\">\n");
      out.write("                                            <input name=\"idDepartamento\" type=\"text\" id=\"txtDepartamentoAct\" class=\"form-control d-none my-1\">\n");
      out.write("                                            ");

                                                out.println("<select class='form-control'id ='SelectIdDepartamento' size = '1'");
                                                /*out.println("<option onclick='setIdDepartamento(\"" + "" "\")'>" + "--Seleccionar--" + "</option>");*/

                                                for (departamento c : milistadepartamento) {
                                                    out.println("<option value='" + c.getIdDepartamento() + "'>" + c.getNombre() + "</option>");
                                                }
                                                out.println("</select>");
                                            
      out.write(" \n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"row d-flex h-100\">\n");
      out.write("                                        <div class=\"col-md-6\">\n");
      out.write("                                            <input name=\"idUsuario\" class=\"form-control d-none my-1\" id=\"txtUsuarioAct\" >\n");
      out.write("                                            ");

                                                out.println("<select class='form-control'id ='SelectIdUsuario' size = '1'");
                                                /*out.println("<option onclick='setIdUsuario(\"" + "" "\")'>" + "--Seleccionar--" + "</option>");*/

                                                for (usuario c : milistausuario) {
                                                    out.println("<option value='" + c.getIdUsuario() + "'>" + c.getNombre() + "</option>");

                                                }
                                                out.println("</select>");
                                            
      out.write(" \n");
      out.write("                                        </div>     \n");
      out.write("                                        <div class=\"col-md-6\"> \n");
      out.write("                                            <input name=\"idEstado\" class=\"form-control d-none my-1\" id=\"txtEstadoAct\">\n");
      out.write("                                            ");

                                                out.println("<select class='form-control'id ='SelectIdEstado' size = '1'");
                                                /*out.println("<option onclick='setIdEstado(\"" + "" "\")'>" + "--Seleccionar--" + "</option>");*/

                                                for (estados c : milistaestado) {
                                                    out.println("<option value='" + c.getIdEstado() + "'>" + c.getNombre() + "</option>");

                                                }
                                                out.println("</select>");
                                            
      out.write(" \n");
      out.write("                                        </div>\n");
      out.write("                                    </div>   \n");
      out.write("                                    <div class=\"row d-flex h-100\">\n");
      out.write("                                        <div class=\"col-md-6\">\n");
      out.write("                                            <input name=\"nombre\" type=\"text\" id=\"txtNombreAct\" class=\"form-control my-1\" placeholder=\"Nombre inmueble\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-md-6\"> \n");
      out.write("                                            <input name=\"direccion\" type=\"text\" id=\"txtDireccionAct\" class=\"form-control my-1\" placeholder=\"Direccion\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"row d-flex h-100\">\n");
      out.write("                                        <div class=\"col-md-6\">\n");
      out.write("                                            <input name=\"capacidad\" type=\"text\" id=\"txtCapacidadAct\" class=\"form-control my-1\" placeholder=\"Capacidad\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-md-6\">\n");
      out.write("                                            <input name=\"precio\" type=\"text\" id=\"txtPrecioAct\" class=\"form-control my-1\" placeholder=\"Precio\">\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                    <div class=\"row d-flex h-100\">\n");
      out.write("                                        <div class=\"col-md-6\">    \n");
      out.write("                                            <input name=\"adjunto\" type=\"text\" id=\"txtAdjuntoAct\" class=\"form-control my-1\" placeholder=\"Adjunto\">\n");
      out.write("                                        </div>\n");
      out.write("                                        <div class=\"col-md-6\">\n");
      out.write("                                            <textarea name=\"descripcion\" class=\"form-control my-1\" id=\"txtDescripcionAct\" rows=\"3\" placeholder=\"Descripción\"></textarea>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <input id=\"txtBandera\" type=\"text\" name=\"banderaRegistro\"> \n");
      out.write("                                    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                    <div class=\"row d-flex h-100\">\n");
      out.write("\n");
      out.write("                                        <div class=\"col-md-6\">\n");
      out.write("                                            <input type=\"submit\" class=\"btn btn-primary boton my-1 btn-block my-1\" value=\"Actualizar Inmueble\" onclick=\"\">\n");
      out.write("                                        </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                                        <div class=\"col-md-6\">\n");
      out.write("                                            <button class=\"btn btn-danger btn-block my-1\" type=\"submit\">Cancelar</button>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </form>\n");
      out.write("\n");
      out.write("                            </div>\n");
      out.write("\n");
      out.write("                        </div>\n");
      out.write("                  <div class=\"container bd-example\" id=\"Listar\">\n");
      out.write("                            <form action=\"/booktripPLaces/listarInmueble\" method = \"post\" >\n");
      out.write("                                <div class=\"row justify-content-md-center\">\n");
      out.write("                                    <div id=\"Listado\" class=\"bd-example\">\n");
      out.write("\n");
      out.write("                                         <div id=\"ControlRegistro\" class=\"input-group\">\n");
      out.write("                                             <!--Agregacion de parametro que se esta buscando-->\n");
      out.write("                                             <input id =\"txt_Id_Consultado\" type = \"text\" class=\"form-control\" name= \"IdConsultado\" value=\"");
      out.print(buscando);
      out.write("\" autofocus placeholder=\"Buscar por TipoInmueble,Nombre y Direccion...\"/>\n");
      out.write("                                             <button type=\"button\" class=\"btn btn-primary\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\" onClick=\"realizarBusquedaBook()\">Buscar</button>\n");
      out.write("                                         </div>\n");
      out.write("                                        <div>\n");
      out.write("                                            <h1>Listado inmuebles</h1>\n");
      out.write("                                            <div id=\"Estados\"></div>\n");
      out.write("                                            ");

                                                inmueblesDAO miinmuebleDAO = new inmueblesDAO();
                                                ArrayList<inmuebles> milistainmueble = new ArrayList<inmuebles>();
                                                milistainmueble = miinmuebleDAO.ConsultarListadoInmueble(buscando);

                                                out.println("<table class='table table-dark'><tr><td>Tipo inmueble</td><td>Departamento</td>"
                                                        + "<td>Usuario</td> <td>Estado</td><td>Nombre</td><td>Dirección</td>"
                                                        + " <td>Capacidad</td><td>Precio</td><td>Adjunto</td><td>Descripcion</td><td>Editar</td > <td>Eliminar</td> </tr>");
                                                for (inmuebles C : milistainmueble) {
                                                    out.println("<tr>");
                                                    out.println("<td>" + C.getIdTipo()+ "</td>");
                                                    out.println("<td>" + C.getIdDepartamento()+ "</td>");
                                                    out.println("<td>" + C.getIdInmueble()+ "</td>");
                                                    out.println("<td>" + C.getIdEstado()+ "</td>");
                                                    out.println("<td>" + C.getNombre() + "</td>");
                                                    out.println("<td>" + C.getDireccion() + "</td>");
                                                    out.println("<td>" + C.getCapacidad() + "</td>");
                                                    out.println("<td>" + C.getPrecio() + "</td>");
                                                    out.println("<td>" + C.getAdjunto()+ "</td>");
                                                    out.println("<td>" + C.getDescripcion() + "</td>");
                                                    out.println("<td>" + "<input type = 'submit' class='btn-primary form-control btn btn-login' value='Actualizar'name='Actualizar'onclick='SetIdConsulta(" + C.getNombre()+ ")'/>" + "</td>");
                                                    out.println("<td>" + "<input type = 'submit' class='btn btn-danger form-control btn btn-login' value= 'Eliminar'name='Eliminar'onclick='SetIdConsulta(" + C.getNombre()+ ")'/>"
                                                            + "</td>");
                                                    out.println("</tr>");
                                                }
                                                out.println("</table>");
                                            
      out.write("\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("\n");
      out.write("            </div>\n");
      out.write("            <script src=\"js/appUtilitarios.js\"></script>\n");
      out.write("            <script src=\"js/jquery-1.11.0.min.js\"></script>\n");
      out.write("            <script src=\"js/gestionarInmuebles.js\"></script>\n");
      out.write("            <script src=\"https://code.jquery.com/jquery-3.5.1.slim.min.js\"\n");
      out.write("                integrity=\"sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj\"\n");
      out.write("                crossorigin=\"anonymous\"></script>\n");
      out.write("            <script src=\"https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js\"\n");
      out.write("                integrity=\"sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN\"\n");
      out.write("                crossorigin=\"anonymous\"></script>\n");
      out.write("            <script src=\"https://stackpath.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js\"\n");
      out.write("                integrity=\"sha384-B4gt1jrGC7Jh4AgTPSdUtOBvfO8shuf57BaghqFfPlYxofvL8/KUEfYiJOMMV+rV\"\n");
      out.write("                crossorigin=\"anonymous\"></script>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("</html>");
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
