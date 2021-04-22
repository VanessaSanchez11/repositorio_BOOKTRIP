/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controlador.inmueblesDAO;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.inmuebles;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

/**
 *
 * @author oscar sanabria
 */
@WebServlet(name = "controllerInmueble", urlPatterns = {"/controllerInmueble"})
public class controllerInmueble extends HttpServlet {

    inmuebles p = new inmuebles();
    inmueblesDAO dao = new inmueblesDAO();

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException, FileNotFoundException, SQLException {
        response.setContentType("text/html;charset=UTF-8");

        String accion = request.getParameter("accion");
        switch (accion) {
            case "Listar":
                List<inmuebles> lista = dao.listar();
                request.setAttribute("lista", lista);
                request.getRequestDispatcher("vista/Propietario/listaInmueble.jsp").forward(request, response);
                break;
            case "Nuevo":
                request.getRequestDispatcher("vista/Propietario/inmueble/add.jsp").forward(request, response);
                break;
            case "Guardar":

                int tipo = Integer.parseInt(request.getParameter("txtTipo"));
                int departamento = Integer.parseInt(request.getParameter("txtDepartamento"));
                int usuario = Integer.parseInt(request.getParameter("txtUsuario"));
                int estado = Integer.parseInt(request.getParameter("txtEstado"));
                String nombre = request.getParameter("txtNombre");
                String direccion = request.getParameter("txtDireccion");
                int capacidad = Integer.parseInt(request.getParameter("txtCapacidad"));
                String descripcion = request.getParameter("txtDescripcion");
                int precio = Integer.parseInt(request.getParameter("txtPrecio"));
                String adjunto = request.getParameter("txtAdjunto");
                ArrayList<String> lis = new ArrayList<>();
                
                try {
                    FileItemFactory file = new DiskFileItemFactory();
                    ServletFileUpload fileUpload = new ServletFileUpload(file);
                    List items = fileUpload.parseRequest(request);
                    for (int i = 0; i < items.size(); i++) {
                        FileItem fileItem = (FileItem) items.get(i);
                        if (!fileItem.isFormField()) {
                            File f = new File("C:\\imagenes\\" + fileItem.getName());
                            fileItem.write(f);
                            p.setAdjunto(f.getAbsolutePath());
                        } else {
                            lis.add(fileItem.getString());
                        }
                    }
                    p.setAdjunto(lis.get(0));

                } catch (Exception e) {
                }
                p.setIdTipo(tipo);
                p.setIdDepartamento(departamento);
                p.setIdUsuario(usuario);
                p.setIdEstado(estado);
                p.setNombre(nombre);
                p.setDireccion(direccion);
                p.setCapacidad(capacidad);
                p.setDescripcion(descripcion);
                p.setPrecio(precio);
                p.setAdjunto(adjunto);
                dao.agregar(p);

                request.getRequestDispatcher("controllerInmueble?accion=Listar").forward(request, response);
                break;
            case "Editar":
                int ide = Integer.parseInt(request.getParameter("id"));
                inmuebles res = dao.listarId(ide);
                request.setAttribute("dato", res);
                request.getRequestDispatcher("vista/Propietario/inmueble/edit.jsp").forward(request, response);
                break;
            case "Actualizar":
                int id2 = Integer.parseInt(request.getParameter("id"));
                int tipo1 = Integer.parseInt(request.getParameter("txtTipo"));
                int departamento1 = Integer.parseInt(request.getParameter("txtDepartamento"));
                int usuario1 = Integer.parseInt(request.getParameter("txtUsuario"));
                int estado1 = Integer.parseInt(request.getParameter("txtEstado"));
                String nombre1 = request.getParameter("txtNombre");
                String direccion1 = request.getParameter("txtDireccion");
                int capacidad1 = Integer.parseInt(request.getParameter("txtCapacidad"));
                String descripcion1 = request.getParameter("txtDescripcion");
                int precio1 = Integer.parseInt(request.getParameter("txtPrecio"));
                String adjunto1 = request.getParameter("txtAdjunto");
                p.setIdInmueble(id2);
                p.setIdTipo(tipo1);
                p.setIdDepartamento(departamento1);
                p.setIdUsuario(usuario1);
                p.setIdEstado(estado1);
                p.setNombre(nombre1);
                p.setDireccion(direccion1);
                p.setCapacidad(capacidad1);
                p.setDescripcion(descripcion1);
                p.setPrecio(precio1);
                p.setAdjunto(adjunto1);

                dao.update(p);
                request.getRequestDispatcher("controllerInmueble?accion=Listar").forward(request, response);
                break;
            case "Delete":
                int idd = Integer.parseInt(request.getParameter("id"));
                dao.delete(idd);
                request.getRequestDispatcher("controllerInmueble?accion=Listar").forward(request, response);
                break;
            case "Buscar":
                String dato = request.getParameter("txtBuscar");
                List<inmuebles> list = dao.buscar(dato);
                request.setAttribute("lista", list);
                request.getRequestDispatcher("vista/Propietario/listaInmueble.jsp").forward(request, response);
                break;
            default:
                request.getRequestDispatcher("controllerInmueble?accion=Listar").forward(request, response);
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
            throws ServletException, IOException, FileNotFoundException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(controllerInmueble.class.getName()).log(Level.SEVERE, null, ex);
        }
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
            throws ServletException, IOException, FileNotFoundException {
        try {
            processRequest(request, response);
        } catch (SQLException ex) {
            Logger.getLogger(controllerInmueble.class.getName()).log(Level.SEVERE, null, ex);
        }
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
