
package modelo;


public class puntuaciones {
    private int idPuntuacion;
    private int idUsuario;
    private int idInmueble;
    private String fechaCreada;
    private String descripcion;
    private String calificacion;
    
    
    public void setIdPuntuacion(int idPuntuacion) {
        this.idPuntuacion = idPuntuacion;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setIdInmueble(int idInmueble) {
        this.idInmueble = idInmueble;
    }

    public void setFechaCreada(String fechaCreada) {
        this.fechaCreada = fechaCreada;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCalificacion(String calificacion) {
        this.calificacion = calificacion;
    }
    
    public int getIdPuntuacion() {
        return idPuntuacion;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public int getIdInmueble() {
        return idInmueble;
    }

    public String getFechaCreada() {
        return fechaCreada;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getCalificacion() {
        return calificacion;
    }
}
