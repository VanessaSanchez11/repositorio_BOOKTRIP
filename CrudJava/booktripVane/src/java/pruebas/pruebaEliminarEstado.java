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

        // estados miestado= estadoDAO.consultarEstados(1);
        // if (miestado !=null) {
        // System.out.println("nombre: "+ miestado.getNombre());
        // }else{
        //  System.out.println("EL estado no existe");
        
        estadosDAO estadoDAO = new estadosDAO();
        ArrayList<estados> listadoEstado = estadoDAO.ConsultarListadoEstado("");

        for (estados T : listadoEstado) {
            System.out.println("idEstado : " + T.getIdEstado() + "nombre: " + T.getNombre());
        }
        System.out.println("se elimino");

        estadoDAO.eliminarEstado(listadoEstado.get(8));
        listadoEstado = estadoDAO.ConsultarListadoEstado("");
        
        for (estados T : listadoEstado) {
            System.out.println("idEstado :" + T.getIdEstado() + "nombre: " + T.getNombre());

        }

    }

}
