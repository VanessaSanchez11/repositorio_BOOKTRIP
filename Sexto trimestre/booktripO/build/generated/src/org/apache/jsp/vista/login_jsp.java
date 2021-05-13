package org.apache.jsp.vista;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
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


    /* Evitamos que la página se guarde en el caché del navegador y en los proxys */
    response.setHeader("Cache-Control", "no-store"); //HTTP 1.1
    response.setHeader("Pragma", "no-cache"); //HTTP 1.0
    response.setDateHeader("Expires", 0); // prevents caching at the proxy server

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <meta name=\"description\" content=\"\">\r\n");
      out.write("        <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("        <title>Iniciar sesion</title>\r\n");
      out.write("\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap-grid.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap-reboot.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"bootstrap/css/bootstrap.min.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"Dashboard/usuario/css/estilosRegister.css\">\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=PT+Serif:ital,wght@1,700&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("        <script src=\"bootstrap/js/bootstrap.min.js\"></script>\r\n");
      out.write("        <script src=\"bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body class=\"bg-gradient-primary\">\r\n");
      out.write(" ");
 HttpSession sesion = request.getSession();
            int nivel = 0;
            if (request.getAttribute("rol")!=null) {
                nivel = (Integer) request.getAttribute("rol");
                if (nivel==1) {
                    sesion.setAttribute("nombre", request.getAttribute("email"));
                     sesion.setAttribute("nivel",nivel);
                      out.println("<script type=\"text/javascript\">");
                    out.println("window.location.href='/booktripO/vista/Dashboard/indexListaSolicitud.jsp';");
                    out.println("</script>");
                }
                if (nivel==2) {
                    sesion.setAttribute("email", request.getAttribute("email"));
                     sesion.setAttribute("nivel",nivel);
                      out.println("<script type=\"text/javascript\">");
                    out.println("window.location.href='/booktripO/vista/Propietario/indexListaInmueble.jsp';");
                    out.println("</script>");
                }if (nivel==3) {
                    sesion.setAttribute("email", request.getAttribute("email"));
                     sesion.setAttribute("nivel",nivel);
                     out.println("<script type=\"text/javascript\">");
                    out.println("window.location.href='/booktripO/vista/Viajero/indexListaPago.jsp';");
                    out.println("</script>");
                }
            }

        
      out.write("\r\n");
      out.write("        <a href=\"index.jsp\" class=\"btn btn-outline-light ml-sm-5 mt-4\">Volver al inicio</a>\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <h1 class=\"row justify-content-center tituloBooktrip\">Booktrip</h1>\r\n");
      out.write("            <!-- Outer Row -->\r\n");
      out.write("            <div class=\"row justify-content-center\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"col-xl-10 col-lg-12 col-md-9\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"card o-hidden border-0 shadow-lg my-5\">\r\n");
      out.write("                        <div class=\"card-body p-0\">\r\n");
      out.write("                            <!-- Nested Row within Card Body -->\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("                                <div class=\"col-lg-6 d-none d-lg-block bg-login-image\"></div>\r\n");
      out.write("                                <div class=\"col-lg-6\">\r\n");
      out.write("                                    <div class=\"p-5\">\r\n");
      out.write("                                        <div class=\"text-center\">\r\n");
      out.write("                                            <h1 class=\"h4 text-gray-900 mb-4\">Iniciar sesión</h1>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <form class=\"user\" action=\"/booktripO/login\" method=\"post\">\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <input type=\"email\" class=\"form-control form-control-user\r\n");
      out.write("                                                       \" name=\"email\" id=\"exampleInputEmail\" aria-describedby=\"emailHelp\" placeholder=\"Email\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"form-group\">\r\n");
      out.write("                                                <input type=\"password\" class=\"form-control form-control-user\" name=\"password\" id=\"exampleInputPassword\" placeholder=\"Contraseña\">\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <input type=\"submit\" class=\"btn btn-primary btn-user btn-block\" value=\"Login\" name=\"btnIngresar\">\r\n");
      out.write("                                            <!-- <a href=\"index.html\" class=\"btn btn-primary btn-user btn-block\"> Login </a>-->\r\n");
      out.write("                                            <hr>\r\n");
      out.write("\r\n");
      out.write("                                        </form>\r\n");
      out.write("                                        <hr>\r\n");
      out.write("\r\n");
      out.write("                                        <div class=\"text-center\">\r\n");
      out.write("                                            <a class=\"small\" href=\"Dashboard/usuario/add.jsp\">Crea una cuenta</a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("       \r\n");
      out.write("\r\n");
      out.write("        ");
    if (request.getParameter("cerrar") != null) {
                session.invalidate();
            }
        
      out.write("  \r\n");
      out.write("\r\n");
      out.write("    </body>\r\n");
      out.write("\r\n");
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
