package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.pagos;

public class pagosDAO {
    
    public String adicionarPago(pagos pago) {

        String miRespuesta = "";
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        PreparedStatement sentencia;
        
        try {
            String sql = "INSERT INTO pagos (idUsuario,idInmueble,adjunto,monto,fechaPago,fechaPago2)"
            +"values(?,?,?,?,?,?);";

            sentencia = nuevaCon.prepareStatement(sql);
            sentencia.setInt(1, pago.getIdUsuario());
            sentencia.setInt(2, pago.getIdInmueble());
            sentencia.setString(3, pago.getAdjunto());
            sentencia.setString(4, pago.getMonto());
            sentencia.setString(5, pago.getFechaPago());
            sentencia.setString(6, pago.getFechaPago2());
            sentencia.execute();
            
            } catch (Exception ex) {
                
            miRespuesta = ex.getMessage();
            System.err.println("ocurrió un problema en pagos\n" + ex.getMessage());

        }
        return miRespuesta;

    }
        //////////////////////////////////
    public String actualizarPago(pagos pago) {

        String miRespuesta = "";
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
       try {
            String Query = "insert into pagos (idUsuario,idInmueble,adjunto,monto,fechaPago,fechaPago2)" + "values"
                    + "(?,?,?,?,?,?);";

            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setInt(1, pago.getIdUsuario());
            sentencia.setInt(2, pago.getIdInmueble());
            sentencia.setString(3, pago.getAdjunto());
            sentencia.setString(4, pago.getMonto());
            sentencia.setString(5, pago.getFechaPago());
            sentencia.setString(6, pago.getFechaPago2());
            sentencia.execute();
            
            } catch (Exception ex) {
                
            miRespuesta = ex.getMessage();
            System.err.println("ocurrió un problema en pagos\n" + ex.getMessage());

        }
        return miRespuesta;

    }
    
    
    //////////////
    public pagos consultarPago(int idPago) {

        pagos mipago = null;
        
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {
            Statement sentencia = nuevaCon.createStatement();

            String Sql = "SELECT idPago, idUsuario, idInmueble, adjunto, monto, fechapago, fechapago2 FROM pagos WHERE idPago = " + idPago;

            ResultSet rs = sentencia.executeQuery(Sql);
            
            while (rs.next()) {

                mipago = new pagos();
                mipago.setIdPago(rs.getInt(1));
                mipago.setIdUsuario(rs.getInt(2));
                mipago.setIdInmueble(rs.getInt(3));
                mipago.setAdjunto(rs.getString(4));
                mipago.setMonto(rs.getString(5));
                mipago.setFechaPago(rs.getString(6));
                mipago.setFechaPago2(rs.getString(7));

            }

            return mipago;

        } catch (Exception ex) {

            System.out.println(ex.getMessage());
            return mipago;
            
        }
       
    }
    

///////
    public ArrayList<pagos> ConsultarListadoPagos(String criterio) {

        ArrayList<pagos> milistapagos = new ArrayList<pagos>();
        pagos mipagos;

        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        try {
            Statement sentencia = nuevaCon.createStatement();

            String sql = "SELECT idPago, idUsuario, idInmueble, adjunto, monto, fechaPago, fechaPago2 " 
                    + "FROM pagos where idPago like '%" + criterio + "%' ORDER BY idPago;";
            
            ResultSet rs = sentencia.executeQuery(sql);
            while (rs.next()) {
             
                mipagos = new pagos();
                mipagos.setIdPago(rs.getInt(1));
                mipagos.setIdUsuario(rs.getInt(2));
                mipagos.setIdInmueble(rs.getInt(3));
                mipagos.setAdjunto(rs.getString(4));
                mipagos.setMonto(rs.getString(5));
                mipagos.setFechaPago(rs.getString(6));
                mipagos.setFechaPago2(rs.getString(7));
                
                milistapagos.add(mipagos);
            }
            
            return milistapagos;
            
        } catch (Exception ex) {
            System.out.println("error consulta lista de pagos:" + ex.getMessage());
            return milistapagos;

        }
    }
    
    //////
     public String EliminarPago(pagos pago){
        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        PreparedStatement sentencia;
        try {
            String Query ="delete from pagos where idPago=? and idUsuario=? and idInmueble=? and adjunto=?  and monto=? and fechaPago=? and fechaPago2=?;";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setInt(1,pago.getIdPago());
            sentencia.setInt(2,pago.getIdUsuario());
            sentencia.setInt(3,pago.getIdInmueble ());
            sentencia.setString(4,pago.getAdjunto ());
            sentencia.setString(5,pago.getMonto());
            sentencia.setString(6,pago.getFechaPago());
            sentencia.setString(7,pago.getFechaPago2 ());
            
            sentencia.execute();
            miRespuesta = "";
            
        } catch (Exception ex){
            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un error en pagosDAO.Eliminarpago" + ex.getMessage());
        }
        
        return miRespuesta;
        
     }
}
