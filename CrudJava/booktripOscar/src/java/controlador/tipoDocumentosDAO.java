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
    public tipoDocumentos ConsultarTiposDocumentos(int id_tipo){
        
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
    
    
    
    
    
    
    
    
}

    
    
    
