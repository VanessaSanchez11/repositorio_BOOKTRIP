/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import controlador.galeriasDAO;
import java.util.ArrayList;
import modelo.galeria;


public class pruebaEliminarGalerias {

    public static void main(String[] args) {

        galeriasDAO galeriasDAO = new galeriasDAO();
        ArrayList<galeria> ListaGaleria = galeriasDAO.ConsularListaGaleria("");

        for (galeria G : ListaGaleria) {
            
            System.out.println("IdGaleria:       " + G.getIdGaleria() + "     "
                    + "IdInmueble:" + G.getIdInmueble() + "     "
                    + "url" + G.getUrl());
        }

        System.out.println("se elimino");

        galeriasDAO.EliminarGaleria(ListaGaleria.get(3));
        ListaGaleria = galeriasDAO.ConsularListaGaleria("");

        for (galeria G : ListaGaleria) {
            
            System.out.println("IdGaleria:        " + G.getIdGaleria() + "     "
                    + "IdInmueble:       " + G.getIdInmueble() + "     "
                    + "url" + G.getUrl());
        }

    }
}
