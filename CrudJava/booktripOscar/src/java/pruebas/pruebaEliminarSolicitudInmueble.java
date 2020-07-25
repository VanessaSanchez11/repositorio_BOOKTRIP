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
public class pruebaEliminarSolicitudInmueble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      solicitudinmueblesDAO solicitudDAO= new solicitudinmueblesDAO();
        ArrayList<solicitudinmuebles> listadosolicitud = solicitudDAO.ConsultarListadoSolicitudInmueble("");
     
        
        for (solicitudinmuebles T:listadosolicitud){
             System.out.println("idSolicitud : "+T.getIdSolicitud()+"idInmueble: "+T.getIdInmueble()+"idUsuario: "
                     +T.getIdUsuario()+"idEstado: "+T.getIdEstado()+"fecha: "+T.getFecha());  
             }
        System.out.println("se elimino");
        
     solicitudDAO.eliminarSolicitud(listadosolicitud.get(2));
        listadosolicitud=solicitudDAO.ConsultarListadoSolicitudInmueble("");
        for (solicitudinmuebles T : listadosolicitud){
             System.out.println("idSolicitud :"+T.getIdSolicitud()+"idInmueble: "+T.getIdInmueble()+"idUsuario: "
                     +T.getIdUsuario()+"idEstado: "+T.getIdEstado()+"fecha: "+T.getFecha());  
            
        }
           
        
        
    }
    
}
