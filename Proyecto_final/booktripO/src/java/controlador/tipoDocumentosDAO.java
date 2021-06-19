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
import modelo.tipoDocumentos;
import java.util.ArrayList;
import java.util.List;


public class tipoDocumentosDAO {
    
     PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion c = new Conexion();
 
    public ArrayList<tipoDocumentos> ConsultarListadoTipos( String nombre) {
        ArrayList<tipoDocumentos> milistatipo = new ArrayList<tipoDocumentos>();

        tipoDocumentos miTipo;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
          // Se recibimos el parametro de consulta para recuperar la informacion
        System.out.println("Buscar parametro:" + nombre);
        try {
            Statement sentencia = nuevaCon.createStatement();

            String Query = " select idTipoDocumento, nombre from tipodocumentos "
                    + " where "
                   + "nombre like '%"+ nombre + "%' ORDER BY idTipoDocumento;";
            ResultSet rs = sentencia.executeQuery(Query);

            while (rs.next()) {
                miTipo = new tipoDocumentos();
                miTipo.setIdTipoDocumento(rs.getInt(1));
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
        List<tipoDocumentos> lista = new ArrayList<>();
        String sql = "select * from tipodocumentos";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                tipoDocumentos p = new tipoDocumentos();
                p.setIdTipoDocumento(rs.getInt(1));
                p.setNombre(rs.getString(2));
                
                lista.add(p);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public tipoDocumentos listarId(int id) {
        String sql = "select * from tipodocumentos where idTipoDocumento=" + id;
        tipoDocumentos pe = new tipoDocumentos();
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                pe.setIdTipoDocumento(rs.getInt(1));
                pe.setNombre(rs.getString(2));
                
            }
        } catch (Exception e) {
        }
        return pe;
    }

    public void agregar(tipoDocumentos p) {
        String sql = "insert into tipodocumentos(nombre)values(?)";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNombre());
          
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }
    public void update(tipoDocumentos p) {
        String sql = "update tipodocumentos set nombre=? where idTipoDocumento=?";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, p.getNombre());
            ps.setInt(2, p.getIdTipoDocumento());
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void delete(int id) {
        String sql = "delete from tipodocumentos where idTipoDocumento=" + id;
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }
   

   
}
