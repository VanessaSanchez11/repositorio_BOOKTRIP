/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.galerias;

public class galeriasDAO {

    public String adicionarGaleria(galerias galeria) {

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
            System.err.println("ocurrió un problema en la galeria\n" + miRespuesta);

        }
        return miRespuesta;

    }

    //////////////////////////////////
    public String actualizarGaleria(galerias galeria) {

        
        String  miRespuesta = "";
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
            System.err.println("ocurrió un problema en la galeria \n" + miRespuesta);

        }
        return miRespuesta;

    }

}
