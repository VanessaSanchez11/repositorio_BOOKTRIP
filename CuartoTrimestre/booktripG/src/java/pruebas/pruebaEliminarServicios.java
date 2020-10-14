
package pruebas;
import controlador.serviciosDAO;
import java.util.ArrayList;
import modelo.servicios;   

public class pruebaEliminarServicios {

    
    public static void main(String[] args) {
        serviciosDAO serviciosDAO = new serviciosDAO();
        servicios miservicio = serviciosDAO.consultarServicio("");
        
        if (miservicio != null){
            System.out.println("descripcion : " + miservicio.getDescripcion());
            
        } 
        
        else {
            System.out.println("El servicio no existe");
        }
        
        ArrayList<servicios> listadoServicio =serviciosDAO.ConsultarListadoServicios("");
        
        for (servicios T : listadoServicio) {
            System.out.println("id." + T.getIdServicio() + "descripcion: " + T.getDescripcion());
        }
        
        System.out.println(" SE ELIMINO");
        
        serviciosDAO.EliminarServicio(listadoServicio.get(0));
        listadoServicio = serviciosDAO.ConsultarListadoServicios("");
        
        for (servicios T : listadoServicio){
            System.out.println("id." + T.getIdServicio() + "descripcion: " + T.getDescripcion());
        }
        
        
       }
    
}
