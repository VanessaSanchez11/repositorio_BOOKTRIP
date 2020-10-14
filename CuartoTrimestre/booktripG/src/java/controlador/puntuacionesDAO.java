package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.puntuaciones;

public class puntuacionesDAO {

    public String adicionarPuntuacion(puntuaciones puntuacion) {

        String miRespuesta = "";
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        
        try {
            String Sql = "INSERT INTO puntuaciones (idUsuario,idInmueble,fechaCreada,descripcion,calificacion)"
            +"values(?,?,?,?,?);";

            sentencia = nuevaCon.prepareStatement(Sql);
            sentencia.setInt(1, puntuacion.getIdUsuario());
            sentencia.setInt(2, puntuacion.getIdInmueble());
            sentencia.setString(3, puntuacion.getFechaCreada());
            sentencia.setString(4, puntuacion.getDescripcion());
            sentencia.setString(5, puntuacion.getCalificacion());
            sentencia.execute();
            
            }catch (Exception ex) {
                
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
            String Query = "insert into puntuaciones  (idUsuario,idInmueble,fechaCreada,descripcion, calificacion)" + "values"
                    + "(?,?,?,?,?);";
            
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setInt(1, puntuacion.getIdUsuario());
            sentencia.setInt(2, puntuacion.getIdInmueble());
            sentencia.setString(3, puntuacion.getFechaCreada());
            sentencia.setString(4, puntuacion.getDescripcion());
            sentencia.setString(5, puntuacion.getCalificacion());
            sentencia.execute();

        } catch (Exception ex) {
            
            miRespuesta = ex.getMessage();
            System.err.println("ocurrió un problema puntuaciones\n" + ex.getMessage());

        }
        return miRespuesta;
        
    }
        
        //////////
        
       public puntuaciones consultarPuntuacion(String descripcion) {

        puntuaciones puntuacion =null;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        
        try {
            Statement sentencia = nuevaCon.createStatement();
        
            String Query = "select idPuntuacion, idUsuario, idInmueble, fechaCreada, descripcion, calificacion FROM puntuaciones where descripcion = " + descripcion;
            
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next())
            {
                
                puntuacion = new puntuaciones();
                puntuacion.setIdPuntuacion(rs.getInt(1));
                puntuacion.setIdUsuario(rs.getInt(2));
                puntuacion.setIdInmueble(rs.getInt(3));
                puntuacion.setFechaCreada(rs.getString(4));
                puntuacion.setDescripcion(rs.getString(5));
                puntuacion.setCalificacion(rs.getString(6));
        }
        
        return puntuacion;
                    
        } 
        
        catch (Exception ex) {
            
            System.out.println(ex.getMessage());
            return puntuacion;
    }
        
  }
   
    public ArrayList<puntuaciones> ConsultarListadoPuntuaciones(String descripcion, String calificacion) {

        ArrayList<puntuaciones> milistapuntuaciones = new ArrayList<puntuaciones>();
        puntuaciones mipuntuaciones;

        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        try {
            Statement sentencia = nuevaCon.createStatement();

            String Query = "SELECT idPuntuacion, idUsuario, idInmueble, fechaCreada, descripcion, calificacion " 
                    + "FROM puntuaciones"
                    + " where"
                    + " descripcion like '%" + descripcion + "%'"
                    + " or (calificacion) like ('%" + calificacion + "%')"
                    + " ORDER BY idPuntuacion;";
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {
             
                mipuntuaciones = new puntuaciones();
                mipuntuaciones.setIdPuntuacion(rs.getInt(1));
                mipuntuaciones.setIdUsuario(rs.getInt(2));
                mipuntuaciones.setIdInmueble(rs.getInt(3)); 
                mipuntuaciones.setFechaCreada(rs.getString(4));
                mipuntuaciones.setDescripcion(rs.getString(5));
                mipuntuaciones.setCalificacion(rs.getString(6));
                
                milistapuntuaciones.add(mipuntuaciones);
            }
            
            return milistapuntuaciones;
            
        } catch (Exception ex) {
            System.out.println("error consulta lista de puntuaciones:" + ex.getMessage());
            return milistapuntuaciones;

        }
    }
    /////////////    
        public String EliminarPuntuacion(puntuaciones puntuacion){
        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        PreparedStatement sentencia;
        try {
            String sql ="delete from puntuaciones where idPuntuacion=? and idUsuario=? and idInmueble=? and fechaCreada=? and descripcion=? and calificacion=?;";
            sentencia = nuevaCon.prepareStatement(sql);
            sentencia.setInt(1,puntuacion.getIdPuntuacion());
            sentencia.setInt(2,puntuacion.getIdUsuario());
            sentencia.setInt(3,puntuacion.getIdInmueble ());
            sentencia.setString(4,puntuacion.getFechaCreada());
            sentencia.setString(5,puntuacion.getDescripcion());
            sentencia.setString(6,puntuacion.getCalificacion());
            
            
            sentencia.execute();
            miRespuesta = "";
            
        } catch (Exception ex){
            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un error en puntuacionesDAO.EliminarPuntuacion" + ex.getMessage());
        }
        
        return miRespuesta;
        
    }

    public ArrayList<puntuaciones> ConsultarListadoPuntuaciones(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
       

}