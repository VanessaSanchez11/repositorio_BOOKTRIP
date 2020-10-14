/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.solicitudinmueblesDAO;
import modelo.solicitudinmuebles;

public class pruebaConsultarSolicitudInmueble {

  
    public static void main(String[] args) {
         solicitudinmueblesDAO misolicitudDAO= new solicitudinmueblesDAO();
        solicitudinmuebles misolicitud= misolicitudDAO.consultarSolicitudInmuebles(1);
        if (misolicitud !=null) {
            System.out.println("Encontrada la solicitud    "+ misolicitud.getIdSolicitud()
                      + " - " + misolicitud.getIdInmueble()
                      + " - " + misolicitud.getIdUsuario()
                      + " - " + misolicitud.getIdEstado()
                      + " - "+ misolicitud.getFecha());
            
            
        }else {
            System.out.println("La solicitud no se encontró");
        }
    }
    }
    