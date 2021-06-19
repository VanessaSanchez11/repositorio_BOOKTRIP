package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.estados;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author oscar sanabria
 */
public class estadosDAO {

   
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion c = new Conexion();
 
    public ArrayList<estados> ConsultarListadoEstados( String nombre) {
        ArrayList<estados> milistaestado = new ArrayList<estados>();

        estados miEstado;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
          // Se recibimos el parametro de consulta para recuperar la informacion
        System.out.println("Buscar parametro:" + nombre);
        try {
            Statement sentencia = nuevaCon.createStatement();

            String Query = " select idEstado, nombre from estados "
                    + " where "
                   + "nombre like '%"+ nombre + "%' ORDER BY idEstado;";
            ResultSet rs = sentencia.executeQuery(Query);

            while (rs.next()) {
                miEstado = new estados();
                miEstado.setIdEstado(rs.getInt(1));
                miEstado.setNombre(rs.getString(2));
                
                milistaestado.add(miEstado);

            }
            return milistaestado;
        } catch (Exception e) {
            System.out.println("Error el a consulta inmueble" + e.getMessage());
            return milistaestado;

        }

    }
    public List listar() {
        List<estados> lista = new ArrayList<>();
        String sql = "select * from estados";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                estados p = new estados();
                p.setIdEstado(rs.getInt(1));
                p.setNombre(rs.getString(2));
                
                lista.add(p);
            }
        } catch (Exception e) {
        }
        return lista;
    }
   
    public estados listarId(int id) {
        String sql = "select * from estados where idEstado=" + id;
        estados pe = new estados();
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                pe.setIdEstado(rs.getInt(1));
                pe.setNombre(rs.getString(2));
                
            }
        } catch (Exception e) {
        }
        return pe;
    }
     public List buscar(String texto) {
        String sql ="select * from estados where idEstado LIKE'%"+texto+"%'or nombre LIKE'%"+texto+"%'";
      List<estados> lista= new ArrayList<>();
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                estados pe= new estados();
                pe.setIdEstado(rs.getInt("idEstado"));
                pe.setNombre(rs.getString("nombre"));
                 lista.add(pe);
                
            }
        } catch (Exception e) {
        }
        return lista;
    }
    public void agregar(estados p) {
        String sql = "insert into estados(nombre)values(?)";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNombre());
          
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }
    public void update(estados p) {
        String sql = "update estados set nombre=? where idEstado=?";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNombre());
            ps.setInt(2, p.getIdEstado());
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void delete(int id) {
        String sql = "delete from estados where idEstado=" + id;
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }
   

   
}
