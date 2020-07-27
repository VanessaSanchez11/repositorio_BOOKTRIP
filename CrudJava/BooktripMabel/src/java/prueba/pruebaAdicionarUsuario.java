/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import controlador.usuarioDao;
import java.util.Scanner;
import modelo.usuario;

/**
 *
 * @author 57321
 */
public class pruebaAdicionarUsuario {
    public static void main(String[] args) {
        usuarioDao userC = new usuarioDao();
        usuario user = new usuario();

        Scanner leer = new Scanner(System.in);

        int IdtipoDocumento;
        int idRol;
        String nombre;
        String apellido;
        String direccion;
        String telefono;
        String fechaNacimiento;
        String email;
        String password;

        
        System.out.println("Por favor digite el numero del tipo de documento");
        IdtipoDocumento = leer.nextInt();
        user.setIdTipoDocumento(IdtipoDocumento);

        System.out.println("Por favor digite el numero del tipo de rol");
        idRol = leer.nextInt();
        user.setIdRol(idRol);

        System.out.println("Por favor digite su nombre");
        nombre = leer.next();
        user.setNombre(nombre);

        System.out.println("Por favor digite sus apellidos");
        apellido = leer.next();
        user.setApellido(apellido);

        System.out.println("Por favor digite su direccion");
        direccion = leer.next();
        user.setDireccion(direccion);

        System.out.println("Por favor digite su telefono");
        telefono = leer.next();
        user.setTelefono(telefono);

        System.out.println("Por favor digite su fecha de nacimiento");
        fechaNacimiento = leer.next();
        user.setFechaNacimiento(fechaNacimiento);

        System.out.println("Por favor digite su email");
        email = leer.next();
        user.setEmail(email);

        System.out.println("Por favor digite su contraseÃ±a");
        password = leer.next();
        user.setPassword(password);
        
        
        String Res = userC.adicionarUsuario(user);
        
        if(Res.length() == 0){
            System.out.println("registrado");
        }else{
            System.out.println("Error");
        
        }

    }
    
}
