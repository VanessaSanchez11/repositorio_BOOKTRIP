/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controlador.departamentosDAO;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.departamento;

/**
 *
 * @author 57321
 */
@WebServlet(name = "controllerDepartamento", urlPatterns = {"/controllerDepartamento"})
public class controllerDepartamento extends HttpServlet {

    departamento p = new departamento();
    departamentosDAO dao = new departamentosDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String accion = request.getParameter("accion");
        switch (accion) {
            /* LISTAR */

            case "Listar":
                List<departamento> lista = dao.listar();
                request.setAttribute("lista", lista);
                out.println("<script type=\"text/javascript\">");
                out.println("window.location.href='/booktripO/vista/Dashboard/indexListaDepartamento.jsp';");
                out.println("</script>");
                break;
            /* AGREGAR */

            case "Nuevo":

                break;
            /*GUARDAR*/
            case "Guardar":
                String nom = request.getParameter("txtNombre");
                p.setNombre(nom);
                dao.agregar(p);
                out.println("<script type=\"text/javascript\">");
                out.println("alert('" + "Se ha registrado con exito" + "');");
                out.println("window.location.href='/booktripO/vista/Dashboard/indexListaDepartamento.jsp';");
                out.println("</script>");

                break;
            case "Editar":
                int ide = Integer.parseInt(request.getParameter("id"));
                departamento res = dao.listarId(ide);
                request.setAttribute("dato", res);
                request.getRequestDispatcher("vista/Dashboard/departamento/edit.jsp").forward(request, response);
                break;
            /* ACTUALIZAR */

            case "Actualizar":
                int id = Integer.parseInt(request.getParameter("id"));
                String nom1 = request.getParameter("txtNombre");
                p.setIdDepartamento(id);
                p.setNombre(nom1);
                dao.update(p);
                HttpSession sesion = request.getSession();
                out.println("<script type=\"text/javascript\">");
                out.println("alert('" + "Se ha actualizado con exito" + "');");
                out.println("window.location.href='/booktripO/vista/Dashboard/indexListaDepartamento.jsp';");
                out.println("</script>");
                break;
            /**
             * ELIMINAR
             *
             */
            case "Delete":
                int idd = Integer.parseInt(request.getParameter("id"));
                dao.delete(idd);
                out.println("<script type=\"text/javascript\">");
                out.println("alert('" + "Se ha eliminado con exito" + "');");
                out.println("window.location.href='/booktripO/vista/Dashboard/indexListaDepartamento.jsp';");
                out.println("</script>");
                break;

            /*BUSCAR*/
            case "Buscar":
                String dato = request.getParameter("txtBuscar");
                List<departamento> list = dao.buscar(dato);
                request.setAttribute("lista", list);
                break;

            default:
                out.println("<script type=\"text/javascript\">");
                out.println("window.location.href='/booktripO/vista/Dashboard/indexListaDepartamento.jsp';");
                out.println("</script>");
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
