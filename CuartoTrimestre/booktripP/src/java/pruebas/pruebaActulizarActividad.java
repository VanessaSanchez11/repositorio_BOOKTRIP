/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.actividadesDAO;
import controlador.departamentosDAO;
import java.util.Scanner;
import modelo.actividades;


public class pruebaActulizarActividad {
    
    
    public static void main(String[] args) {
        actividadesDAO depa = new actividadesDAO();
        actividades actividades = new actividades();

        Scanner leer = new Scanner(System.in);

        String nombre = "";

        System.out.println("Ingrese la nueva informacion de la actividad");
        nombre = leer.next();
       
        
       actividades.setIdActividad(1);

        String Res = depa.actualizarActividad(actividades);
        if (Res.length() == 0) {
            System.out.println("Dato actualizado");
        } else {
            System.out.println("Error");
        }

    }
    

    
}
