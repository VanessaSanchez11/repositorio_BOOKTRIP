/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author 57321
 */
public class municipios {
    private int idMunicipio;
    private int idDepartamento;
    private String nombre;

    public void setIdMunicipio(int idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdMunicipio() {
        return idMunicipio;
    }

    public int getIdDepartamento() {
        return idDepartamento;
    }

    public String getNombre() {
        return nombre;
    }
    
}
