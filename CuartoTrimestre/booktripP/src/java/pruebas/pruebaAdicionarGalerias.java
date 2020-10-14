
package pruebas;

import controlador.galeriasDAO;
import modelo.galeria;
import java.util.Scanner;



public class pruebaAdicionarGalerias {
    
    
    
    public static void main(String[] args) {
        galeriasDAO galeriasDAO = new galeriasDAO();
        galeria migaleria = new galeria();

        Scanner leer = new Scanner(System.in);

        int inmueble;
        String imagen;
        String url;

        System.out.println("por favor ingrese el codigo inmueble(numero)");
        inmueble = leer.nextInt();
        migaleria.setIdInmueble(inmueble);

        System.out.println("por favor ingrese la imagen");
        imagen = leer.next();
        migaleria.setImagen(imagen);

        System.out.println("por favor ingrese la url");
        url = leer.next();
        migaleria.setUrl(url);

        migaleria.setIdGaleria(2);

        String respuesta = galeriasDAO.actualizarGaleria(migaleria);
        
        if (respuesta.length() == 0) {
            System.out.println("informaciÃ³n actualizada ");
        } else {
            System.out.println("error" + respuesta);

        }

    }

}
