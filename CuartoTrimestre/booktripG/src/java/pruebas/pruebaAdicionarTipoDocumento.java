/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.tipoDocumentosDAO;
import java.util.Scanner;
import modelo.tipoDocumentos;



public class pruebaAdicionarTipoDocumento {
    
    public static void main(String[] args) {
        tipoDocumentosDAO tipoDocu = new tipoDocumentosDAO();
        tipoDocumentos tipoDocumento = new tipoDocumentos();
        
        Scanner leer = new Scanner (System.in);
        
        String nombre="";
        
        System.out.println("Digite el nombre del tipo de documento");
        nombre=leer.next();
        tipoDocumento.setNombre(nombre);
       
        String Res = tipoDocu.adicionarTipoDocumentos(tipoDocumento);
        
        if(Res.length()==0){
            System.out.println("Registrado");
        }else{
            System.out.println("Error"+Res);
        }
        
        
    }
    
}
