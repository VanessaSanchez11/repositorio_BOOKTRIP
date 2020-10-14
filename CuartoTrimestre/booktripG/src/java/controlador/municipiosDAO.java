/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.municipios;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.departamento;

/**
 *
 * @author 57321
 */
public class municipiosDAO {

    public static String miRespuesta = "";

    public String adicionarMunicipios(municipios municipio) {

        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "insert into municipios (idDepartamento,nombre) " + "values(?,?);";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setInt(1, municipio.getIdDepartamento());
            sentencia.setString(2, municipio.getNombre());
            sentencia.execute();

        } catch (Exception ex) {
            miRespuesta = "";
            miRespuesta = ex.getMessage();
            System.err.println("ocurrió un problema en el municipio\n" + ex.getMessage());

        }
        return miRespuesta;
        //////////////////////////////////
    }  
    public String actualizarMunicipio(municipios municipio) {

        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "update municipios set idDepartamento=?, nombre=? where idMunicipio =?";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setInt(1, municipio.getIdDepartamento());
            sentencia.setString(2, municipio.getNombre());
            sentencia.setInt(3, municipio.getIdMunicipio());
            sentencia.executeUpdate();

        } catch (Exception ex) {
            miRespuesta = "";
            miRespuesta = ex.getMessage();
            System.err.println("ocurrió un problema en el municipio\n" + ex.getMessage());

        }
        return miRespuesta;

    }

    /*
    metodo consultars
     */
        
    public municipios ConsultarMunicipio(int idMunicipio) {

        municipios miMunicipio = null;
         Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {
            Statement sentencia = nuevaCon.createStatement();
            String Query = "select idMunicipio, idDepartamento, nombre  from municipios  where idMunicipio = " + idMunicipio;
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {

                miMunicipio = new municipios();
                miMunicipio.setIdMunicipio(rs.getInt(1));
                miMunicipio.setIdDepartamento(rs.getInt(2));
                miMunicipio.setNombre(rs.getString(3));

            }

            return miMunicipio;

        } catch (Exception ex) {

            System.out.println(ex.getMessage());
            return miMunicipio;

        }

    }

    /*
     Listar 
     */
    public ArrayList<municipios> ConsularListaMunicipio(String criterio) {
        ArrayList<municipios> milistamunicipio = new ArrayList<municipios>();

        municipios miMunicipio;

          Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {
            Statement sentencia = nuevaCon.createStatement();

            String Query = "SELECT idMunicipio, idDepartamento, nombre" + " FROM municipios  where nombre like '%" + criterio + "%' ORDER BY nombre;";
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {

                miMunicipio = new municipios();
                miMunicipio.setIdMunicipio(rs.getInt(1));
                miMunicipio.setIdDepartamento(rs.getInt(2));
                miMunicipio.setNombre(rs.getString(3));
                milistamunicipio.add(miMunicipio);

            }

            return milistamunicipio;
        } catch (Exception ex) {
            System.out.println("errror en la consulta" + ex.getMessage());

            return milistamunicipio;
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
     /*
    eliminar
     */

    public String EliminarMunicipio(municipios  municipio) {

        String miRespuesta;
          Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        PreparedStatement sentencia;

        try {
            String Query = "delete from municipios   where idMunicipio=? and  idDepartamento=? and nombre=? ;";
            sentencia = nuevaCon.prepareStatement(Query);

            sentencia.setInt(1, municipio.getIdMunicipio());
            sentencia.setInt(2, municipio.getIdDepartamento());
            sentencia.setString(3, municipio.getNombre());
            sentencia.execute();
            miRespuesta = "";
        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.err.println(ex.getMessage() + "ocurrio un error " + ex.getMessage());

        }
        return miRespuesta;

    }
    

}
