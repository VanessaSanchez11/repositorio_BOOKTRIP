/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import static java.sql.DriverManager.println;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import modelo.departamento;

/**
 *
 * @author 57321
 */
public class departamentosDAO {
PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion c = new Conexion();
 
    
    public List listar() {
        List<departamento> lista = new ArrayList<>();
        String sql = "select * from departamentos";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
               departamento p = new departamento();
                p.setIdDepartamento(rs.getInt(1));
                p.setNombre(rs.getString(2));
                
                lista.add(p);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public departamento listarId(int id) {
        String sql = "select * from departamentos where idDepartamento=" + id;
        departamento pe = new departamento();
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                pe.setIdDepartamento(rs.getInt(1));
                pe.setNombre(rs.getString(2));
                
            }
        } catch (Exception e) {
        }
        return pe;
    }

    public void agregar(departamento p) {
        String sql = "insert into departamentos(nombre)values(?)";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNombre());
          
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }
    public void update(departamento p) {
        String sql = "update departamentos set nombre=? where idDepartamento=?";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNombre());
            ps.setInt(2, p.getIdDepartamento());
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void delete(int id) {
        String sql = "delete from departamentos where idDepartamento=" + id;
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }
   
    /*
     Listar 
     */
    public ArrayList<departamento> ConsularListaDepartamento(String criterio) {
        ArrayList<departamento> milistadepartamento = new ArrayList<departamento>();

        departamento miDepartamento;

          Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {
            Statement sentencia = nuevaCon.createStatement();

            String Query = "SELECT idDepartamento, nombre" + " FROM departamentos  where nombre like '%" + criterio + "%' ORDER BY nombre;";
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {

                miDepartamento = new departamento();
                miDepartamento.setIdDepartamento(rs.getInt(1));
                miDepartamento.setNombre(rs.getString(2));
                milistadepartamento.add(miDepartamento);

            }

            return milistadepartamento;
        } catch (Exception ex) {
            System.out.println("errror en la consulta" + ex.getMessage());

            return milistadepartamento;
        }

    }

    /*
    eliminar
     */

    public List<departamento> buscar(String dato) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


}
