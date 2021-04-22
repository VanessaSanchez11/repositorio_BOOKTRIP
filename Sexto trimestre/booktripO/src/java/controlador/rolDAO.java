/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.rol;


public class rolDAO {

   PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion c = new Conexion();
 
    public ArrayList<rol> ConsultarListadoRoles( String nombre) {
        ArrayList<rol> milistaestado = new ArrayList<rol>();

        rol miRol;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
          // Se recibimos el parametro de consulta para recuperar la informacion
        System.out.println("Buscar parametro:" + nombre);
        try {
            Statement sentencia = nuevaCon.createStatement();

            String Query = " select idRol, nombre from roles "
                    + " where "
                   + "nombre like '%"+ nombre + "%' ORDER BY idRol;";
            ResultSet rs = sentencia.executeQuery(Query);

            while (rs.next()) {
                miRol = new rol();
                miRol.setIdRol(rs.getInt(1));
                miRol.setNombre(rs.getString(2));
                
                milistaestado.add(miRol);

            }
            return milistaestado;
        } catch (Exception e) {
            System.out.println("Error el a consulta roles" + e.getMessage());
            return milistaestado;

        }

    }
    public List listar() {
        List<rol> lista = new ArrayList<>();
        String sql = "select * from roles";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                rol p = new rol();
                p.setIdRol(rs.getInt(1));
                p.setNombre(rs.getString(2));
                
                lista.add(p);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public rol listarId(int id) {
        String sql = "select * from roles where idRol=" + id;
        rol pe = new rol();
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                pe.setIdRol(rs.getInt(1));
                pe.setNombre(rs.getString(2));
                
            }
        } catch (Exception e) {
        }
        return pe;
    }

    public void agregar(rol p) {
        String sql = "insert into roles(nombre)values(?)";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNombre());
          
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }
    public void update(rol p) {
        String sql = "update rol set nombre=? where idRol=?";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNombre());
            ps.setInt(2, p.getIdRol());
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void delete(int id) {
        String sql = "delete from roles where idRol=" + id;
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }
   

   
}
