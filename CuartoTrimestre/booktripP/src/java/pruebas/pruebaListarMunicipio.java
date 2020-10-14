/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.municipiosDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.municipios;


public class pruebaListarMunicipio {
    
    public static void main (String[] args) throws SQLException{
        
        municipiosDAO municipiosDAO = new municipiosDAO();
        ArrayList<municipios> miMunicipio = new ArrayList<municipios>();
        miMunicipio = municipiosDAO.ConsularListaMunicipio("");
        
        int size = miMunicipio.size();
        System.out.println("<table border=\"1\"><tr><td>idMunicipio</td><td>idDepartamento</td><td>nombre</td>");
        
        for (municipios D:miMunicipio){
            
            System.out.println("<tr>");
            System.out.println("<td>" + D.getIdDepartamento() + "</td>");
            System.out.println("<td>" + D.getIdDepartamento()+ "</td>");
            System.out.println("<td>" + D.getNombre() + "</td>");
            System.out.println("</tr>");
            
        }
        
        System.out.println("</table>");
    }
    

    
    
}
