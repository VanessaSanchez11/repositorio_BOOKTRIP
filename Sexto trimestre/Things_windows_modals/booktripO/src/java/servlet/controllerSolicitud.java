/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import com.sun.xml.fastinfoset.stax.events.Util;
import controlador.inmueblesDAO;
import controlador.solicitudinmueblesDAO;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.inmuebles;
import modelo.solicitudinmuebles;

/**
 *
 * @author gabob
 */
@WebServlet(name = "controllerSolicitud", urlPatterns = {"/controllerSolicitud"})
public class controllerSolicitud extends HttpServlet {

    solicitudinmuebles p=new solicitudinmuebles();
    solicitudinmueblesDAO dao=new solicitudinmueblesDAO();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
            
         String accion=request.getParameter("accion");
        switch (accion) {
            case "Listar":
                List<solicitudinmuebles>lista=dao.listar();
                request.setAttribute("lista", lista);
                request.getRequestDispatcher("vista/Dashboard/listaSolicitud.jsp").forward(request, response);
                break;
            case "Nuevo":                
                request.getRequestDispatcher("vista/Dashboard/solicitud/add.jsp").forward(request, response);
                break;
            case "Guardar":
                int inmueble=Integer.parseInt(request.getParameter("txtInmueble"));
                int usuario=Integer.parseInt(request.getParameter("txtUsuario"));
                int estado=Integer.parseInt(request.getParameter("txtEstado"));
                String fecha=request.getParameter("txtFecha");
                
                p.setIdInmueble(inmueble);
                p.setIdUsuario(usuario);
                p.setIdEstado(estado);
                p.setFecha(fecha);
               dao.agregar(p);
 
                request.getRequestDispatcher("controllerSolicitud?accion=Listar").forward(request, response);
                break;
            case "Editar": 
                int ide=Integer.parseInt(request.getParameter("id"));
                solicitudinmuebles res=dao.listarId(ide);
                request.setAttribute("dato",res);
                request.getRequestDispatcher("vista/Dashboard/solicitud/edit.jsp").forward(request, response);
                break;
            case "Actualizar":   
                int id=Integer.parseInt(request.getParameter("id"));
                int inmueble1=Integer.parseInt(request.getParameter("txtInmueble"));
                int usuario1=Integer.parseInt(request.getParameter("txtUsuario"));
                int estado1=Integer.parseInt(request.getParameter("txtEstado"));
                String fecha1=request.getParameter("txtFecha");
                 p.setIdSolicitud(id);
                p.setIdInmueble(inmueble1);
                p.setIdUsuario(usuario1);
                p.setIdEstado(estado1);
                p.setFecha(fecha1);
           
               
                dao.update(p);
                request.getRequestDispatcher("controllerSolicitud?accion=Listar").forward(request, response);
                break;
            case "Delete":      
                int idd= Integer.parseInt(request.getParameter("id"));
                dao.delete(idd);
                request.getRequestDispatcher("controllerSolicitud?accion=Listar").forward(request, response);
                break;
                case "Buscar":
                    String dato = request.getParameter("txtBuscar");
                 List<solicitudinmuebles> list = dao.buscar(dato);
                    request.setAttribute("lista", list);
                    request.getRequestDispatcher("vista/Dashboard/listaSolicitud.jsp").forward(request, response);
                    
            default:
                request.getRequestDispatcher("controllerSolicitud?accion=Listar").forward(request, response);;
        }
    
        
        
    }

    
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
    @SuppressWarnings("IncompatibleEquals")
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
