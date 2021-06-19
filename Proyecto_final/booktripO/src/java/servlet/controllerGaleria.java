/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controlador.galeriasDAO;
import controlador.municipiosDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.galerias;
import modelo.municipios;

/**
 *
 * @author 57321
 */
@WebServlet(name = "controllerGaleria", urlPatterns = {"/controllerGaleria"})
public class controllerGaleria extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    galerias p = new galerias();
     galeriasDAO dao = new galeriasDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        String accion = request.getParameter("accion");
        switch (accion) {

            case "Listar":
                List<municipios> lista = dao.listar();
                request.setAttribute("lista", lista);
                request.getRequestDispatcher("vista/Propietario/listaGaleria.jsp").forward(request, response);
                break;
            case "Nuevo":
                request.getRequestDispatcher("vista/Propietario/galerias/add.jsp").forward(request, response);
                break;
            case "Guardar":
                int galeria = Integer.parseInt(request.getParameter("txtGaleria"));

                String nombre = request.getParameter("txtNombre");

                p.getIdGaleria();
                p.getIdInmueble();
                p.setImagen(nombre);
                 p.setUrl(nombre);
                
                dao.agregar(p);
                request.getRequestDispatcher("controllerGaleria?accion=Listar").forward(request, response);
                break;
            case "Editar": 
                int ide=Integer.parseInt(request.getParameter("id"));
                galerias res=dao.listarId(ide);
                request.setAttribute("dato",res);
                request.getRequestDispatcher("vista/Dashboard/Propietario/edit.jsp").forward(request, response);
                break;
            case "Actualizar":   
                int id=Integer.parseInt(request.getParameter("id"));
                int inmueble1=Integer.parseInt(request.getParameter("txtInmueble"));
               String imagen1=request.getParameter("txtImagen");
                String url1=request.getParameter("txtUrl");
                 p.setIdGaleria(id);
                p.setIdInmueble(inmueble1);
                p.setImagen(imagen1);
                p.setUrl(url1);
                
                dao.update(p);
                request.getRequestDispatcher("controllerGaleria?accion=Listar").forward(request, response);
                break;
            case "Delete":
                int idd = Integer.parseInt(request.getParameter("id"));
                dao.delete(idd);
                request.getRequestDispatcher("controllerGaleria?accion=Listar").forward(request, response);
                break;
            default:
                request.getRequestDispatcher("controllerGaleria?accion=Listar").forward(request, response);
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
