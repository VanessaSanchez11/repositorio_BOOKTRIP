package pruebas;

import controlador.Conexion;
import controlador.usuarioDao;
import java.awt.BorderLayout;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;
import modelo.usuario;

public class appAlojamiento {

    public static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        appAlojamiento miApp = new appAlojamiento();
        miApp.menuPrincipal();

    }

    public void menuPrincipal() {
        int opcion = 0;
        while (opcion != 10) {
            System.out.println(" S E R V I C I O S   D E   A L O J A M I E N T O");
            System.out.println(" 1. Listar usuarios");
            System.out.println(" 2. Consultar un usuario");
            System.out.println(" 3. Agregar usuario");
            System.out.println(" 4. Actualizar usuario");
            System.out.println(" 5. Eliminar usuario");
            System.out.println("10. SALIR");
            System.out.println("Elija la opción deseada ?");
            opcion = entrada.nextInt();
            switch (opcion) {
                case 1:
                    listarUsuarios();
                    break;
                case 2:
                    consultarUsuario();
                    break;
                case 3:
                    agregarUsuario();
                    break;
                case 10:
                    darDespedida();
                    break;
            }
        }
    }

    public void listarUsuarios() {
        ArrayList<usuario> listadoUsuario = null;

        listadoUsuario = ListadoUsuarios();
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        System.out.println("id\tnombre\t\tapellido\tdireccion\ttelefono\tfechaNacimiento\temail");
        System.out.println("--------------------------------------------------------------------------------------------------------------------");
        for (usuario u : listadoUsuario) {
            System.out.printf("%4d\t%-15s\t%-15s\t%-15s\t%-10s\t%-12s\t%s\n", u.getIdUsuario(), u.getNombre(), u.getApellido(), u.getDireccion(), u.getTelefono(), u.getFechaNacimiento(), u.getEmail());
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("Total registros procesados : " + listadoUsuario.size());
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
    
    }

    public void consultarUsuario() {
        ArrayList<usuario> listadoUsuario = null;
        System.out.println("Ingrese el nombre del usuario a consultar");
        String criterio = entrada.next();

        listadoUsuario = ListadoUsuarios(criterio);
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("id\tnombre\t\tapellido\tdireccion\ttelefono\tfechaNacimiento\temail");
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        for (usuario u : listadoUsuario) {
            System.out.printf("%4d\t%-15s\t%-15s\t%-15s\t%-10s\t%-12s\t%s\n", u.getIdUsuario(), u.getNombre(), u.getApellido(), u.getDireccion(), u.getTelefono(), u.getFechaNacimiento(), u.getEmail());
        }
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
        System.out.println("Total registros procesados : " + listadoUsuario.size());
        System.out.println("-------------------------------------------------------------------------------------------------------------------");
    }

    public void agregarUsuario() {
        usuario user = new usuario();
        usuarioDao userC = new usuarioDao();

        int IdtipoDocumento;
        int idRol;
        String nombre;
        String apellido;
        String direccion;
        String telefono;
        String fechaNacimiento;
        String email;
        String password;

        System.out.println("Por favor digite el numero del tipo de documento");
        IdtipoDocumento = entrada.nextInt();
        user.setIdTipoDocumento(IdtipoDocumento);

        System.out.println("Por favor digite el numero del tipo de rol");
        idRol = entrada.nextInt();
        user.setIdRol(idRol);

        System.out.println("Por favor digite su nombre");
        nombre = entrada.next();
        user.setNombre(nombre);

        System.out.println("Por favor digite sus apellidos");
        apellido = entrada.next();
        user.setApellido(apellido);

        System.out.println("Por favor digite su direccion");
        direccion = entrada.next();
        user.setDireccion(direccion);

        System.out.println("Por favor digite su telefono");
        telefono = entrada.next();
        user.setTelefono(telefono);

        System.out.println("Por favor digite su fecha de nacimiento");
        fechaNacimiento = entrada.next();
        user.setFechaNacimiento(fechaNacimiento);

        System.out.println("Por favor digite su email");
        email = entrada.next();
        user.setEmail(email);

        System.out.println("Por favor digite su contraseña");
        password = entrada.next();
        user.setPassword(password);

        String Res = userC.adicionarUsuario(user);

        if (Res.length() == 0) {
            System.out.println("registrado");
        } else {
            System.out.println("Error");

        }

    }

    public ArrayList<usuario> ListadoUsuarios() {

        ArrayList<usuario> listadoUsuarios = new ArrayList<usuario>();
        usuario user;

        Conexion connect = new Conexion();
        Connection newConexion;
        newConexion = connect.getConn();

        try {
            Statement sentencia = newConexion.createStatement();

            /*String sql = " SELECT idUsuario, nombre, apellido, direccion, telefono, fechaNacimiento, email " 
                    + "FROM usuarios where nombre like '%" + criterio + "%' ORDER BY idUsuario;";*/
            String sql = " SELECT idUsuario, nombre, apellido, direccion, telefono, fechaNacimiento, email "
                    + "FROM usuarios ORDER BY idUsuario;";

            ResultSet rs = sentencia.executeQuery(sql);
            

            while (rs.next()) {
                user = new usuario();
                user.setIdUsuario(rs.getInt(1));
                user.setNombre(rs.getString(2));
                user.setApellido(rs.getString(3));
                user.setDireccion(rs.getString(4));
                user.setTelefono(rs.getString(5));
                user.setFechaNacimiento(rs.getString(6));
                user.setEmail(rs.getString(7));
                listadoUsuarios.add(user);

            }
            connect.CerrarConexion();
            return listadoUsuarios;

        } catch (Exception e) {
            System.out.println("Erro en el listado " + e.getMessage());
            return listadoUsuarios;
        }

    }

    public ArrayList<usuario> ListadoUsuarios(String criterio) {

        ArrayList<usuario> listadoUsuarios = new ArrayList<usuario>();
        usuario user;

        Conexion connect = new Conexion();
        Connection newConexion;
        newConexion = connect.getConn();

        try {
            Statement sentencia = newConexion.createStatement();

            String sql = " SELECT idUsuario, nombre, apellido, direccion, telefono, fechaNacimiento, email "
                    + "FROM usuarios where nombre like '%" + criterio + "%' ORDER BY idUsuario;";

            ResultSet rs = sentencia.executeQuery(sql);

            while (rs.next()) {
                user = new usuario();
                user.setIdUsuario(rs.getInt(1));
                user.setNombre(rs.getString(2));
                user.setApellido(rs.getString(3));
                user.setDireccion(rs.getString(4));
                user.setTelefono(rs.getString(5));
                user.setFechaNacimiento(rs.getString(6));
                user.setEmail(rs.getString(7));
                listadoUsuarios.add(user);

            }

            return listadoUsuarios;

        } catch (Exception e) {
            System.out.println("Erro en el listado " + e.getMessage());
            return listadoUsuarios;

        }

    }

    public void darDespedida() {
        System.out.println("Gracias por usar nuestros servicios");
        System.exit(0);
    }

}
