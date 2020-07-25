/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import modelo.departamentos;
import controlador.departamentosDAO;
import java.util.Scanner;

public class pruebaAdicionarDepartamento {
   
 public static void main(String[] args) {
            departamentosDAO depa = new departamentosDAO();
            departamentos departamento = new departamentos();
        
        Scanner leer = new Scanner (System.in);
        
        String nombre="";
        
        System.out.println("Digite el nombre del departamento");
        nombre=leer.next();
        departamento.setNombre(nombre);
       
        String Res = depa.adicionarDepartamento(departamento);
        
        if(Res.length()==0){
            System.out.println("Registrado");
        }else{
            System.out.println("Error"+Res);
        }
        
        
    }
    } 