package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.servicios;

public class serviciosDAO {

    
    public String adicionarServicio(servicios servicio) {

        String res = "";
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "INSERT INTO servicios (nombre, descripcion)"
                    + "values(?,?);";

            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, servicio.getNombre());
            sentencia.setString(2, servicio.getDescripcion());
            sentencia.execute();

        } catch (Exception ex) {
            res = "";
            res = ex.getMessage();
            System.err.println("ocurrió un problema en servicio\n" + ex.getMessage());

        }
        return res;   
    }

  
    public String actualizarServicio(servicios servicio) {

        String miRespuesta = "";
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "update servicios  set idServicio=?, nombre=?, descripcion=?,";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setInt(1, servicio.getIdServicio());
            sentencia.setString(2, servicio.getNombre());
            sentencia.setString(3, servicio.getDescripcion());
            sentencia.executeUpdate();

        } catch (Exception ex) {
            miRespuesta = "";
            miRespuesta = ex.getMessage();
            System.err.println("ocurrió un problema servicio\n" + ex.getMessage());

        }
        return miRespuesta;

    }

    //////////
    public servicios consultarServicio(String nombre) {

        servicios servicio = null;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {
            Statement sentencia = nuevaCon.createStatement();

            String Query = "SELECT idServicio, nombre, descripcion "
                    + " FROM servicios WHERE nombre = +'" + nombre + "'";

            ResultSet rs = sentencia.executeQuery(Query);
            
            while (rs.next()) {

                servicio = new servicios();
                servicio.setIdServicio(rs.getInt(1));
                servicio.setNombre(rs.getString(2));
                servicio.setDescripcion(rs.getString(3));

            }

            return servicio;

        } catch (Exception ex) {

            System.out.println(ex.getMessage());
            return servicio;
            
        }

    }

    

///////
    public ArrayList<servicios> ConsultarListadoServicios(String nombre, String descripcion) {

        ArrayList<servicios> milistaservicios = new ArrayList<servicios>();
        servicios miservicios;

        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        try {
            Statement sentencia = nuevaCon.createStatement();

              String Query = "SELECT idServicio, nombre, descripcion" 
                      + " FROM servicios "
                      + "WHERE "
                      + " nombre like '%" + nombre + "%'"
                      + "or (descripcion) like ('%" + descripcion + "%')"                     
                      + " ORDER BY idServicio;";
              
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {
             
                miservicios = new servicios();
                miservicios.setIdServicio(rs.getInt(1));
                miservicios.setNombre(rs.getString(2));
                miservicios.setDescripcion(rs.getString(3));
                
                milistaservicios.add(miservicios);
            }
            
            return milistaservicios;
            
        } catch (Exception ex) {
            System.out.println("error consulta lista de servicios:" + ex.getMessage());
            return milistaservicios;

        }

    }
    
    //////////////
    public String EliminarServicio(servicios servicio){
        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        PreparedStatement sentencia;
        try {
            String Query ="delete from servicios where idServicio=? and nombre=? and descripcion=?;";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setInt(1,servicio.getIdServicio());
            sentencia.setString(2,servicio.getNombre());
            sentencia.setString(3,servicio.getDescripcion ());
            
            sentencia.execute();
            miRespuesta = "";
            
        } catch (Exception ex){
            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un error en serviciosDAO.EliminarServicio" + ex.getMessage());
        }
        
        return miRespuesta;
       
    }    

    public ArrayList<servicios> ConsultarListadoServicios(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}


