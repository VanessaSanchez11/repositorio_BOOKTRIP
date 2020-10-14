/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controlador.inmueblesDAO;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.inmuebles;

/**
 *
 * @author oscar sanabria
 */
@WebServlet(name = "listarInmueble", urlPatterns = {"/listarInmueble"})
public class listarInmueble extends HttpServlet {
    private int idInmueble;

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

        String IdInmueble = request.getParameter("IdConsultado");

        inmueblesDAO miInmuebleDAO = new inmueblesDAO();
        inmuebles miInmueble = null;
        miInmueble = miInmuebleDAO.consultarInmuebles(IdInmueble);
        if (Accion != null) {
            if (miInmueble != null) {


                response.sendRedirect("/IdConsultado?idTipo="
                        + miInmueble.getIdInmueble() + "&"
                        + "nombre=" + miInmueble.getIdTipo()+ "&"
                        + "apellido=" + miInmueble.getIdDepartamento()+ "&"
                        + "telefono=" + miInmueble.getIdUsuario()+ "&"
                        + "correo=" + miInmueble.getIdEstado()+ "&"
                        + "password=" + miInmueble.getNombre() + "&"
                        + "id_tipo=" + miInmueble.getDireccion() + "&"
                        + "id_rol=" + miInmueble.getCapacidad() + "&"
                        + "password=" + miInmueble.getDescripcion() + "&"
                        + "id_tipo=" + miInmueble.getPrecio() + "&"
                        + "id_rol=" + miInmueble.getAdjunto()+ "&"
                        + "Vista=" + "Actualizar" + "&");
                System.out.println("Salio");
            } else {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('" + "No se ha podido relizar la consulta." + "\n"
                        + "Por favor verificar la identificacion: " + IdInmueble + "');");
                out.println("</script>");
            }
        } else {
// Va a eliminar cuando el parametro de la accion es nulo
            if (miInmueble != null) {
//Si el usuario existe intentará eliminarlo.
                String respuestaRegistrada = miInmuebleDAO.EliminarInmueble(miInmueble);
                if (respuestaRegistrada.length() == 0) {
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('" + "Eliminacion Realizada." + "');");
// Se agrega el redreccionamiento la url para visualice la tabla.
                    out.println("window.location.href = '/blackrawe/Usuarios.jsp';");
                    out.println("</script>");
                } else {
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('" +"No se ha podido relizar la eliminacion."+respuestaRegistrada.replace("'", "") +"');");
out.println("</script>");
                }
            } else {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('" + "No se ha podido relizar la consulta." + "\n"
                        + "Por favor verificar la identificacion: " + IdInmueble
                        + "');");
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
