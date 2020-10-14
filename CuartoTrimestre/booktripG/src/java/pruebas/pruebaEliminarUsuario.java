package pruebas;

import modelo.usuario;
import controlador.usuarioDao;
import java.util.ArrayList;

public class pruebaEliminarUsuario {

    public static void main(String[] args) {
        usuarioDao userC = new usuarioDao();
        usuario user = userC.consultarUsuarioEmail("");

        if (user != null) {
            System.out.println("Encontrado el tipo de documento  " + user.getIdUsuario() + "  -  " + user.getNombre());

        } else {
            System.out.println("El usuario no se encontro");
        }

        ArrayList<usuario> listaUsuarios = userC.ListadoUsuarios("");

        for (usuario u : listaUsuarios) {

            System.out.println("ID:  " + u.getIdUsuario()
            + "   NOMBRE:  " + u.getNombre()
            + "   APELLIDOS:  " + u.getApellido()
            + "   DIRECCION:  " + u.getDireccion()
            + "   TELEFONO:  " + u.getTelefono()
            + "   FECHA DE NACIMIENTO:  " + u.getFechaNacimiento()
            + "   EMAIL:  " + u.getEmail()
            + "   PASSWORD:  " + u.getPassword());

        }

        System.out.println("SE ELIMINO ");

        userC.EliminarUsuario(listaUsuarios.get(4));
        listaUsuarios = userC.ListadoUsuarios("");

        for (usuario u : listaUsuarios) {

             System.out.println("ID:  " + u.getIdUsuario()
            + "  NOMBRE:  " + u.getNombre()
            + "  APELLIDOS:  " + u.getApellido()
            + "  DIRECCION:  " + u.getDireccion()
            + "  TELEFONO:  " + u.getTelefono()
            + "  FECHA DE NACIMIENTO:  " + u.getFechaNacimiento()
            + "  EMAIL:  " + u.getEmail()
            + "  PASSWORD:  " + u.getPassword());

        }

    }

}
