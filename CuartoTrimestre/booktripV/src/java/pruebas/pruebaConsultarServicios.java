package pruebas;
import controlador.serviciosDAO;
import modelo.servicios;


public class pruebaConsultarServicios {
    
    public static void main(String[] args) {
        
    serviciosDAO serviciosDAO = new  serviciosDAO();
    servicios servicio = serviciosDAO.consultarServicio(3);
    
    if (servicio != null){
        System.out.print("Encontrado servicio    "
                + servicio.getIdServicio() +  "   -  "
                + servicio.getNombre() + "    -   "
                + servicio.getDescripcion() + "  ");
        
       
    }
    else {
        System.out.println("el servicio no se encontro");
    }
        
    }
    
}
