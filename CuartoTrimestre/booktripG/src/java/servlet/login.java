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


@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {

    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) {
        
            String correo = request.getParameter("email");
            String password = request.getParameter("pass");
            
            try {
                usuarioDao miusuariosDao = new usuarioDao();
                usuario miusuario = new usuario();
                miusuario = miusuariosDao.consultarUsuarioEmail(correo);
                
                
                if (miusuario == null){
                    System.out.println(correo);
                    
                    out.println("<script type=\"text/javascript\">");
                    out.println( "alert('"+ "El correo no es correcto "+ correo +" ,no existe." + "');");
                    out.println("window.location.href='/booktripG/vista/login.jsp'");
                    out.println("</script>");
                    
                }else {
                    
                    System.out.println(miusuario.getPassword());
                    System.out.println(password);
                    
                    if (miusuario.getPassword().equals(password)) {
                        out.println("<script type=\"text/javascript\">");
                        out.println("alert('"+ "ah ingresado con exito " + miusuario.getNombre() + " " + miusuario.getApellido()+  "');");
                        out.println("window.location.href ='/booktripG/vista/Dashboard/indexListaRol.jsp';");
                        out.println("</script>");
                    
                    }else {
                        out.println("<script type=\"text/javascript\">");
                        out.println("alert('" + "Error" + "');");
                        out.println("window.location.href ='/booktripG/vista/login.jsp';");
                        out.println("</script>");
                    }
                }
                
            }catch (Exception e){
                e.printStackTrace();
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
