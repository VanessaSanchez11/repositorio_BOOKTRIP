/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controlador.puntuacionesDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.puntuaciones;

/**
 *
 * @author gabob
 */
@WebServlet(name = "controllerPuntuacion", urlPatterns = {"/controllerPuntuacion"})
public class controllerPuntuacion extends HttpServlet {

    puntuaciones p = new puntuaciones();
    puntuacionesDAO dao = new puntuacionesDAO();

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
        String accion = request.getParameter("accion");
        switch (accion) {
            case "Listar":
                List<puntuaciones> lista = dao.listar();
                request.setAttribute("lista", lista);
                request.getRequestDispatcher("vista/Dashboard/listaPuntuacion.jsp").forward(request, response);
                break;
            case "Nuevo":
                request.getRequestDispatcher("vista/Dashboard/puntuacion/add.jsp").forward(request, response);
                break;
            case "Guardar":
                int inmueble = Integer.parseInt(request.getParameter("txtInmueble"));
                int usuario = Integer.parseInt(request.getParameter("txtUsuario"));
                String fecha = request.getParameter("txtFechaCreada");
                String descripcion = request.getParameter("txtDescripcion");
                String calificacion = request.getParameter("txtCalificacion");
                p.setIdInmueble(inmueble);
                p.setIdUsuario(usuario);
                p.setFechaCreada(fecha);
                p.setDescripcion(descripcion);
                p.setCalificacion(calificacion);
                dao.agregar(p);

                request.getRequestDispatcher("controllerPuntuacion?accion=Listar").forward(request, response);
                break;
            case "Editar":
                int ide = Integer.parseInt(request.getParameter("id"));
                puntuaciones res = dao.listarId(ide);
                request.setAttribute("dato", res);
                request.getRequestDispatcher("vista/Dashboard/puntuacion/edit.jsp").forward(request, response);
                break;
            case "Actualizar":
                int id = Integer.parseInt(request.getParameter("id"));
                int inmueble1 = Integer.parseInt(request.getParameter("txtInmueble"));
                int usuario1 = Integer.parseInt(request.getParameter("txtUsuario"));
                String fecha1 = request.getParameter("txtFechaCreada");
                String descripcion1 = request.getParameter("txtDescripcion");
                String calificacion1 = request.getParameter("txtCalificacion");
                p.setIdInmueble(inmueble1);
                p.setIdUsuario(usuario1);
                p.setFechaCreada(fecha1);
                p.setDescripcion(descripcion1);
                p.setCalificacion(calificacion1);
               
                p.setIdPuntuacion(id);
             

                dao.update(p);
                request.getRequestDispatcher("controllerPuntuacion?accion=Listar").forward(request, response);
                break;
            case "Delete":
                int idd = Integer.parseInt(request.getParameter("id"));
                dao.delete(idd);
                request.getRequestDispatcher("controllerPuntuacion?accion=Listar").forward(request, response);
                break;
            default:
                request.getRequestDispatcher("controllerPuntuacion?accion=Listar").forward(request, response);
                ;
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
