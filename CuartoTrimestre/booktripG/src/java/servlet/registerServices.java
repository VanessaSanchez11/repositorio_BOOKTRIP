/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controlador.serviciosDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.servicios;

/**
 *
 * @author Giovanny
 */
@WebServlet(name = "registerServices", urlPatterns = {"/registerServices"})
public class registerServices extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
                
            String Nombre = request.getParameter("nombre");
            String Descripcion = request.getParameter("descripcion");
            String BanderaServicios = request.getParameter("BanderaRegistro");

            serviciosDAO miServicioDAO = new serviciosDAO();
            servicios miServicios = new servicios();

            miServicios.setNombre(Nombre);
            miServicios.setDescripcion(Descripcion);
            
            System.out.println("El valor es" + BanderaServicios);

           if (BanderaServicios.equals("correcto")) {
                    String respuesta = miServicioDAO.adicionarServicio(miServicios);
                    System.out.println("res" + respuesta);
                    System.out.println("res" + respuesta.length());

            if (respuesta.length() == 0) {
             
                System.out.println("Res " + respuesta);
                System.out.println("Res " + respuesta.length());
                out.println("<script type=\"text/javascript\">");
                out.println("alert('" + "Se ha registrado con exito" + "');");
                out.println("window.location.href='/booktripG/vista/Dashboard/indexListaServicios.jsp';");
                out.println("</script>");
            } else {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('" + respuesta + "');");
                out.println("alert('" + "No se pudo insetar el registro con exito" + "');");
                out.println("window.history.back();");
                out.println("</script>");
            }

        }else {
                    System.out.println("El valor no es correcto" + BanderaServicios);
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
