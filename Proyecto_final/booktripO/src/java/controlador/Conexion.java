
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.usuario;


public class Conexion {
    private Connection conn;
    private String driver = "com.mysql.jdbc.Driver";
    private String user = "root";
    private String password = "";
    private String baseDatos = "booktripr";
    private String url = "jdbc:mysql://localhost:3306/" + baseDatos + "?serverTimezone=UTC";

  
    public Conexion() {
        conn = null;
        try {
            Class.forName(driver);
            
            conn = DriverManager.getConnection(url, user, password);
            if (conn == null) {
                System.out.println("No se ha establecido la conexion" + "\n" + url);
            } else {
                System.out.println("Conexion establecida");
            }
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
            System.out.println("error");
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
      

