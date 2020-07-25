/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.galeriasDAO;
import modelo.galerias;
import java.util.Scanner;


public class pruebaAdicionarGalerias {

    public static void main(String[] args) {
        galeriasDAO galeriasDAO = new galeriasDAO();
        galerias migaleria = new galerias();

        Scanner leer = new Scanner(System.in);
        int inmueble ;
        String imagen ;
        String url ;

        System.out.println("por favor digite el inmueble(numero) ");
        inmueble = leer.nextInt();
        migaleria.setIdInmueble(inmueble);

        System.out.println("ingrese imagen (texto)");
        imagen = leer.next();
        migaleria.setImagen(imagen);

        System.out.println("ingrese la url (texto)");
        url = leer.next();
        migaleria.setUrl(url);

        String respuesta = galeriasDAO.adicionarGaleria(migaleria);
        if (respuesta.length() == 0) {
            System.out.println("registrado");
        } else {
            System.err.println("error" + respuesta);
        }

    }
}
