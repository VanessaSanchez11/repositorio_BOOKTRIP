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
import modelo.galeria;
import java.util.ArrayList;


public class galeriasDAO {
    
    public String adicionarGaleria(galeria galeria) {

        String miRespuesta = "";

        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "insert into galerias (idInmueble,imagen,url)" + "values(?,?,?);";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setInt(1, galeria.getIdInmueble());
            sentencia.setString(2, galeria.getImagen());
            sentencia.setString(3, galeria.getUrl());
            sentencia.execute();

        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.err.println("ocurrio³ un problema en la galeria\n" + miRespuesta);

        }
        return miRespuesta;

    }

    //////////////////////////////////
    public String actualizarGaleria(galeria galeria) {

        String miRespuesta = "";
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {
            String Query = "UPDATE galerias SET idInmueble=?, imagen=?, url=? where idGaleria = ? ";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setInt(1, galeria.getIdInmueble());
            sentencia.setString(2, galeria.getImagen());
            sentencia.setString(3, galeria.getUrl());
            sentencia.setInt(4, galeria.getIdGaleria());
            sentencia.executeUpdate();

        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.err.println("ocurriÃƒÂ³ un problema en la galeria \n" + miRespuesta);

        }
        return miRespuesta;

    }

    /*
    metodo consultar
   
     */
    public galeria ConsultarGalerias(String url) {
        galeria miGaleria = null;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {
            Statement sentencia = nuevaCon.createStatement();
            String Query = "select idGaleria, idInmueble, imagen, url from galerias where idGaleria = +'" + url + "'";
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {

                miGaleria = new galeria();
                miGaleria.setIdGaleria(rs.getInt(1));
                miGaleria.setIdInmueble(rs.getInt(2));
                miGaleria.setImagen(rs.getString(3));
                miGaleria.setUrl(rs.getString(4));
            }

            return miGaleria;

        } catch (Exception ex) {

            System.out.println(ex.getMessage());
            return miGaleria;

        }

    }

    /*
    listas
   
     */
    public ArrayList<galeria> ConsularListaGaleria(String criterio) {
        ArrayList<galeria> milistagalerias = new ArrayList<galeria>();

        galeria miGaleria;

        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {
            Statement sentencia = nuevaCon.createStatement();

            String Query = "SELECT idGaleria, idInmueble, imagen, url"
                    + " FROM galerias "
                    + " where "
                    + "url like '%" + criterio + "%' ORDER BY idGaleria;";
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {

                miGaleria = new galeria();
                miGaleria.setIdGaleria(rs.getInt(1));
                miGaleria.setIdInmueble(rs.getInt(2));
                miGaleria.setImagen(rs.getString(3));
                miGaleria.setUrl(rs.getString(4));
                milistagalerias.add(miGaleria);
            }
            return milistagalerias;
        } catch (Exception ex) {
            System.out.println("error en la consulta" + ex.getMessage());
            return milistagalerias;
        }

    }

    /*
    eliminar
     */

    public String EliminarGaleria(galeria galerias) {

        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        PreparedStatement sentencia;

        try {
            String Query = "delete from galerias  where idGaleria=? and idInmueble=?  and imagen=? and url=?  ;";
            sentencia = nuevaCon.prepareStatement(Query);

            sentencia.setInt(1, galerias.getIdGaleria());
            sentencia.setInt(2, galerias.getIdInmueble());
            sentencia.setString(3, galerias.getImagen());
            sentencia.setString(4, galerias.getUrl());

            sentencia.execute();
            miRespuesta = "";
        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.err.println(ex.getMessage() + "ocurrio un error " + ex.getMessage());

        }
        return miRespuesta;

    }

}
