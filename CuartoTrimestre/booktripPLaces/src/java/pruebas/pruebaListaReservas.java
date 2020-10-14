
package pruebas;

import controlador.reservasDAO;
import java.util.ArrayList;
import modelo.reservas;

public class pruebaListaReservas {


    public static void main(String[] args) {
        
        reservasDAO reservasD = new reservasDAO();
        
        ArrayList<reservas> mireserva = new ArrayList<reservas>();
        
        mireserva = reservasD.ConsultarListadoReservas("");
        
        int size = mireserva.size();
        
        System.out.println("<table border= \"1\"><tr><td>idReserva</td><td>idUsuario</td><td>idInmueble</td><td>idEstado</td><td>fechaReserva</td><td>checkIn</td><td>checkOut</td>");
        
        for(reservas res : mireserva) {
            System.out.println("<tr>");
            System.out.println("<td>  " + res.getIdReserva()+ "</td>");
            System.out.println("<td>  " + res.getIdUsuario()+ "</td>");
            System.out.println("<td>  " + res.getIdInmueble()+ "</td>");
            System.out.println("<td>  " + res.getIdEstado()+ "</td>");
            System.out.println("<td>  " + res.getFechaReserva()+ "</td>");
            System.out.println("<td>  " + res.getCheckIn() + "</td>");
            System.out.println("<td>  " + res.getCheckOut() + "</td>");
            System.out.println("</tr>");
        }
        
        System.out.println("</table>");
        
    }
    
}
