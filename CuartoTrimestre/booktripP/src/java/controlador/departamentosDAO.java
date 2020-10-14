/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import com.sun.xml.rpc.processor.modeler.j2ee.xml.string;
import java.sql.Connection;
import static java.sql.DriverManager.println;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.departamento;

public class departamentosDAO {
    
    

    public String adicionarDepartamento(departamento departamento) {

        String Res = "";
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        PreparedStatement sentence;

        try {
            String sql = "INSERT INTO departamentos(nombre)" + "VALUES(?);";
            sentence = nuevaCon.prepareStatement(sql);
            sentence.setString(1, departamento.getNombre());
            sentence.execute();
        } catch (SQLException e) {

            Res = e.getMessage();
            System.err.println("Ocurrio un problema" + Res);
        }
        return Res;
    }

    public String actualizarDepartamento(departamento departamento) {
        String Res = "";
          Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentence;
        try {
            String sql = "UPDATE departamentos SET nombre=? WHERE idDepartamento = ?";
            sentence = nuevaCon.prepareStatement(sql);
            sentence.setString(1, departamento.getNombre());
            sentence.setInt(2, departamento.getIdDepartamento());
            sentence.executeUpdate();

        } catch (Exception e) {

            Res = e.getMessage();
            System.err.println("Ocurrio un problema " + Res);

        }
        return Res;

    }

    /*
    Metodo Consultar
     */
    public departamento ConsultarDepartamento(String Nombre) {
        departamento miDepartamento = null;
          Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {
            Statement sentencia = nuevaCon.createStatement();
            String Query = "select idDepartamento, nombre from departamentos where nombre = " + Nombre;
            
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {

                miDepartamento = new departamento();
                miDepartamento.setIdDepartamento(rs.getInt(1));
                miDepartamento.setNombre(rs.getString(2));

            }

            return miDepartamento;

        } catch (Exception ex) {

            System.out.println(ex.getMessage());
            return miDepartamento;

        }

    }

    /*
     Listar 
     */
    public ArrayList<departamento> ConsularListaDepartamento(String criterio) {
        ArrayList<departamento> milistadepartamento = new ArrayList<departamento>();

        departamento miDepartamento;

          Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {
            Statement sentencia = nuevaCon.createStatement();

            String Query = "SELECT idDepartamento, nombre" + " FROM departamentos  where nombre like '%" + criterio + "%' ORDER BY idDepartamento;";
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {

                miDepartamento = new departamento();
                miDepartamento.setIdDepartamento(rs.getInt(1));
                miDepartamento.setNombre(rs.getString(2));
                milistadepartamento.add(miDepartamento);

            }

            return milistadepartamento;
        } catch (Exception ex) {
            System.out.println("errror en la consulta" + ex.getMessage());

            return milistadepartamento;
        }

    }

    /*
    eliminar
     */

    public String EliminarDepartamento(departamento departamento) {

        String miRespuesta;
         Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        PreparedStatement sentencia;

        try {
            String Query = "delete from departamentos  where idDepartamento=? and nombre=? ;";
            sentencia = nuevaCon.prepareStatement(Query);

            sentencia.setInt(1, departamento.getIdDepartamento());
            sentencia.setString(2, departamento.getNombre());
            sentencia.execute();
            miRespuesta = "";
        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.err.println(ex.getMessage() + "ocurrio un error " + ex.getMessage());

        }
        return miRespuesta;

    }

    
}
