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
        
      tipoinmuebleDAO tipoDAO = new tipoinmuebleDAO();
        tipoinmuebles mitipo = tipoDAO.consultarTipoInmuebles("");

        if (mitipo != null) {
            System.out.println("Encontrado el tipo de documento  " + mitipo.getIdTipo()+ "  -  " + mitipo.getNombre());

        } else {
            System.out.println("El usuario no se encontro");
        }

        ArrayList<tipoinmuebles> listatipos = tipoDAO.ConsultarListadoTipoInmueble("");

        for (tipoinmuebles u : listatipos) {

            System.out.println("ID:  " + u.getIdTipo()
            + "   NOMBRE:  " + u.getNombre()
            );
          
        }

        System.out.println("SE ELIMINO ");

        tipoDAO.eliminarTipoInmueble(listatipos.get(4));
        listatipos = tipoDAO.ConsultarListadoTipoInmueble("");

        for (tipoinmuebles u : listatipos) {

             System.out.println("ID:  " + u.getIdTipo()
            + "  NOMBRE:  " + u.getNombre());
           
        }
    }

}

    

