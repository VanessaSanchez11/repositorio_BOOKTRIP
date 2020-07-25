package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.puntuaciones;

public class puntuacionesDAO {

    public String adicionarPuntuacion(puntuaciones puntuacion) {

        String miRespuesta = "";
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "insert into puntuaciones (idUsuario,idInmueble,fechaCreada,descripcion,calificacion)"
            + "values(?,?,?,?,?);";

            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setInt(1, puntuacion.getIdUsuario());
            sentencia.setInt(2, puntuacion.getIdInmueble());
            sentencia.setString(3, puntuacion.getFechaCreada());
            sentencia.setString(4, puntuacion.getDescripcion());
            sentencia.setString(5, puntuacion.getCalificacion());
            sentencia.execute();
            

            } catch (Exception ex) {
            miRespuesta = "";
            miRespuesta = ex.getMessage();
            System.err.println("ocurrió un problema en puntuacion\n" + ex.getMessage());

        }
        return miRespuesta;

    }

    /////
    public String actualizarPuntuacion(puntuaciones puntuacion) {

        String miRespuesta = "";
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "update puntuaciones  set idUsuario=?, idInmueble=?, fechaCreada=?,descripcion=?, calificacion=? where idPuntuacion =?";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setInt(1, puntuacion.getIdUsuario());
            sentencia.setInt(2, puntuacion.getIdInmueble());
            sentencia.setString(3, puntuacion.getFechaCreada());
            sentencia.setString(4, puntuacion.getDescripcion());
            sentencia.setString(5, puntuacion.getCalificacion());
            sentencia.setInt(6, puntuacion.getIdPuntuacion());
            sentencia.executeUpdate();

        } catch (Exception ex) {
            miRespuesta = "";
            miRespuesta = ex.getMessage();
            System.err.println("ocurrió un problema puntuaciones\n" + ex.getMessage());

        }
        return miRespuesta;

    }
}
