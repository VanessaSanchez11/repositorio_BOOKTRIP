/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import controlador.galeriasDAO;
import modelo.galeria;

public class pruebaConsultarGaleria {

    public static void main(String[] args) {

        galeriasDAO galeriasDAO = new galeriasDAO();
        galeria migaleria = galeriasDAO.ConsultarGalerias(1);

        if (migaleria != null) {

            System.out.print("encontrada la imagen" + migaleria.getIdGaleria() + migaleria.getIdInmueble() + " - " + migaleria.getImagen() + "-" + " - " + migaleria.getUrl());
        } else {
            System.out.println("No se encontro");
        }

    }

}
