/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;
import modelo.usuario;
import controlador.usuarioDao;
import java.util.ArrayList;

public class pruebaListaUsuarios {
    
    
    
    public static void main(String[] args) {

        usuarioDao usuarioC = new usuarioDao();

        ArrayList<usuario> user = new ArrayList<usuario>();

        user = usuarioC.ListadoUsuarios("");

        int size = user.size();

        System.out.println("<table border= \"1\"><tr><td>IdUsuario</td><td>Nombre</td><td>Apellidos</td><td>Direccion</td><td>Telefono</td><td>Fecha de nacimiento</td><td>Email</td>");

        for (usuario u : user) {
            System.out.println("<tr>");
            System.out.println("<td>" + u.getIdUsuario() + "</td>");
            System.out.println("<td>" + u.getNombre() + "</td>");
            System.out.println("<td>" + u.getApellido() + "</td>");
            System.out.println("<td>" + u.getDireccion() + "</td>");
            System.out.println("<td>" + u.getTelefono() + "</td>");
            System.out.println("<td>" + u.getFechaNacimiento() + "</td>");
            System.out.println("<td>" + u.getEmail() + "</td>");
            System.out.println("</tr>");
        }

        System.out.println("</table>");
    }

    
}
