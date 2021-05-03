package org.apache.jsp.vista.Viajero;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import modelo.inmuebles;
import controlador.inmueblesDAO;
import modelo.usuario;
import java.util.ArrayList;
import controlador.usuarioDao;
import modelo.pagos;
import controlador.pagosDAO;
import java.util.Iterator;
import java.util.List;
import java.sql.ResultSet;
import java.sql.Statement;
import controlador.Conexion;
import controlador.estadosDAO;
import modelo.estados;

public final class listaPago2_jsp extends org.apache.jasper.runtime.HttpJspBase
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

    /* Evitamos que la página se guarde en el caché del navegador y en los proxys */
    response.setHeader("Cache-Control", "no-store"); //HTTP 1.1
    response.setHeader("Pragma", "no-cache"); //HTTP 1.0
    response.setDateHeader("Expires", 0); // prevents caching at the proxy server

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<body onload=\"myFunction();\">\n");
      out.write("\n");
      out.write("<center> <div class=\"col-md-6\">\n");
      out.write("        <form action=\"/booktripO/controllerPago\" method=\"POST\"  onsubmit=\"return validarEstado()\">\n");
      out.write("\n");
      out.write("            <a href=\"#\" name=\"accion\" value=\"Listar\" class=\"d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm\"onclick=\"myFunctionB1()\"> Listar</a>\n");
      out.write("            <a href=\"#\" name=\"accion\" value=\"Nuevo\" class=\"d-none d-sm-inline-block btn btn-sm btn-success shadow-sm\" onclick=\"myFunctionB2()\"> Nuevo</a>\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("    <div class=\"principal\" id=\"Listado\">\n");
      out.write("\n");
      out.write("        <div class=\"fondo container my-10 buscar\">\n");
      out.write("\n");
      out.write("\n");
      out.write("            <hr>\n");
      out.write("            <center>\n");
      out.write("                <div>\n");
      out.write("                    <h1>lista de pago</h1>\n");
      out.write("\n");
      out.write("                    <table class=\"bg-light table table-bordered dataTables-example\">\n");
      out.write("                        <thead>\n");
      out.write("                            <tr>\n");
      out.write("                                <th>ID</th>\n");
      out.write("                                <th>idUsuario</th>\n");
      out.write("                                <th>id inmueble</th>\n");
      out.write("                                <th>adjunto</th>\n");
      out.write("                                <th>monto</th>\n");
      out.write("                                <th>fecha</th>\n");
      out.write("                                <th>fecha2</th>\n");
      out.write("                                <th>ACCIONES</th>\n");
      out.write("                            </tr>\n");
      out.write("                        </thead>\n");
      out.write("                        ");

                            pagosDAO dao = new pagosDAO();
                            List<pagos> lista = dao.listar();
                            request.setAttribute("lista", lista);
      out.write("\n");
      out.write("                        <tbody style=\"height: 10px;\">\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("                        </tbody>\n");
      out.write("                    </table>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("            </center>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("    <div class=\"principal\" id=\"Registrar\">\n");
      out.write("        <div class=\"container principal\">\n");
      out.write("\n");
      out.write("            <div class=\"container  col-md-6 mt-5 bg-light form-group\">\n");
      out.write("                <h3>Agregar nuevo estado</h3>\n");
      out.write("                <hr>\n");
      out.write("                <br>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <form action=\"/booktripO/controllerPago\" method=\"POST\">\n");
      out.write("                    <label>id usuario</label>\n");
      out.write("\n");
      out.write("                    <div class=\"col-sm-6\">\n");
      out.write("\n");
      out.write("                        ");

                            usuarioDao miusuarioDAO = new usuarioDao();
                            ArrayList<usuario> listausuario = miusuarioDAO.ListadoUsuarios("");
                        
      out.write(" \n");
      out.write("                        <select name=\"txtUsuario\">\n");
      out.write("                            ");

                                for (usuario i : listausuario) {
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(i.getIdUsuario());
      out.write('"');
      out.write('>');
      out.print(i.getNombre());
      out.write(" </option>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                        </select>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <label>id inmueble</label>\n");
      out.write("\n");
      out.write("\n");
      out.write("                    <div class=\"col-sm-6\">\n");
      out.write("\n");
      out.write("                        ");

                            inmueblesDAO miinmuebleDAO = new inmueblesDAO();
                            ArrayList<inmuebles> listainmueble = miinmuebleDAO.ConsultarListadoInmueble("");
                        
      out.write(" \n");
      out.write("                        <select name=\"txtInmueble\">\n");
      out.write("                            ");

                                for (inmuebles i : listainmueble) {
      out.write("\n");
      out.write("                            <option value=\"");
      out.print(i.getIdInmueble());
      out.write('"');
      out.write('>');
      out.print(i.getNombre());
      out.write(" </option>\n");
      out.write("                            ");

                                }
                            
      out.write("\n");
      out.write("                        </select>\n");
      out.write("\n");
      out.write("                    </div>\n");
      out.write("                    <div col-md-6>\n");
      out.write("                        <div col-md-3><label>Adjunto</label></div>\n");
      out.write("                        <div col-md-3><input type=\"text\" name=\"txtAdjunto\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div col-md-6>\n");
      out.write("                        <div col-md-3><label>Monto</label></div>\n");
      out.write("                        <div col-md-3><input type=\"text\" name=\"txtMonto\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div col-md-6>\n");
      out.write("                        <div col-md-3><label>fecha</label></div>\n");
      out.write("                        <div col-md-3><input type=\"text\" name=\"txtFechaPago\">\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div col-md-6>\n");
      out.write("                        <div col-md-3><label>fecha2</label></div>\n");
      out.write("                        <div col-md-3><input type=\"text\" name=\"txtFechaPago2\" >\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div col-md-6>\n");
      out.write("                        <div col-md-3><input type=\"submit\" name=\"accion\" value=\"Guardar\" class=\"btn btn-success btn-block mt-1\"></div>\n");
      out.write("                        <div col-md-3> <input type=\"submit\" name=\"accion\" value=\"Regresar\" class=\"btn btn-danger btn-block mt-1 my-4\"></div>\n");
      out.write("                    </div>    \n");
      out.write("\n");
      out.write("            </div>      \n");
      out.write("        </div> \n");
      out.write("\n");
      out.write("\n");
      out.write("        </form>\n");
      out.write("\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
          out.write("\n");
          out.write("                                <tr>\n");
          out.write("                                    <td style=\"padding-left:25px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getIdPago()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td style=\"padding-left:25px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getIdUsuario()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td style=\"padding-left:25px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getIdInmueble()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td style=\"padding-left:25px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getAdjunto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td style=\"padding-left:25px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getMonto()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td style=\"padding-left:25px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getFechaPago()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td style=\"padding-left:25px;\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getFechaPago2()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</td>\n");
          out.write("                                    <td style=\"padding-left:25px;\">\n");
          out.write("                                        <form action=\"/booktripO/controllerPago\" method=\"POST\">\n");
          out.write("                                            <input type=\"hidden\" name=\"id\" value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${dato.getIdPago()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                            <input type=\"submit\" name=\"accion\" value=\"Editar\" class=\"btn-success btn-block\" >\n");
          out.write("                                            <input type=\"submit\" name=\"accion\" value=\"Delete\" class=\"btn-danger btn-block\" onclick=\"return confirm('Está seguro que deseas eliminar el registro?');\">\n");
          out.write("                                        </form>\n");
          out.write("                                    </td>\n");
          out.write("                                </tr>\n");
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
