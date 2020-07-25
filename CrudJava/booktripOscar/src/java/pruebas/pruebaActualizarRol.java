/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.rolDAO;
import java.util.Scanner;
import modelo.rol;

/**
 *
 * @author vanessa
 */
public class pruebaActualizarRol {
     public static void main(String[] args) {
        rolDAO rolDao = new rolDAO();
        rol rol = new rol();
        
        Scanner leer = new Scanner(System.in);
        
        String nombre = "";
        
        System.out.println("Ingrese la nueva informacion de el rol");
        nombre = leer.next();
        rol.setNombre(nombre);
        rol.setIdRol(2);
        
        String Res = rolDao.actualizarRol(rol);
        if (Res.length() == 0) {
            System.out.println("Dato actualizado");
        }else{
            System.out.println("Error");
        }
        
        
    }
}
