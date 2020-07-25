/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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

}
