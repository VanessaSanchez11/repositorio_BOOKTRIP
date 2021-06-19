package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.pagos;

public class pagosDAO {
    
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion c = new Conexion();

    public List listar() {
        List<pagos> lista = new ArrayList<>();
        String sql = "select * from pagos";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                pagos p = new pagos();
                p.setIdPago(rs.getInt(1));
                p.setIdUsuario(rs.getInt(2));
                p.setIdInmueble(rs.getInt(3));
                p.setAdjunto(rs.getString(4));
                p.setMonto(rs.getInt(5));
                p.setFechaPago(rs.getString(6));
                p.setFechaPago2(rs.getString(7));

                lista.add(p);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public pagos listarId(int id) {
        String sql = "select * from pagos where idPago=" + id;
        pagos pe = new pagos();
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                pe.setIdPago(rs.getInt(1));
                 pe.setIdUsuario(rs.getInt(2));
                  pe.setIdInmueble(rs.getInt(3));
                  pe.setAdjunto(rs.getString(4));
                   pe.setMonto(rs.getInt(5));
                pe.setFechaPago(rs.getString(6));
                pe.setFechaPago2(rs.getString(7));
                
            }
        } catch (Exception e) {
        }
        return pe;
    }

    public void agregar(pagos p) {
        String sql = "insert into pagos( idUsuario, idInmueble, adjunto, monto,"
                + "fechaPago, fechaPago2)values(?,?,?,?,?,?)";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
             ps.setInt(1, p.getIdUsuario());
             ps.setInt(2, p.getIdInmueble());
             ps.setString(3, p.getAdjunto());
              ps.setInt(4, p.getMonto());
            ps.setString(5, p.getFechaPago());
            ps.setString(6, p.getFechaPago2());
           
            
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void update(pagos p) {
        String sql = "update pagos set idUsuario=?,idInmueble=?, adjunto=?, monto=?, fechaPago=?,"
                + " fechaPago2=? where idPago=?";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps = con.prepareStatement(sql);
            
            ps.setInt(1, p.getIdUsuario());
            ps.setInt(2, p.getIdInmueble());
            ps.setString(3, p.getAdjunto());
            ps.setInt(4, p.getMonto());
            ps.setString(5, p.getFechaPago());
            ps.setString(6, p.getFechaPago2());
            ps.setInt(7, p.getIdPago());
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }
    

    public void delete(int id) {
        String sql = "delete from pagos where idPago=" + id;
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

}
