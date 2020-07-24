
package controlador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
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
            String Query = "update reservas  set idUsuario=?,idInmueble=?,idEstado=?,fechaReserva=?,checkIn=?,checkOut=? where idReserva ";

            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setInt(1, reserva.getIdUsuario());
            sentencia.setInt(2, reserva.getIdInmueble());
            sentencia.setInt(3, reserva.getIdEstado());
            sentencia.setString(4, reserva.getFechaReserva());
            sentencia.setString(5, reserva.getCheckIn());
            sentencia.setString(6, reserva.getCheckOut());
            sentencia.executeUpdate();

        } catch (Exception ex) {
            miRespuesta = "";
            miRespuesta = ex.getMessage();
            System.err.println("ocurrió un problema en reserva\n" + ex.getMessage());

        }
        return miRespuesta;

    }
        //////////////
    public reservas consultarReserva(int idReserva) {

        reservas reserva = null;
        
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {
            Statement sentencia = nuevaCon.createStatement();

            String sql = "SELECT idReserva, idUsuario, idInmueble, idEstado, fechaReserva, checkIn, checkOut"
                    + " FROM reservas WHERE idReserva = " + idReserva;

            ResultSet rs = sentencia.executeQuery(sql);
            
            while (rs.next()) {

                reserva = new reservas();
                reserva.setIdReserva(rs.getInt(1));
                reserva.setIdUsuario(rs.getInt(2));
                reserva.setIdInmueble(rs.getInt(3));
                reserva.setIdEstado(rs.getInt(4));
                reserva.setFechaReserva(rs.getString(5));
                reserva.setCheckIn(rs.getString(6));
                reserva.setCheckOut(rs.getString(7));

            }

            return reserva;

        } catch (Exception ex) {

            System.out.println(ex.getMessage());
            return reserva;
           
       
    }
   
}
    

///////
    public ArrayList<reservas> ConsultarListadoReservas(String criterio) {

        ArrayList<reservas> milistareservas = new ArrayList<reservas>();
        reservas mireservas;

        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        try {
            Statement sentencia = nuevaCon.createStatement();

            String sql = "SELECT idReserva, idUsuario, idInmueble, idEstado, fechaReserva, checkIn, checkOut " 
                    + "FROM reservas where idReserva like '%" + criterio + "%' ORDER BY idReserva;";
            ResultSet rs = sentencia.executeQuery(sql);
            while (rs.next()) {
             
                mireservas = new reservas();
                mireservas.setIdReserva(rs.getInt(1));
                mireservas.setIdUsuario(rs.getInt(2));
                mireservas.setIdInmueble(rs.getInt(3));
                mireservas.setIdEstado(rs.getInt(4));
                mireservas.setFechaReserva(rs.getString(5));
                mireservas.setCheckIn(rs.getString(6));
                mireservas.setCheckOut(rs.getString(7));
                
                milistareservas.add(mireservas);
            }
            
            return milistareservas;
            
        } catch (Exception ex) {
            System.out.println("error consulta lista de reservas:" + ex.getMessage());
            return milistareservas;

        }
    }

///////////

public String EliminarReserva(reservas reserva){
        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        PreparedStatement sentencia;
        try {
            String Query ="delete from reservas where idReserva=? and idUsuario=? and idInmueble=? and idEstado=?  and fechaReserva=? and checkIn=? and checkOut=?;";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setInt(1,reserva.getIdReserva());
            sentencia.setInt(2,reserva.getIdUsuario());
            sentencia.setInt(3,reserva.getIdInmueble ());
            sentencia.setInt(4,reserva.getIdEstado ());
            sentencia.setString(5,reserva.getFechaReserva());
            sentencia.setString(6,reserva.getCheckIn ());
            sentencia.setString(7,reserva.getCheckOut ());
            
            sentencia.execute();
            miRespuesta = "";
            
        } catch (Exception ex){
            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un error en reservasDAO.Eliminarreserva" + ex.getMessage());
        }
        
        return miRespuesta;
        
     }

}

