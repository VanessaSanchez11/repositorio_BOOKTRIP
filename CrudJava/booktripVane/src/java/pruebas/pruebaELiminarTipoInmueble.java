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
public class pruebaELiminarTipoInmueble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        tipoinmuebleDAO mitipoinmuebleDAO= new tipoinmuebleDAO();
        ArrayList<tipoinmuebles> listadotipoinmueble = mitipoinmuebleDAO.ConsultarListadoEstado("");
     
        
        for (tipoinmuebles T:listadotipoinmueble){
             System.out.println("idEstado : "+T.getIdTipo()+"nombre: "+T.getNombre());  
             }
        System.out.println("se elimino");
        
       mitipoinmuebleDAO.eliminarEstado(listadotipoinmueble.get(5));
        listadotipoinmueble=mitipoinmuebleDAO.ConsultarListadoEstado("");
        for (tipoinmuebles T : listadotipoinmueble){
             System.out.println("idEstado :"+T.getIdTipo()+"nombre: "+T.getNombre());  
            
        }
        
        
    }
    }
    

