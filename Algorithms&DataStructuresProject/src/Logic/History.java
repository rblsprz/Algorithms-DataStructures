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
public class History {
    
    private String fecha;
    private String hora;
    private String cedula;
    private String nombre;

    public History(String fecha, String hora, String cedula, String nombre) {
        this.fecha = fecha;
        this.hora = hora;
        this.cedula = cedula;
        this.nombre = nombre;
    }//End Constructor History
    
    public History(){
    }//End History

    public String getFecha() {
        return fecha;
    }//End getFecha

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }//End setFecha

    public String getHora() {
        return hora;
    }//End getHora

    public void setHora(String hora) {
        this.hora = hora;
    }//End setHora

    public String getCedula() {
        return cedula;
    }//End getCedula

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }//End setCedula

    public String getNombre() {
        return nombre;
    }//End getNombre

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }//End setNombre   
}//End History
