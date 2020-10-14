/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controlador.solicitudinmueblesDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.solicitudinmuebles;

/**
 *
 * @author oscar sanabria
 */
@WebServlet(name = "actualizarSolicitud", urlPatterns = {"/actualizarSolicitud"})
public class actualizarSolicitud extends HttpServlet {
    private int idSolicitud;

   
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String Accion = request.getParameter("Actualizar");
            System.out.println("Accion " + Accion);

            String IdSolicitud = request.getParameter("IdConsultado");

            solicitudinmueblesDAO miSolicitudDAO = new solicitudinmueblesDAO();
            solicitudinmuebles miSolicitud = null;

            miSolicitud = miSolicitudDAO.consultarSolicitudInmuebles(Accion);
            if (Accion != null) {

                if (miSolicitud != null) {

              
                    response.sendRedirect("/boooktripPlaces/listadoSolicitudInmuele.jsp?idInmueble="
                            + miSolicitud.getIdInmueble() + "&"
                            + "inmueble=" + miSolicitud.getIdInmueble()+ "&"
                            + "ususrio=" + miSolicitud.getIdUsuario() + "&"
                            + "estado=" + miSolicitud.getIdEstado() + "&"
                            + "Fecha=" + miSolicitud.getFecha()+ "&"
                            + "Vista=" + "Actualizar" + "&");
                    System.out.println("Salio");
                } else {
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('" + "No se ha podido relizar la consulta." + "\n"
                            + "Por favor verificar la identificacion: " + IdSolicitud
                            + "');");
                    out.println("</script>");
                }

                if (miSolicitud != null) {

                    String respuestaRegistrada = miSolicitudDAO.eliminarSolicitud(miSolicitud);
                    if (respuestaRegistrada.length() == 0) {
                        out.println("<script type=\"text/javascript\">");
                        out.println("alert('" + "Eliminacion Realizada." + "');");

                        out.println("window.location.href = '/boooktripPlaces/inmueble.jsp';");
                        out.println("</script>");
                    } else {
                        out.println("<script type=\"text/javascript\">");
                        out.println("alert('" +"No se ha podido relizar laeliminacion  "+respuestaRegistrada.replace("'", "") +"');");
out.println("</script>");
                    }
                } else {
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('" + "No se ha podido relizar la consulta." + "\n"
                            + "Por favor verificar el codigo de la finca " + IdSolicitud + "');");
                    out.println("</script>");
                }
            }
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