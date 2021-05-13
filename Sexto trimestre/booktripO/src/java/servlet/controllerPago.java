/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controlador.estadosDAO;
import controlador.pagosDAO;
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
import modelo.estados;
import modelo.pagos;

/**
 *
 * @author oscar sanabria
 */
@WebServlet(name = "controllerPago", urlPatterns = {"/controllerPago"})
public class controllerPago extends HttpServlet {

    pagos p = new pagos();
    pagosDAO dao = new pagosDAO();
  
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String accion = request.getParameter("accion");
<<<<<<< HEAD
 
            switch (accion) {

            case "Listar":
                List<pagos> lista = dao.listar();
                request.setAttribute("lista", lista);
                out.println("<script type=\"text/javascript\">");
                out.println("window.location.href='/booktripO/vista/Viajero/indexListaPago.jsp';");
                out.println("</script>");
                break;
            
            case "Guardar":

                int usuario = Integer.parseInt(request.getParameter("txtUsuario"));
                int inmueble = Integer.parseInt(request.getParameter("txtInmueble"));
                String adjunto = request.getParameter("txtAdjunto");
                int monto = Integer.parseInt(request.getParameter("txtMonto"));
                String fecha1 = request.getParameter("txtFechaPago");
                String fecha2 = request.getParameter("txtFechaPago2");

                p.setIdUsuario(usuario);
                p.setIdInmueble(inmueble);
                p.setAdjunto(adjunto);
                p.setMonto(monto);
                p.setFechaPago(fecha1);
                p.setFechaPago2(fecha2);
                dao.agregar(p);

                out.println("<script type=\"text/javascript\">");
                out.println("alert('" + "Se ha registrado con exito" + "');");
                out.println("window.location.href='/booktripO/vista/Viajero/indexListaPago.jsp';");
                out.println("</script>");
                break;
            case "Editar":
                int ide = Integer.parseInt(request.getParameter("id"));
                pagos res = dao.listarId(ide);
                request.setAttribute("dato", res);
                
//                out.println("<script type=\"text/javascript\">");
//                out.println("alert('" + "Se ha eliminado con exito" + "');");
//                out.println("window.location.href='/booktripO/vista/Viajero/indexListaPago.jsp';");
//                out.println("</script>");
                request.getRequestDispatcher("vista/Viajero/editPago.jsp").forward(request, response);
                break;
            case "Actualizar":

                int usuario2 = Integer.parseInt(request.getParameter("txtUsuario"));
                int inmueble2 = Integer.parseInt(request.getParameter("txtInmueble"));
                String adjunto2 = request.getParameter("txtAdjunto");
                int monto2 = Integer.parseInt(request.getParameter("txtMonto"));
                String Fecha1 = request.getParameter("txtFechaPago");
                String Fecha2 = request.getParameter("txtFechaPago2");

                p.setIdUsuario(usuario2);
                p.setIdInmueble(inmueble2);
                p.setAdjunto(adjunto2);
                p.setMonto(monto2);
                p.setFechaPago(Fecha1);
                p.setFechaPago2(Fecha2);
                dao.update(p);
                out.println("<script type=\"text/javascript\">");
                out.println("alert('" + "Se ha actualizado con exito" + "');");
                out.println("window.location.href='/booktripO/vista/Viajero/indexListaPago.jsp';");
                out.println("</script>");
                break;
            case "Delete":
                int idd = Integer.parseInt(request.getParameter("id"));
                dao.delete(idd);
                out.println("<script type=\"text/javascript\">");
                out.println("alert('" + "Se ha eliminado con exito" + "');");
                out.println("window.location.href='/booktripO/vista/Viajero/indexListaPago.jsp';");
                out.println("</script>");
                break;
            default:
                out.println("<script type=\"text/javascript\">");
                out.println("window.location.href='/booktripO/vista/Viajero/indexListaPago.jsp';");
                out.println("</script>");
            
                   
=======

            switch (accion) {

                case "Listar":
                    List<pagos> lista = dao.listar();
                    request.setAttribute("lista", lista);
                    out.println("<script type=\"text/javascript\">");
                    out.println("window.location.href='/booktripO/vista/Viajero/indexListaPago.jsp';");
                    out.println("</script>");
                    break;
                case "Nuevo":

//                request.getRequestDispatcher("vista/Viajero/pago/add.jsp").forward(request, response);
                    break;
                case "Guardar":

                    int usuario = Integer.parseInt(request.getParameter("txtUsuario"));
                    int inmueble = Integer.parseInt(request.getParameter("txtInmueble"));
                    String adjunto = request.getParameter("txtAdjunto");
                    int monto = Integer.parseInt(request.getParameter("txtMonto"));
                    String fecha1 = request.getParameter("txtFechaPago");
                    String fecha2 = request.getParameter("txtFechaPago2");

                    p.setIdUsuario(usuario);
                    p.setIdInmueble(inmueble);
                    p.setAdjunto(adjunto);
                    p.setMonto(monto);
                    p.setFechaPago(fecha1);
                    p.setFechaPago2(fecha2);
                    dao.agregar(p);

                     out.println("<script type=\"text/javascript\">");
                    out.println("alert('" + "Se ha registrado con exito" + "');");
                    out.println("window.location.href='/booktripO/vista/Viajero/indexListaPago.jsp';");
                    out.println("</script>");
                    break;
                case "Editar":
                    int ide = Integer.parseInt(request.getParameter("id"));
                    pagos res = dao.listarId(ide);
                    request.setAttribute("dato", res);
                    request.getRequestDispatcher("vista/Viajero/editPago.jsp").forward(request, response);
                    break;
                case "Actualizar":

                    int usuario2 = Integer.parseInt(request.getParameter("txtUsuario"));
                    int inmueble2 = Integer.parseInt(request.getParameter("txtInmueble"));
                    String adjunto2 = request.getParameter("txtAdjunto");
                    int monto2 = Integer.parseInt(request.getParameter("txtMonto"));
                    String Fecha1 = request.getParameter("txtFechaPago");
                    String Fecha2 = request.getParameter("txtFechaPago2");

                    p.setIdUsuario(usuario2);
                    p.setIdInmueble(inmueble2);
                    p.setAdjunto(adjunto2);
                    p.setMonto(monto2);
                    p.setFechaPago(Fecha1);
                    p.setFechaPago2(Fecha2);
                    dao.update(p);
                   out.println("<script type=\"text/javascript\">");
                    out.println("alert('" + "Se ha actualizado con exito" + "');");
                    out.println("window.location.href='/booktripO/vista/Viajero/indexListaPago.jsp';");
                    out.println("</script>");
                    break;
                case "Delete":
                    int idd = Integer.parseInt(request.getParameter("id"));
                    dao.delete(idd);
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('" + "Se ha eliminado con exito" + "');");
                    out.println("window.location.href='/booktripO/vista/Viajero/indexListaPago.jsp';");
                    out.println("</script>");
                    break;
                default:
                    out.println("<script type=\"text/javascript\">");
                    out.println("window.location.href='/booktripO/vista/Viajero/indexListaPago.jsp';");
                    out.println("</script>");
                    ;

>>>>>>> master
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
