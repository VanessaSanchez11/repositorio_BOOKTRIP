/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import controlador.departamentosDAO;
import java.util.ArrayList;
import modelo.departamento;

/**
 *
 * @author 57321
 */
public class pruebaEliminarDepartamento {

    public static void main(String[] args) {
        /*departamentosDAO departamentosDAO = new departamentosDAO();
        departamento miDepartamento = departamentosDAO.ConsultarDepartamento(2);

        if (miDepartamento != null) {
            System.out.println("descripcion : " + miDepartamento.getNombre());
        } else {
            System.out.println("no existe");
        }*/

        

    departamentosDAO departamentoDAO = new departamentosDAO();
    ArrayList<departamento> ListaDepartamentos = departamentoDAO.ConsularListaDepartamento("");

    for (departamento T :ListaDepartamentos) {
     System.out.println("Nombre:" + T.getNombre() + "Id:" + T.getIdDepartamento());
    }

    System.out.println("se elimino");
   
    departamentoDAO.EliminarDepartamento(ListaDepartamentos.get(6));
    ListaDepartamentos  = departamentoDAO.ConsularListaDepartamento("");

    
    for (departamento T :ListaDepartamentos) {
     System.out.println("Nombre:" + T.getNombre() + "Id:" + T.getIdDepartamento());
    }

    
  
    }


}
    
