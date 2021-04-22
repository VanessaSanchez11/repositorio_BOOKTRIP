package controlador;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.inmuebles;

public class inmueblesDAO {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion c = new Conexion();
    

    public List listar() {
        List<inmuebles> lista = new ArrayList<>();
        String sql = "select * from inmuebles";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                inmuebles p = new inmuebles();
                p.setIdInmueble(rs.getInt(1));
                p.setIdTipo(rs.getInt(2));
                p.setIdDepartamento(rs.getInt(3));
                p.setIdUsuario(rs.getInt(4));
                p.setIdEstado(rs.getInt(5));
                p.setNombre(rs.getString(6));
                p.setDireccion(rs.getString(7));
                p.setCapacidad(rs.getInt(8));
                p.setDescripcion(rs.getString(9));
                p.setPrecio(rs.getInt(10));
                p.setAdjunto(rs.getString(11));

                lista.add(p);
            }
        } catch (Exception e) {
        }
        return lista;
    }
    
    public inmuebles listarId(int id) {
        String sql = "select * from inmuebles where idInmueble=" + id;
        inmuebles pe = new inmuebles();
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                pe.setIdInmueble(rs.getInt(1));
                pe.setIdTipo(rs.getInt(2));
                pe.setIdDepartamento(rs.getInt(3));
                pe.setIdUsuario(rs.getInt(4));
                pe.setIdEstado(rs.getInt(5));
                pe.setNombre(rs.getString(6));
                pe.setDireccion(rs.getString(7));
                pe.setCapacidad(rs.getInt(8));
                pe.setDescripcion(rs.getString(9));
                pe.setPrecio(rs.getInt(10));
                pe.setAdjunto(rs.getString(11));

            }
        } catch (Exception e) {
        }
        return pe;
    }
    

    public void agregar(inmuebles p) throws FileNotFoundException, SQLException {
        String sql = "insert into inmuebles(idTipo, idDepartamento, idUsuario, idEstado, nombre, direccion, capacidad, descripcion,"
                + " precio, adjunto)values(?, ?, ?, ?, ?, ?, ?, ?, ?,?)";
       

        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.setInt(1, p.getIdTipo());
            ps.setInt(2, p.getIdDepartamento());
            ps.setInt(3, p.getIdUsuario());
            ps.setInt(4, p.getIdEstado());
            ps.setString(5, p.getNombre());
            ps.setString(6, p.getDireccion());
            ps.setInt(7, p.getCapacidad());
            ps.setString(8, p.getDescripcion());
            ps.setInt(9, p.getPrecio());
            ps.setString(10, p.getAdjunto());

            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void update(inmuebles p) {
        String sql = "update inmuebles set idTipo=?, idDepartamento=?, idUsuario=?, idEstado=?, nombre=?,"
                + "direccion=?, capacidad=?, descripcion=?, precio=?, adjunto=? where idInmueble=?";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.setInt(1, p.getIdTipo());
            ps.setInt(2, p.getIdDepartamento());
            ps.setInt(3, p.getIdUsuario());
            ps.setInt(4, p.getIdEstado());
            ps.setString(5, p.getNombre());
            ps.setString(6, p.getDireccion());
            ps.setInt(7, p.getCapacidad());
            ps.setString(8, p.getDescripcion());
            ps.setInt(9, p.getPrecio());
            ps.setString(10, p.getAdjunto());
            ps.setInt(11, p.getIdInmueble());
            
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void delete(int id) {
        String sql = "delete from inmuebles where idInmueble=" + id;
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }
     public List buscar(String texto) {
        String sql ="select * from inmuebles where idInmueble LIKE'%"+texto+"%'or nombre LIKE'%"+texto+"%'";
      List<inmuebles> lista= new ArrayList<>();
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                inmuebles pe= new inmuebles();
                pe.setIdInmueble(rs.getInt("idInmueble"));
                pe.setNombre(rs.getString("nombre"));
                 lista.add(pe);
                
            }
        } catch (Exception e) {
        }
        return lista;
    }
        public ArrayList<inmuebles> ConsultarListadoInmueble(String criterio) {
        ArrayList<inmuebles> milistainmueble = new ArrayList<inmuebles>();

        inmuebles miInmueble;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {
            Statement sentencia = nuevaCon.createStatement();

            String Query = "select idInmueble, idTipo, idDepartamento, idUsuario, idEstado,"
                    + "nombre, direccion, capacidad, descripcion, precio, adjunto"
                    + " from inmuebles where nombre like '%"
                    + criterio + "%' ORDER BY nombre;";

            ResultSet rs = sentencia.executeQuery(Query);

            while (rs.next()) {
                miInmueble = new inmuebles();
                miInmueble.setIdInmueble(rs.getInt(1));
                miInmueble.setIdTipo(rs.getInt(2));
                miInmueble.setIdDepartamento(rs.getInt(3));
                miInmueble.setIdUsuario(rs.getInt(4));
                miInmueble.setIdEstado(rs.getInt(5));
                miInmueble.setNombre(rs.getString(6));
                miInmueble.setDireccion(rs.getString(7));
                miInmueble.setCapacidad(rs.getInt(8));
                miInmueble.setDescripcion(rs.getString(9));
                miInmueble.setPrecio(rs.getInt(10));
                miInmueble.setAdjunto(rs.getString(11));
                milistainmueble.add(miInmueble);

            }
            return milistainmueble;
        } catch (Exception e) {
            System.out.println("Error el a consulta inmueble" + e.getMessage());
            return milistainmueble;

        }

    }
}
