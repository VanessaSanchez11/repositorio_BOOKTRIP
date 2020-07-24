
package modelo;


public class reservas {
    private int idReserva;
    private int idUsuario;
    private int idInmueble;
    private int idEstado;
    private String fechaReserva;
    private String checkIn;
    private String checkOut;

    public int getIdReserva() {
        return idReserva;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public int getIdInmueble() {
        return idInmueble;
    }

    public int getIdEstado() {
        return idEstado;
    }

    public String getFechaReserva() {
        return fechaReserva;
    }

    public String getCheckIn() {
        return checkIn;
    }

    public String getCheckOut() {
        return checkOut;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setIdInmueble(int idInmueble) {
        this.idInmueble = idInmueble;
    }

    public void setIdEstado(int idEstado) {
        this.idEstado = idEstado;
    }

    public void setFechaReserva(String fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public void setCheckIn(String checkIn) {
        this.checkIn = checkIn;
    }

    public void setCheckOut(String checkOut) {
        this.checkOut = checkOut;
    }

    public void setReserva(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getIdEstados() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getFechareserva() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
  
}
