/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.estadosDAO;
import modelo.estados;
import java.util.ArrayList;

/**
 *
 * @author oscar sanabria
 */
public class pruebaEliminarEstado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

       estadosDAO miestadoDAO = new estadosDAO();
        estados miestado = miestadoDAO.consultarEstados(5);

         if (miestado != null) {
            System.out.println("Encontrado el tipo de documento  " + miestado.getIdEstado()+ "  -  " + miestado.getNombre());

        } else {
            System.out.println("El estado no se encontro");
        }

        ArrayList<estados> listaestado = miestadoDAO.ConsultarListadoEstado("");

        for (estados u : listaestado) {

            System.out.println("ID:  " + u.getIdEstado()
            + "   NOMBRE:  " + u.getNombre()
            );
          
        }

        System.out.println("SE ELIMINO ");

        miestadoDAO.eliminarEstado(listaestado.get(5));
        listaestado = miestadoDAO.ConsultarListadoEstado("");

        for (estados u : listaestado) {

             System.out.println("ID:  " + u.getIdEstado()
            + "  NOMBRE:  " + u.getNombre());
           
        }
    }

}
