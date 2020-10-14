
package pruebas;

import controlador.adicionalesDAO;
import java.util.Scanner;
import modelo.adicionales;


public class pruebaAdicionarAdicionales {
    
     public static void main(String[] args) {
        adicionalesDAO adiC = new adicionalesDAO();
        adicionales adi = new adicionales();
        
        Scanner leer = new Scanner (System.in);
        
        int idInmueble;
        int idServicio;
        
        System.out.println("Digite el id del inmueble");
        idInmueble=leer.nextInt();
        adi.setIdInmueble(idInmueble);
       
        
        System.out.println("Digite el id del servicio");
        idServicio=leer.nextInt();
        adi.setIdServicio(idServicio);
       
        String Res = adiC.adicionarAdicionales(adi);
        
        if(Res.length()==0){
            System.out.println("Registrado");
        }else{
            System.out.println("Error"+Res);
        }
        
        
    }
    
}
