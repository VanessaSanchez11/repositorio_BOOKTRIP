package pruebas;

import controlador.serviciosDAO;
import modelo.servicios;
import java.util.Scanner;


public class pruebaActualizarServicios {

    public static void main(String[] args) {
    serviciosDAO serviciosDAO=new  serviciosDAO();
    servicios miservicio =new  servicios(); 
    Scanner leer= new Scanner (System.in);
    
    int idServicio;
    String nombre;
    String descripcion;
    
        System.out.println("ingrese servicio(texto)");
        idServicio=leer.nextInt();
        miservicio.setIdServicio(idServicio);
        
        System.out.println("Ingrese nombre(text)");
        nombre=leer.next();
        miservicio.setNombre(nombre);
        
        System.out.println("ingrese descripcion(texto)");
        descripcion=leer.next();
        miservicio.setDescripcion(nombre);
        
        miservicio.setIdServicio(4);
        String respuesta = serviciosDAO.actualizarServicio(miservicio);
        if(respuesta.length()==0){
            System.out.println("información actualizada ");
        } else {
        System.out.println("error en servicio"+respuesta);
    }
        
    }
    
}
