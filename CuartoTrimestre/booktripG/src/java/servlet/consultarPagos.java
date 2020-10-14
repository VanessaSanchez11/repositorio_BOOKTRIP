package servlet;

import controlador.pagosDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.pagos;

@WebServlet(name = "consultarPagos", urlPatterns = {"/consultarPagos"})
public class consultarPagos extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, SQLException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            String Accion = request.getParameter("Actualizar");
            System.out.println("Accion " + Accion);

            String id = request.getParameter("IdConsultado");

            pagosDAO miPagosDAO = new pagosDAO();
            pagos miPagos = new pagos();

            int idUsuario = Integer.parseInt(id);
            miPagos = miPagosDAO.consultarUsuarioId(idUsuario);

            if (Accion != null) {

                if (miPagos != null) {
                    response.sendRedirect("/booktripG/vista/Dashboard/indexListaPagos.jsp?idUsuario=" + miPagos.getIdUsuario() + "&"
                            + "idInmueble=" + miPagos.getIdInmueble() + "&"
                            + "adjunto=" + miPagos.getAdjunto() + "&"
                            + "monto=" + miPagos.getMonto() + "&"
                            + "fechaPago=" + miPagos.getFechaPago() + "&"
                            + "fechaPago2=" + miPagos.getFechaPago2() + "&"
                            + "Vista=" + "Actualizar" + "&");
                    System.out.println("Salio");

                } else {
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('" + "No se ha podido relizar la consulta." + "\n"
                            + "Por favor verificar el id: " + idUsuario + "');");
                    out.println("</script>");
                }
            } else {
                if (miPagos != null) {
                    String respuestaRegistrada = miPagosDAO.EliminarPago(miPagos);
                    if (respuestaRegistrada.length() == 0) {
                        out.println("<script type=\"text/javascript\">");
                        out.println("alert('" + "Eliminacion Realizada." + "');");

                        out.println("window.location.href = '/booktripG/vista/Dashboard/indexListaPagos.jsp';");
                        out.println("</script>");
                    } else {
                        out.println("<script type=\"text/javascript\">");
                        out.println("alert('" + "No se ha podido relizar la eliminacion."
                                + respuestaRegistrada.replace("'", "") + "');");
                        out.println("</script>");
                    }
                } else {
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('" + "No se ha podido relizar la consulta." + "\n"
                            + "Por favor verificar la identificacion: " + idUsuario + "');");
                    out.println("</script>");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

// <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
/**
 * Handles the HTTP <code>GET</code> method.
 *
 * @param request servlet request
 * @param response servlet response
 * @throws ServletException if a servlet-specific error occurs
 * @throws IOException if an I/O error occurs
 */
@Override
        protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request,response);
        } catch (SQLException ex) {
            Logger.getLogger(consultarPagos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request,response);
        } catch (SQLException ex) {
            Logger.getLogger(consultarPagos.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
        public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
