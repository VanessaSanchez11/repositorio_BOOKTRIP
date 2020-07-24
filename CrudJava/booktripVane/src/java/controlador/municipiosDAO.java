package controlador;

import modelo.municipios;
import java.sql.Connection;
import java.sql.PreparedStatement;


public class municipiosDAO {

    public static String miRespuesta = "";

    public String adicionarMunicipios(municipios municipio) {

        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "insert into municipios (idDepartamento,nombre) " + "values(?,?);";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setInt(1, municipio.getIdDepartamento());
            sentencia.setString(2, municipio.getNombre());
            sentencia.execute();

        } catch (Exception ex) {
            miRespuesta = "";
            miRespuesta = ex.getMessage();
            System.err.println("ocurrió un problema en el municipio\n" + ex.getMessage());

        }
        return miRespuesta;

    }

    //////////////////////////////////
    public String actualizarMunicipio(municipios municipio) {

        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "update municipios set idDepartamento=?, nombre=? where idMunicipio =?";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setInt(1, municipio.getIdDepartamento());
            sentencia.setString(2, municipio.getNombre());
            sentencia.setInt(3, municipio.getIdMunicipio());
            sentencia.executeUpdate();

        } catch (Exception ex) {
            miRespuesta = "";
            miRespuesta = ex.getMessage();
            System.err.println("ocurrió un problema en el municipio\n" + ex.getMessage());

        }
        return miRespuesta;

    }

}
