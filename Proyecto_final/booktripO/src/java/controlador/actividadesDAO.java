/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.actividades;

public class actividadesDAO {

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
                actividades p = new actividades();
                p.setIdActividad(rs.getInt(1));
                p.setIdMunicipio(rs.getInt(2));
                p.setNombre(rs.getString(3));
                p.setLugar(rs.getString(4));
                p.setDescripcion(rs.getString(5));
                lista.add(p);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public actividades listarId(int id) {
        String sql = "select * from actividades where idActividad=" + id;
        actividades pe = new actividades();
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                pe.setIdActividad(rs.getInt(1));
                pe.setIdMunicipio(rs.getInt(2));
                pe.setNombre(rs.getString(3));
                pe.setLugar(rs.getString(4));
                pe.setDescripcion(rs.getString(5));

            }
        } catch (Exception e) {
        }
        return pe;
    }

    public void agregar(actividades p) {
        String sql = "insert into actividades(idActividad, idMunicipio, nombre, lugar, descripcion)values(?,?,?,?,?)";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.setInt(1, p.getIdActividad());
            ps.setInt(2, p.getIdMunicipio());
            ps.setString(3, p.getNombre());
            ps.setString(4, p.getLugar());
            ps.setString(5, p.getDescripcion());
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void update(actividades p) {
        String sql = "update actividades set idMunicipio=?,nombre=?, lugar=?, descripcion=? where idActividad=?";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps = con.prepareStatement(sql);

            ps.setInt(1, p.getIdMunicipio());
            ps.setString(2, p.getNombre());
             ps.setString(3, p.getLugar());
            ps.setString(4, p.getDescripcion());
            
            ps.setInt(5, p.getIdActividad());
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void delete(int id) {
        String sql = "delete from actividades where idActividad=" + id;
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
    public ArrayList<actividades> ConsularListaActividades(String criterio) {
        ArrayList<actividades> milistaActividades = new ArrayList<actividades>();

        actividades miActividad;

        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {
            Statement sentencia = nuevaCon.createStatement();

            String Query = "SELECT idActividad, idMunicipio, nombre, lugar, descripcion" + " FROM actividades  where idActividad like '%" + criterio + "%' ORDER BY idActividad;";
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {

                miActividad = new actividades();
                miActividad.setIdActividad(rs.getInt(1));
                miActividad.setIdMunicipio(rs.getInt(2));
                miActividad.setNombre(rs.getString(3));
                miActividad.setLugar(rs.getString(4));
                miActividad.setDescripcion(rs.getString(5));

                milistaActividades.add(miActividad);

            }

            return milistaActividades;

        } catch (Exception ex) {
            System.out.println("errror en la consulta" + ex.getMessage());
            return milistaActividades;
        }

    }

}
