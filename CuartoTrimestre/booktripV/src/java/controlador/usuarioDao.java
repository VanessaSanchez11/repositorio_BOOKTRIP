/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
            System.err.println("Ha ocurrido un problema al intentar la inserción " + Res);

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
            String sql = "update usuarios set idUsuario = ?, idTipoDocumento = ?, idRol = ?, nombre = ?, apellido = ?, direccion = ?, telefono = ?, fechaNacimiento = ?, email = ?, password = ? WHERE idUsuario =?";
            sentence = newConexion.prepareStatement(sql);
            sentence.setInt(1, user.getIdUsuario());
            sentence.setInt(2, user.getIdTipoDocumento());
            sentence.setInt(3, user.getIdRol());
            sentence.setString(4, user.getNombre());
            sentence.setString(5, user.getApellido());
            sentence.setString(6, user.getDireccion());
            sentence.setString(7, user.getTelefono());
            sentence.setString(8, user.getFechaNacimiento());
            sentence.setString(9, user.getEmail());
            sentence.setString(10, user.getPassword());
            sentence.setInt(11, user.getIdUsuario());
          
            sentence.executeUpdate();
        } catch (Exception ex) {
            
            Res = ex.getMessage();
            System.err.println("ocurrió un problema en actualizar dao\n" + Res);

        }
        return Res;

    }
    
    //consultar
    public usuario consultarUsuario(String email) {

        usuario user = null;

        Conexion connect = new Conexion();
        Connection newConexion;
        newConexion = connect.getConn();

        try {
            Statement sentencia = newConexion.createStatement();

            String sql = "select idUsuario, idTipoDocumento, idRol, nombre, apellido, direccion, telefono, fechaNacimiento, email, password" 
                    + " FROM usuarios WHERE email = '" + email + "'";
            
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

    
     public usuario consultarUsuarioId(int idUsuario) {

        usuario user = null;

        Conexion connect = new Conexion();
        Connection newConexion;
        newConexion = connect.getConn();

        try {
            Statement sentencia = newConexion.createStatement();

            String sql = "select idUsuario, idTipoDocumento, idRol, nombre, apellido, direccion, telefono, fechaNacimiento, email, password FROM usuarios WHERE idUsuario = " + idUsuario;
            
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
    
    
    
    
    
    public ArrayList<usuario>ListadoUsuarios( String email, String nombre, String apellido) {

        ArrayList<usuario> listadoUsuarios = new ArrayList<usuario>();
        usuario user;

        Conexion connect = new Conexion();
        Connection newConexion;
        newConexion = connect.getConn();

        try {
            Statement sentencia = newConexion.createStatement();

            String sql = " SELECT idUsuario, idTipoDocumento, idRol, nombre, apellido, direccion, telefono, fechaNacimiento, email, password " 
                    + "FROM usuarios "
                    + "where "
                    + "email like '%" + email + "%'"
                    + "or (nombre) like ('%" + nombre + "%')"
                    + "or (apellido) like ('%" + apellido + "%')"
                    + " ORDER BY idUsuario;";

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
                 listadoUsuarios.add(user);

            }

            return listadoUsuarios;

        } catch (Exception e) {
            System.out.println("Erro en el listado " + e.getMessage());
            return listadoUsuarios;

        }

    }
    
    
     public String EliminarUsuario(usuario user){
        
        String res;
        Conexion connect = new Conexion();
        Connection newConexion;
        newConexion = connect.getConn();
        
         PreparedStatement sentence;
         
         try {
            String sql  = "DELETE FROM usuarios WHERE idUsuario=? AND idTipoDocumento=? AND idRol=?  AND nombre=? AND apellido =? AND direccion=? AND telefono=? AND fechaNacimiento=? AND email=? AND password = ?;";
           
            sentence = newConexion.prepareStatement(sql);
            
            sentence.setInt(1, user.getIdUsuario());
            sentence.setInt(2, user.getIdTipoDocumento());
            sentence.setInt(3, user.getIdRol());
            sentence.setString(4, user.getNombre());
            sentence.setString(5, user.getApellido());
            sentence.setString(6, user.getDireccion());
            sentence.setString(7, user.getTelefono());
            sentence.setString(8, user.getFechaNacimiento());
            sentence.setString(9, user.getEmail());
            sentence.setString(10, user.getPassword());
            
            
            sentence.execute();
            res= "";
            
        } catch (Exception e) {
            
            res = e.getMessage();
            System.out.println("Ocurrio un error en el eliminar usuario " + e.getMessage());
        }
             
        return res;
    
    }
       
     
     
     
     
    
     
     
}
