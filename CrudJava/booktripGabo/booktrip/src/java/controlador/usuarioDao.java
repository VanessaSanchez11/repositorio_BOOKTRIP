package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.usuario;

public class usuarioDao {

    public String adicionarUsuario(usuario user) {
        String Res = "";

        Conexion connect = new Conexion();
        Connection newConexion;
        newConexion = connect.getConn();
        PreparedStatement sentence;

        try {
            String sql = "INSERT INTO usuarios (idTipoDocumento,idRol, nombre, apellido, direccion, telefono, fechaNacimiento, email, password) "
                    + "VALUES(?,?,?,?,?,?,?,?,?);";
            sentence = newConexion.prepareStatement(sql);
            sentence.setInt(1, user.getIdTipoDocumento());
            sentence.setInt(2, user.getIdRol());
            sentence.setString(3, user.getNombre());
            sentence.setString(4, user.getApellido());
            sentence.setString(5, user.getDireccion());
            sentence.setString(6, user.getTelefono());
            sentence.setString(7, user.getFechaNacimiento());
            sentence.setString(8, user.getEmail());
            sentence.setString(9, user.getPassword());
            sentence.execute();

        } catch (Exception e) {

            Res = e.getMessage();
            System.err.println("Ocurrio un problema" + Res);

        }

        return Res;

    }

    public String actualizarUsuario(usuario user) {

        String Res = "";
        Conexion connect = new Conexion();
        Connection newConexion;
        newConexion = connect.getConn();
        PreparedStatement sentence;

        try {
            String sql = "update usuarios set idTipoDocumento = ?, idRol = ?, nombre = ?, apellido = ?, direccion = ?, telefono = ?, fechaNacimiento = ?, email = ?, password = ? where idUsuario =?";
            sentence = newConexion.prepareStatement(sql);
           sentence.setInt(1, user.getIdTipoDocumento());
            sentence.setInt(2, user.getIdRol());
            sentence.setString(3, user.getNombre());
            sentence.setString(4, user.getApellido());
            sentence.setString(5, user.getDireccion());
            sentence.setString(6, user.getTelefono());
            sentence.setString(7, user.getFechaNacimiento());
            sentence.setString(8, user.getEmail());
            sentence.setString(9, user.getPassword());
            sentence.setInt(10, user.getIdUsuario());
            sentence.executeUpdate();
        } catch (Exception ex) {
            
            Res = ex.getMessage();
            System.err.println("ocurrió un problema en estados\n" + Res);

        }
        return Res;

    }
    
    //consultar
    public usuario consultarUsuario(int idUsuario) {

        usuario user = null;

        Conexion connect = new Conexion();
        Connection newConexion;
        newConexion = connect.getConn();

        try {
            Statement sentencia = newConexion.createStatement();

            String sql = "select idUsuario, idTipoDocumento, idRol, nombre, apellido, direccion, telefono, fechaNacimiento, email, password "
                    + " FROM usuarios WHERE idUsuario = " + idUsuario;
            //filas columnas
            ResultSet rs = sentencia.executeQuery(sql);

            while (rs.next()) {
                user = new usuario();
                user.setIdUsuario(rs.getInt(1));
                user.setIdTipoDocumento(rs.getInt(2));
                user.setIdRol(rs.getInt(3));  
                user.setNombre(rs.getString(4));
                user.setApellido(rs.getString(5));
                user.setDireccion(rs.getString(6));
                user.setTelefono(rs.getString(7));
                user.setFechaNacimiento(rs.getString(8));
                user.setEmail(rs.getString(9));
                user.setPassword(rs.getString(10));

            }

            return user;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return user;
        }
    }

    public ArrayList<usuario>ListadoUsuarios(String criterio) {

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
    
    
    
    
    
    
    
    
    
    
    
    

}
