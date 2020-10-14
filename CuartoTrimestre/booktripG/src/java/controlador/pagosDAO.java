package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import modelo.pagos;

public class pagosDAO {

    public String adicionarPago(pagos pago) {

        String miRespuesta = "";
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;

        try {
            String sql = "INSERT INTO pagos (idUsuario,idInmueble,adjunto,monto,fechaPago,fechaPago2)"
                    + "values(?,?,?,?,?,?);";

            sentencia = nuevaCon.prepareStatement(sql);
            sentencia.setInt(1, pago.getIdUsuario());
            sentencia.setInt(2, pago.getIdInmueble());
            sentencia.setString(3, pago.getAdjunto());
            sentencia.setInt(4, pago.getMonto());
            sentencia.setString(5, pago.getFechaPago());
            sentencia.setString(6, pago.getFechaPago2());
            sentencia.execute();

        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.err.println("ocurrió un problema en pagos\n" + ex.getMessage());

        }
        return miRespuesta;

    }
    //////////////////////////////////

    public String actualizarPago(pagos pago) {

        String miRespuesta = "";
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        try {
            String sql = "update pagos set idPago = ?, idUsuario = ?, idInmueble= ?, adjunto = ?, monto = ?, fechaPago = ?, fechaPago2 = ? WHERE idUsuario =?";

            sentencia = nuevaCon.prepareStatement(sql);
            sentencia.setInt(1, pago.getIdUsuario());
            sentencia.setInt(2, pago.getIdInmueble());
            sentencia.setString(3, pago.getAdjunto());
            sentencia.setInt(4, pago.getMonto());
            sentencia.setString(5, pago.getFechaPago());
            sentencia.setString(6, pago.getFechaPago2());
            sentencia.setInt(7, pago.getIdUsuario());

            sentencia.executeUpdate();

        } catch (Exception ex) {

            miRespuesta = ex.getMessage();
            System.err.println("ocurrió un problema en pagos\n" + ex.getMessage());

        }
        return miRespuesta;

    }

    //////////////
    public pagos consultarPago(String fechapago) {

        pagos mipago = null;

        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {
            Statement sentencia = nuevaCon.createStatement();

            String Sql = "SELECT idPago, idUsuario, idInmueble, adjunto, monto, fechapago, fechapago2 FROM pagos WHERE fechapago = " + fechapago;

            ResultSet rs = sentencia.executeQuery(Sql);

            while (rs.next()) {

                mipago = new pagos();
                mipago.setIdPago(rs.getInt(1));
                mipago.setIdUsuario(rs.getInt(2));
                mipago.setIdInmueble(rs.getInt(3));
                mipago.setAdjunto(rs.getString(4));
                mipago.setMonto(rs.getInt(5));
                mipago.setFechaPago(rs.getString(6));
                mipago.setFechaPago2(rs.getString(7));

            }

            return mipago;

        } catch (Exception ex) {

            System.out.println(ex.getMessage());
            return mipago;

        }

    }

    ////
    public pagos consultarUsuarioId(int idUsuario) throws SQLException {

        pagos user = null;

        Conexion connect = new Conexion();
        Connection newConexion;
        newConexion = connect.getConn();

        try {
            Statement sentencia = newConexion.createStatement();

            String sql = "select idUsuario, idInmueble, adjunto, monto, fechaPago, fechaPago2 FROM pagos WHERE idUsuario = " + idUsuario;

            //filas columnas
            ResultSet rs = sentencia.executeQuery(sql);

            while (rs.next()) {
                user = new pagos();
                user.setIdUsuario(rs.getInt(1));
                user.setIdInmueble(rs.getInt(2));
                user.setAdjunto(rs.getString(3));
                user.setMonto(rs.getInt(4));
                user.setFechaPago(rs.getString(5));
                user.setFechaPago2(rs.getString(6));

            }
            return user;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return user;
        }
    }

///////
    public ArrayList<pagos> ConsultarListadoPagos(String criterio) {

        ArrayList<pagos> milistapagos = new ArrayList<pagos>();
        pagos mipagos;

        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        try {
            Statement sentencia = nuevaCon.createStatement();

            String sql = "SELECT idPago, idUsuario, idInmueble, adjunto, monto, fechaPago, fechaPago2 "
                    + "FROM pagos "
                    + "where fechaPago like '%" + criterio + "%' ORDER BY idPago;";

            ResultSet rs = sentencia.executeQuery(sql);
            while (rs.next()) {

                mipagos = new pagos();
                mipagos.setIdPago(rs.getInt(1));
                mipagos.setIdUsuario(rs.getInt(2));
                mipagos.setIdInmueble(rs.getInt(3));
                mipagos.setAdjunto(rs.getString(4));
                mipagos.setMonto(rs.getInt(5));
                mipagos.setFechaPago(rs.getString(6));
                mipagos.setFechaPago2(rs.getString(7));

                milistapagos.add(mipagos);
            }

            return milistapagos;

        } catch (Exception ex) {
            System.out.println("error consulta lista de pagos:" + ex.getMessage());
            return milistapagos;

        }
    }

    //////
    public String EliminarPago(pagos pago) {
        String miRespuesta;
        Conexion miConexion = new Conexion();
        Connection nuevaCon;
        nuevaCon = miConexion.getConn();

        PreparedStatement sentencia;
        try {
            String Query = "delete from pagos where idPago=? and idUsuario=? and idInmueble=? and adjunto=?  and monto=? and fechaPago=? and fechaPago2=?;";
            sentencia = nuevaCon.prepareStatement(Query);
            sentencia.setInt(1, pago.getIdPago());
            sentencia.setInt(2, pago.getIdUsuario());
            sentencia.setInt(3, pago.getIdInmueble());
            sentencia.setString(4, pago.getAdjunto());
            sentencia.setInt(5, pago.getMonto());
            sentencia.setString(6, pago.getFechaPago());
            sentencia.setString(7, pago.getFechaPago2());

            sentencia.execute();
            miRespuesta = "";

        } catch (Exception ex) {
            miRespuesta = ex.getMessage();
            System.err.println("Ocurrio un error en pagosDAO.Eliminarpago" + ex.getMessage());
        }

        return miRespuesta;

    }
}
