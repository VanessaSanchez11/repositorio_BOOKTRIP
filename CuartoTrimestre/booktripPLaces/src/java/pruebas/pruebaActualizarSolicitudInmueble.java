/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

import controlador.solicitudinmueblesDAO;
import java.util.Scanner;
import modelo.solicitudinmuebles;

/**
 *
 * @author oscar sanabria
 */
public class pruebaActualizarSolicitudInmueble {

    public static solicitudinmueblesDAO solicitudinmuebleDAO = new solicitudinmueblesDAO();
    public static solicitudinmuebles misolicitud = new solicitudinmuebles();

    public static Scanner leer = new Scanner(System.in);
    public static int inmueble = 0;
    public static int usuario = 0;
    public static int estado = 0;
    public static String fecha= "";
    
    public static void main(String[] args) {

        System.out.println("ingrese el inmueble(un numero)");
        inmueble = leer.nextInt();
        misolicitud.setIdInmueble(inmueble);

       

        System.out.println("ingrese el usuario(un numero)");
        usuario = leer.nextInt();
        misolicitud.setIdUsuario(usuario);

        System.out.println("ingrese el estado(un numero)");
        estado = leer.nextInt();
        misolicitud.setIdEstado(estado);

        System.out.println("ingrese fecha(texto)");
        fecha = leer.next();
        misolicitud.setFecha(fecha);

        
        misolicitud.setIdSolicitud(1);

        String res = solicitudinmuebleDAO.actualizarSolicitudInmueble(misolicitud);

        if (res.length() == 0) {
            System.out.println("informacion actualizada");
        } else {
            System.out.println("error" + res);
        }

    }

}
