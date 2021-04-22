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

public final class listaInmueble_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

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
