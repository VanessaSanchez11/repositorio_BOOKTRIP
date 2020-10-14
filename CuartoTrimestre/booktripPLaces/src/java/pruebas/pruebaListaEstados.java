/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.estadosDAO;
import java.util.ArrayList;
import modelo.estados;

/**
 *
 * @author oscar sanabria
 */
public class pruebaListaEstados {

    public static void main(String[] args) {
        estadosDAO estadoDAO = new estadosDAO();
        ArrayList<estados> miestado = new ArrayList<estados>();
        
        miestado = estadoDAO.ConsultarListadoEstado("");
        int size = miestado.size();

        System.out.println("<table border=\"1\"><tr><td>idEstado</td>nombre<td></td>");
        for (estados D : miestado) {
            System.out.println("<tr>" + D.getIdEstado() + "</td>");
            System.out.println("<td>" + D.getNombre() + "</td>");

            System.out.println("<tr/>");
        }
        System.out.println("<table/>");
    }
}
