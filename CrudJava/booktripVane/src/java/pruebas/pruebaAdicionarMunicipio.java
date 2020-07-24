/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;


import controlador.municipiosDAO;
import modelo.municipios;
import java.util.Scanner;


public class pruebaAdicionarMunicipio {
    
    public static municipiosDAO municipiosDAO=new  municipiosDAO();
   public static municipios mimunicipio =new  municipios();
    
    public static Scanner leer= new Scanner (System.in);
    public static int departamento=0; 
    public static String nombre="";
    
    
    public static void main(String[] args) {
    
    
        System.out.println("por favor digite el departamento (numero) ");
        departamento=leer.nextInt();
        mimunicipio.setIdDepartamento(departamento);
        
        System.out.println("ingrese nombre del municipio");
        nombre= leer.next();     
        mimunicipio.setNombre(nombre);
        
      
       String respuesta = municipiosDAO.adicionarMunicipios(mimunicipio);
        if(respuesta.length()==0){
            System.out.println("registrado");
        }else{
        System.err.println("error"+respuesta);
    }   
    
    }  
}
