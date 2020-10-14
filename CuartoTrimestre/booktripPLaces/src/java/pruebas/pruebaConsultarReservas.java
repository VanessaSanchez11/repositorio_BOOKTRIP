
package pruebas;
import controlador.reservasDAO;
import modelo.reservas;


public class pruebaConsultarReservas {


    public static void main(String[] args) {
    reservasDAO reservasDAO = new  reservasDAO();
    reservas reserva = reservasDAO.consultarReserva(2);
    
    if (reserva != null){
        System.out.print("Encontrada la reserva    "
                + reserva.getIdReserva() +  "  -  "
                + reserva.getIdUsuario() + "  -   "
                + reserva.getIdInmueble() + "  -   "
                + reserva.getIdEstado() + "  -   "
                + reserva.getFechaReserva() + "  -   "
                + reserva.getCheckIn() + "  -   "
                + reserva.getCheckOut() + "  ");
        
       
    }
    
    else {
        System.out.println("la reserva no se encontro");
        
    }
    
    }
}
