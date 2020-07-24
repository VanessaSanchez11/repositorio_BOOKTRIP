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
import modelo.rol;


public class rolDAO {

    public String adicionarRol(rol rol) {

        String Res = "";
        Conexion connect = new Conexion();
        Connection newConexion;
        newConexion = connect.getConn();
        PreparedStatement sentence;

        try {
            String sql = "INSERT INTO roles(nombre)" + "VALUES(?);";
            sentence = newConexion.prepareStatement(sql);
            sentence.setString(1, rol.getNombre());
            sentence.execute();
        } catch (Exception e) {
            Res = "";
            Res = e.getMessage();
            System.err.println("Ocurrio un problema" + Res);
        }
        return Res;
    }

    public String actualizarRol(rol rol) {
        String Res = "";
        Conexion connect = new Conexion();
        Connection newConexion;
        newConexion = connect.getConn();

        PreparedStatement sentence;
        try {
            String sql = "UPDATE roles SET nombre=? WHERE idRol = ?";
            sentence = newConexion.prepareStatement(sql);
            sentence.setString(1, rol.getNombre());
            sentence.setInt(2, rol.getIdRol());
            sentence.executeUpdate();

        } catch (Exception e) {

            Res = e.getMessage();
            System.err.println("Ocurrio un problema " + Res);

        }
        return Res;
    }
    
    
     //consultar
    public rol consultarRol(int idRol) {

        rol rol = null;

        Conexion connect = new Conexion();
        Connection newConexion;
        newConexion = connect.getConn();

        try {
            Statement sentencia = newConexion.createStatement();

            String sql = "select idRol, nombre FROM roles WHERE idRol = " + idRol;
            //filas columnas
            ResultSet rs = sentencia.executeQuery(sql);

            while (rs.next()) {
                rol = new rol();
                rol.setIdRol(rs.getInt(1));
                rol.setNombre(rs.getString(2));

            }

            return rol;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return rol;
        }
    }

    public ArrayList<rol> ConsultarListadoRol(String criterio) {

        ArrayList<rol> listadoRol = new ArrayList<rol>();
        rol rol;

        Conexion connect = new Conexion();
        Connection newConexion;
        newConexion = connect.getConn();

        try {
            Statement sentencia = newConexion.createStatement();

            String sql = " SELECT idRol, nombre " + "  FROM roles where nombre like '%" + criterio + "%' ORDER BY idRol;";

            ResultSet rs = sentencia.executeQuery(sql);

            while (rs.next()) {
                rol = new rol();
                rol.setIdRol(rs.getInt(1));
                rol.setNombre(rs.getString(2));
                listadoRol.add(rol);

            }

            return listadoRol;

        } catch (Exception e) {
            System.out.println("Error en el listado " + e.getMessage());
            return listadoRol;

        }

    }
    
    public String EliminarRol(rol rol){
        
        String res;
        Conexion connect = new Conexion();
        Connection newConexion;
        newConexion = connect.getConn();
        
         PreparedStatement sentence;
         
         try {
            String sql  = "DELETE FROM roles WHERE idRol=? and nombre=?;";
            sentence = newConexion.prepareStatement(sql);
            sentence.setInt(1, rol.getIdRol());
            sentence.setString(2, rol.getNombre());
            
            sentence.execute();
            
            res= "";
            
        } catch (Exception e) {
            
            res = e.getMessage();
             System.out.println("Ocurrio un error el eliminar rol" + e.getMessage());
        }
             
        return res;
    
    }
    

}
