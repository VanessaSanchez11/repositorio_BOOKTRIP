
package servlet;

import controlador.pagosDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.pagos;



@WebServlet(name = "actualizarPagos", urlPatterns = {"/actualizarPagos"})
public class actualizarPagos extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
                        
            String IdUsuario = request.getParameter("idUsuario");
            String IdInmueble = request.getParameter("idInmueble");
            String Adjunto = request.getParameter("adjunto");
            String Monto = request.getParameter("monto");
            String Fechapago = request.getParameter("fechaPago");
            String Fechapago2 = request.getParameter("fechaPago2");
            String BanderaPagos = request.getParameter("banderaRegistro");
            
            pagosDAO miPagosDAO = new pagosDAO();
            pagos miPagos = new pagos();
            
            int idUsuario = Integer.parseInt(IdUsuario);
            int idInmueble = Integer.parseInt(IdInmueble);
            int MontoN = Integer.parseInt(Monto);
            
            miPagos.setIdUsuario(idUsuario);
            miPagos.setIdInmueble(idInmueble);
            miPagos.setAdjunto(Adjunto);
            miPagos.setMonto(MontoN);
            miPagos.setFechaPago(Fechapago);
            miPagos.setFechaPago2(Fechapago2);
            
            String respuesta = miPagosDAO.actualizarPago(miPagos);
            
            if (respuesta.length() == 0) {
                System.out.println("Res " + respuesta);
                System.out.println("Res " + respuesta.length());
                out.println("<script type=\"text/javascript\">");
                out.println("alert('" + "Se ha actualizado con exito" + "');");
                out.println("window.location.href='/booktripG/vista/Dashboard/indexListaPagos.jsp';");
                out.println("</script>");
                
            } else {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('" + respuesta + "');");
                out.println("alert('" + "No se pudo actualizar el registro con exito" + "');");
                out.println("</script>");
            }
        }catch (Exception e) {
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
        processRequest(request, response);
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
        processRequest(request, response);
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
