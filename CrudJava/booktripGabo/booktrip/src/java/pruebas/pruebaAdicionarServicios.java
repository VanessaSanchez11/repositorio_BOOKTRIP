package pruebas;

import controlador.serviciosDAO;
import modelo.servicios;
import java.util.Scanner;


public class pruebaAdicionarServicios {

    public static void main(String[] args, int servicio) {
      
    serviciosDAO serviciosDAO=new  serviciosDAO();
    servicios miservicio =new  servicios(); 
    Scanner leer= new Scanner (System.in);
    
    int idServicio = 0;
    String nombre;
    String descripcion;
    
    System.out.println("ingrese el servicio(numero)");
    servicio = leer.nextInt();
    miservicio.setIdServicio(idServicio);
    
    System.out.println("ingrese nombre(texto)");
    nombre = leer.next();
    miservicio.setNombre(nombre); 
    
    System.out.println("ingrese la fecha(texto)");
    descripcion= leer.next();
    miservicio.setDescripcion(descripcion);
    
    String respuesta =serviciosDAO.adicionarServicios(miservicio);
    if(respuesta.length()==0){
        
    System.out.println("información actualizada ");
    }
    else{ 
    System.out.println("error en servicio"+respuesta); }
    }
    
      
}
