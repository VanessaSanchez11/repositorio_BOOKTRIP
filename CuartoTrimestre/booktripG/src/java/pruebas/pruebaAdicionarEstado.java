/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.estadosDAO;
import java.util.Scanner;
import modelo.estados;

/**
 *
 * @author vanessa
 */
public class pruebaAdicionarEstado {
    
     public static void main(String[] args) {
    estadosDAO estadosDAO=new  estadosDAO();
    estados miestado =new  estados();
    
    Scanner leer= new Scanner (System.in);
    
    String nombre="";
    
        System.out.println("por favor digite el nombre del estado");
        nombre=leer.next();
        miestado.setNombre(nombre);
        
      
       String respuesta = estadosDAO.adicionarEstado(miestado);
        if(respuesta.length()==0){
            System.out.println("registrado");
        }else{
        System.out.println("error"+respuesta);
    }
    }
}
