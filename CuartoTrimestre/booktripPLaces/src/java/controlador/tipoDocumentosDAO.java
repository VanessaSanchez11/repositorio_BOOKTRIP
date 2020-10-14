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
import modelo.tipoDocumentos;
import java.util.ArrayList;


public class tipoDocumentosDAO {
    
    public  String adicionarTipoDocumentos(tipoDocumentos tipoDocu){
        
        String Res = "";
        Conexion connect = new Conexion();
        Connection newConexion;
        newConexion = connect.getConn();
        
        PreparedStatement sentence;
        
        try {
            String sql = "INSERT INTO tipodocumentos (nombre)" + "values(?);";
            sentence = newConexion.prepareStatement(sql);
            sentence.setString(1,tipoDocu.getNombre());
            sentence.execute();
            
            
        } catch (Exception e) {
            
            Res = e.getMessage();
            System.err.println("Ocurrio un problema en tipo de documentoDAO" + Res);
            
        }
        return Res;
    }
    
    public String actualizarTipoDocumentos(tipoDocumentos tipoDocu){
        
        String Res = "";
        Conexion  connect= new Conexion();
        Connection newConexion;
        newConexion = connect.getConn();
        
        
        PreparedStatement sentence;
        try {
            String sql ="UPDATE tipodocumentos SET nombre=? where idTipoDocumento = ?";
            sentence = newConexion.prepareStatement(sql);
            sentence.setString(1, tipoDocu.getNombre());
            sentence.setInt(2, tipoDocu.getIdTipoDocumento());
            sentence.executeUpdate();
            
            
        } catch (SQLException e) {
            
            Res = e.getMessage();
            System.err.println("Ocurrio un problema documentoDAO" + Res);
        }
        
        return Res;
        
    }
    
    //////////////////////////
    public tipoDocumentos consultarTipoDocumento(int id_tipo){
        
      tipoDocumentos miTipoDocumento =null;
        Conexion  miConexion= new Conexion();
        Connection nuevaCon;
        nuevaCon= miConexion.getConn();
        
        
        try {
            Statement sentencia = nuevaCon.createStatement();
            String Query ="select idTipoDocumento, nombre from tipodocumentos where idTipoDocumento=" +id_tipo;
           ResultSet rs=sentencia.executeQuery(Query);
            while (rs.next()) {                
               miTipoDocumento = new tipoDocumentos();
               miTipoDocumento.setIdTipoDocumento(rs.getInt(1));
               miTipoDocumento.setNombre(rs.getString(2));
               
            }
            
            
        } catch (Exception e) {
            
          
            System.out.println(e.getMessage());
        }
        
        return miTipoDocumento;
        
    }
    public ArrayList<tipoDocumentos> ConsultarListadoTiposDocumento(String criterio) {

        ArrayList<tipoDocumentos> listadoTipoDocu = new ArrayList<tipoDocumentos>();
        tipoDocumentos tipoDocu;

        Conexion connect = new Conexion();
        Connection newConexion;
        newConexion = connect.getConn();

        try {
            Statement sentencia = newConexion.createStatement();

            String sql = " SELECT idTipoDocumento, nombre " + "  FROM tipoDocumentos where idTipoDocumento like '%" + criterio + "%' ORDER BY idTipoDocumento;";

            ResultSet rs = sentencia.executeQuery(sql);

            while (rs.next()) {
                tipoDocu = new tipoDocumentos();
                tipoDocu.setIdTipoDocumento(rs.getInt(1));
                tipoDocu.setNombre(rs.getString(2));
                listadoTipoDocu.add(tipoDocu);

            }

            return listadoTipoDocu;

        } catch (Exception e) {
            System.out.println("Error en el listado " + e.getMessage());
            return listadoTipoDocu;

        }

    }
    
    
    
    
    
    
    
    
    
    
    
     public String EliminarTipoDocumento(tipoDocumentos tipo){
        
        String res;
        Conexion connect = new Conexion();
        Connection newConexion;
        newConexion = connect.getConn();
        
         PreparedStatement sentence;
         
         try {
            String sql  = "DELETE FROM tipodocumentos WHERE idTipoDocumento=? and nombre=?;";
            sentence = newConexion.prepareStatement(sql);
            sentence.setInt(1, tipo.getIdTipoDocumento());
            sentence.setString(2, tipo.getNombre());
            
            sentence.execute();
            
            res= "";
            
        } catch (Exception e) {
            
            res = e.getMessage();
             System.out.println("Ocurrio un error en eliminar tipo documento" + e.getMessage());
        }
             
        return res;
    
    }
    
    
    
    
    
    
}

    
    
    
