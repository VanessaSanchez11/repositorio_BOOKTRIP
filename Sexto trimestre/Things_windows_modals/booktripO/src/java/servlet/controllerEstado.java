/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controlador.estadosDAO;
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
import modelo.estados;

/**
 *
 * @author oscar sanabria
 */
@WebServlet(name = "controllerEstado", urlPatterns = {"/controllerEstado"})
public class controllerEstado extends HttpServlet {

    estados p = new estados();
    estadosDAO dao = new estadosDAO();
    
    String listar="booktripO/vista/Dashboard/indexListaEstado.jsp";
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String accion = request.getParameter("accion");
 String acceso="";
            switch (accion) {

                case "Listar":
                    List<estados> lista = dao.listar();
                    request.setAttribute("lista", lista);
                    request.getRequestDispatcher("vista/Dashboard/indexListaEstado.jsp").forward(request, response);
                    break;
                case "Nuevo":
                   
                    break;
                case "Guardar":
                    String nom = request.getParameter("txtNom");
                    p.setNombre(nom);
                    dao.agregar(p);
                    HttpSession session = request.getSession();
                    acceso=listar;

                    break;
                case "Editar":
                    int ide = Integer.parseInt(request.getParameter("id"));
                    estados res = dao.listarId(ide);
                    request.setAttribute("dato", res);
                    request.getRequestDispatcher("vista/Dashboard/editEstado.jsp ").forward(request, response);
                    break;
                case "Actualizar":
                    int id = Integer.parseInt(request.getParameter("id"));
                    String nom1 = request.getParameter("txtNom");
                    p.setIdEstado(id);
                    p.setNombre(nom1);
                    dao.update(p);
                    HttpSession sesion = request.getSession();
                    request.getRequestDispatcher("vista/Dashboard/indexListaEstado.jsp").forward(request, response);
                    break;
                case "Delete":
                    int idd = Integer.parseInt(request.getParameter("ide"));
                    dao.delete(idd);
                    request.getRequestDispatcher("controllerEstado?accion=Listar").forward(request, response);
                    break;
                case "Buscar":
                    String dato = request.getParameter("txtBuscar");
                 List<estados> list = dao.buscar(dato);
                    request.setAttribute("lista", list);
                    request.getRequestDispatcher("vista/Dashboard/indexListaEstado.jsp").forward(request, response);

                    break;
                    
                default:
                    request.getRequestDispatcher("controllerEstado?accion=Listar").forward(request, response);
                    ;
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
