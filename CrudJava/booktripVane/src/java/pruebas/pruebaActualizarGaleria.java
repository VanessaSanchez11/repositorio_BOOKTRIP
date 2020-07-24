/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;
import controlador.galeriasDAO;
import modelo.galerias;
import java.util.Scanner;


public class pruebaActualizarGaleria {

    public static void main(String[] args) {
        galeriasDAO galeriasDAO = new galeriasDAO();
        galerias migaleria = new galerias();

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
            System.out.println("información actualizada ");
        } else {
            System.out.println("error" + respuesta);

        }

    }
}
