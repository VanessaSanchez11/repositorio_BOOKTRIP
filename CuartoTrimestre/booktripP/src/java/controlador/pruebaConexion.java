/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;


import java.sql.Connection;


public class pruebaConexion {
    

    public static void main(String[] args) {
        Conexion con = new Conexion();
        Connection reg = con.getConn();
    }

    
}
