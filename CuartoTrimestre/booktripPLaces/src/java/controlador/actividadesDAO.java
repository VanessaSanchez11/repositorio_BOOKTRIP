/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.actividades;

public class actividadesDAO {

    public String adicionarActividad(actividades actividad) {

        String miRespuesta = "";

        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "insert into actividades (idActividad,idMunicipio,nombre,lugar,descripcion)" + "values(?,?,?,?,?);";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setInt(1, actividad.getIdActividad());
            sentencia.setInt(2, actividad.getIdMunicipio());
            sentencia.setString(3, actividad.getNombre());
            sentencia.setString(4, actividad.getLugar());
            sentencia.setString(5, actividad.getDescripcion());
            sentencia.execute();

        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.err.println("ocurrió un problema en las actividades\n" + miRespuesta);

        }
        return miRespuesta;

    }

    /*
    ACTUALIZAR
     */
    public String actualizarActividad(actividades actividad) {

        String miRespuesta = "";
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {
            String Query = "UPDATE actividades SET  idMunicipio=?, nombre=?  lugar=?  descripcion=? where idActividad = ?";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setInt(1, actividad.getIdActividad());
            sentencia.setInt(2, actividad.getIdMunicipio());
            sentencia.setString(3, actividad.getNombre());
            sentencia.setString(4, actividad.getLugar());
            sentencia.setString(5, actividad.getDescripcion());
            sentencia.executeUpdate();

        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.err.println("ocurrió un problema en las actividades \n" + miRespuesta);

        }
        return miRespuesta;

    }

    /*
     consultar
     */
    public actividades ConsultarActividad(int idActividad) {

        actividades miActividad = null;
          Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {
            Statement sentencia = nuevaCon.createStatement();

            String Query = "SELECT idActividad, idMunicipio, nombre, lugar, descripcion from actividades where idActividad = " + idActividad;
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {

                miActividad = new actividades();
                miActividad.setIdActividad(rs.getInt(1));
                miActividad.setIdMunicipio(rs.getInt(2));
                miActividad.setNombre(rs.getString(3));
                miActividad.setLugar(rs.getString(4));
                miActividad.setDescripcion(rs.getString(5));
            }

            return miActividad;

        } catch (Exception ex) {

            System.out.println(ex.getMessage());
            return miActividad;

        }

    }

    /*
    Listas
     */
    public ArrayList<actividades> ConsularListaActividades(String criterio) {
        ArrayList<actividades> milistaActividades = new ArrayList<actividades>();

        actividades miActividad;

         Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {
            Statement sentencia = nuevaCon.createStatement();

            String Query = "SELECT idActividad, idMunicipio, nombre, lugar, descripcion" + " FROM actividades  where idActividad like '%" + criterio + "%' ORDER BY idActividad;";
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {

                miActividad = new actividades();
                miActividad.setIdActividad(rs.getInt(1));
                miActividad.setIdMunicipio(rs.getInt(2));
                miActividad.setNombre(rs.getString(3));
                miActividad.setLugar(rs.getString(4));
                miActividad.setDescripcion(rs.getString(5));

                milistaActividades.add(miActividad);

            }

            return milistaActividades;

        } catch (Exception ex) {
            System.out.println("errror en la consulta" + ex.getMessage());
            return milistaActividades;
        }

    }

    /*
    ELIMINAR
     */
    public String EliminarActividad(actividades actividad) {

        String miRespuesta;
    Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        PreparedStatement sentencia;

        try {
            String Query = "delete from actividades  where idActividad=? and idMunicipio=? and nombre=? and lugar=? and descripcion=?;";
            sentencia = nuevaCon.prepareStatement(Query);

            sentencia.setInt(1, actividad.getIdActividad());
            sentencia.setInt(2, actividad.getIdMunicipio());
            sentencia.setString(3, actividad.getNombre());
            sentencia.setString(4, actividad.getLugar());
            sentencia.setString(5, actividad.getDescripcion());
            sentencia.execute();
            miRespuesta = "";
        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.err.println(ex.getMessage() + "ocurrio un error " + ex.getMessage());

        }
        return miRespuesta;

    }

}
