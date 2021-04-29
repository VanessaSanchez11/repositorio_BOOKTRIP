/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controlador.reservasDAO;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.reservas;

/**
 *
 * @author gabob
 */
@WebServlet(name = "controllerReserva", urlPatterns = {"/controllerReserva"})
public class controllerReserva extends HttpServlet {

   reservas p=new reservas();
    reservasDAO dao=new reservasDAO();
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
            
         String accion=request.getParameter("accion");
        switch (accion) {
            case "Listar":
                List<reservas>lista=dao.listar();
                request.setAttribute("lista", lista);
                request.getRequestDispatcher("vista/Viajero/listaReserva.jsp").forward(request, response);
                break;
            case "Nuevo":                
                request.getRequestDispatcher("vista/Viajero/reserva/add.jsp").forward(request, response);
                break;
            case "Guardar":
                int inmueble=Integer.parseInt(request.getParameter("txtInmueble"));
                int usuario=Integer.parseInt(request.getParameter("txtUsuario"));
                int estado=Integer.parseInt(request.getParameter("txtEstado"));
                String fechaRes=request.getParameter("txtFechaReserva");
                 String checkin=request.getParameter("txtCheckIn");
                  String checkout=request.getParameter("txtCheckOut");
                   p.setIdUsuario(usuario);
                p.setIdInmueble(inmueble);
                p.setIdEstado(estado);
                p.setFechaReserva(fechaRes);
                 p.setCheckIn(checkin);
                  p.setCheckOut(checkout);
               dao.agregar(p);
 
                request.getRequestDispatcher("controllerReserva?accion=Listar").forward(request, response);
                break;
            case "Editar": 
                int ide=Integer.parseInt(request.getParameter("id"));
                reservas res=dao.listarId(ide);
                request.setAttribute("dato",res);
                request.getRequestDispatcher("vista/Viajero/reserva/edit.jsp").forward(request, response);
                break;
            case "Actualizar":   
                int id=Integer.parseInt(request.getParameter("id"));
               int inmueble2=Integer.parseInt(request.getParameter("txtInmueble"));
                int usuario2=Integer.parseInt(request.getParameter("txtUsuario"));
                int estado2=Integer.parseInt(request.getParameter("txtEstado"));
                String fechaRes2=request.getParameter("txtFechaReserva");
                 String checkin2=request.getParameter("txtCheckIn");
                  String checkout2=request.getParameter("txtCheckOut");
                   p.setIdUsuario(usuario2);
                p.setIdInmueble(inmueble2);
                p.setIdEstado(estado2);
                p.setFechaReserva(fechaRes2);
                 p.setCheckIn(checkin2);
                  p.setCheckOut(checkout2);
           
               
                dao.update(p);
                request.getRequestDispatcher("controllerReserva?accion=Listar").forward(request, response);
                break;
            case "Delete":      
                int idd= Integer.parseInt(request.getParameter("id"));
                dao.delete(idd);
                request.getRequestDispatcher("controllerReserva?accion=Listar").forward(request, response);
                break;
            default:
              out.println("<script type=\"text/javascript\">");
                out.println("window.location.href='/booktripO/vista/Dashboard/indexListaEstado.jsp';");
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
