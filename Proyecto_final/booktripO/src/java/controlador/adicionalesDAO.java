
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.adicionales;


public class adicionalesDAO {
  
    public String adicionarAdicionales(adicionales adi) {

        String Res = "";
        Conexion connect = new Conexion();
        Connection newConexion;
        newConexion = connect.getConn();

        PreparedStatement sentence;

        try {
            String sql = "INSERT INTO adicionales (idInmueble, idServicio)" + "values(?,?);";
            sentence = newConexion.prepareStatement(sql);
            sentence.setInt(1, adi.getIdInmueble());
             sentence.setInt(2, adi.getIdServicio());
            sentence.execute();

        } catch (Exception e) {

            Res = e.getMessage();
            System.err.println("Ocurrio un problema en adicionalesDao" + Res);

        }
        return Res;
    }

    public String actualizarAdicionales(adicionales adi) {

        String Res = "";
        Conexion connect = new Conexion();
        Connection newConexion;
        newConexion = connect.getConn();

        PreparedStatement sentence;
        try {
            String sql = "UPDATE adicionales SET idInmueble=?, idServicio=? where idInmueble= ?";
            sentence = newConexion.prepareStatement(sql);
            sentence.setInt(1, adi.getIdInmueble());
            sentence.setInt(2, adi.getIdServicio());
            sentence.setInt(3, adi.getIdInmueble());
            sentence.executeUpdate();

        } catch (SQLException e) {

            Res = e.getMessage();
            System.err.println("Ocurrio un problema adicionalesDAO " + Res);
        }

        return Res;

    }

    //consultar
    public adicionales consultarAdicionales(int idInmueble) {

        adicionales adi = null;

        Conexion connect = new Conexion();
        Connection newConexion;
        newConexion = connect.getConn();

        try {
            Statement sentencia = newConexion.createStatement();

            String sql = "select idInmueble, idServicio FROM adicionales WHERE idInmueble = " + idInmueble;
            //filas columnas
            ResultSet rs = sentencia.executeQuery(sql);

            while (rs.next()) {
                adi = new adicionales();
                adi.setIdInmueble(rs.getInt(1));
                adi.setIdServicio(rs.getInt(2));

            }

            return adi;

        } catch (Exception e) {
            System.out.println(e.getMessage());
            return adi;
        }
    }

    public ArrayList<adicionales> ConsultarListadoAdicionales(String criterio) {

        ArrayList<adicionales> listadoAdi = new ArrayList<adicionales>();
        adicionales adi;

        Conexion connect = new Conexion();
        Connection newConexion;
        newConexion = connect.getConn();

        try {
            Statement sentencia = newConexion.createStatement();

            String sql = " SELECT idInmueble, idServicio " + "  FROM adicionales where idInmueble like '%" + criterio + "%' ORDER BY idInmueble;";

            ResultSet rs = sentencia.executeQuery(sql);

            while (rs.next()) {
                adi = new adicionales();
                adi.setIdInmueble(rs.getInt(1));
                adi.setIdServicio(rs.getInt(2));
                listadoAdi.add(adi);

            }

            return listadoAdi;

        } catch (Exception e) {
            System.out.println("Error en el listado " + e.getMessage());
            return listadoAdi;

        }

    }
    public String EliminarAdicionales(adicionales adi){
        
        String res;
        Conexion connect = new Conexion();
        Connection newConexion;
        newConexion = connect.getConn();
        
         PreparedStatement sentence;
         
         try {
            String sql  = "DELETE FROM adicionales WHERE idInmueble=? and idServicio=?;";
            sentence = newConexion.prepareStatement(sql);
            sentence.setInt(1, adi.getIdInmueble());
            sentence.setInt(2, adi.getIdServicio());
            
            sentence.execute();
            
            res= "";
            
        } catch (Exception e) {
            
            res = e.getMessage();
             System.out.println("Ocurrio un error en eliminar adicional " + e.getMessage());
        }
             
        return res;
    
    }
    
    
    
    

}

    
    
    
  