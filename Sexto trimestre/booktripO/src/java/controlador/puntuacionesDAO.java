package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.puntuaciones;

public class puntuacionesDAO {
    
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion c = new Conexion();

    public List listar() {
        List<puntuaciones> lista = new ArrayList<>();
        String sql = "select * from puntuaciones";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                puntuaciones p = new puntuaciones();
                p.setIdPuntuacion(rs.getInt(1));
                p.setIdUsuario(rs.getInt(2));
                p.setIdInmueble(rs.getInt(3));
                p.setFechaCreada(rs.getString(4));
                p.setDescripcion(rs.getString(5));
                p.setCalificacion(rs.getString(6));

                lista.add(p);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public puntuaciones listarId(int id) {
        String sql = "select * from puntuaciones where idPuntuacion=" + id;
        puntuaciones pe = new puntuaciones();
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                pe.setIdPuntuacion(rs.getInt(1));
                pe.setIdUsuario(rs.getInt(2));
                pe.setIdInmueble(rs.getInt(3));
                pe.setFechaCreada(rs.getString(4));
                pe.setDescripcion(rs.getString(5));
                pe.setCalificacion(rs.getString(6));
                
            }
        } catch (Exception e) {
        }
        return pe;
    }

     public void agregar(puntuaciones p) {
        String sql = "insert into puntuaciones( idUsuario, idInmueble,fechaCreada, descripcion, calificacion)values(?,?,?,?,?)";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
             
             ps.setInt(1, p.getIdUsuario());
             ps.setInt(2, p.getIdInmueble());
             ps.setString(3, p.getFechaCreada());
            ps.setString(4, p.getDescripcion());
             ps.setString(5, p.getCalificacion());
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void update(puntuaciones p) {
        String sql = "update puntuaciones set idUsuario=?,idInmueble=?, fechaCreada=?, "
                + "descripcion=?,calificacion=? where idPuntuacion=?";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps = con.prepareStatement(sql);
            
             ps.setInt(1, p.getIdUsuario());
             ps.setInt(2, p.getIdInmueble());
             ps.setString(3, p.getFechaCreada());
             ps.setString(4, p.getDescripcion());
             ps.setString(5, p.getCalificacion());
          
            ps.setInt(6, p.getIdPuntuacion());
             
             ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void delete(int id) {
        String sql = "delete from puntuaciones where idPuntuacion=" + id;
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    
    public ArrayList<puntuaciones> ConsultarListadoPuntuaciones(String criterio) {

        ArrayList<puntuaciones> milistapuntuaciones = new ArrayList<puntuaciones>();
        puntuaciones mipuntuaciones;

        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
        
        try {
            Statement sentencia = nuevaCon.createStatement();

            String Query = "SELECT idPuntuacion, idUsuario, idInmueble, fechaCreada, descripcion, calificacion " 
                    + "FROM puntuaciones where idPuntuacion like '%" + criterio + "%' ORDER BY idPuntuacion;";
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {
             
                mipuntuaciones = new puntuaciones();
                mipuntuaciones.setIdPuntuacion(rs.getInt(1));
                mipuntuaciones.setIdUsuario(rs.getInt(2));
                mipuntuaciones.setIdInmueble(rs.getInt(3)); 
                mipuntuaciones.setFechaCreada(rs.getString(4));
                mipuntuaciones.setDescripcion(rs.getString(5));
                mipuntuaciones.setCalificacion(rs.getString(6));
                
                milistapuntuaciones.add(mipuntuaciones);
            }
            
            return milistapuntuaciones;
            
        } catch (Exception ex) {
            System.out.println("error consulta lista de puntuaciones:" + ex.getMessage());
            return milistapuntuaciones;

        }
       

    }
}