/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Giovanny
 */
class Conexion {
    private Connection conn;
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String user = "root";
    private String password = "";
    private String baseDatos = "booktrip";
    private String url = "jdbc:mysql://localhost:3306/" + baseDatos + "?serverTimezone=UTC";

    public Conexion() {
        conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            if (conn == null) {
                System.out.println("No se ha establecido la conexion" + "\n" + url);
            } else {
                System.out.println("Conexionn establecida");
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }

    public Connection getConn() {
        return conn;
    }
   
    public void CerrarConexion() throws SQLException {
        if (conn != null){
            conn.close();
        }
    }
}

