
package controlador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import modelo.reservas;


public class reservasDAO {
    
    public String adicionarReserva(reservas reserva) {

        String miRespuesta = "";
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        PreparedStatement sentencia;
        
    try {
            String Query = "insert into reservas (idUsuario,idInmueble,idEstado,fechaReserva,checkIn,checkOut)"
            +"values(?,?,?,?,?,?);";

            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setInt(1, reserva.getIdUsuario());
            sentencia.setInt(2, reserva.getIdInmueble());
            sentencia.setInt(3, reserva.getIdEstado());
            sentencia.setString(4, reserva.getFechaReserva());
            sentencia.setString(5, reserva.getCheckIn());
            sentencia.setString(6, reserva.getCheckOut());
            sentencia.execute();
            
            } catch (Exception ex) {
            miRespuesta = "";
            miRespuesta = ex.getMessage();
            System.err.println("ocurrió un problema en reservas\n" + ex.getMessage());

        }
        return miRespuesta;
    }
        
     //////
     
        public String actualizarReservas (reservas reserva){

        String miRespuesta = "";
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "update reservas  set idUsuario=?,idInmueble=?,idEstado=?,fechaReserva=?,checkIn=?,checkOut=? where idReserva = ? ";

            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setInt(1, reserva.getIdUsuario());
            sentencia.setInt(2, reserva.getIdInmueble());
            sentencia.setInt(3, reserva.getIdEstado());
            sentencia.setString(4, reserva.getFechaReserva());
            sentencia.setString(5, reserva.getCheckIn());
            sentencia.setString(6, reserva.getCheckOut());
            sentencia.setInt(7, reserva.getIdReserva());
            sentencia.executeUpdate();

        } catch (Exception ex) {
            miRespuesta = "";
            miRespuesta = ex.getMessage();
            System.err.println("ocurrió un problema en reserva\n" + ex.getMessage());

        }
        return miRespuesta;

    }

    }

