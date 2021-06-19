
<%
session.setAttribute("usuario", 0);
session.setAttribute("autorizado", 0);
session.setAttribute("valor_editado", 0);
out.println("<script type=\"text/javascript\">");
//  out.println("alert('" + "Sesión cerrada" + "');");
                    out.println("window.location.href='/booktripO/vista/login.jsp';");
                    out.println("</script>"); 
%>