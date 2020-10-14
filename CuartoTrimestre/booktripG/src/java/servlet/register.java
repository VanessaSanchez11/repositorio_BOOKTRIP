/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controlador.usuarioDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.usuario;

/**
 *
 * @author Giovanny
 */
@WebServlet(name = "register", urlPatterns = {"/register"})
public class register extends HttpServlet {

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

            String IdTipoDocumento = request.getParameter("idTipoDocumento");
            String IdRol = request.getParameter("idRol");
            String Nombre = request.getParameter("nombre");
            String Apellido = request.getParameter("apellido");
            String Direccion = request.getParameter("direccion");
            String Telefono = request.getParameter("telefono");
            String FechaNacimiento = request.getParameter("fechaNacimiento");
            String Email = request.getParameter("email");
            String Password = request.getParameter("password");

            usuarioDao miUsuarioDao = new usuarioDao();
            usuario miUsuario = new usuario();

            int idTipoDocumento = Integer.parseInt(IdTipoDocumento);
            int idRol = Integer.parseInt(IdRol);

            miUsuario.setIdTipoDocumento(idTipoDocumento);
            miUsuario.setIdRol(idRol);
            miUsuario.setNombre(Nombre);
            miUsuario.setApellido(Apellido);
            miUsuario.setDireccion(Direccion);
            miUsuario.setTelefono(Telefono);
            miUsuario.setFechaNacimiento(FechaNacimiento);
            miUsuario.setEmail(Email);
            miUsuario.setPassword(Password);

            String respuesta = miUsuarioDao.adicionarUsuario(miUsuario);

            if (respuesta.length() == 0) {
                System.out.println("Res " + respuesta);
                System.out.println("Res " + respuesta.length());
                out.println("<script type=\"text/javascript\">");
                out.println("alert('" + "Se ha registrado con exito" + "');");
                out.println("window.location.href='/booktripG/vista/login.jsp';");
                out.println("</script>");
            } else {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('" + respuesta + "');");
                out.println("alert('" + "No se pudo insetar el registro con exito" + "');");
                out.println("window.history.back();");
                out.println("</script>");
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
