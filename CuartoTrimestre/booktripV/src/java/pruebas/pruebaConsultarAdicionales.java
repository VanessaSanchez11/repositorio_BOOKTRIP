
package pruebas;

import controlador.adicionalesDAO;
import modelo.adicionales;


public class pruebaConsultarAdicionales {
    
     public static void main(String[] args) {
        
        adicionalesDAO adiC  = new adicionalesDAO();
        adicionales  adi = adiC.consultarAdicionales(14);
        
        if(adi != null){
            System.out.println("Encontrado el adicional " + adi.getIdInmueble() + " - "
                    + adi.getIdServicio());
            
        }else{
            System.out.println("El adicional no se encontro");
        }
        
        
    }
    
}
