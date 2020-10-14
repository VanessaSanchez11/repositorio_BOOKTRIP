/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controlador.departamentosDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.departamento;

/**
 *
 * @author 57321
 */
@WebServlet(name = "actualizarDepa", urlPatterns = {"/actualizarDepa"})
public class actualizarDepartamentos extends HttpServlet {

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
           
            String Nombre = request.getParameter("nombre");
            
             departamentosDAO departamento = new departamentosDAO();
            departamento Departa = new departamento();
            
            String respuesta = departamento.actualizarDepartamento(Departa);
            
            if (respuesta.length() == 0) {
                System.out.println("Res " + respuesta);
                System.out.println("Res " + respuesta.length());
                out.println("<script type=\"text/javascript\">");
                out.println("alert('" + "Se ha actualizado con exito" + "');");
                out.println("window.location.href='/booktripP/vista/Dashboard/indexListaDepartamentos.jsp';");
                out.println("</script>");
            } else {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('" + respuesta + "');");
                out.println("alert('" + "No se pudo actualizar el registro con exito" + "');");
                out.println("</script>");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
            
        }
    }

  