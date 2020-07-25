
package pruebas;

import controlador.tipoDocumentosDAO;
import java.util.Scanner;
import modelo.tipoDocumentos;


public class pruebaActualizarTipoDocumento {
    
    public static void main(String[] args) {
        tipoDocumentosDAO tipoDocu = new tipoDocumentosDAO();
        tipoDocumentos tipoDocumento = new tipoDocumentos();
        
        
        Scanner leer = new Scanner(System.in);
        
        String nombre = "";
        
        System.out.println("Ingrese la nueva informacion de el tipo de documento");
        nombre = leer.next();
        tipoDocumento.setNombre(nombre);
        tipoDocumento.setIdTipoDocumento(3);
        
        String Res = tipoDocu.actualizarTipoDocumentos(tipoDocumento);
        if (Res.length() == 0) {
            System.out.println("Dato actualizado");
        }else{
            System.out.println("Error");
        }
        
        
    }
            
            
    
    
}
