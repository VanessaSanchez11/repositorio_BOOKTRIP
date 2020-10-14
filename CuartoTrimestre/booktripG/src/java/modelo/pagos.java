package modelo;

public class pagos {

    private int idPago;
    private int idUsuario;
    private int idInmueble;
    private String adjunto;
    private int monto;
    private String fechaPago;
    private String fechaPago2;

    public void setIdPago(int idPago) {
        this.idPago = idPago;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setIdInmueble(int idInmueble) {
        this.idInmueble = idInmueble;
    }

    public void setAdjunto(String adjunto) {
        this.adjunto = adjunto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public void setFechaPago(String fechaPago) {
        this.fechaPago = fechaPago;
    }

    public void setFechaPago2(String fechaPago2) {
        this.fechaPago2 = fechaPago2;
    }
    
    
    public int getIdPago() {
        return idPago;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public int getIdInmueble() {
        return idInmueble;
    }

    public String getAdjunto() {
        return adjunto;
    }

    public int getMonto() {
        return monto;
    }

    public String getFechaPago() {
        return fechaPago;
    }

    public String getFechaPago2() {
        return fechaPago2;
    }

    public void setIdReserva(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setIdEstado(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setFechaReserva(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCheckIn(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setCheckOut(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}

