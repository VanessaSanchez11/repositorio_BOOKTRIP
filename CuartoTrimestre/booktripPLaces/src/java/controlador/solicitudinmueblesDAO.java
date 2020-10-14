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
import modelo.solicitudinmuebles;

/**
 *
 * @author oscar sanabria
 */
public class solicitudinmueblesDAO {

    public static String miRespuesta = "";

    public String adicionarSolicitudInmueble(solicitudinmuebles solicitud) {

        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "insert into solicitudinmuebles (idInmueble, idUsuario, idEstado, fecha)" + "values"
                    + "(?,?,?,?);";
            sentencia = nuevaCon.prepareStatement(Query);

            sentencia.setInt(1, solicitud.getIdInmueble());
            sentencia.setInt(2, solicitud.getIdUsuario());
            sentencia.setInt(3, solicitud.getIdEstado());
            sentencia.setString(4, solicitud.getFecha());

            sentencia.execute();

        } catch (Exception ex) {
            miRespuesta = "";
            miRespuesta = ex.getMessage();
            System.err.println("ocurrió un problema en solicitud inmuebles\n" + ex.getMessage());

        }
        return miRespuesta;

    }

    //////////////////////////////////
    public String actualizarSolicitudInmueble(solicitudinmuebles solicitud) {

        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {
            String Query = "update solicitudinmuebles set idInmueble=?,"
                    + "idUsuario=?, idEstado=?, fecha=? where idSolicitud =?";
            sentencia = nuevaCon.prepareStatement(Query);

            
            sentencia.setInt(1, solicitud.getIdInmueble());
            sentencia.setInt(2, solicitud.getIdUsuario());
            sentencia.setInt(3, solicitud.getIdEstado());
            sentencia.setString(4, solicitud.getFecha());

            sentencia.setInt(5, solicitud.getIdSolicitud());

            sentencia.executeUpdate();
        } catch (Exception ex) {
            miRespuesta = "";
            miRespuesta = ex.getMessage();
            System.err.println("ocurrió un problema en solicitud inmuebles\n" + ex.getMessage());

        }
        return miRespuesta;

    }

    public solicitudinmuebles consultarSolicitudInmuebles( String fecha) {

        solicitudinmuebles misolicitud = null;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {
            Statement sentencia = nuevaCon.createStatement();
            String Query = "select idSolicitud, idInmueble, idUsuario,  idEstado, "
                    + "fecha from solicitudinmuebles where fecha =" + fecha;
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {
                misolicitud = new solicitudinmuebles();

                misolicitud.setIdSolicitud(rs.getInt(1));
                misolicitud.setIdInmueble(rs.getInt(2));
                misolicitud.setIdUsuario(rs.getInt(3));
                misolicitud.setIdEstado(rs.getInt(4));
                misolicitud.setFecha(rs.getString(5));

            }

            return misolicitud;
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }

        return misolicitud;

    }
    ////////////////////////////////////////////////////////////////////77
     public ArrayList<solicitudinmuebles>ConsultarListadoSolicitudInmueble( String fecha){
        ArrayList<solicitudinmuebles>milistasolicitud =new ArrayList<solicitudinmuebles>();
        
        solicitudinmuebles miSolicitudInmueble;
        Conexion  miConexion= new Conexion();
        Connection nuevaCon;
        nuevaCon= miConexion.getConn();
        
        try{
            Statement sentencia = nuevaCon.createStatement();
    
           String Query = "select idSolicitud, idInmueble, idUsuario,  idEstado, fecha"
                   + " from  solicitudinmuebles"
                   + " where "
                   + "fecha like '%"+ fecha + "%' ORDER BY idSolicitud;";
           
          
           
            ResultSet rs=sentencia.executeQuery(Query);
          
            while (rs.next()) {                
              miSolicitudInmueble= new solicitudinmuebles();
              miSolicitudInmueble.setIdSolicitud(rs.getInt(1));
             miSolicitudInmueble.setIdInmueble(rs.getInt(2));
              miSolicitudInmueble.setIdUsuario(rs.getInt(3));
               miSolicitudInmueble.setIdEstado(rs.getInt(4));
                miSolicitudInmueble.setFecha(rs.getString(5));
                 milistasolicitud.add(miSolicitudInmueble);
          
            }
              return  milistasolicitud;
              }catch (Exception e){
           System.out.println("Error el a consulta solicitud"+e.getMessage());
              return  milistasolicitud;
                
        }
    
   }
     
      //////////////////////////////////////////
   public String eliminarSolicitud(solicitudinmuebles solicitud) {

        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia; 
    
   try{
             String Query="delete from solicitudinmuebles where idSolicitud=? and idInmueble=? and idUsuario=? and idEstado=? and fecha=?;";
           sentencia=nuevaCon.prepareStatement(Query);
           sentencia.setInt(1, solicitud.getIdSolicitud());
           sentencia.setInt(2, solicitud.getIdInmueble());
           sentencia.setInt(3, solicitud.getIdUsuario());
           sentencia.setInt(4, solicitud.getIdEstado());
           sentencia.setString(5, solicitud.getFecha());
           sentencia.execute();
           
            miRespuesta = "";
            
              }catch (Exception e){
                  miRespuesta=e.getMessage();
                  System.out.println("Error al eliminar la solicitud" +e.getMessage());
                  
              }
        return miRespuesta;
      }
  
}
