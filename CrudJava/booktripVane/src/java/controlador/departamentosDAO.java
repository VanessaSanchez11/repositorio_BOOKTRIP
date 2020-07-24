/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.departamentos;

public class departamentosDAO {

    public String adicionarDepartamento(departamentos departamento) {

        String Res = "";
        Conexion connect = new Conexion();
        Connection newConexion;
        newConexion = connect.getConn();
        PreparedStatement sentence;

        try {
            String sql = "INSERT INTO departamentos(nombre)" + "VALUES(?);";
            sentence = newConexion.prepareStatement(sql);
            sentence.setString(1, departamento.getNombre());
            sentence.execute();
        } catch (SQLException e) {
            
            Res = e.getMessage();
            System.err.println("Ocurrio un problema" + Res);
        }
        return Res;
    }
    
    public String actualizarDepartamento(departamentos departamento) {
      String Res = "";
        Conexion connect = new Conexion();
        Connection newConexion;
        newConexion = connect.getConn();

        PreparedStatement sentence;
        try {
            String sql = "UPDATE departamentos SET nombre=? WHERE idDepartamento = ?";
            sentence = newConexion.prepareStatement(sql);
            sentence.setString(1, departamento.getNombre());
            sentence.setInt(2, departamento.getIdDepartamento());
            sentence.executeUpdate();

        } catch (Exception e) {

            Res = e.getMessage();
            System.err.println("Ocurrio un problema " + Res);

        }
        return Res;
    
    
    }

}
