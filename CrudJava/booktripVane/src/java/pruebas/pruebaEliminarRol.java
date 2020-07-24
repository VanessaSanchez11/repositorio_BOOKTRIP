/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.ArrayList;
import modelo.rol;
import controlador.rolDAO;


public class pruebaEliminarRol {
    
    public static void main(String[] args) {
        rolDAO rolC = new rolDAO();
        rol rol = rolC.consultarRol(4);

        if (rol != null) {
            System.out.println("Encontrado el rol " + rol.getIdRol() + " - " + rol.getNombre());

        } else {
            System.out.println("El rol no se encontro");
        }

        
        ArrayList<rol> listaRol = rolC.ConsultarListadoRol("");
        
        for(rol R : listaRol){
            System.out.println("ID: " + R.getIdRol() + "Nombre: " + R.getNombre());
            
        }
        
        System.out.println("SE ELIMINO ");
        
        rolC.EliminarRol(listaRol.get(3));
       
        listaRol = rolC.ConsultarListadoRol("");
        
        for(rol R : listaRol){
            System.out.println("ID: " + R.getIdRol() + "Nombre: " + R.getNombre());
            
        }
        
    }
    
    
}
