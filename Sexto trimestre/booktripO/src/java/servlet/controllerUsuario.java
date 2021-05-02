/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controlador.usuarioDao;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import modelo.usuario;

/**
 * @author oscar sanabria
 */
@WebServlet(name = "controllerUsuario", urlPatterns = {"/controllerUsuario"})
public class controllerUsuario extends HttpServlet {

  usuario p = new usuario();
    usuarioDao dao = new usuarioDao();
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        String accion = request.getParameter("accion"); 
        switch (accion) {
            case "Listar":
                List<usuario> lista = dao.listar();
                request.setAttribute("lista", lista);
                    out.println("<script type=\"text/javascript\">");
                    out.println("window.location.href='/booktripO/vista/login.jsp';");
                    out.println("</script>");
                break;
            case "Nuevo":
               
                break;
            case "Guardar":
                int idTipo = Integer.parseInt(request.getParameter("txtTipoDocumento"));
                int numero = Integer.parseInt(request.getParameter("txtNumDocu"));
                int idRol = Integer.parseInt(request.getParameter("txtRol"));
                String nombre = request.getParameter("txtNombre");
                String apellido = request.getParameter("txtApellido");
                String direccion = request.getParameter("txtDireccion");
                //String telefono = request.getParameter("txtTelefono");
                int telefono = Integer.parseInt(request.getParameter("txtTelefono"));
                String fecha = request.getParameter("txtFecha");
                String email = request.getParameter("txtEmail");     
                String password = request.getParameter("txtPassword");

                p.setIdTipoDocumento(idTipo);
                p.setNumDocu(numero);
                p.setIdRol(idRol);
                p.setNombre(nombre);
                p.setApellido(apellido);
                p.setDireccion(direccion);
                p.setTelefono(telefono);
                p.setFechaNacimiento(fecha);
                p.setEmail(email);
                p.setPassword(password);

                dao.agregar(p);
                HttpSession session =request.getSession();
                request.getRequestDispatcher("controllerUsuario?accion=Listar").forward(request, response);
                break;
            case "Editar":
                int ide = Integer.parseInt(request.getParameter("id"));
                usuario res = dao.listarId(ide);
                request.setAttribute("dato", res);
                request.getRequestDispatcher("vista/Dashboard/usuario/edit.jsp").forward(request, response);
                break;
            case "Actualizar":
                int id = Integer.parseInt(request.getParameter("id"));
               int idTipo2 = Integer.parseInt(request.getParameter("txtTipoDocumento"));
                int numero2 = Integer.parseInt(request.getParameter("txtNumDocu"));
                int idRol2 = Integer.parseInt(request.getParameter("txtRol"));
                String nombre2 = request.getParameter("txtNombre");
                String apellido2 = request.getParameter("txtApellido");
                String direccion2 = request.getParameter("txtDireccion");
                int telefono2 = Integer.parseInt(request.getParameter("txtTelefono"));
                String fecha2 = request.getParameter("txtFecha");
                String email2 = request.getParameter("txtEmail");
                String password2 = request.getParameter("txtPassword");

                p.setIdTipoDocumento(idTipo2);
                p.setNumDocu(numero2);
                p.setIdRol(idRol2);
                p.setNombre(nombre2);
                p.setApellido(apellido2);
                p.setDireccion(direccion2);
                p.setTelefono(telefono2);
                p.setFechaNacimiento(fecha2);
                p.setEmail(email2);
                p.setPassword(password2);

                dao.update(p);
                 HttpSession sesion =request.getSession();
                request.getRequestDispatcher("controllerUsuario?accion=Listar").forward(request, response);
                break;
            case "Delete":
                int idd = Integer.parseInt(request.getParameter("id"));
                dao.delete(idd);
                request.getRequestDispatcher("controllerUsuario?accion=Listar").forward(request, response);
                break;
            default:
                request.getRequestDispatcher("controllerUsuario?accion=Listar").forward(request, response);
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
