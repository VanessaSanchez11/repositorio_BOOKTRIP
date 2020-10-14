/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.inmueblesDAO;
import modelo.inmuebles;

/**
 *
 * @author oscar sanabria
 */
public class pruebaConsultarInmueble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        inmueblesDAO inmuebleDAO = new inmueblesDAO();
        inmuebles inmueble = inmuebleDAO.consultarInmuebles("");
        if (inmueble != null) {
            System.out.println("Encontrado el inmueble   " + inmueble.getIdInmueble()
                    
                    + "  -  " + inmueble.getIdTipo()
                    + "  -  " + inmueble.getIdDepartamento()
                    + "  -  " + inmueble.getIdUsuario()
                    + "  -  " + inmueble.getIdEstado()
                    + "  -  " + inmueble.getNombre()
                    + "  -  " + inmueble.getDireccion()
                    + "  -  " + inmueble.getCapacidad()
                    + "  -  " + inmueble.getDescripcion()
                    + "  -  " + inmueble.getPrecio()
                    + "  -  " + inmueble.getAdjunto());

        } else {
            System.out.println("El inmueble no se encontró");
        }
    }
}
