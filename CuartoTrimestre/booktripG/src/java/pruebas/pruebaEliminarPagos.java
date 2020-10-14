
package pruebas;
import controlador.pagosDAO;
import java.util.ArrayList;
import modelo.pagos;

public class pruebaEliminarPagos {

    
    public static void main(String[] args) {
        pagosDAO pagosDAO = new pagosDAO();
        pagos mipago = pagosDAO.consultarPago("");
        
        if (mipago != null){
            System.out.println("idPago : " + mipago.getIdPago());
            
        } 
        
        else {
            System.out.println("El pago no existe");
        }
        
        ArrayList<pagos> listadoPago =pagosDAO.ConsultarListadoPagos("");
        
        for (pagos T : listadoPago) {
            System.out.println("id." + T.getIdPago() + "idPago: " + T.getIdPago());
        }
        
        System.out.println(" SE ELIMINO ");
        
        pagosDAO.EliminarPago(listadoPago.get(1));
        listadoPago = pagosDAO.ConsultarListadoPagos("");
        
        for (pagos T : listadoPago){
            System.out.println("id." + T.getIdPago() + "idPago: " + T.getIdPago());
        }
        
        
       }
    
}
