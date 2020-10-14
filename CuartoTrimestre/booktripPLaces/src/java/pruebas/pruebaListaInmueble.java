/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.inmueblesDAO;
import java.util.ArrayList;
import modelo.inmuebles;

/**
 *
 * @author oscar sanabria
 */
public class pruebaListaInmueble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        inmueblesDAO solicitudDAO = new inmueblesDAO();
        ArrayList<inmuebles> miinmueble = new ArrayList<inmuebles>();
        miinmueble = solicitudDAO.ConsultarListadoInmueble("");
        int size = miinmueble.size();
        System.out.println("<table border=\"1\"><tr><td>idInmueble</td><td>idTipo</td><td>idDepartamento</td>"
                + "<td>idUsuario</td><td>idEstado</td><td>nombre</td><td>dirrecion</td><td>capacidad</td>"
                + "<td>descripcion</td><td>precio</td><td>adjunto</td>");
        for (inmuebles D : miinmueble) {
            System.out.println("<tr>" + D.getIdInmueble() + "</td>");
            System.out.println("<td>" + D.getIdTipo()+ "</td>");
            System.out.println("<td>" + D.getIdDepartamento()+ "</td>");
            System.out.println("<td>" + D.getIdUsuario()+ "</td>");
            System.out.println("<td>" + D.getIdEstado()+ "</td>");
            System.out.println("<td>" + D.getNombre() + "</td>");
            System.out.println("<td>" + D.getDireccion()+ "</td>");
            System.out.println("<td>" + D.getCapacidad()+ "</td>");
            System.out.println("<td>" + D.getDescripcion()+ "</td>");
            System.out.println("<td>" + D.getPrecio()+ "</td>");
            System.out.println("<td>" + D.getAdjunto()+ "</td>");

            System.out.println("<tr/>");
        }
        System.out.println("<table/>");
    }
}


