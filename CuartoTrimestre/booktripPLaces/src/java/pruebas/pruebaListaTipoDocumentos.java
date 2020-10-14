/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;


import modelo.tipoDocumentos;
import controlador.tipoDocumentosDAO;
import java.util.ArrayList;

public class pruebaListaTipoDocumentos {
    
    public static void main(String[] args) {
        
        tipoDocumentosDAO tipoDocuC = new tipoDocumentosDAO();
        
        ArrayList<tipoDocumentos> miTipoDocu = new ArrayList<tipoDocumentos>();
        
        miTipoDocu = tipoDocuC.ConsultarListadoTiposDocumento("");
        
        int size = miTipoDocu.size();
        
        System.out.println("<table border= \"1\"><tr><td>IdTipoDocumento</td><td>Nombre</td>");
        
        for(tipoDocumentos t : miTipoDocu ){
            System.out.println("<tr>");
            System.out.println("<td>" + t.getIdTipoDocumento() + "</td>");
            System.out.println("<td>" + t.getNombre() + "</td>");
            System.out.println("</tr>");
        }
        
        System.out.println("</table>");
         
    }
 
}
