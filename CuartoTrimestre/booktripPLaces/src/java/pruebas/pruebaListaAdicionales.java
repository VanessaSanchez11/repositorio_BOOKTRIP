

package pruebas;

import controlador.adicionalesDAO;
import modelo.adicionales;
import java.util.ArrayList;



public class pruebaListaAdicionales {
    
       public static void main(String[] args) {
        
         adicionalesDAO adiC  = new adicionalesDAO();
        
        ArrayList<adicionales> adi = new ArrayList<adicionales>();
        
        adi = adiC.ConsultarListadoAdicionales("");
        
        int size = adi.size();
        
        System.out.println("<table border= \"1\"><tr><td>IdInmueble</td><td>IdServicio</td>");
        
        for(adicionales a : adi ){
            System.out.println("<tr>");
            System.out.println("<td>" + a.getIdInmueble() + "</td>");
            System.out.println("<td>" + a.getIdServicio() + "</td>");
            System.out.println("</tr>");
        }
        
        System.out.println("</table>");
         
    }
    
    
}
