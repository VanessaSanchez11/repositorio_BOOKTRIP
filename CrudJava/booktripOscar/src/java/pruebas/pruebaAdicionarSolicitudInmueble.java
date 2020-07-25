/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.inmueblesDAO;
import controlador.solicitudinmueblesDAO;
import java.util.Scanner;
import modelo.inmuebles;
import modelo.solicitudinmuebles;

/**
 *
 * @author oscar sanabria
 */
public class pruebaAdicionarSolicitudInmueble {

    public static solicitudinmueblesDAO solicitudinmuebleDAO = new solicitudinmueblesDAO();
    public static solicitudinmuebles misolicitudinmueble = new solicitudinmuebles();
    
    public static Scanner leer = new Scanner(System.in);
    public static int solicitud=0;
    public static int inmueble=0;
    public static int usuario=0;
    public static int estado=0;
    public static String fecha= "";
    
    public static void main(String[] args) {
        
       
        
        System.out.println("ingrese el departamento(un numero)");
        inmueble = leer.nextInt();
        misolicitudinmueble.setIdInmueble(inmueble);
        
        System.out.println("ingrese el usuario(un numero)");
        usuario = leer.nextInt();
        misolicitudinmueble.setIdUsuario(usuario);
        
        System.out.println("ingrese el estado(un numero)");
        estado = leer.nextInt();
        misolicitudinmueble.setIdEstado(estado);
        
        System.out.println("ingrese la fecha(texto)");
        fecha = leer.next();
        misolicitudinmueble.setFecha(fecha);
        
       
        
    
        String respuesta =solicitudinmuebleDAO.adicionarSolicitudInmueble(misolicitudinmueble);
        if(respuesta.length()==0){
            System.out.println("información ingresada ");
        }else{
        System.out.println("error"+respuesta);
    }
                    
    }
    
    
    
}
