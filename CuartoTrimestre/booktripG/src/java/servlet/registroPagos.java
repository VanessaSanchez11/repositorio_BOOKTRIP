/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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


@WebServlet(name = "registroPagos", urlPatterns = {"/registroPagos"})
public class registroPagos extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
         try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

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
            
            System.out.println("El valor es" + BanderaPagos);
            
            
            if (BanderaPagos.equals("correcto")) {
                    String respuesta = miPagosDAO.adicionarPago(miPagos);
                    System.out.println("res" + respuesta);
                    System.out.println("res" + respuesta.length());

            if (respuesta.length() == 0) {
                
                System.out.println("Res " + respuesta);
                System.out.println("Res " + respuesta.length());
                out.println("<script type=\"text/javascript\">");
                out.println("alert('" + "Se ha registrado con exito" + "');");
                out.println("window.location.href='/booktripG/vista/Dashboard/indexListaPagos.jsp';");
                out.println("</script>");
            } else {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('" + respuesta + "');");
                out.println("alert('" + "No se pudo insetar el registro con exito" + "');");
                out.println("window.history.back();");
                out.println("</script>");
            }
            
            }else {
                    System.out.println("El valor no es correcto" + BanderaPagos);
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
