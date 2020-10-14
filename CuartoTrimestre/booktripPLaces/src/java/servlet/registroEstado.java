/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controlador.estadosDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.estados;

/**
 *
 * @author oscar sanabria
 */
@WebServlet(name = "registroEstado", urlPatterns = {"/registroEstado"})
public class registroEstado extends HttpServlet {

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
           
            
            String Nombre = request.getParameter("nombre");
             String BanderaEstado = request.getParameter("banderaRegistro");
            try {

               estadosDAO miEstadoDAO = new estadosDAO();

                estados miEstado = new estados();
                
               
                  miEstado.setNombre(Nombre);
                  
                 System.out.println("El valor es" +BanderaEstado);
                        
                if (BanderaEstado.equals("correcto")) {
                    String respuestaRegistrada=miEstadoDAO.adicionarEstado(miEstado);
                    System.out.println("res" + respuestaRegistrada);
                     System.out.println("res" + respuestaRegistrada.length());
                     if (respuestaRegistrada.length()==0) {
                        out.println("<script type=\"text/javascript\">");
                    out.println("alert('" + "estado registrado " + "');");
                    out.println("window.location.href='/booktripPLaces/vista/Dashboard/listadoEstados.jsp'");
                    out.println("</script>");
 
                    } else {
                    
                        out.println("<script type=\"text/javascript\">");
                        out.println("alert('" + respuestaRegistrada+"');");
                         out.println("alert('" + "error encontrado: " + respuestaRegistrada.replace("'","")+ "');");
                       out.println("window.histry.back();");
                        out.println("</script>");
                    } 
                }else  {
                    System.out.println("El valor no es correcto"+BanderaEstado);
                }

            } catch (NumberFormatException e) {
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
