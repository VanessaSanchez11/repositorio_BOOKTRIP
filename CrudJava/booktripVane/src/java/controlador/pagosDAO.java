package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.pagos;

public class pagosDAO {
    
    public String adicionarPago(pagos pago) {

        String miRespuesta = "";
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        PreparedStatement sentencia;
        
        try {
            String Query = "insert into pagos (idUsuario,idInmueble,adjunto,monto,fechaPago,fechaPago2)"
            +"values(?,?,?,?,?,?);";

            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setInt(1, pago.getIdUsuario());
            sentencia.setInt(2, pago.getIdInmueble());
            sentencia.setString(3, pago.getAdjunto());
            sentencia.setString(4, pago.getMonto());
            sentencia.setString(5, pago.getFechaPago());
            sentencia.setString(6, pago.getFechaPago2());
            sentencia.execute();
            
            } catch (Exception ex) {
            miRespuesta = "";
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
            String Query = "UPDATE pagos SET idUsuario = ?, idInmueble = ?, adjunto = ?, monto =?, fechaPago =?, fechaPago2 = ? WHERE idPago = ? ";
                  

            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setInt(1, pago.getIdUsuario());
            sentencia.setInt(2, pago.getIdInmueble());
            sentencia.setString(3, pago.getAdjunto());
            sentencia.setString(4, pago.getMonto());
            sentencia.setString(5, pago.getFechaPago());
            sentencia.setString(6, pago.getFechaPago2());
            sentencia.setInt(7, pago.getIdPago());
             sentencia.executeUpdate();
            
            } catch (Exception ex) {
            miRespuesta = "";
            miRespuesta = ex.getMessage();
            System.err.println("ocurrió un problema en pagos\n" + ex.getMessage());

        }
        return miRespuesta;

    }
}
