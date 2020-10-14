
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.tipoinmuebleDAO;
import modelo.tipoinmuebles;

/**
 *
 * @author oscar sanabria
 */
public class pruebaConsultarTipoInmueble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        tipoinmuebleDAO mitipoinmuebleDAO = new tipoinmuebleDAO();
        tipoinmuebles mitipoinmueble = mitipoinmuebleDAO.consultarTipoInmueblesId(4);
        if (mitipoinmueble != null) {
            System.out.println("Encontrado el tipo inmueble      " + mitipoinmueble.getIdTipo()
                    + "  -   " + mitipoinmueble.getNombre());

        } else {
            System.out.println("El inmueble no se encontró");
        }
    }
}
