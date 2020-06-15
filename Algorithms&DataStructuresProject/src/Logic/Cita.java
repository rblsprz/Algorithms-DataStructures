/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logic;

/**
 *
 * @author pc
 */
public class Cita {
    
    private String fecha;
    private String hora;
    private String cedula;
    private String nombre;

    public Cita(String fecha, String hora, String cedula, String nombre) {
        this.fecha = fecha;
        this.hora = hora;
        this.cedula = cedula;
        this.nombre = nombre;
    }
    
    public Cita(){}

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
