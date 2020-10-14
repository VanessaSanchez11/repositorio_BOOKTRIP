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
import modelo.tipoinmuebles;

public class tipoinmuebleDAO {
    public String adicionarTipoInmueble(tipoinmuebles tipoinmueble) {

        String miRespuesta = "";
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {
            String Query = "INSERT INTO tipoinmuebles (nombre)" + "values(?);";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, tipoinmueble.getNombre());
            sentencia.execute();

        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.err.println("ocurrió un problema en tipoinmuebles\n" + ex.getMessage());

        }
        return miRespuesta;

    }

    ////////////////////////////////////////////////////////////
    public String actualizarTipoInmueble(tipoinmuebles tipoinmueble) {

        String miRespuesta = "";
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {
            String Query = "UPDATE tipoinmuebles set nombre=? where idTipo =?";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, tipoinmueble.getNombre());
            sentencia.setInt(2, tipoinmueble.getIdTipo());
            sentencia.executeUpdate();

        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.err.println("ocurrió un problema en estados\n" + miRespuesta);

        }
        return miRespuesta;

    }
 public tipoinmuebles consultarTipoInmuebles(int idTipo){
        
        tipoinmuebles miTipoInmueble =null;
        Conexion  miConexion= new Conexion();
        Connection nuevaCon;
        nuevaCon= miConexion.getConn();
        
        
        try {
            Statement sentencia = nuevaCon.createStatement();
            String Query ="select idTipo, nombre from tipoinmuebles where idTipo =" +idTipo;
           ResultSet rs=sentencia.executeQuery(Query);
            while (rs.next()) {                
               miTipoInmueble = new tipoinmuebles();
               miTipoInmueble.setIdTipo(rs.getInt(1));
               miTipoInmueble.setNombre(rs.getString(2));
               
           }
            
            return miTipoInmueble;
        } catch (Exception ex){
            
          
            System.out.println(ex.getMessage());
        }
        
        return miTipoInmueble;
        
    } 
 
 ////////////////////////////////////////////////////////////////////////////////
  public ArrayList<tipoinmuebles>ConsultarListadoEstado(String criterio){
        ArrayList<tipoinmuebles>milistatipoinmueble =new ArrayList<tipoinmuebles>();
        
       tipoinmuebles mitipoinmueble;
        Conexion  miConexion= new Conexion();
        Connection nuevaCon;
        nuevaCon= miConexion.getConn();
        
        try{
            Statement sentencia = nuevaCon.createStatement();
    
            String Query="select idTipo, nombre" + " from tipoinmuebles where nombre like '%"+ 
                    criterio +"%' ORDER BY nombre;";
           
            ResultSet rs=sentencia.executeQuery(Query);
          
            while (rs.next()) {                
               mitipoinmueble= new tipoinmuebles();
               mitipoinmueble.setIdTipo(rs.getInt(1));
               mitipoinmueble.setNombre(rs.getString(2));
                 milistatipoinmueble.add(mitipoinmueble);
          
            }
              return milistatipoinmueble;
              }catch (Exception e){
           System.out.println("Error el a consulta estado"+e.getMessage());
              return milistatipoinmueble;
                
        }
    
   }
  
  
   //////////////////////////////////////////
   public String eliminarEstado(tipoinmuebles tipoinmueble) {

        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia; 
    
   try{
             String Query="delete from tipoinmuebles where idTipo=? and nombre=?;";
           sentencia=nuevaCon.prepareStatement(Query);
           sentencia.setInt(1, tipoinmueble.getIdTipo());
           sentencia.setString(2, tipoinmueble.getNombre());
           sentencia.execute();
           
            miRespuesta = "";
            
              }catch (Exception e){
                  miRespuesta=e.getMessage();
                  System.out.println("Error al eliminar tipo de inmueble" +e.getMessage());
                  
              }
        return miRespuesta;
      }
}
