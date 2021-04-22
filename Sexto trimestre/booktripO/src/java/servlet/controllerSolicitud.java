/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controlador.estadosDAO;
import controlador.solicitudinmueblesDAO;
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
import modelo.solicitudinmuebles;

/**
 *
 * @author oscar sanabria
 */
@WebServlet(name = "controllerSolicitud", urlPatterns = {"/controllerSolicitud"})
public class controllerSolicitud extends HttpServlet {

    solicitudinmuebles p=new solicitudinmuebles();
    solicitudinmueblesDAO dao=new solicitudinmueblesDAO();
  
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String accion = request.getParameter("accion");
 
            switch (accion) {

                 case "Listar":
                List<solicitudinmuebles>lista=dao.listar();
                request.setAttribute("lista", lista);
                out.println("<script type=\"text/javascript\">");
                out.println("window.location.href='/booktripO/vista/Dashboard/indexListaSolicitud.jsp';");
                out.println("</script>");
                break;
            case "Nuevo":                
               
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
 out.println("<script type=\"text/javascript\">");
                    out.println("alert('" + "Se ha registrado con exito" + "');");
                out.println("window.location.href='/booktripO/vista/Dashboard/indexListaSolicitud.jsp';");
                out.println("</script>");
               
                break;
            case "Editar": 
                int ide=Integer.parseInt(request.getParameter("id"));
                solicitudinmuebles res=dao.listarId(ide);
                request.setAttribute("dato",res);
                out.println("<script type=\"text/javascript\">");
                out.println("window.location.href='/booktripO/vista/Dashboard/editSolicitud.jsp';");
                out.println("</script>");
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
               out.println("<script type=\"text/javascript\">");
                    out.println("alert('" + "Se ha actualizado con exito" + "');");
                out.println("window.location.href='/booktripO/vista/Dashboard/indexListaSolicitud.jsp';");
                out.println("</script>");
                break;
            case "Delete":      
                int idd= Integer.parseInt(request.getParameter("id"));
                dao.delete(idd);
               out.println("<script type=\"text/javascript\">");
                    out.println("alert('" + "Se ha eliminado con exito" + "');");
                out.println("window.location.href='/booktripO/vista/Dashboard/indexListaSolicitud.jsp';");
                out.println("</script>");
                break;
                case "Buscar":
                    String dato = request.getParameter("txtBuscar");
                 List<solicitudinmuebles> list = dao.buscar(dato);
                    request.setAttribute("lista", list);
                   
                    
            default:
                out.println("<script type=\"text/javascript\">");
                out.println("window.location.href='/booktripO/vista/Dashboard/indexListaSolicitud.jsp';");
                out.println("</script>");
                   
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
