/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import java.util.ArrayList;
import modelo.tipoinmuebles;
import controlador.tipoinmuebleDAO;

/**
 *
 * @author oscar sanabria
 */
public class pruebaListaTipoInmueble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      tipoinmuebleDAO mitipoinmuebleDAO = new tipoinmuebleDAO();
        ArrayList<tipoinmuebles> mitipoinmueble = new ArrayList<tipoinmuebles>();
        mitipoinmueble =mitipoinmuebleDAO.ConsultarListadoEstado("");
        int size = mitipoinmueble.size();
       System.out.println("<table border=\"1\"><tr><td>idTipo</td><td>nombre<td></td>");
        for (tipoinmuebles D : mitipoinmueble) {
            System.out.println("<tr>"+ D.getIdTipo()+"</td>");
            System.out.println("<td>"+ D.getNombre()+"</td>");
           
              System.out.println("<tr/>");
        }
        System.out.println("<table/>");
        }
    }



 
    

