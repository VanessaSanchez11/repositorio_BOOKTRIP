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
public class pruebaEliminarInmueble {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        inmueblesDAO inmuebleDAO = new inmueblesDAO();

        ArrayList<inmuebles> listainmueble = inmuebleDAO.ConsultarListadoInmueble("");

        for (inmuebles u : listainmueble) {

            System.out.println("idInmueble:  " + u.getIdInmueble()
                    + "   idTipo:  " + u.getIdTipo()
                    + "   idDepartamneto:  " + u.getIdDepartamento()
                    + "   idUsuario:  " + u.getIdUsuario()
                    + "   idEstado:  " + u.getIdEstado()
                    + "   nombre:  " + u.getNombre()
                    + "   direccion:  " + u.getDireccion()
                    + "   capacidad:  " + u.getCapacidad()
                    + "   descripcion:  " + u.getDescripcion()
                    + "   precio:  " + u.getPrecio()
                    + "   adjunto:  " + u.getAdjunto());
        }

        System.out.println("SE ELIMINO ");

        inmuebleDAO.EliminarInmueble(listainmueble.get(1));
        listainmueble = inmuebleDAO.ConsultarListadoInmueble("");

        for (inmuebles u : listainmueble) {
           System.out.println("idInmueble:  " + u.getIdInmueble()
                    + "   idTipo:  " + u.getIdTipo()
                    + "   idDepartamneto:  " + u.getIdDepartamento()
                    + "   idUsuario:  " + u.getIdUsuario()
                    + "   idEstado:  " + u.getIdEstado()
                    + "   nombre:  " + u.getNombre()
                    + "   direccion:  " + u.getDireccion()
                    + "   capacidad:  " + u.getCapacidad()
                    + "   descripcion:  " + u.getDescripcion()
                    + "   precio:  " + u.getPrecio()
                    + "   adjunto:  " + u.getAdjunto());

        }

    }

}
