/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.galeriasDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.galeria;

public class pruebaListarGalerias {
    
    public static void main (String[] args) throws SQLException{
        
        galeriasDAO galeriasDAO = new galeriasDAO();
        ArrayList<galeria> miGalerias = new ArrayList<galeria>();
        miGalerias = galeriasDAO.ConsularListaGaleria("");
        
        int size = miGalerias.size();
        System.out.println("<table border=\"1\"><tr><td>idGaleria</td><td>idInmueble</td><td>imagen</td><td>url</td>");
        
        for (galeria D:miGalerias){
            
            System.out.println("<tr>");
            System.out.println("<td>" + D.getIdGaleria()+ "</td>");
            System.out.println("<td>" + D.getIdInmueble() + "</td>");
            System.out.println("<td>" + D.getImagen() + "</td>");
            System.out.println("<td>" + D.getUrl()+ "</td>");
            System.out.println("</tr>");
            
        }
        
        System.out.println("</table>");
    }

    
}
