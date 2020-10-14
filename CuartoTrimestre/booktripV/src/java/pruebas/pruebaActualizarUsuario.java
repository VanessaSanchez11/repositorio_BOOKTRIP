/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.usuarioDao;
import java.util.Scanner;
import modelo.usuario;

public class pruebaActualizarUsuario {

    public static void main(String[] args) {
        
        usuarioDao userC = new usuarioDao();
        usuario user = new usuario();

        Scanner leer = new Scanner(System.in);

        int idUsuario;
        int idTipoDocumento;
        int idRol;
        String nombre;
        String apellido;
        String direccion;
        String telefono;
        String fechaNacimiento;
        String email;
        String password;

        System.out.println("Por favor digite la nueva informacion de id usuario");
        idUsuario = leer.nextInt();
        user.setIdUsuario(idUsuario);
        
        System.out.println("Por favor digite la nueva informacion de tipo de documento");
        idTipoDocumento = leer.nextInt();
        user.setIdTipoDocumento(idTipoDocumento);

        System.out.println("Por favor digite la nueva informacion del tipo de rol");
        idRol = leer.nextInt();
        user.setIdRol(idRol);

        System.out.println("Por favor la nueva informacion de nombre");
        nombre = leer.next();
        user.setNombre(nombre);

        System.out.println("Por favor digite sus apellidos");
        apellido = leer.next();
        user.setApellido(apellido);

        System.out.println("Por favor la nueva informacion de1 direccion");
        direccion = leer.next();
        user.setDireccion(direccion);

        System.out.println("Por favor digite la nueva informacion de telefono");
        telefono = leer.next();
        user.setTelefono(telefono);

        System.out.println("Por favor digite la nueva informacion de fecha de nacimiento");
        fechaNacimiento = leer.next();
        user.setFechaNacimiento(fechaNacimiento);

        System.out.println("Por favor digite la nueva informacion de su email");
        email = leer.next();
        user.setEmail(email);

        System.out.println("Por favor digite la nueva informacion de su contraseña");
        password = leer.next();
        user.setPassword(password);

        
        user.setIdUsuario(2);
        String Res = userC.actualizarUsuario(user);
        
        if (Res.length() == 0) {
            System.out.println("Dato actualizado");
        } else {
            System.out.println("Error");
        }

    }
}
