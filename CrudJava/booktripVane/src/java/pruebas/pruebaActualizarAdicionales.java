/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.adicionalesDAO;
import java.util.Scanner;
import modelo.adicionales;

/**
 *
 * @author vanessa
 */
public class pruebaActualizarAdicionales {

    public static void main(String[] args) {
        adicionalesDAO adiC = new adicionalesDAO();
        adicionales adi = new adicionales();

        Scanner leer = new Scanner(System.in);

        int idInmueble;
        int idServicio;

       System.out.println("Digite el id del inmueble");
        idInmueble=leer.nextInt();
        adi.setIdInmueble(idInmueble);
       
        
        System.out.println("Digite el id del servicio");
        idServicio=leer.nextInt();
        adi.setIdServicio(idServicio);
        
        adi.setIdInmueble(1);

        String Res = adiC.actualizarAdicionales(adi);
        if (Res.length() == 0) {
            System.out.println("Dato actualizado");
        } else {
            System.out.println("Error");
        }

    }

}
