package pruebas;

import controlador.inmueblesDAO;
import modelo.inmuebles;
import java.util.Scanner;

public class pruebaActualizarInmueble {

    public static inmueblesDAO inmueblesDAO = new inmueblesDAO();
    public static inmuebles miinmueble = new inmuebles();

    public static Scanner leer = new Scanner(System.in);
    public static int tipo = 0;
    public static int departamento = 0;
    public static int usuario = 0;
    public static int estado = 0;
    public static String nombre = "";
    public static String direccion = "";
    public static int capacidad = 0;
    public static String descripcion = "";
    public static int precio = 0;

    public static void main(String[] args) {

        System.out.println("ingrese el tipo de finca(un numero)");
        tipo = leer.nextInt();
        miinmueble.setIdTipo(tipo);

        System.out.println("ingrese el departamento(un numero)");
        departamento = leer.nextInt();
        miinmueble.setIdDepartamento(departamento);

        System.out.println("ingrese el usuario(un numero)");
        usuario = leer.nextInt();
        miinmueble.setIdUsuario(usuario);

        System.out.println("ingrese el estado(un numero)");
        estado = leer.nextInt();
        miinmueble.setIdEstado(estado);

        System.out.println("ingrese el nombre(texto)");
        nombre = leer.next();
        miinmueble.setNombre(nombre);

        System.out.println("ingrese el direcion(texto)");
        direccion = leer.next();
        miinmueble.setDireccion(direccion);

        System.out.println("ingrese la capacidad(texto)");
        capacidad = leer.nextInt();
        miinmueble.setCapacidad(capacidad);

        System.out.println("ingrese la descripcion(texto)");
        descripcion = leer.next();
        miinmueble.setDescripcion(descripcion);

        System.out.println("ingrese el precio (un numero)");
        precio = leer.nextInt();
        miinmueble.setPrecio(precio);

        miinmueble.setIdInmueble(11);

        String res = inmueblesDAO.actualizarInmueble(miinmueble);

        if (res.length() == 0) {
            System.out.println("informacion actualizada");
        } else {
            System.out.println("error" + res);
        }

    }

}
