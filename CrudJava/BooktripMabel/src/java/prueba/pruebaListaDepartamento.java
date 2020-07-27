/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import controlador.departamentosDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.departamento;

/**
 *
 * @author 57321
 */
public class pruebaListaDepartamento {
    
     public static void main (String[] args) throws SQLException{
        
        departamentosDAO departamentosDAO = new departamentosDAO();
        ArrayList<departamento> miDepartamento = new ArrayList<departamento>();
        miDepartamento = departamentosDAO.ConsularListaDepartamento("");
        
        int size = miDepartamento.size();
        System.out.println("<table border=\"1\"><tr><td>idDepartamento</td><td>nombre</td>");
        
        for (departamento D:miDepartamento){
            
            System.out.println("<tr>");
            System.out.println("<td>" + D.getIdDepartamento()+ "</td>");
            System.out.println("<td>" + D.getNombre() + "</td>");
            System.out.println("</tr>");
            
        }
        
        System.out.println("</table>");
    }
    
}
