package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.inmuebles;

public class inmueblesDAO {

    public static String miRespuesta = "";

    public String adicionarInmueble(inmuebles inmueble) {

        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "insert into inmuebles (idTipo, idDepartamento, idUsuario, idEstado, nombre, direccion, capacidad, "
                    + "descripcion, precio, adjunto)" + "values(?,?,?,?,?,?,?,?,?,?);";
            sentencia = nuevaCon.prepareStatement(Query);

            sentencia.setInt(1, inmueble.getIdInmueble());
            sentencia.setInt(2, inmueble.getIdDepartamento());
            sentencia.setInt(3, inmueble.getIdUsuario());
            sentencia.setInt(4, inmueble.getIdEstado());
            sentencia.setString(5, inmueble.getNombre());
            sentencia.setString(6, inmueble.getDireccion());
            sentencia.setInt(7, inmueble.getCapacidad());
            sentencia.setString(8, inmueble.getDescripcion());
            sentencia.setInt(9, inmueble.getPrecio());
            sentencia.setString(10, inmueble.getAdjunto());

            sentencia.execute();

        } catch (Exception ex) {
            miRespuesta = "";
            miRespuesta = ex.getMessage();
            System.err.println("ocurrió un problema en inmuebles\n" + ex.getMessage());

        }
        return miRespuesta;

    }

    //////////////////////////////////
    public String actualizarInmueble(inmuebles inmueble) {

        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {
            String Query = "update inmuebles set idTipo=?, idDepartamento=?,"
                    + "idUsuario=?, idEstado=?, nombre=?, direccion=?, capacidad=?, "
                    + "descripcion=?, precio=? where idInmueble=?";
            sentencia = nuevaCon.prepareStatement(Query);

            sentencia.setInt(1, inmueble.getIdTipo());
            sentencia.setInt(2, inmueble.getIdDepartamento());
            sentencia.setInt(3, inmueble.getIdUsuario());
            sentencia.setInt(4, inmueble.getIdEstado());
            sentencia.setString(5, inmueble.getNombre());
            sentencia.setString(6, inmueble.getDireccion());
            sentencia.setInt(7, inmueble.getCapacidad());
            sentencia.setString(8, inmueble.getDescripcion());
            sentencia.setInt(9, inmueble.getPrecio());
            sentencia.setString(10, inmueble.getAdjunto());

            sentencia.setInt(11, inmueble.getIdInmueble());

            sentencia.executeUpdate();
        } catch (Exception ex) {
            miRespuesta = "";
            miRespuesta = ex.getMessage();
            System.err.println("ocurrió un problema en inmuebles\n" + ex.getMessage());

        }
        return miRespuesta;

    }

    public inmuebles consultarInmuebles(String nombre) {

        inmuebles miInmueble = null;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {
            Statement sentencia = nuevaCon.createStatement();
            String Query = "select idInmueble, idTipo, idDepartamento, idUsuario, idEstado, "
                    + "nombre, direccion, capacidad, descripcion, precio, adjunto from inmuebles where nombre= " + nombre;
            ResultSet rs = sentencia.executeQuery(Query);
            while (rs.next()) {
                miInmueble = new inmuebles();

                miInmueble.setIdInmueble(rs.getInt(1));
                miInmueble.setIdTipo(rs.getInt(2));
                miInmueble.setIdDepartamento(rs.getInt(3));
                miInmueble.setIdUsuario(rs.getInt(4));
                miInmueble.setIdEstado(rs.getInt(5));
                miInmueble.setNombre(rs.getString(6));
                miInmueble.setDireccion(rs.getString(7));
                miInmueble.setCapacidad(rs.getInt(8));
                miInmueble.setDescripcion(rs.getString(9));
                miInmueble.setPrecio(rs.getInt(10));
                miInmueble.setAdjunto(rs.getString(11));
                miInmueble.setIdInmueble(rs.getInt(12));
            }

            return miInmueble;
        } catch (Exception ex) {

            System.out.println(ex.getMessage());
        }

        return miInmueble;

    }

    /////////////////////////////////////////////////////////////////
    public ArrayList<inmuebles> ConsultarListadoInmueble( String nombre) {
        ArrayList<inmuebles> milistainmueble = new ArrayList<inmuebles>();

        inmuebles miInmueble;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();
          // Se recibimos el parametro de consulta para recuperar la informacion
        System.out.println("Buscar parametro:" + nombre);
        try {
            Statement sentencia = nuevaCon.createStatement();

            String Query = " select idInmueble, idTipo, idDepartamento, idUsuario, idEstado, "
                    + " nombre, direccion, capacidad, descripcion, precio, adjunto "
                    + " from inmuebles "
                    + " where "
                   + "nombre like '%"+ nombre + "%' ORDER BY idInmueble;";
            ResultSet rs = sentencia.executeQuery(Query);

            while (rs.next()) {
                miInmueble = new inmuebles();
                miInmueble.setIdInmueble(rs.getInt(1));
                miInmueble.setIdTipo(rs.getInt(2));
                miInmueble.setIdDepartamento(rs.getInt(3));
                miInmueble.setIdUsuario(rs.getInt(4));
                miInmueble.setIdEstado(rs.getInt(5));
                miInmueble.setNombre(rs.getString(6));
                miInmueble.setDireccion(rs.getString(7));
                miInmueble.setCapacidad(rs.getInt(8));
                miInmueble.setDescripcion(rs.getString(9));
                miInmueble.setPrecio(rs.getInt(10));
                miInmueble.setAdjunto(rs.getString(11));
                milistainmueble.add(miInmueble);

            }
            return milistainmueble;
        } catch (Exception e) {
            System.out.println("Error el a consulta inmueble" + e.getMessage());
            return milistainmueble;

        }

    }

    //////////////////////////////////////////

    public String EliminarInmueble(inmuebles inmueble){
        
        String res;
        Conexion connect = new Conexion();
        Connection newConexion;
        newConexion = connect.getConn();
        
         PreparedStatement sentence;
         
         try {
            String sql  = "DELETE FROM inmuebles WHERE idInmueble=? AND idTipo=? AND idDepartamento=?  "
                    + "AND idUsuario=? AND idEstado =? AND nombre=? AND direccion=? AND capacidad=? "
                    + "AND descripcion=? AND precio= ? AND adjunto=?;";
           
            sentence = newConexion.prepareStatement(sql);
            
            sentence.setInt(1, inmueble.getIdInmueble());
            sentence.setInt(2, inmueble.getIdTipo());
            sentence.setInt(3, inmueble.getIdDepartamento());
            sentence.setInt(4, inmueble.getIdUsuario());
            sentence.setInt(5,inmueble.getIdEstado());
            sentence.setString(6, inmueble.getNombre());
            sentence.setString(7,inmueble.getDireccion());
            sentence.setInt(8, inmueble.getCapacidad());
            sentence.setString(9, inmueble.getDescripcion());
            sentence.setInt(10, inmueble.getPrecio());
            sentence.setString(11, inmueble.getAdjunto());
            
            
            sentence.execute();
            res= "";
            
        } catch (Exception e) {
            
            res = e.getMessage();
            System.out.println("Ocurrio un error en el eliminar usuario " + e.getMessage());
        }
             
        return res;
    
    }
}
