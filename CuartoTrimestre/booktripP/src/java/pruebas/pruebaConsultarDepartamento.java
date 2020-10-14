/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.departamentosDAO;
import modelo.departamento;



/**
 *
 * @author 57321
 */
public class pruebaConsultarDepartamento {
    
    public static void main(String[] args) {

        departamentosDAO departamentosDAO = new departamentosDAO();
        departamento midepartamento = departamentosDAO.ConsultarDepartamento("");

        if (midepartamento != null) {

            System.out.print("Departamento encontrado   " + midepartamento.getIdDepartamento()+ "  "  + midepartamento.getNombre());
        } else {
            System.out.println("No se encontro el departamento");
        }

    }

    
    
    
}
