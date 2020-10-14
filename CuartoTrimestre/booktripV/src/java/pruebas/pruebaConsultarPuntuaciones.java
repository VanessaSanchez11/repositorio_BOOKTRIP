
package pruebas;
import controlador.puntuacionesDAO;
import modelo.puntuaciones;


public class pruebaConsultarPuntuaciones {
    
    
    public static void main(String[] args){        
    puntuacionesDAO puntuacionesDAO = new  puntuacionesDAO();
    puntuaciones puntuacion = puntuacionesDAO.consultarPuntuacion(4);
    
    if (puntuacion != null){
        System.out.println("encontrado puntuacion" + puntuacion.getIdPuntuacion() + " - "
                + puntuacion.getIdUsuario()
                + " - " + puntuacion.getIdInmueble() 
                + " - " + puntuacion.getFechaCreada()
                + " - " + puntuacion.getDescripcion() 
                + " - " + puntuacion.getCalificacion());
    }
    else {
        System.out.println("la puntuacion no se encontro");
    }
    
    }
}
