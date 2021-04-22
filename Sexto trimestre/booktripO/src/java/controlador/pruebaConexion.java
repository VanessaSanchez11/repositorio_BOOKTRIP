package controlador;

import java.sql.Connection;

public class pruebaConexion {

    public static void main(String[] args) {
        Conexion con = new Conexion();
        Connection reg = con.getConn();
    }

}
