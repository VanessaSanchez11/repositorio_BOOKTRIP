/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.tipoDocumentosDAO;
import modelo.tipoDocumentos;
import java.util.ArrayList;

public class pruebaEliminarTipoDocumento {

    public static void main(String[] args) {
        tipoDocumentosDAO tipoDocu = new tipoDocumentosDAO();
        tipoDocumentos tipo = tipoDocu.consultarTipoDocumento(4);

        if (tipo != null) {
            System.out.println("Encontrado el tipo de documento " + tipo.getIdTipoDocumento() + " - " + tipo.getNombre());

        } else {
            System.out.println("El tipo de documento no se encontro");
        }

        
        ArrayList<tipoDocumentos> listaTipoDocumento = tipoDocu.ConsultarListadoTiposDocumento("");
        
        for(tipoDocumentos T : listaTipoDocumento){
            System.out.println("ID: " + T.getIdTipoDocumento() + "Nombre: " + T.getNombre());
            
        }
        
        System.out.println("SE ELIMINO ");
        
        tipoDocu.EliminarTipoDocumento(listaTipoDocumento.get(3));
        listaTipoDocumento = tipoDocu.ConsultarListadoTiposDocumento("");
        
        for(tipoDocumentos T : listaTipoDocumento){
            System.out.println("ID: " + T.getIdTipoDocumento() + "Nombre: " + T.getNombre());
            
        }
        
    }

}
