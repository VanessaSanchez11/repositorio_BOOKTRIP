package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.reservas;


public class reservasDAO {
    
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion c = new Conexion();

    public List listar() {
        List<reservas> lista = new ArrayList<>();
        String sql = "select * from reservas";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                reservas p = new reservas();
                p.setIdReserva(rs.getInt(1));
                p.setIdUsuario(rs.getInt(2));
                p.setIdInmueble(rs.getInt(3));
                p.setIdEstado(rs.getInt(4));
                p.setFechaReserva(rs.getString(5));
                p.setCheckIn(rs.getString(6));
                p.setCheckOut(rs.getString(7));

                lista.add(p);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public reservas listarId(int id) {
        String sql = "select * from reservas where idReserva=" + id;
        reservas pe = new reservas();
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                pe.setIdReserva(rs.getInt(1));
                pe.setIdUsuario(rs.getInt(2));
                pe.setIdInmueble(rs.getInt(3));
                pe.setIdEstado(rs.getInt(4));
                pe.setFechaReserva(rs.getString(5));
                pe.setCheckIn(rs.getString(6));
                pe.setCheckOut(rs.getString(7));
                
            }
        } catch (Exception e) {
        }
        return pe;
    }

     public void agregar(reservas p) {
        String sql = "insert into reservas( idUsuario, idInmueble,idEstado, fechaReserva, checkIn, checkOut)values(?,?,?,?,?,?)";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
             
             ps.setInt(1, p.getIdUsuario());
             ps.setInt(2, p.getIdInmueble());
             ps.setInt(3, p.getIdEstado());
             ps.setString(4, p.getFechaReserva());
            ps.setString(5, p.getCheckIn());
             ps.setString(6, p.getCheckOut());
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void update(reservas p) {
        String sql = "update reservas set idUsuario=?,idInmueble=?,idEstado=?, fechaReserva=?, "
                + "checkIn=?,checkOut=? where idReserva=?";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps = con.prepareStatement(sql);
            
             ps.setInt(1, p.getIdUsuario());
             ps.setInt(2, p.getIdInmueble());
             ps.setInt(3, p.getIdEstado());
             ps.setString(4, p.getFechaReserva());
             ps.setString(5, p.getCheckIn());
             ps.setString(6, p.getCheckOut());
          
            ps.setInt(7, p.getIdReserva());
             
             ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void delete(int id) {
        String sql = "delete from reservas where idReserva=" + id;
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
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

}

