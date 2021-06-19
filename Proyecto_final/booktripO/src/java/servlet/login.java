/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controlador.Conexion;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.usuario;
import controlador.usuarioDao;
import java.sql.SQLException;
import java.util.Objects;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpSession;

/**
 *
 * @author vanessa
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, ClassNotFoundException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */

            String email = request.getParameter("email");
            String password = request.getParameter("password");

            try {
                usuarioDao userC = new usuarioDao();
                usuario user = new usuario();
                user = userC.consultarUsuario(email, password);
                String nombre = user.getNombre();
                int rol= user.getIdRol();
           
                if (user == null) {
                    System.out.println(email);
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('" + "Este email o contraseña : " + email + "   no es correcto" + "');");
                    out.println("window.location.href='/booktripO/vista/login.jsp';");
                    out.println("</script>");
                } else {
                   HttpSession sesion = request.getSession();
              switch(user.getIdRol())
                {
                    case 1 : 
                        sesion.setAttribute("user", nombre);
                         sesion.setAttribute("rol",rol );
                        out.println("<script type=\"text/javascript\">");
                             out.println("alert('" + "Bienvenido: " + user.getNombre() + "  " + user.getApellido() + "');");
                             out.println("window.location.href='/booktripO/vista/Dashboard/indexListaEstado.jsp';");
                             out.println("</script>"); 
                    break;
                         case 2 : out.println("<script type=\"text/javascript\">");
                             out.println("alert('" + "Bienvenido: " + user.getNombre() + "  " + user.getApellido() + "');");
                             out.println("window.location.href='/booktripO/vista/Propietario/indexListaInmueble.jsp';");
                             out.println("</script>"); 
                    break;
                              case 3 : out.println("<script type=\"text/javascript\">");
                             out.println("alert('" + "Bienvenido: " + user.getNombre() + "  " + user.getApellido() + "');");
                             out.println("window.location.href='/booktripO/vista/Viajero/indexListaPago.jsp';");
                             out.println("</script>"); 
                    break;
                        
                    default:
                             out.println("<script type=\"text/javascript\">");
                             out.println("alert('" + "Bienvenido: " + user.getNombre() + "  " + user.getApellido() + "');");
                             out.println("window.location.href='/booktripO/vista/login.jsp';");
                             out.println("</script>"); 
               
                    break;
                
                }
   
                }

            } catch (Exception ex) {
                System.err.println(ex.getMessage());
                System.err.println(ex.getStackTrace());
                System.out.println("este es el catch");
            }

        }    }

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
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
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
            processRequest(request, response);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(login.class.getName()).log(Level.SEVERE, null, ex);
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
