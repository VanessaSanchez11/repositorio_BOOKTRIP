
package pruebas;

import controlador.serviciosDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.servicios;


public class pruebaListaServicios {

  
    public static void main(String[] args) {
        
        serviciosDAO serviciosDAO = new serviciosDAO();
        ArrayList<servicios> miservicio = new ArrayList<servicios>();
        miservicio = serviciosDAO.ConsultarListadoServicios("");
        
        int size = miservicio.size();
        
        System.out.println("<table border\"1\"><tr><td>idServicios</td><td>nombre</td><td>descripcion</td>");
        
        for(servicios ser : miservicio) {
            System.out.println("<tr>");
            System.out.println("<td>" + ser.getIdServicio()+ "</td>");
            System.out.println("<td>" + ser.getNombre() + "</td>");
            System.out.println("<td>" + ser.getDescripcion() + "</td>");
        }
        
        System.out.println("</table>");
        
     
    }
    
}
