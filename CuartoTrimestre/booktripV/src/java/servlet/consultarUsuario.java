/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import controlador.usuarioDao;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.usuario;

@WebServlet(name = "consultarUsuario", urlPatterns = {"/consultarUsuario"})
public class consultarUsuario extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        try (PrintWriter out = response.getWriter()) {

            String Accion = request.getParameter("Actualizar");
            System.out.println("Accion " + Accion);

            String id = request.getParameter("IdConsultado");
                  
            usuarioDao userC = new usuarioDao();
            usuario user = new usuario();

            int idUsuario = Integer.parseInt(id);
            user = userC.consultarUsuarioId(idUsuario);

            if (Accion != null) {

                if (user != null) {

                    response.sendRedirect("/booktripV/vista/Dashboard/indexListaUsuario.jsp?idUsuario="+ user.getIdUsuario()+ "&"
                            + "idTipoDocumento=" + user.getIdTipoDocumento() + "&"
                            + "idRol=" + user.getIdRol() + "&"
                            + "nombre=" + user.getNombre() + "&"
                            + "apellido=" + user.getApellido() + "&"
                            + "direccion=" + user.getDireccion() + "&"
                            + "telefono=" + user.getTelefono() + "&"
                            + "fechaNacimiento=" + user.getFechaNacimiento() + "&"
                            + "email=" + user.getEmail() + "&"
                            + "password=" + user.getPassword() + "&"
                            + "Vista=" + "Actualizar" + "&");
                    System.out.println("Salio");
                } else {
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('" + "No se ha podido relizar la consulta." + "\n"
                            + "Por favor verificar el id: " + idUsuario + "');");
                    out.println("</script>");
                }
            } else {
                if (user != null) {
                    String respuestaRegistrada = userC.EliminarUsuario(user);
                    if (respuestaRegistrada.length() == 0) {
                        out.println("<script type=\"text/javascript\">");
                        out.println("alert('" + "Eliminacion Realizada." + "');");

                        out.println("window.location.href = '/booktripV/vista/Dashboard/indexListaUsuario.jsp';");
                        out.println("</script>");
                    } else {
                        out.println("<script type=\"text/javascript\">");
                        out.println("alert('" + "No se ha podido relizar la eliminacion."
                                + respuestaRegistrada.replace("'", "") + "');");
                        out.println("</script>");
                    }
                } else {
                    out.println("<script type=\"text/javascript\">");
                    out.println("alert('" + "No se ha podido relizar la consulta." + "\n"
                            + "Por favor verificar la identificacion: " + idUsuario + "');");
                    out.println("</script>");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
