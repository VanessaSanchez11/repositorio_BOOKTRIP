/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.adicionalesDAO;
import modelo.adicionales;
import java.util.ArrayList;

public class pruebaEliminarAdicional {
    
    public static void main(String[] args) {
        adicionalesDAO adiC = new adicionalesDAO();
        adicionales adi = adiC.consultarAdicionales(14);

        if (adi != null) {
            System.out.println("Encontrado el rol " + adi.getIdInmueble() + " - " + adi.getIdServicio());

        } else {
            System.out.println("El rol no se encontro");
        }

        
        ArrayList<adicionales> listaAdicionales = adiC.ConsultarListadoAdicionales("");
        
        for(adicionales A : listaAdicionales){
            System.out.println("IdInmueble: " + A.getIdInmueble() + "IdServicio: " + A.getIdServicio());
            
        }
        
        System.out.println("SE ELIMINO ");
        
        
        adiC.EliminarAdicionales(listaAdicionales.get(2));
        
        listaAdicionales = adiC.ConsultarListadoAdicionales("");
        
        for(adicionales A : listaAdicionales){
            System.out.println("IdInmueble: " + A.getIdInmueble() + "IdServicio: " + A.getIdServicio());
            
        }
        
    }
    
    
}
