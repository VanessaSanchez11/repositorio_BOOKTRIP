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

public class pruebaAdicionarActividad {

    public static void main(String[] args) {
        actividadesDAO depa = new actividadesDAO();
        actividades actividades = new actividades();

        Scanner leer = new Scanner(System.in);

        String nombre = "";

        System.out.println("Digite el nombre de la actividad");
        nombre = leer.next();
        actividades.setNombre(nombre);

        String Res = depa.adicionarActividad(actividades);

        if (Res.length() == 0) {
            System.out.println("Registrado");
        } else {
            System.out.println("Error" + Res);
        }

    }

}
