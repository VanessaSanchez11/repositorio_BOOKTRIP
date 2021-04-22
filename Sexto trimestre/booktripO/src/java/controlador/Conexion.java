
package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import modelo.usuario;


public class Conexion {
    private Connection conn;
    private String driver = "com.mysql.cj.jdbc.Driver";
    private String user = "root";
    private String password = "";
    private String baseDatos = "booktripn";
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
    public int loguear(usuario log1) throws ClassNotFoundException, SQLException {
        PreparedStatement pst;
        ResultSet rs;
        int cont=0;
        int rol=0;
        
        String sql = "select rol from usuarios where "
                + "email = '" +log1.getEmail() + "' and password=md5'" + log1.getPassword()+ "'";
       
                  
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            while(rs.next()) {
                rol = rs.getInt(1);
            }
            conn.close();
        return rol;
    } 
}
      

