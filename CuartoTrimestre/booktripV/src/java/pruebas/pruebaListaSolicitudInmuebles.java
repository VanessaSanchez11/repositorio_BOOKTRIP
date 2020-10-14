/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.solicitudinmueblesDAO;
import java.util.ArrayList;
import modelo.solicitudinmuebles;

/**
 *
 * @author oscar sanabria
 */
public class pruebaListaSolicitudInmuebles {

 
    public static void main(String[] args) {
        solicitudinmueblesDAO solicitudinmuebleDAO = new solicitudinmueblesDAO();
        ArrayList<solicitudinmuebles> misolicitudinmueble = new ArrayList<solicitudinmuebles>();
        misolicitudinmueble = solicitudinmuebleDAO.ConsultarListadoSolicitudInmueble("");
        int size = misolicitudinmueble.size();
        System.out.println("<table border=\"1\"><tr><td>idSolicitud</td><td>idInmueble</td><td>idUsuario</td>"
                + "<td>idEstado</td><td>fecha</td>");
        for (solicitudinmuebles D : misolicitudinmueble) {
            System.out.println("<tr>" + D.getIdSolicitud() + "</td>");
            System.out.println("<td>" + D.getIdInmueble() + "</td>");
            System.out.println("<td>" + D.getIdUsuario() + "</td>");
            System.out.println("<td>" + D.getIdEstado() + "</td>");
            System.out.println("<td>" + D.getFecha() + "</td>");

            System.out.println("<tr/>");
        }
        System.out.println("<table/>");
    }
    }



