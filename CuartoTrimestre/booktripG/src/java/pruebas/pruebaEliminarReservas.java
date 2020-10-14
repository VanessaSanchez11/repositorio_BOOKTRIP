
package pruebas;
import controlador.reservasDAO;
import java.util.ArrayList;
import modelo.reservas;

public class pruebaEliminarReservas {

    
    public static void main(String[] args) {
        reservasDAO reservasDAO = new reservasDAO();
        reservas mireserva = reservasDAO.consultarReserva(1);
        
        if (mireserva != null){
            System.out.println("idReserva : " + mireserva.getIdReserva());
            
        } 
        
        else {
            System.out.println("la Reserva no existe");
        }
        
        ArrayList<reservas> listadoReserva =reservasDAO.ConsultarListadoReservas("");
        
        for (reservas T : listadoReserva) {
            System.out.println("id." + T.getIdReserva() + "idReserva: " + T.getIdReserva());
        }
        
        System.out.println(" SE ELIMINO ");
        
        reservasDAO.EliminarReserva(listadoReserva.get(1));
        listadoReserva = reservasDAO.ConsultarListadoReservas("");
        
        for (reservas T : listadoReserva){
            System.out.println("id." + T.getIdReserva() + "idReserva: " + T.getIdReserva());
        }
        
        
       }
    
}
