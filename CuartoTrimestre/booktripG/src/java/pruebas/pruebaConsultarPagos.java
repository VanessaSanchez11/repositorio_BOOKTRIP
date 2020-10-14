
package pruebas;
import controlador.pagosDAO;
import modelo.pagos;


public class pruebaConsultarPagos {

    
    public static void main(String[] args) {
    pagosDAO pagosDAO = new  pagosDAO();
    pagos pago = pagosDAO.consultarPago(1);
    
    if (pago != null){
        System.out.print("Encontrado el pago    "
                + pago.getIdPago() +  "  -  "
                + pago.getIdUsuario() + "  -   "
                + pago.getIdInmueble() + "  -   "
                + pago.getAdjunto() + "  -   "
                + pago.getMonto() + "  -   "
                + pago.getFechaPago() + "  -   "
                + pago.getFechaPago2() + "  ");
        
       
    }
    else {
        System.out.println("el pago no se encontro");
    }
        
    }
    
}
