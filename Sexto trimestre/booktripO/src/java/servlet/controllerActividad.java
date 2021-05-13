/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controlador.actividadesDAO;
import controlador.estadosDAO;
import controlador.usuarioDao;
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
import modelo.actividades;
import modelo.estados;

/**
 *
 * @author oscar sanabria
 */
@WebServlet(name = "controllerActividad", urlPatterns = {"/controllerActividad"})
public class controllerActividad extends HttpServlet {

      actividades p=new actividades();
    actividadesDAO dao=new actividadesDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String accion = request.getParameter("accion");
            usuarioDao u = new usuarioDao();
            request.getAttribute("copiaU");
            switch (accion) {

               case "Listar":
                List<actividades>lista=dao.listar();
                request.setAttribute("lista", lista);
                out.println("<script type=\"text/javascript\">");
                out.println("window.location.href='/booktripO/vista/Propietario/indexListaActividad.jsp';");
                out.println("</script>");
                break;
  
  /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            case "Nuevo":                
                request.getRequestDispatcher("vista/Propietario/actividad/add.jsp").forward(request, response);
                break;
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////                
            case "Guardar":
                int municipio=Integer.parseInt(request.getParameter("txtMunicipio"));
                String nombre=request.getParameter("txtNombre");
                String lugar=request.getParameter("txtLugar");
                String descripcion=request.getParameter("txtDescripcion");
                
                p.setIdMunicipio(municipio);
                p.setNombre(nombre);
                p.setLugar(lugar);
                p.setDescripcion(descripcion);
               dao.agregar(p);
                out.println("<script type=\"text/javascript\">");
                out.println("alert('" + "Se ha registrado con exito" + "');");
                out.println("window.location.href='/booktripO/vista/Propietario/indexListaActividad.jsp';");
                out.println("</script>");
               
                break;
/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////// 
            case "Editar": 
                int ide=Integer.parseInt(request.getParameter("id"));
                actividades res=dao.listarId(ide);
                request.setAttribute("dato",res);
                request.getRequestDispatcher("vista/Propietario/editActividad.jsp").forward(request, response);
                break;
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////                 
            case "Actualizar":   
                int id=Integer.parseInt(request.getParameter("id"));
                int municipio1=Integer.parseInt(request.getParameter("txtMunicipio"));
                String nombre1=request.getParameter("txtNombre");
                String lugar1=request.getParameter("txtLugar");
                String descripcion1=request.getParameter("txtDescripcion");
                
                p.setIdActividad(id);
                p.setIdMunicipio(municipio1);
                p.setNombre(nombre1);
                p.setLugar(lugar1);
                p.setDescripcion(descripcion1);
                dao.update(p);
                HttpSession sesion = request.getSession();
                out.println("<script type=\"text/javascript\">");
                out.println("alert('" + "Se ha actualizado con exito" + "');");
                out.println("window.location.href='/booktripO/vista/Propietario/indexListaActividad.jsp';");
                out.println("</script>");
                break;
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////                 
            case "Delete":      
                int idd= Integer.parseInt(request.getParameter("id"));
                dao.delete(idd);
                out.println("<script type=\"text/javascript\">");
                out.println("alert('" + "Se ha eliminado con exito" + "');");
                out.println("window.location.href='/booktripO/vista//Propietario/indexListaActividad.jsp';");
                out.println("</script>");
                break;
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////           
          
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////            
            
            
            
            default:
                out.println("<script type=\"text/javascript\">");
                out.println("window.location.href='/booktripO/vista/Propietario/indexListaActividad.jsp';");
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
