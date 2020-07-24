
package controlador;
import  java.sql.Connection;
import  java.sql.PreparedStatement; 
import  modelo.tipodocumentos; 

public class tipodocumentosDAO {
    public String adicionarTipoDocumentos(tipodocumentos tipodocumento){
         
       String miRespuesta = "";
       Conexion miConexion = new Conexion();
       Connection nuevaCon;
       nuevaCon = miConexion.getConn();
       
       PreparedStatement sentencia;
       try {
String Query= "insert into tipodocumentos (nombre)"+"values(?);";
sentencia=nuevaCon.prepareStatement(Query);
sentencia.setString(1, tipodocumento.getNombre());
   sentencia.execute();
   

       }catch (Exception ex) {
        miRespuesta="";  
miRespuesta= ex.getMessage();
           System.err.println("ocurrió un problema en tipodocumento\n"+ex.getMessage());
     

}
         return miRespuesta;
       
     }
     
     //////////////////////////////////
     public String actualizarTipoDocumento(tipodocumentos tipodocumento){
         
       String miRespuesta = "";
       Conexion miConexion = new Conexion();
       Connection nuevaCon;
       nuevaCon = miConexion.getConn();
       
       PreparedStatement sentencia;
       try {
String Query= "update tipodocumentos  set nombre=? where idTipoDocumento =?";
sentencia=nuevaCon.prepareStatement(Query);
sentencia.setString(1, tipodocumento.getNombre());
sentencia.setInt(2, tipodocumento.getIdTipoDocumento());
   sentencia.executeUpdate();
   

       }catch (Exception ex) {
        miRespuesta="";  
miRespuesta= ex.getMessage();
           System.err.println("ocurrió un problema en tipodocuemnto\n"+ex.getMessage());
     

}
         return miRespuesta;
       
     }
    
}
