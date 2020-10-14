package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.estados;
import java.util.ArrayList;
import jdk.internal.org.objectweb.asm.tree.TryCatchBlockNode;

/**
 *
 * @author oscar sanabria
 */
public class estadosDAO {

    public String adicionarEstado(estados estado) {

        String miRespuesta = "";
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "insert into estados (nombre)" + "values(?);";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setString(1, estado.getNombre());
            sentencia.execute();

        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.err.println("ocurrió un problema en estados\n" + miRespuesta);

        }
        return miRespuesta;

    }

    //////////////////////////////////
    public String actualizarEstado(estados estado) {

        String miRespuesta = "";
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "UPDATE estados set idEstado=?, nombre=? where idEstado=?";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setInt(1, estado.getIdEstado());
            sentencia.setString(2, estado.getNombre());
            sentencia.setInt(3, estado.getIdEstado());

            sentencia.executeUpdate();

        } catch (Exception ex) {
            miRespuesta = "";
            miRespuesta = ex.getMessage();
            System.err.println("ocurrió un problema en estados\n" + ex.getMessage());

        }
        return miRespuesta;

    }

   
    /////////////////////////////////////////////////////////////////////////////////////////
     public estados consultarEstados(int idEstado) {

        estados miEstado = null;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {
            Statement sentencia = nuevaCon.createStatement();
            String Query = "select idEstado, nombre from estados where idEstado =" +idEstado;
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {
                miEstado = new estados();
                miEstado.setIdEstado(rs.getInt(1));
                miEstado.setNombre(rs.getString(2));

            }

            return miEstado;
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
            return miEstado;
        }

        

    }
    /////////////////////////////////////////////////////////////////////////////////////////

    public ArrayList<estados> ConsultarListadoEstado(String criterio) {
        ArrayList<estados> milistaestado = new ArrayList<estados>();

        estados miEstado;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {
            Statement sentencia = nuevaCon.createStatement();

               String Query = " SELECT idEstado, nombre" + " FROM estados where nombre like '%" + criterio + "%' ORDER BY idEstado;";
                 
            ResultSet rs = sentencia.executeQuery(Query);

            while (rs.next()) {
                miEstado = new estados();
                miEstado.setIdEstado(rs.getInt(1));
                miEstado.setNombre(rs.getString(2));
                milistaestado.add(miEstado);

            }
            
            return milistaestado;
            
        } catch (Exception e) {
            System.out.println("Error el a consulta estado" + e.getMessage());
            return milistaestado;

        }

    }

    //////////////////////////////////////////
    public String eliminarEstado(estados estado) {

        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {
            String Query = "delete from estados where idEstado=? and nombre=?;";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setInt(1, estado.getIdEstado());
            sentencia.setString(2, estado.getNombre());
            sentencia.execute();

            miRespuesta = "";

        } catch (Exception e) {
            
            miRespuesta = e.getMessage();
            System.out.println("Error al eliminar estado" + e.getMessage());

        }
        return miRespuesta;
    }

   

   
}
