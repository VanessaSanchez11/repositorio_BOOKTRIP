package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.servicios;

public class serviciosDAO {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion c = new Conexion();
 
    public ArrayList<servicios> ConsultarListadoServicios( String nombre) {
        ArrayList<servicios> milistaServicio = new ArrayList<servicios>();

        servicios miServicio;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
          // Se recibimos el parametro de consulta para recuperar la informacion
        System.out.println("Buscar parametro:" + nombre);
        try {
            Statement sentencia = nuevaCon.createStatement();

            String Query = " select idServicio, nombre from servicios "
                    + " where "
                   + "nombre like '%"+ nombre + "%' ORDER BY idServicio;";
            ResultSet rs = sentencia.executeQuery(Query);

            while (rs.next()) {
                miServicio = new servicios();
                miServicio.setIdServicio(rs.getInt(1));
                miServicio.setNombre(rs.getString(2));
                miServicio.setDescripcion(rs.getString(3));
                milistaServicio.add(miServicio);

            }
            return milistaServicio;
        } catch (Exception e) {
            System.out.println("Error el a consulta servicio" + e.getMessage());
            return milistaServicio;

        }

    }
    public List listar() {
        List<servicios> lista = new ArrayList<>();
        String sql = "select * from servicios";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                servicios p = new servicios();
                p.setIdServicio(rs.getInt(1));
                p.setNombre(rs.getString(2));
                p.setDescripcion(rs.getString(3));
                
                lista.add(p);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public servicios listarId(int id) {
        String sql = "select * from servicios where idServicio=" + id;
        servicios pe = new servicios();
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                pe.setIdServicio(rs.getInt(1));
                pe.setNombre(rs.getString(2));
                pe.setDescripcion(rs.getString(3));
            }
        } catch (Exception e) {
        }
        return pe;
    }

    public void agregar(servicios p) {
        String sql = "insert into servicios(nombre,descripcion)values(?,?)";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getDescripcion());
          
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }
    public void update(servicios p) {
        String sql = "update servicios set nombre=?, descripcion=? where idServicio=?";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNombre());
            ps.setString(2, p.getDescripcion());
            ps.setInt(3, p.getIdServicio());
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void delete(int id) {
        String sql = "delete from servicios where idServicio=" + id;
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }
    
}


