
package pruebas;

import controlador.rolDAO;
import java.util.Scanner;
import modelo.rol;

public class pruebaAdicionarRol {
     public static void main(String[] args) {
            rolDAO rolDao = new rolDAO();
            rol rol = new rol();
        
        Scanner leer = new Scanner (System.in);
        
        String nombre="";
        
        System.out.println("Digite el nombre del rol");
        nombre=leer.next();
        rol.setNombre(nombre);
       
        String Res = rolDao.adicionarRol(rol);
        
        if(Res.length()==0){
            System.out.println("Registrado");
        }else{
            System.out.println("Error"+Res);
        }
        
        
    }
    
}
