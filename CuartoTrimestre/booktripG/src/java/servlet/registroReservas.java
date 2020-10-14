/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controlador.reservasDAO;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.reservas;


@WebServlet(name = "registroReservas", urlPatterns = {"/registroReservas"})
public class registroReservas extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            String IdUsuario = request.getParameter("idUsuario");
            String IdInmueble = request.getParameter("idInmueble");
            String IdEstado = request.getParameter("idEstado");
            String FechaReserva = request.getParameter("fechaReserva");
            String CheckIn = request.getParameter("checkIn");
            String CheckOut = request.getParameter("checkOut");
            String BanderaReserva = request.getParameter("banderaRegistro");
            

            reservasDAO miReservasDAO = new reservasDAO();
            reservas miReservas = new reservas();

            int idUsuario = Integer.parseInt(IdUsuario);
            int idInmueble = Integer.parseInt(IdInmueble);
            int idEstado = Integer.parseInt(IdEstado);

            miReservas.setIdUsuario(idUsuario);
            miReservas.setIdInmueble(idInmueble);
            miReservas.setIdEstado(idEstado);
            miReservas.setFechaReserva(FechaReserva);
            miReservas.setCheckIn(CheckIn);
            miReservas.setCheckOut(CheckOut);
           
           System.out.println("El valor es" +BanderaReserva);
            

                    if (BanderaReserva.equals("correcto")) {
                        String respuestaRegistrada = miReservasDAO.adicionarReserva(miReservas);
                        System.out.println("res" + respuestaRegistrada);
                        System.out.println("res" + respuestaRegistrada.length());
                        
                    if (respuestaRegistrada.length() == 0) {
                        
                        out.println("<script type=\"text/javascript\">");
                        out.println("alert('" + "Reserva registrado " + "');");
                        out.println("window.location.href='/booktripG/vista/Dashboard/indexListaReserva.jsp';");
                        out.println("</script>");

                    } else {

                        out.println("<script type=\"text/javascript\">");
                        out.println("alert('" + respuestaRegistrada + "');");
                        out.println("alert('" + "No se pudo insetar el registro con exito: " + respuestaRegistrada.replace("'", "") + "');");
                        out.println("window.histry.back();");
                        out.println("</script>");
                    }
                }else  {
                    System.out.println("El valor no es correcto"+BanderaReserva);
                }

            } catch (NumberFormatException e) {
               e.getMessage();
                out.println("<script type=\"text/javascript\">");
                out.println("window.history.back();");
                out.println("</script>");
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
