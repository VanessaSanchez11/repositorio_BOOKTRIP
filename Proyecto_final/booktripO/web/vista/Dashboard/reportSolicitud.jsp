


<%@page import="net.sf.jasperreports.engine.JasperRunManager"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>reportes de estados</h1>
        <%
            Connection con = null;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/booktrip", "root", "");
                out.print("Conexión en Linea");
            } catch (Exception ex) {
                out.print("Error" + ex.getMessage());
            }
        %>
<% 
File reportfile = new File
(application.getRealPath("reportes/solicitudes.jasper"));
Map<String, Object> parameter = new HashMap<String, Object>();
byte[] bytes =JasperRunManager.runReportToPdf(reportfile.getPath(), parameter, con);
response.setContentType("application/pdf");
response.setContentLength(bytes.length);
ServletOutputStream outputstream =
response.getOutputStream();
outputstream.write(bytes,0,bytes.length);
outputstream.flush();
outputstream.close();
%>
    </body>
</html>
