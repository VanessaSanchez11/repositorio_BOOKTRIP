/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;


import controlador.actividadesDAO;
import controlador.departamentosDAO;
import modelo.actividades;

public class pruebaConsultarActividad {
    
    
    public static void main(String[] args) {

        actividadesDAO actividadesDAO = new actividadesDAO();
        actividades miActividad = actividadesDAO.ConsultarActividad("");

        if (miActividad != null) {

            System.out.print("Actividad encontrado  " + miActividad.getIdMunicipio()  + "   " + miActividad.getNombre()  +"   " + miActividad.getDescripcion());
        } else {
            System.out.println("No se encontro la actividad");
        }

    }

    
}

    
    
    
 
