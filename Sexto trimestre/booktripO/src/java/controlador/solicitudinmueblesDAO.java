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
import modelo.solicitudinmuebles;

/**
 *
 * @author oscar sanabria
 */
public class solicitudinmueblesDAO {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion c = new Conexion();

    public List listar() {
        List<solicitudinmuebles> lista = new ArrayList<>();
        String sql = "select * from solicitudinmuebles";
//        String sql = "SELECT solicitudinmuebles.idSolicitud, inmuebles.nombre, usuarios.nombre, estados.nombre,"
//                + " solicitudinmuebles.fecha FROM solicitudinmuebles INNER JOIN inmuebles "
//                + "on solicitudinmuebles.idInmueble=inmuebles.idInmueble INNER JOIN usuarios "
//                + "on solicitudinmuebles.idUsuario=usuarios.idUsuario INNER JOIN estados on"
//                + "solicitudinmuebles.idEstado=estados.idEstado";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                solicitudinmuebles p = new solicitudinmuebles();
                p.setIdSolicitud(rs.getInt(1));
                p.setIdInmueble(rs.getInt(2));
                p.setIdUsuario(rs.getInt(3));
                p.setIdEstado(rs.getInt(4));
                p.setFecha(rs.getString(5));

                lista.add(p);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public solicitudinmuebles listarId(int id) {
        String sql = "select * from solicitudinmuebles where idSolicitud=" + id;
        solicitudinmuebles pe = new solicitudinmuebles();
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                pe.setIdSolicitud(rs.getInt(1));
                 pe.setIdInmueble(rs.getInt(2));
                  pe.setIdUsuario(rs.getInt(3));
                   pe.setIdEstado(rs.getInt(4));
                pe.setFecha(rs.getString(5));
                
            }
        } catch (Exception e) {
        }
        return pe;
    }

    public void agregar(solicitudinmuebles p) {
        String sql = "insert into solicitudinmuebles(idInmueble, idUsuario, idEstado, fecha)values(?,?,?,?)";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
             ps.setInt(1, p.getIdInmueble());
             ps.setInt(2, p.getIdUsuario());
             ps.setInt(3, p.getIdEstado());
            ps.setString(4, p.getFecha());
            
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void update(solicitudinmuebles p) {
        String sql = "update solicitudinmuebles set idInmueble=?,idUsuario=?, idEstado=?, fecha=? where idSolicitud=?";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps = con.prepareStatement(sql);
            
             ps.setInt(1, p.getIdInmueble());
             ps.setInt(2, p.getIdUsuario());
             ps.setInt(3, p.getIdEstado());
            ps.setString(4, p.getFecha());
            ps.setInt(5, p.getIdSolicitud());
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public void delete(int id) {
        String sql = "delete from solicitudinmuebles where idSolicitud=" + id;
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }
    
    public List buscar(String texto) {
        String sql ="select * from solicitudinmuebles where idSolicitud LIKE'%"+texto+"%'or fecha LIKE'%"+texto+"%'";
      List<solicitudinmuebles> lista= new ArrayList<>();
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                solicitudinmuebles pe= new solicitudinmuebles();
                pe.setIdSolicitud(rs.getInt("idSolicitud"));
                pe.setFecha(rs.getString("fecha"));
                 lista.add(pe);
                
            }
        } catch (Exception e) {
        }
        return lista;
    }
     ////////////////////////////////////////////////////////////////////77
     public ArrayList<solicitudinmuebles>ConsultarListadoSolicitudInmueble(String criterio){
        ArrayList<solicitudinmuebles>milistasolicitud =new ArrayList<solicitudinmuebles>();
        
        solicitudinmuebles miSolicitudInmueble;
        Conexion  miConexion= new Conexion();
        Connection nuevaCon;
        nuevaCon= miConexion.getConn();
        
        try{
            Statement sentencia = nuevaCon.createStatement();
    
            String Query="select idSolicitud, idInmueble, idUsuario, idEstado, fecha" 
                    + " from  solicitudinmuebles where fecha like '%"+ 
                    criterio +"%' ORDER BY fecha;";
           
            ResultSet rs=sentencia.executeQuery(Query);
          
            while (rs.next()) {                
              miSolicitudInmueble= new solicitudinmuebles();
              miSolicitudInmueble.setIdSolicitud(rs.getInt(1));
             miSolicitudInmueble.setIdInmueble(rs.getInt(2));
              miSolicitudInmueble.setIdUsuario(rs.getInt(3));
               miSolicitudInmueble.setIdEstado(rs.getInt(4));
                miSolicitudInmueble.setFecha(rs.getString(5));
                 milistasolicitud.add(miSolicitudInmueble);
          
            }
              return  milistasolicitud;
              }catch (Exception e){
           System.out.println("Error el a consulta solicitud"+e.getMessage());
              return  milistasolicitud;
                
        }
    
   }

}
