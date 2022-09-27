/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controlador.tipoinmuebleDAO;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.estados;
import modelo.tipoinmuebles;
import static org.apache.taglibs.standard.tag.common.core.OutSupport.out;
//import static sun.misc.MessageUtils.out;

/**
 *
 * @author oscar sanabria
 */
@WebServlet(name = "controllerTipoInmueble", urlPatterns = {"/controllerTipoInmueble"})
public class controllerTipoInmueble extends HttpServlet {

     tipoinmuebles p = new tipoinmuebles();
    tipoinmuebleDAO dao = new tipoinmuebleDAO();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String accion = request.getParameter("accion");
 
            switch (accion) {
            case "Listar":
                List<tipoinmuebles> lista = dao.listar();
                request.setAttribute("lista", lista);
              out.println("<script type=\"text/javascript\">");
                out.println("window.location.href='/booktripO/vista/Dashboard/indexListaTipoInmueble.jsp';");
                out.println("</script>");
                break;
            case "Nuevo":

                break;
            case "Guardar":
                String nom = request.getParameter("txtNom");
                p.setNombre(nom);
                dao.agregar(p);
                out.println("<script type=\"text/javascript\">");
                out.println("alert('" + "Se ha registrado con exito" + "');");
                out.println("window.location.href='/booktripO/vista/Dashboard/indexListaTipoInmueble.jsp';");
                out.println("</script>");
                break;
            case "Editar":
                int ide = Integer.parseInt(request.getParameter("id"));
                tipoinmuebles res = dao.listarId(ide);
                request.setAttribute("dato", res);
               request.getRequestDispatcher("vista/Dashboard/editTipoInmueble.jsp").forward(request, response);
                break;
            case "Actualizar":
                int id = Integer.parseInt(request.getParameter("id"));
                String nom1 = request.getParameter("txtNom");
                p.setIdTipo(id);
                p.setNombre(nom1);
                dao.update(p);
                out.println("<script type=\"text/javascript\">");
                out.println("alert('" + "Se ha actualizado con exito" + "');");
                out.println("window.location.href='/booktripO/vista/Dashboard/indexListaTipoInmueble.jsp';");
                out.println("</script>");
                break;
            case "Delete":
                int idd = Integer.parseInt(request.getParameter("id"));
                dao.delete(idd);
                out.println("<script type=\"text/javascript\">");
                
                out.println("alert('" + "Se ha eliminado con exito" + "');");
                out.println("window.location.href='/booktripO/vista/Dashboard/indexListaTipoInmueble.jsp';");
                out.println("</script>");
                
                break;
           
            default:
                 out.println("<script type=\"text/javascript\">");
                out.println("window.location.href='/booktripO/vista/Dashboard/indexListaTipoInmueble.jsp';");
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
