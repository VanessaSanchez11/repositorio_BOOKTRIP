
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.actividades;
import modelo.municipios;

public class municipiosDAO {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion c = new Conexion();

    public List listar() {
        List<actividades> lista = new ArrayList<>();
        String sql = "select * from actividades";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                municipios p = new municipios();
                p.setIdDepartamento(rs.getInt(1));
                p.setIdMunicipio(rs.getInt(2));
                p.setNombre(rs.getString(3));
                
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public municipios listarId(int id) {
        String sql = "select * from municipios where idMunicipio=" + id;
        municipios pe = new municipios();
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                pe.setIdDepartamento(rs.getInt(1));
                pe.setIdMunicipio(rs.getInt(2));
                pe.setNombre(rs.getString(3));

            }
        } catch (Exception e) {
        }
        return pe;
    }

    public void agregar(municipios p) {
        String sql = "insert into municipios (idDepartamento, idMunicipio, nombre)values(?,?,?)";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.setInt(1, p.getIdDepartamento());
            ps.setInt(2, p.getIdMunicipio());
            ps.setString(3, p.getNombre());
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void update(municipios p) {
        String sql = "update municipios set idDepartamento=?,nombre=? where idMunicipio=?";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps = con.prepareStatement(sql);

            ps.setInt(1, p.getIdMunicipio());
            ps.setString(2, p.getNombre());
            
            
            ps.setInt(5, p.getIdMunicipio());
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void delete(int id) {
        String sql = "delete from Municipios where idMunicipio=" + id;
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    /*
     Listas
     */
    public ArrayList<municipios> ConsularListaMunicipios(String nombre) {
        ArrayList<municipios> milistaMuni = new ArrayList<municipios>();

        municipios miMunicipio;

        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {
            Statement sentencia = nuevaCon.createStatement();

           // String Query = "SELECT idDepartamento, idMunicipio, nombre" + " FROM muicipios  where idMunicipio like '%" + 
           //criterio + "%' ORDER BY idMunicipio;";
            String Query = " select idMunicipio, idDepartamento, nombre from municipios "
                    + " where "
                   + "nombre like '%"+ nombre + "%' ORDER BY idMunicipio;";
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {

                miMunicipio = new municipios();
              
                miMunicipio.setIdMunicipio(rs.getInt(1));
                  miMunicipio.setIdDepartamento(rs.getInt(2));
                miMunicipio.setNombre(rs.getString(3));
                
                milistaMuni.add(miMunicipio);

            }

            return milistaMuni;

        } catch (Exception ex) {
            System.out.println("errror en la consulta" + ex.getMessage());
            return milistaMuni;
        }

    }

}
