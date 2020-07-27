/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import controlador.municipiosDAO;
import modelo.municipios;

/**
 *
 * @author 57321
 */
public class pruebaConsultarMunicipio {
    public static void main(String[] args) {

        municipiosDAO municipiosDAO = new municipiosDAO();
        municipios miMunicipio = municipiosDAO.ConsultarMunicipio(1);

        if (miMunicipio != null) {

            System.out.print("Municipio encontrado "
                    + miMunicipio.getIdMunicipio() + " - "
                    + miMunicipio.getIdDepartamento()+ " - "
                    + miMunicipio.getNombre() + "  ");
        } else {
            System.out.println("No se encontro el departamento");
        }

    }
    
    
}
