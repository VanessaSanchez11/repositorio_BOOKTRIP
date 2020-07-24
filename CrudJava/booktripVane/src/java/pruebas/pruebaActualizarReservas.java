package pruebas;

import controlador.reservasDAO;
import modelo.reservas;
import java.util.Scanner;

public class pruebaActualizarReservas {

    
    public static void main(String[] args) {
    reservasDAO reservasDAO=new  reservasDAO();
    reservas mireserva =new  reservas(); 
    Scanner leer= new Scanner (System.in);
    
    int idUsuario;
    int idInmueble;
    int idEstado;
    String fechaReserva;
    String checkIn;
    String checkOut;
    
     System.out.println("ingrese el usuario(un numero)");
    idUsuario = leer.nextInt();
    mireserva.setIdUsuario(idUsuario);
    
    System.out.println("seleccione el inmueble(un numero)");
    idInmueble= leer.nextInt();
    mireserva.setIdInmueble(idInmueble);
    
    System.out.println("ingrese codigo estado(numero)");
    idEstado = leer.nextInt();
    mireserva.setIdEstado(idEstado);
    
    System.out.println("ingrese fecha de la reserva(numero)");
    fechaReserva= leer.next();
    mireserva.setFechaReserva(fechaReserva);
    
    System.out.println("ingrese fecha checkIn(");
    checkIn = leer.next();
    mireserva.setCheckIn(checkIn);
    
    System.out.println("ingrese fecha checkOut");
    checkOut = leer.next();
    mireserva.setCheckOut(checkOut);
    
    mireserva.setIdReserva(17);
    String respuesta = reservasDAO.actualizarReservas(mireserva);
    if(respuesta.length()==0){
    System.out.println("información actualizada ");
    }else{
    System.out.println("error"+respuesta);
        }
        
    }
    
}
