package org.apache.jsp.vista.Dashboard.vendor;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Actividad_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("tentType=\"text/html\" pageEncoding=\"UTF-8\"%>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleFormControlInput1\">Email address</label>\n");
      out.write("    <input type=\"email\" class=\"form-control\" id=\"exampleFormControlInput1\" placeholder=\"name@example.com\">\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleFormControlSelect1\">Example select</label>\n");
      out.write("    <select class=\"form-control\" id=\"exampleFormControlSelect1\">\n");
      out.write("      <option>1</option>\n");
      out.write("      <option>2</option>\n");
      out.write("      <option>3</option>\n");
      out.write("      <option>4</option>\n");
      out.write("      <option>5</option>\n");
      out.write("    </select>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleFormControlSelect2\">Example multiple select</label>\n");
      out.write("    <select multiple class=\"form-control\" id=\"exampleFormControlSelect2\">\n");
      out.write("      <option>1</option>\n");
      out.write("      <option>2</option>\n");
      out.write("      <option>3</option>\n");
      out.write("      <option>4</option>\n");
      out.write("      <option>5</option>\n");
      out.write("    </select>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"form-group\">\n");
      out.write("    <label for=\"exampleFormControlTextarea1\">Example textarea</label>\n");
      out.write("    <textarea class=\"form-control\" id=\"exampleFormControlTextarea1\" rows=\"3\"></textarea>\n");
      out.write("  </div>\n");
      out.write("</form>\n");
      out.write("    </body>\n");
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
