/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.estadosDAO;
import java.util.Scanner;
import modelo.estados;

public class pruebaActualizaEstado {

    public static void main(String[] args) {
        estadosDAO estadosDAO = new estadosDAO();
        estados miestado = new estados();

        Scanner leer = new Scanner(System.in);

        String nombre = "";

        System.out.println("por favor ingrese la nueva informacion");
        nombre = leer.next();
        miestado.setNombre(nombre);
        miestado.setIdEstado(5);
        String respuesta = estadosDAO.actualizarEstado(miestado);
        if (respuesta.length() == 0) {
            System.out.println("información actualizada ");
        } else {
            System.out.println("error" + respuesta);
        }

    }
}
