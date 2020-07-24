/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;


import controlador.municipiosDAO;
import modelo.municipios;
import java.util.Scanner;


public class pruebaActualizarMunicipios {
    
    public static void main(String[] args) {
        municipiosDAO municipiosDAO = new municipiosDAO();
        municipios mimunicipios = new municipios();
        
        Scanner leer = new Scanner(System.in);
        
        int departamento;
        String nombre = "";
        
        System.out.println("por favor ingrese el id del departamento");
        departamento = leer.nextInt();
        mimunicipios.setIdDepartamento(departamento);
        
        System.out.println("por favor ingrese el nombre del municipo");
        nombre = leer.next();
        mimunicipios.setNombre(nombre);
        
        mimunicipios.setIdMunicipio(1);
        
        String respuesta = municipiosDAO.actualizarMunicipio(mimunicipios);
        
        if (respuesta.length() == 0) {
            System.out.println("información actualizada ");
        } else {
            System.out.println("error" + respuesta);
            
        }
        
    }
}
