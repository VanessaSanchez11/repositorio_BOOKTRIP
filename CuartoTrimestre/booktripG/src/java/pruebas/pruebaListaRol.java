
package pruebas;

import java.util.ArrayList;
import modelo.rol;
import controlador.rolDAO;


public class pruebaListaRol {
    
      
    public static void main(String[] args) {
        
        rolDAO rolC = new rolDAO();
        
        ArrayList<rol> rol = new ArrayList<rol>();
        
        rol = rolC.ConsultarListadoRol("");
        
        int size = rol.size();
        
        System.out.println("<table border= \"1\"><tr><td>IdTipoDocumento</td><td>Nombre</td>");
        
        for(rol r : rol ){
            System.out.println("<tr>");
            System.out.println("<td>" + r.getIdRol() + "</td>");
            System.out.println("<td>" + r.getNombre() + "</td>");
            System.out.println("</tr>");
        }
        
        System.out.println("</table>");
        
        
        
        
    }
    
    
}
