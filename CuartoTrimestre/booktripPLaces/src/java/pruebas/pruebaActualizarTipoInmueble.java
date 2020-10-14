/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.tipoinmuebleDAO;
import java.util.Scanner;
import modelo.tipoinmuebles;

public class pruebaActualizarTipoInmueble {

    public static void main(String[] args) {
        tipoinmuebleDAO tipoinmueblesDAO = new tipoinmuebleDAO();
        tipoinmuebles mitipoinmueble = new tipoinmuebles();

        Scanner leer = new Scanner(System.in);

        String nombre = "";
        System.out.println("ingrese el nombre(un numero)");
        nombre = leer.next();
        mitipoinmueble.setNombre(nombre);

        mitipoinmueble.setIdTipo(1);
        String respuesta = tipoinmueblesDAO.actualizarTipoInmueble(mitipoinmueble);
        if (respuesta.length() == 0) {
            System.out.println("información actualizada ");
        } else {
            System.out.println("error" + respuesta);
        }

    }

}
