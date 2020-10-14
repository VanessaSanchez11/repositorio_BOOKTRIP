
package prueba;

import controlador.actividadesDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.actividades;



public class pruebaListaActividad {

public static void main (String[] args) throws SQLException{
        
        actividadesDAO actividadesDAO = new actividadesDAO();
        ArrayList<actividades> miActividad = new ArrayList<actividades>();
        miActividad = actividadesDAO.ConsularListaActividades("");
        
        int size = miActividad.size();
        System.out.println("<table border=\"1\"><tr><td>idActividad</td><td>idMunicipio</td><td>nombre</td><td>lugar</td><td>descripcion</td>");
        
        for (actividades D : miActividad){
            
            System.out.println("<tr>");
            System.out.println("<td>" + D.getIdActividad()+ "</td>");
            System.out.println("<td>" + D.getIdMunicipio() + "</td>");
             System.out.println("<td>" + D.getNombre()+ "</td>");
            System.out.println("<td>" + D.getLugar() + "</td>");
            System.out.println("<td>" + D.getDescripcion() + "</td>");
            System.out.println("</tr>");
            
        }
        
        System.out.println("</table>");
    }
}

