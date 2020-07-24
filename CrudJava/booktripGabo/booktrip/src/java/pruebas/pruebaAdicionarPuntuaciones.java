package pruebas;

import controlador.puntuacionesDAO;
import modelo.puntuaciones;
import java.util.Scanner;


public class pruebaAdicionarPuntuaciones {
    
    public static void main(String[] args) {
        
    puntuacionesDAO puntuacionesDAO=new  puntuacionesDAO();
    puntuaciones mipuntuacion =new  puntuaciones(); 
    Scanner leer= new Scanner (System.in);
    
    int usuario;
    int inmueble;
    String fechacreada;
    String descripcion;
    String calificacion;
            
            
    System.out.println("ingrese el usuario(un numero)");
    usuario = leer.nextInt();
    mipuntuacion.setIdUsuario(usuario);
    
    System.out.println("seleccione el inmueble(un numero)");
    inmueble= leer.nextInt();
    mipuntuacion.setIdInmueble(inmueble); 
    
    System.out.println("ingrese la fecha(texto)");
    fechacreada= leer.next();
    mipuntuacion.setFechaCreada(fechacreada);
    
    System.out.println("ingrese la descripcion (texto)");
    descripcion = leer.next();
    mipuntuacion.setDescripcion(descripcion);
    
    System.out.println("");
    calificacion = leer.next();
    mipuntuacion.setCalificacion(calificacion);
    
    String respuesta =puntuacionesDAO.adicionarPuntuacion(mipuntuacion);
    if(respuesta.length()==0){
        
    System.out.println("información actualizada ");
    }
    else{ 
    System.out.println("error en puntuaciones"+respuesta); }
    }
    
    
}
