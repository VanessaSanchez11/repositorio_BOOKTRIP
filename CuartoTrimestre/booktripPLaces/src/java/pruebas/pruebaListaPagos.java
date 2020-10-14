
package pruebas;

import controlador.pagosDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.pagos;


public class pruebaListaPagos {

    public static void main(String[] args) {
        
        pagosDAO pagosDAO = new pagosDAO();
        ArrayList<pagos> mipago = new ArrayList<pagos>();
        mipago = pagosDAO.ConsultarListadoPagos("");
        
        int size = mipago.size();
        
        System.out.println("<table border\"1\"><tr><td>idPago</td><td>idUsuario</td><td>idInmueble</td><td>adjunto</td><td>monto</td><td>fechaPago</td><td>fechaPago2</td>");
        
        for(pagos ser : mipago) {
            System.out.println("<tr>");
            System.out.println("<td>" + ser.getIdPago()+ "</td>");
            System.out.println("<td>" + ser.getIdUsuario()+ "</td>");
            System.out.println("<td>" + ser.getIdInmueble()+ "</td>");
            System.out.println("<td>" + ser.getAdjunto()+ "</td>");
            System.out.println("<td>" + ser.getMonto()+ "</td>");
            System.out.println("<td>" + ser.getFechaPago() + "</td>");
            System.out.println("<td>" + ser.getFechaPago2() + "</td>");
        }
        
        System.out.println("</table>");
    
    }
    
}
