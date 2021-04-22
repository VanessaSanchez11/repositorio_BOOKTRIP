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
import modelo.tipoinmuebles;

public class tipoinmuebleDAO {
     
    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion c = new Conexion();
 
    public ArrayList<tipoinmuebles> ConsultarListadoTipos( String nombre) {
        ArrayList<tipoinmuebles> milistatipo = new ArrayList<tipoinmuebles>();

        tipoinmuebles miTipo;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
          // Se recibimos el parametro de consulta para recuperar la informacion
        System.out.println("Buscar parametro:" + nombre);
        try {
            Statement sentencia = nuevaCon.createStatement();

            String Query = " select idTipo, nombre from tipoinmuebles "
                    + " where "
                   + "nombre like '%"+ nombre + "%' ORDER BY idTipo;";
            ResultSet rs = sentencia.executeQuery(Query);

            while (rs.next()) {
                miTipo = new tipoinmuebles();
                miTipo.setIdTipo(rs.getInt(1));
                miTipo.setNombre(rs.getString(2));
                
                milistatipo.add(miTipo);

            }
            return milistatipo;
        } catch (Exception e) {
            System.out.println("Error en la  consulta" + e.getMessage());
            return milistatipo;

        }

    }
    public List listar() {
        List<tipoinmuebles> lista = new ArrayList<>();
        String sql = "select * from tipoinmuebles";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                tipoinmuebles p = new tipoinmuebles();
                p.setIdTipo(rs.getInt(1));
                p.setNombre(rs.getString(2));
                
                lista.add(p);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public tipoinmuebles listarId(int id) {
        String sql = "select * from tipoinmuebles where idTipo=" + id;
        tipoinmuebles pe = new tipoinmuebles();
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                pe.setIdTipo(rs.getInt(1));
                pe.setNombre(rs.getString(2));
                
            }
        } catch (Exception e) {
        }
        return pe;
    }

    public void agregar(tipoinmuebles p) {
        String sql = "insert into tipoinmuebles(nombre)values(?)";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNombre());
          
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }
    public void update(tipoinmuebles p) {
        String sql = "update tipoinmuebles set nombre=? where idTipo=?";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNombre());
            ps.setInt(2, p.getIdTipo());
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void delete(int id) {
        String sql = "delete from tipoinmuebles where idTipo=" + id;
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }
   
public List buscar(String texto) {
        String sql ="select * from tipoinmuebles where idTipo LIKE'%"+texto+"%'or nombre LIKE'%"+texto+"%'";
      List<tipoinmuebles> lista= new ArrayList<>();
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                tipoinmuebles pe= new tipoinmuebles();
                pe.setIdTipo(rs.getInt("idTipo"));
                pe.setNombre(rs.getString("nombre"));
                 lista.add(pe);
                
            }
        } catch (Exception e) {
        }
        return lista;
    }
   
}
