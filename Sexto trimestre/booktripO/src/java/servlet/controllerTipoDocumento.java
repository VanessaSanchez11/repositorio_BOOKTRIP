/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controlador.tipoDocumentosDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.tipoDocumentos;

/**
 *
 * @author oscar sanabria
 */
@WebServlet(name = "controllerTipoDocumento", urlPatterns = {"/controllerTipoDocumento"})
public class controllerTipoDocumento extends HttpServlet {
tipoDocumentos p=new tipoDocumentos();
    tipoDocumentosDAO dao=new tipoDocumentosDAO();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
          String accion=request.getParameter("accion");
        switch (accion) {
            case "Listar":
                List<tipoDocumentos>lista=dao.listar();
                request.setAttribute("lista", lista);
                request.getRequestDispatcher("vista/Dashboard/listaTipoDocumento.jsp").forward(request, response);
                break;
            case "Nuevo":                
               request.getRequestDispatcher("vista/Dashboard/tipoDocumento/add.jsp").forward(request, response);
                break;
            case "Guardar":
                String nom=request.getParameter("txtNom");
                p.setNombre(nom);
                dao.agregar(p);
                request.getRequestDispatcher("controllerTipoDocumento?accion=Listar").forward(request, response);
                break;
            case "Editar": 
                int ide=Integer.parseInt(request.getParameter("id"));
                tipoDocumentos res=dao.listarId(ide);
                request.setAttribute("dato",res);
                request.getRequestDispatcher("vista/Dashboard/tipoDocumento/edit.jsp").forward(request, response);
                break;
            case "Actualizar":   
                int id=Integer.parseInt(request.getParameter("id"));
                String nom1=request.getParameter("txtNom");
                p.setIdTipoDocumento(id);
                p.setNombre(nom1); 
                dao.update(p);
                request.getRequestDispatcher("controllerTipoDocumento?accion=Listar").forward(request, response);
                break;
            case "Delete":      
                int idd= Integer.parseInt(request.getParameter("id"));
                dao.delete(idd);
                request.getRequestDispatcher("controllerTipoDocumento?accion=Listar").forward(request, response);
                break;
            default:
                request.getRequestDispatcher("controllerTipoDocumento?accion=Listar").forward(request, response);;
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
