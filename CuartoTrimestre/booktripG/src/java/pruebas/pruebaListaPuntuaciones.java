
package pruebas;

import controlador.puntuacionesDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.puntuaciones;



public class pruebaListaPuntuaciones {

   
    public static void main(String[] args) {
        puntuacionesDAO puntuacionesDAO = new puntuacionesDAO();
        ArrayList<puntuaciones> mipuntuacion = new ArrayList<puntuaciones>();
        mipuntuacion = puntuacionesDAO.ConsultarListadoPuntuaciones("");
        
        int size = mipuntuacion.size();
        
        System.out.println("<table border\"1\"><tr><td>idPuntuacion</td><td>idUsuario</td><td>idInmueble</td><td>fechaCreada</td><td>descrpcion</td><td>calificacion</td>");
        
        for(puntuaciones ser : mipuntuacion) {
            System.out.println("<tr>");
            System.out.println("<td>" + ser.getIdPuntuacion()+ "</td>");
            System.out.println("<td>" + ser.getIdUsuario()+ "</td>");
            System.out.println("<td>" + ser.getIdInmueble()+ "</td>");
            System.out.println("<td>" + ser.getFechaCreada() + "</td>");
            System.out.println("<td>" + ser.getDescripcion() + "</td>");
            System.out.println("<td>" + ser.getCalificacion()+ "</td>");

        }
        
    }
    
}
