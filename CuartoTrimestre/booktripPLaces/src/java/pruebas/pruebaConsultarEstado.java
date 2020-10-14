/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.estadosDAO;
import modelo.estados;

/**
 *
 * @author oscar sanabria
 */
public class pruebaConsultarEstado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        estadosDAO miestadoDAO = new estadosDAO();
      
        estados miestado = miestadoDAO.consultarEstados(5);
        
       if (miestado != null) {
            System.out.println("Encontrado el usuario "
                    + miestado.getIdEstado()+ " - "
                    + miestado.getNombre()+ " - "
                    );

        } else {
            System.out.println("El usuario no se encontro");
        }

    }

    
}
