/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import modelo.permisos;
import modelo.rol;

/**
 *
 * @author oscar sanabria
 */
public class permisosDAO {

    PreparedStatement ps;
    ResultSet rs;
    Connection con;
    Conexion c = new Conexion();

    public List listar() {
        List<permisos> lista = new ArrayList<>();
        String sql = "select * from permisos";
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                permisos p = new permisos();
                p.setIdPermiso(rs.getInt(1));
                p.setIdRol(rs.getInt(2));
                p.setIdUsuario(rs.getInt(3));

                lista.add(p);
            }
        } catch (Exception e) {
        }
        return lista;
    }

    public permisos listarId(int id) {
        String sql = "select * from permisos where idUsario=" +id;
        permisos pe = new permisos();
        try {
            con = c.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                pe.setIdPermiso(rs.getInt(1));
                pe.setIdUsuario(rs.getInt(2));
                pe.setIdRol(rs.getInt(3));

            }
        } catch (Exception e) {
        }
        return pe;
    }
}
