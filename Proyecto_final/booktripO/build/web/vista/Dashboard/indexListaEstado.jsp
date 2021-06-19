<%  
int uno=1;
    int autorizado= (Integer)session.getAttribute("autorizado");
    if(autorizado!=1)
    {
        out.println("<script type=\"text/javascript\">");
                    out.println("window.location.href='/booktripO/vista/salir.jsp';");
                    out.println("</script>");
    }
    %>
<%@include file="header.jsp" %>
<%@include file="sidebar.jsp" %>
<%@include file="content.jsp" %>
<%@include file="listaEstado.jsp" %>
<%@include file="footer.jsp" %>
