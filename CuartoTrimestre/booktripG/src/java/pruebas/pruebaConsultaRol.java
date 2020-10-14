
package pruebas;

import modelo.rol;
import controlador.rolDAO;



public class pruebaConsultaRol {
   
     public static void main(String[] args) {
        
        rolDAO rolC  = new rolDAO();
        rol  rol = rolC.consultarRol(4);
        
        if(rol != null){
            System.out.println("Encontrado el rol " + rol.getIdRol() + " - "
                    + rol.getNombre());
            
        }else{
            System.out.println("El rol no se encontro");
        }
        
        
    } 
}
