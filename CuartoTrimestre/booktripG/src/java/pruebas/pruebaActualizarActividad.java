
package prueba;

import controlador.actividadesDAO;
import controlador.departamentosDAO;
import java.util.Scanner;
import modelo.actividades;


public class pruebaActualizarActividad {
    
    public static void main(String[] args) {
        actividadesDAO depa = new actividadesDAO();
        actividades actividades = new actividades();

        Scanner leer = new Scanner(System.in);

        String nombre = "";

        System.out.println("Ingrese la nueva informacion de la actividad");
        nombre = leer.next();
       
        
       actividades.setIdActividad(1);

        String Res = depa.actualizarActividad(actividades);
        if (Res.length() == 0) {
            System.out.println("Dato actualizado");
        } else {
            System.out.println("Error");
        }

    }
    
    
}
