/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.tipoinmuebleDAO;
import modelo.tipoinmuebles;
import java.util.Scanner;

public class pruebaAdicionarTipoInmueble {

 
    public static void main(String[] args) {
        tipoinmuebleDAO tipoinmueblesDAO = new tipoinmuebleDAO();
        tipoinmuebles mitipoinmueble = new tipoinmuebles();

        Scanner leer = new Scanner(System.in);

        String nombretipo = "";

        System.out.println("por favor digite el tipo de inmueble");
        nombretipo = leer.next();
        mitipoinmueble.setNombre(nombretipo);

        String respuesta = tipoinmueblesDAO.adicionarTipoInmueble(mitipoinmueble);
        if (respuesta.length() == 0) {
            System.out.println("registrado");
        } else {
            System.out.println("error" + respuesta);
        }
    }
}
