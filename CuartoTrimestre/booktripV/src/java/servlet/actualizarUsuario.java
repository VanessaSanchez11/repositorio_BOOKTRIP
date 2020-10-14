
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


@WebServlet(name = "actualizarUsuario", urlPatterns = {"/actualizarUsuario"})
public class actualizarUsuario extends HttpServlet {

  
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html;charset=UTF-8");
        
        try (PrintWriter out = response.getWriter()) {

            String idUsuario = request.getParameter("idUsuario");
            String idTipoDocumento = request.getParameter("idTipoDocumento");
            String idRol = request.getParameter("idRol");
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String direccion = request.getParameter("direccion");
            String telefono = request.getParameter("telefono");
            String fechaNacimiento = request.getParameter("fechaNacimiento");
            String email = request.getParameter("email");
            String password = request.getParameter("password");

            usuarioDao userC = new usuarioDao();
            usuario user = new usuario();

            int idUsuariov = Integer.parseInt(idUsuario);
            int idTipoD = Integer.parseInt(idTipoDocumento);
            int idRoles = Integer.parseInt(idRol);
            
            user.setIdUsuario(idUsuariov);
            user.setIdTipoDocumento(idTipoD);
            user.setIdRol(idRoles);
            user.setNombre(nombre);
            user.setApellido(apellido);
            user.setDireccion(direccion);
            user.setTelefono(telefono);
            user.setFechaNacimiento(fechaNacimiento);
            user.setEmail(email);
            user.setPassword(password);

            String respuesta = userC.actualizarUsuario(user);
            
            if (respuesta.length() == 0) {
                System.out.println("Res " + respuesta);
                System.out.println("Res " + respuesta.length());
                out.println("<script type=\"text/javascript\">");
                out.println("alert('" + "Se ha actualizado con exito" + "');");
                out.println("window.location.href='/booktripV/vista/Dashboard/indexListaUsuario.jsp';");
                out.println("</script>");
            } else {
                out.println("<script type=\"text/javascript\">");
                out.println("alert('" + respuesta + "');");
                out.println("alert('" + "No se pudo actualizar el registro con exito" + "');");
                out.println("</script>");
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

