/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controlador.actividadesDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.actividades;

/**
 *
 * @author 57321
 */
@WebServlet(name = "registrarActi", urlPatterns = {"/registrarActi"})
public class registrarActi extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            String Municipio = request.getParameter("Municipio");
            String Actividad = request.getParameter("actividad");
            String lugar = request.getParameter("place");
            String Descripcion = request.getParameter("descripcion");
            

            actividadesDAO ACTIVIDAD = new actividadesDAO();
            actividades actividades = new actividades();

            int idMunicipios = Integer.parseInt(Municipio);

            actividades.setIdMunicipio(idMunicipios);
            actividades.setNombre(Actividad);
            actividades.setLugar(lugar);
            actividades.setDescripcion(Descripcion);

            String respuesta = ACTIVIDAD.adicionarActividad(actividades);

            if (respuesta.length() == 0) {
                System.out.println("Res " + respuesta);
                System.out.println("Res " + respuesta.length());
                out.println("<script type=\"text/javascript\">");
                out.println("alert('" + "Se ha registrado la actividad con exito" + "');");
                out.println("window.location.href='/booktripP/vista/DashboardPropietario/indexActividades.jsp';");
                out.println("</script>");
            } else {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('" + respuesta + "');");
                out.println("alert('" + "No se pudo insertar la actividad con exito " + "');");
                out.println("window.history.back();");
                out.println("</script>");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        }
    }
   
