/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controlador.tipoinmuebleDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.tipoinmuebles;

/**
 *
 * @author oscar sanabria
 */
@WebServlet(name = "listarTipoInmueble", urlPatterns = {"/listarTipoInmueble"})
public class listarTipoInmueble extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String Accion = request.getParameter("Actualizar");
            System.out.println("Accion " + Accion);

            String id = request.getParameter("IdConsultado");

            tipoinmuebleDAO tipoDAO = new tipoinmuebleDAO(); // Controlador

            tipoinmuebles mitipo = new tipoinmuebles(); // Modelo

            int idTipo = Integer.parseInt(id);
            mitipo = tipoDAO.consultarTipoInmueblesId(idTipo);

            if (Accion != null) {

                if (mitipo != null) {

                    response.sendRedirect("/booktripPlaces/vista/Dashboard/indexTipoInmueble.jsp?idTipo=" + mitipo.getIdTipo()+ "&"
                           
                            + "nombre=" + mitipo.getNombre() + "&"
                         
                            + "Vista=" + "Actualizar" + "&");
                    System.out.println("Salio");
                } else {
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('" + "No se ha podido relizar la consulta." + "\n"
                            + "Por favor verificar el id: " + idTipo + "');");
                    out.println("</script>");
                }
            } else {
                if (mitipo != null) {
                    String respuestaRegistrada = tipoDAO.eliminarTipoInmueble(mitipo);
                    if (respuestaRegistrada.length() == 0) {
                        out.println("<script type=\"text/javascript\">");
                        out.println("alert('" + "Eliminacion Realizada." + "');");

                        out.println("window.location.href = '/booktripPlaces/vista/Dashboard/indexTipoInmueble.jsp';");
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
                            + "Por favor verificar la identificacion: " + idTipo+ "');");
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
