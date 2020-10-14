/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controlador.inmueblesDAO;
import java.io.IOException;
import java.io.PrintWriter;
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
@WebServlet(name = "registroInmueble", urlPatterns = {"/registroInmueble"})
public class registroInmueble extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */

            String IdTipo = request.getParameter("idTipo");
            String IdDepartamento = request.getParameter("idDepartamento");
            String IdUsuario = request.getParameter("idUsuario");
            String IdEstado = request.getParameter("idEstado");
            String Nombre = request.getParameter("nombre");
            String Direccion = request.getParameter("direccion");
            String Capacidad = request.getParameter("capacidad");
            String Descripcion = request.getParameter("descripcion");
            String Precio = request.getParameter("precio");
            String Adjunto = request.getParameter("adjunto");
            String BanderaInmueble = request.getParameter("banderaRegistro");
            try {

                inmueblesDAO miInmuebleDAO = new inmueblesDAO();
                inmuebles miInmueble = new inmuebles();

                int idTipo = Integer.parseInt(IdTipo);
                int idDepartamento = Integer.parseInt(IdDepartamento);
                int idUsuario = Integer.parseInt(IdUsuario);
                int idEstado = Integer.parseInt(IdEstado);
                int capacidad = Integer.parseInt(Capacidad);
                int precio = Integer.parseInt(Precio);

                miInmueble.setIdTipo(idTipo);
                miInmueble.setIdDepartamento(idDepartamento);
                miInmueble.setIdUsuario(idUsuario);
                miInmueble.setIdEstado(idEstado);
                miInmueble.setNombre(Nombre);
                miInmueble.setDireccion(Direccion);
                miInmueble.setCapacidad(capacidad);
                miInmueble.setDescripcion(Descripcion);
                miInmueble.setPrecio(precio);
                miInmueble.setAdjunto(Adjunto);

                
                 System.out.println("El valor es" +BanderaInmueble);
                        
                if (BanderaInmueble.equals("correcto")) {
                    String respuestaRegistrada = miInmuebleDAO.adicionarInmueble(miInmueble);
                    System.out.println("res" + respuestaRegistrada);
                     System.out.println("res" + respuestaRegistrada.length());
                    if (respuestaRegistrada.length() == 0) {
                        out.println("<script type=\"text/javascript\">");
                        out.println("alert('" + "Inmueble registrado " + "');");
                        out.println("window.location.href='/booktripPLaces/login.jsp'");
                        out.println("</script>");

                    } else {

                        out.println("<script type=\"text/javascript\">");
                        out.println("alert('" + "error encontrado: " + respuestaRegistrada.replace("'", "") + "');");
                        out.println("window.histry.back();");
                        out.println("</script>");
                    }
                }else  {
                    System.out.println("El valor no es correcto"+BanderaInmueble);
                }

            } catch (NumberFormatException e) {
               e.getMessage();
                out.println("<script type=\"text/javascript\">");
                out.println("window.history.back();");
                out.println("</script>");
            }
            //out.println("<h1>Servlet registroInmueble at " + request.getContextPath() + "</h1>");

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
