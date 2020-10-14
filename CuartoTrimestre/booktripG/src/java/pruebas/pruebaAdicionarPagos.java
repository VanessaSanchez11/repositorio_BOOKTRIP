
package pruebas;

import controlador.pagosDAO;
import modelo.pagos;
import java.util.Scanner;

public class pruebaAdicionarPagos {

    
    public static void main(String[] args) {
    pagosDAO pagosDAO=new  pagosDAO();
    pagos mipago =new  pagos(); 
    Scanner leer= new Scanner (System.in);
    
    int usuario;
    int inmueble;
    String adjunto;
    int monto;
    String fechaPago;
    String fechaPago2;
            
            
    System.out.println("ingrese el usuario(un numero)");
    usuario = leer.nextInt();
    mipago.setIdUsuario(usuario);
    
    System.out.println("seleccione el inmueble(un numero)");
    inmueble= leer.nextInt();
    mipago.setIdInmueble(inmueble);
    
    System.out.println("Agrege Adjunto");
    adjunto = leer.next();
    mipago.setAdjunto(adjunto);
    
    System.out.println("ingrese el monto(numero)");
    monto= leer.nextInt();
    mipago.setMonto(monto);
    
    System.out.println("ingrese fecha de pago(");
    fechaPago = leer.next();
    mipago.setFechaPago(fechaPago);
    
    System.out.println("ingrese fecha de pago 2");
    fechaPago2 = leer.next();
    mipago.setFechaPago2(fechaPago2);
    
    String respuesta =pagosDAO.adicionarPago(mipago);
    if(respuesta.length()==0){
        
    System.out.println("información actualizada ");
    }
    else{ 
    System.out.println("error en pagos"+respuesta); }
    }
        
    }
    
