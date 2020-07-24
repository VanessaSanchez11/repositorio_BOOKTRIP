
package pruebas;
import controlador.puntuacionesDAO;
import java.util.ArrayList;
import modelo.puntuaciones;

public class pruebaEliminarPuntuaciones {

    
    public static void main(String[] args) {
        puntuacionesDAO puntuacionesDAO = new puntuacionesDAO();
        puntuaciones mipuntuacion = puntuacionesDAO.consultarPuntuacion(1);
        
        if (mipuntuacion != null){
            System.out.println("idPuntuacion : " + mipuntuacion.getIdPuntuacion());
            
        } 
        
        else {
            System.out.println("La Puntuacion no existe");
        }
        
        ArrayList<puntuaciones> listadoPuntuacion =puntuacionesDAO.ConsultarListadoPuntuaciones("");
        
        for (puntuaciones T : listadoPuntuacion) {
            System.out.println("id." + T.getIdPuntuacion() + "idPuntuacion: " + T.getIdPuntuacion());
        }
        
        System.out.println(" SE ELIMINO ");
        
        puntuacionesDAO.EliminarPuntuacion(listadoPuntuacion.get(1));
        listadoPuntuacion = puntuacionesDAO.ConsultarListadoPuntuaciones("");
        
        for (puntuaciones T : listadoPuntuacion){
            System.out.println("id." + T.getIdPuntuacion() + "idPuntuacion: " + T.getIdPuntuacion());
        }
        
        
       }
    
}
