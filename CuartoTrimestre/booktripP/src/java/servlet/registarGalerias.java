package servlet;

import controlador.galeriasDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.galeria;

@WebServlet(name = "registarGalerias", urlPatterns = {"/registarGalerias"})
public class registarGalerias extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {

            String Inmueble = request.getParameter("inmueble");
            String Photo = request.getParameter("Photo");
            String Url = request.getParameter("Url");

            galeriasDAO galeC = new galeriasDAO();
            galeria gale = new galeria();

            int inmueble = Integer.parseInt(Inmueble);

            gale.setIdInmueble(inmueble);
            gale.setUrl(Url);
            gale.setImagen(Photo);

            String respuesta = galeC.adicionarGaleria(gale);

            if (respuesta.length() == 0) {
                System.out.println("Res " + respuesta);
                System.out.println("Res " + respuesta.length());
                out.println("<script type=\"text/javascript\">");
                out.println("alert('" + "Se ha registrado con exito" + "');");
                out.println("window.location.href='/booktripP/vista/DashboardPropietario/indexListaGaleria.jsp';");
                out.println("</script>");
            } else {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('" + respuesta + "');");
                out.println("alert('" + "No se pudo insetar el registro con exito " + "');");
                out.println("window.history.back();");
                out.println("</script>");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
