/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;


import modelo.tipoDocumentos;
import controlador.tipoDocumentosDAO;

public class pruebaConsultaTipoDocumento {
    
    public static void main(String[] args) {
        
        tipoDocumentosDAO tipoDocu  = new tipoDocumentosDAO();
        tipoDocumentos  tipo = tipoDocu.consultarTipoDocumento(5);
        
        if(tipo != null){
            System.out.println("Encontrado el tipo de documento " + tipo.getIdTipoDocumento() + " - "
                    + tipo.getNombre());
            
        }else{
            System.out.println("El tipo de documento no se encontro");
        }
        
        
    }
    
    
    
}
