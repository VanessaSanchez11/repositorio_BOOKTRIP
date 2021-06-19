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
import modelo.galeria;
import java.util.ArrayList;
import java.util.List;
import modelo.actividades;
import modelo.galerias;

/**
 *
 * @author 57321
 */
public class galeriasDAO {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion c = new Conexion();

    public List listar() {
        List<galerias> lista = new ArrayList<>();
        String sql = "select * from galerias";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                galerias p = new galerias();
                p.setIdGaleria(rs.getInt(1));
                p.setIdInmueble(rs.getInt(2));
                p.setImagen(rs.getString(3));
                 p.setUrl(rs.getString(4));

                lista.add(p);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public galerias listarId(int id) {
        String sql = "select * from galerias where idGaleria=" + id;
        galerias pe = new galerias();
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                pe.setIdGaleria(rs.getInt(1));
                 pe.setIdInmueble(rs.getInt(2));
                pe.setImagen(rs.getString(3));
                pe.setUrl(rs.getString(4));
                
            }
        } catch (Exception e) {
        }
        return pe;
    }

    public void agregar(galerias p) {
        String sql = "insert into galerias(idInmueble, imagen, url)values(?,?,?)";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
             ps.setInt(1, p.getIdInmueble());
            ps.setString(2, p.getImagen());
             ps.setString(3, p.getUrl());
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void update(galerias p) {
        String sql = "update galerias set idInmueble=?,imagen=?, url=? where idGaleria=?";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps = con.prepareStatement(sql);
            
             ps.setInt(1, p.getIdInmueble());
             ps.setString(4, p.getImagen());
            ps.setString(4, p.getUrl());
            ps.setInt(5, p.getIdGaleria());
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void delete(int id) {
        String sql = "delete from galerias where idGaleria=" + id;
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }
     ////////////////////////////////////////////////////////////////////77
     public ArrayList<galerias>ConsultarListadoGalerias(String criterio){
        ArrayList<galerias>milista =new ArrayList<galerias>();
        
        galerias miGaleria;
        Conexion  miConexion= new Conexion();
        Connection nuevaCon;
        nuevaCon= miConexion.getConn();
        
        try{
            Statement sentencia = nuevaCon.createStatement();
    
            String Query="select idGaleria, idInmueble, imagen, urlfecha" 
                    + " from  galerias where fecha like '%"+ 
                    criterio +"%' ORDER BY fecha;";
           
            ResultSet rs=sentencia.executeQuery(Query);
          
            while (rs.next()) {                
              miGaleria= new galerias();
              miGaleria.setIdGaleria(rs.getInt(1));
             miGaleria.setIdInmueble(rs.getInt(2));
 miGaleria.setImagen(rs.getString(5));
                miGaleria.setUrl(rs.getString(5));
                
                milista.add(miGaleria);
          
            }
              return  milista;
              }catch (Exception e){
           System.out.println("Error el a consulta solicitud"+e.getMessage());
              return  milista;
                
        }
    
   }

}
