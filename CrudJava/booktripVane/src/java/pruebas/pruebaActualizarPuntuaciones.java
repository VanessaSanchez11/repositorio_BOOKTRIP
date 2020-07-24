
package pruebas;

import controlador.puntuacionesDAO;
import modelo.puntuaciones;
import java.util.Scanner;


public class pruebaActualizarPuntuaciones {

    public static void main(String[] args) {
    puntuacionesDAO puntuacionesDAO=new  puntuacionesDAO();
    puntuaciones mipuntuacion =new  puntuaciones(); 
    Scanner leer= new Scanner (System.in);
    
    int usuario;
    int inmueble;
    String fechacreada;
    String descripcion;
    String calificacion;
     
   
        System.out.println("ingrese codigo usuario(numero)");
        usuario=leer.nextInt();
        mipuntuacion.setIdUsuario(usuario);
        
        System.out.println("Ingrese codigo inmueble (numero)");
        inmueble=leer.nextInt();
        mipuntuacion.setIdInmueble(inmueble);
        
        System.out.println("por favor ingrese la fecha");
        fechacreada=leer.next();
        mipuntuacion.setFechaCreada(fechacreada);
        
        System.out.println("por favor ingrese la nueva informacion");
        descripcion=leer.next();
        mipuntuacion.setDescripcion(descripcion);
        
        System.out.println("por favor ingrese la nueva informacion");
        calificacion=leer.next();
        mipuntuacion.setCalificacion(calificacion);
       
        mipuntuacion.setIdPuntuacion(2);
        String respuesta = puntuacionesDAO.actualizarPuntuacion(mipuntuacion);
        if(respuesta.length()==0){
            System.out.println("información actualizada ");
        }else{
        System.out.println("error en puntuaciones"+respuesta);
    }
   
    }
        
    }
    
